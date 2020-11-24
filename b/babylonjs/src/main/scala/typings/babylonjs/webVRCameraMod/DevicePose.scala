package typings.babylonjs.webVRCameraMod

import typings.babylonjs.typesMod.Nullable
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DevicePose extends js.Object {
  
  /**
    * The angularAcceleration of the device, values in array are [x,y,z].
    */
  val angularAcceleration: Nullable[Float32Array] = js.native
  
  /**
    * The angularVelocity of the device, values in array are [x,y,z].
    */
  val angularVelocity: Nullable[Float32Array] = js.native
  
  /**
    * The linearAcceleration of the device, values in array are [x,y,z].
    */
  val linearAcceleration: Nullable[Float32Array] = js.native
  
  /**
    * The linearVelocity of the device, values in array are [x,y,z].
    */
  val linearVelocity: Nullable[Float32Array] = js.native
  
  /**
    * The orientation of the device in a quaternion array, values in array are [x,y,z,w].
    */
  val orientation: Nullable[Float32Array] = js.native
  
  /**
    * The position of the device, values in array are [x,y,z].
    */
  val position: Nullable[Float32Array] = js.native
}
object DevicePose {
  
  @scala.inline
  def apply(): DevicePose = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePose]
  }
  
  @scala.inline
  implicit class DevicePoseOps[Self <: DevicePose] (val x: Self) extends AnyVal {
    
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
    def setAngularAcceleration(value: Nullable[Float32Array]): Self = this.set("angularAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularAccelerationNull: Self = this.set("angularAcceleration", null)
    
    @scala.inline
    def setAngularVelocity(value: Nullable[Float32Array]): Self = this.set("angularVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngularVelocityNull: Self = this.set("angularVelocity", null)
    
    @scala.inline
    def setLinearAcceleration(value: Nullable[Float32Array]): Self = this.set("linearAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearAccelerationNull: Self = this.set("linearAcceleration", null)
    
    @scala.inline
    def setLinearVelocity(value: Nullable[Float32Array]): Self = this.set("linearVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinearVelocityNull: Self = this.set("linearVelocity", null)
    
    @scala.inline
    def setOrientation(value: Nullable[Float32Array]): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationNull: Self = this.set("orientation", null)
    
    @scala.inline
    def setPosition(value: Nullable[Float32Array]): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionNull: Self = this.set("position", null)
  }
}
