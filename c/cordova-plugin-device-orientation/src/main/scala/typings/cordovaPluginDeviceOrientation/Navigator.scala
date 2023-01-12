package typings.cordovaPluginDeviceOrientation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /** 
    * This plugin provides access to the device's compass. The compass is a sensor that detects
    * the direction or heading that the device is pointed, typically from the top of the device.
    * It measures the heading in degrees from 0 to 359.99, where 0 is north.
    */
  var compass: Compass
}
object Navigator {
  
  inline def apply(compass: Compass): Navigator = {
    val __obj = js.Dynamic.literal(compass = compass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    inline def setCompass(value: Compass): Self = StObject.set(x, "compass", value.asInstanceOf[js.Any])
  }
}
