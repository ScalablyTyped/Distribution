package typings.cordovaPluginDeviceMotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains Accelerometer data captured at a specific point in time. Acceleration values include
  * the effect of gravity (9.81 m/s^2), so that when a device lies flat and facing up, x, y, and z
  * values returned should be 0, 0, and 9.81.
  */
@js.native
trait Acceleration extends js.Object {
  
  /** Creation timestamp in milliseconds. */
  var timestamp: Double = js.native
  
  /** Amount of acceleration on the x-axis. (in m/s^2) */
  var x: Double = js.native
  
  /** Amount of acceleration on the y-axis. (in m/s^2) */
  var y: Double = js.native
  
  /** Amount of acceleration on the z-axis. (in m/s^2) */
  var z: Double = js.native
}
object Acceleration {
  
  @scala.inline
  def apply(timestamp: Double, x: Double, y: Double, z: Double): Acceleration = {
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acceleration]
  }
  
  @scala.inline
  implicit class AccelerationOps[Self <: Acceleration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: Double): Self = this.set("z", value.asInstanceOf[js.Any])
  }
}
