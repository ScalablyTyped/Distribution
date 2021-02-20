package typings.cordovaPluginBluetoothclassicSerial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Window extends StObject {
  
  var BluetoothClassicSerial: typings.cordovaPluginBluetoothclassicSerial.BluetoothClassicSerial = js.native
}
object Window {
  
  @scala.inline
  def apply(BluetoothClassicSerial: BluetoothClassicSerial): Window = {
    val __obj = js.Dynamic.literal(BluetoothClassicSerial = BluetoothClassicSerial.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBluetoothClassicSerial(value: BluetoothClassicSerial): Self = StObject.set(x, "BluetoothClassicSerial", value.asInstanceOf[js.Any])
  }
}
