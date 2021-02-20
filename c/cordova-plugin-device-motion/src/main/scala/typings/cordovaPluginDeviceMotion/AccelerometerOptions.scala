package typings.cordovaPluginDeviceMotion

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Object with options for watchAcceleration */
@js.native
trait AccelerometerOptions extends StObject {
  
  /** How often to retrieve the Acceleration in milliseconds. (Default: 10000) */
  var frequency: js.UndefOr[Double] = js.native
}
object AccelerometerOptions {
  
  @scala.inline
  def apply(): AccelerometerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccelerometerOptions]
  }
  
  @scala.inline
  implicit class AccelerometerOptionsMutableBuilder[Self <: AccelerometerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrequency(value: Double): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
  }
}
