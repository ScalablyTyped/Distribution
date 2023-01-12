package typings.cordovaPluginQrscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var QRScanner: typings.cordovaPluginQrscanner.QRScanner
}
object Window {
  
  inline def apply(QRScanner: QRScanner): Window = {
    val __obj = js.Dynamic.literal(QRScanner = QRScanner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setQRScanner(value: QRScanner): Self = StObject.set(x, "QRScanner", value.asInstanceOf[js.Any])
  }
}
