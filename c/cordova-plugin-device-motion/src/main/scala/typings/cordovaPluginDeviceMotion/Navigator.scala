package typings.cordovaPluginDeviceMotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  /**
    * This plugin provides access to the device's accelerometer. The accelerometer is a motion sensor
    * that detects the change (delta) in movement relative to the current device orientation,
    * in three dimensions along the x, y, and z axis.
    */
  var accelerometer: Accelerometer = js.native
}
object Navigator {
  
  @scala.inline
  def apply(accelerometer: Accelerometer): Navigator = {
    val __obj = js.Dynamic.literal(accelerometer = accelerometer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerometer(value: Accelerometer): Self = StObject.set(x, "accelerometer", value.asInstanceOf[js.Any])
  }
}
