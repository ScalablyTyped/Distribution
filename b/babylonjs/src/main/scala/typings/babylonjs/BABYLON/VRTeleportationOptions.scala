package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VRTeleportationOptions extends StObject {
  
  /**
    * The easing function used in the animation or null for Linear. (default CircleEase)
    */
  var easingFunction: js.UndefOr[EasingFunction] = js.undefined
  
  /**
    * The name of the mesh which should be used as the teleportation floor. (default: null)
    */
  var floorMeshName: js.UndefOr[String] = js.undefined
  
  /**
    * A list of meshes to be used as the teleportation floor. (default: empty)
    */
  var floorMeshes: js.UndefOr[js.Array[Mesh]] = js.undefined
  
  /**
    * The teleportation mode. (default: TELEPORTATIONMODE_CONSTANTTIME)
    */
  var teleportationMode: js.UndefOr[Double] = js.undefined
  
  /**
    * The speed of the animation in distance/sec, apply when animationMode is TELEPORTATIONMODE_CONSTANTSPEED. (default 20 units / sec)
    */
  var teleportationSpeed: js.UndefOr[Double] = js.undefined
  
  /**
    * The duration of the animation in ms, apply when animationMode is TELEPORTATIONMODE_CONSTANTTIME. (default 122ms)
    */
  var teleportationTime: js.UndefOr[Double] = js.undefined
}
object VRTeleportationOptions {
  
  inline def apply(): VRTeleportationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRTeleportationOptions]
  }
  
  extension [Self <: VRTeleportationOptions](x: Self) {
    
    inline def setEasingFunction(value: EasingFunction): Self = StObject.set(x, "easingFunction", value.asInstanceOf[js.Any])
    
    inline def setEasingFunctionUndefined: Self = StObject.set(x, "easingFunction", js.undefined)
    
    inline def setFloorMeshName(value: String): Self = StObject.set(x, "floorMeshName", value.asInstanceOf[js.Any])
    
    inline def setFloorMeshNameUndefined: Self = StObject.set(x, "floorMeshName", js.undefined)
    
    inline def setFloorMeshes(value: js.Array[Mesh]): Self = StObject.set(x, "floorMeshes", value.asInstanceOf[js.Any])
    
    inline def setFloorMeshesUndefined: Self = StObject.set(x, "floorMeshes", js.undefined)
    
    inline def setFloorMeshesVarargs(value: Mesh*): Self = StObject.set(x, "floorMeshes", js.Array(value*))
    
    inline def setTeleportationMode(value: Double): Self = StObject.set(x, "teleportationMode", value.asInstanceOf[js.Any])
    
    inline def setTeleportationModeUndefined: Self = StObject.set(x, "teleportationMode", js.undefined)
    
    inline def setTeleportationSpeed(value: Double): Self = StObject.set(x, "teleportationSpeed", value.asInstanceOf[js.Any])
    
    inline def setTeleportationSpeedUndefined: Self = StObject.set(x, "teleportationSpeed", js.undefined)
    
    inline def setTeleportationTime(value: Double): Self = StObject.set(x, "teleportationTime", value.asInstanceOf[js.Any])
    
    inline def setTeleportationTimeUndefined: Self = StObject.set(x, "teleportationTime", js.undefined)
  }
}
