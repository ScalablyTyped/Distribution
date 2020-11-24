package typings.canvaskitWasm.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Camera extends js.Object {
  
  /** field of view in radians */
  var angle: AngleInRadians = js.native
  
  /** center of attention - the 3d point the camera is looking at. */
  var coa: Vector3 = js.native
  
  /** a 3d point locating the camera. */
  var eye: Vector3 = js.native
  
  /** far clipping plane distance */
  var far: Double = js.native
  
  /** near clipping plane distance */
  var near: Double = js.native
  
  /**
    * A unit vector pointing the cameras up direction. Note that using only eye and coa
    * would leave the roll of the camera unspecified.
    */
  var up: Vector3 = js.native
}
object Camera {
  
  @scala.inline
  def apply(angle: AngleInRadians, coa: Vector3, eye: Vector3, far: Double, near: Double, up: Vector3): Camera = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], coa = coa.asInstanceOf[js.Any], eye = eye.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
    __obj.asInstanceOf[Camera]
  }
  
  @scala.inline
  implicit class CameraOps[Self <: Camera] (val x: Self) extends AnyVal {
    
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
    def setAngle(value: AngleInRadians): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoaVarargs(value: Double*): Self = this.set("coa", js.Array(value :_*))
    
    @scala.inline
    def setCoa(value: Vector3): Self = this.set("coa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEyeVarargs(value: Double*): Self = this.set("eye", js.Array(value :_*))
    
    @scala.inline
    def setEye(value: Vector3): Self = this.set("eye", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFar(value: Double): Self = this.set("far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNear(value: Double): Self = this.set("near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpVarargs(value: Double*): Self = this.set("up", js.Array(value :_*))
    
    @scala.inline
    def setUp(value: Vector3): Self = this.set("up", value.asInstanceOf[js.Any])
  }
}
