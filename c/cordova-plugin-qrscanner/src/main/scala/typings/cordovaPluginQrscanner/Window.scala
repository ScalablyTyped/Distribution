package typings.cordovaPluginQrscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var QRScanner: typings.cordovaPluginQrscanner.QRScanner = js.native
}
object Window {
  
  @scala.inline
  def apply(QRScanner: QRScanner): Window = {
    val __obj = js.Dynamic.literal(QRScanner = QRScanner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQRScanner(value: QRScanner): Self = StObject.set(x, "QRScanner", value.asInstanceOf[js.Any])
  }
}
