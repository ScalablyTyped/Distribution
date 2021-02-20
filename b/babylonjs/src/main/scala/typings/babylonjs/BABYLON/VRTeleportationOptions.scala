package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VRTeleportationOptions extends StObject {
  
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
  implicit class VRTeleportationOptionsMutableBuilder[Self <: VRTeleportationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEasingFunction(value: EasingFunction): Self = StObject.set(x, "easingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEasingFunctionUndefined: Self = StObject.set(x, "easingFunction", js.undefined)
    
    @scala.inline
    def setFloorMeshName(value: String): Self = StObject.set(x, "floorMeshName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorMeshNameUndefined: Self = StObject.set(x, "floorMeshName", js.undefined)
    
    @scala.inline
    def setFloorMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "floorMeshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloorMeshesUndefined: Self = StObject.set(x, "floorMeshes", js.undefined)
    
    @scala.inline
    def setFloorMeshesVarargs(value: Mesh*): Self = StObject.set(x, "floorMeshes", js.Array(value :_*))
    
    @scala.inline
    def setTeleportationMode(value: Double): Self = StObject.set(x, "teleportationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeleportationModeUndefined: Self = StObject.set(x, "teleportationMode", js.undefined)
    
    @scala.inline
    def setTeleportationSpeed(value: Double): Self = StObject.set(x, "teleportationSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeleportationSpeedUndefined: Self = StObject.set(x, "teleportationSpeed", js.undefined)
    
    @scala.inline
    def setTeleportationTime(value: Double): Self = StObject.set(x, "teleportationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeleportationTimeUndefined: Self = StObject.set(x, "teleportationTime", js.undefined)
  }
}
