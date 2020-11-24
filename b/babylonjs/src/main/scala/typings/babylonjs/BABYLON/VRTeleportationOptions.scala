package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRTeleportationOptions extends js.Object {
  
  /**
    * The easing function used in the animation or null for Linear. (default CircleEase)
    */
  var easingFunction: js.UndefOr[EasingFunction] = js.native
  
  /**
    * The name of the mesh which should be used as the teleportation floor. (default: null)
    */
  var floorMeshName: js.UndefOr[String] = js.native
  
  /**
    * A list of meshes to be used as the teleportation floor. (default: empty)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.native
  
  /**
    * The teleportation mode. (default: TELEPORTATIONMODE_CONSTANTTIME)
    */
  var teleportationMode: js.UndefOr[Double] = js.native
  
  /**
    * The speed of the animation in distance/sec, apply when animationMode is TELEPORTATIONMODE_CONSTANTSPEED. (default 20 units / sec)
    */
  var teleportationSpeed: js.UndefOr[Double] = js.native
  
  /**
    * The duration of the animation in ms, apply when animationMode is TELEPORTATIONMODE_CONSTANTTIME. (default 122ms)
    */
  var teleportationTime: js.UndefOr[Double] = js.native
}
object VRTeleportationOptions {
  
  @scala.inline
  def apply(): VRTeleportationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRTeleportationOptions]
  }
  
  @scala.inline
  implicit class VRTeleportationOptionsOps[Self <: VRTeleportationOptions] (val x: Self) extends AnyVal {
    
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
    def setEasingFunction(value: EasingFunction): Self = this.set("easingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasingFunction: Self = this.set("easingFunction", js.undefined)
    
    @scala.inline
    def setFloorMeshName(value: String): Self = this.set("floorMeshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorMeshName: Self = this.set("floorMeshName", js.undefined)
    
    @scala.inline
    def setFloorMeshesVarargs(value: Mesh*): Self = this.set("floorMeshes", js.Array(value :_*))
    
    @scala.inline
    def setFloorMeshes(value: js.Array[Mesh]): Self = this.set("floorMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloorMeshes: Self = this.set("floorMeshes", js.undefined)
    
    @scala.inline
    def setTeleportationMode(value: Double): Self = this.set("teleportationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeleportationMode: Self = this.set("teleportationMode", js.undefined)
    
    @scala.inline
    def setTeleportationSpeed(value: Double): Self = this.set("teleportationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeleportationSpeed: Self = this.set("teleportationSpeed", js.undefined)
    
    @scala.inline
    def setTeleportationTime(value: Double): Self = this.set("teleportationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTeleportationTime: Self = this.set("teleportationTime", js.undefined)
  }
}
