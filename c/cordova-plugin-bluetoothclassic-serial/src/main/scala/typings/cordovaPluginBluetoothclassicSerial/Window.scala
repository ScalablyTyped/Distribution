package typings.cordovaPluginBluetoothclassicSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var BluetoothClassicSerial: typings.cordovaPluginBluetoothclassicSerial.BluetoothClassicSerial
}
object Window {
  
  inline def apply(BluetoothClassicSerial: BluetoothClassicSerial): Window = {
    val __obj = js.Dynamic.literal(BluetoothClassicSerial = BluetoothClassicSerial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setBluetoothClassicSerial(value: BluetoothClassicSerial): Self = StObject.set(x, "BluetoothClassicSerial", value.asInstanceOf[js.Any])
  }
}
