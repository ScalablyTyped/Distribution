package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Space
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdjustRoll extends StObject {
  
  var adjustPitch: js.UndefOr[Double] = js.undefined
  
  var adjustRoll: js.UndefOr[Double] = js.undefined
  
  var adjustYaw: js.UndefOr[Double] = js.undefined
  
  var maxPitch: js.UndefOr[Double] = js.undefined
  
  var maxYaw: js.UndefOr[Double] = js.undefined
  
  var minPitch: js.UndefOr[Double] = js.undefined
  
  var minYaw: js.UndefOr[Double] = js.undefined
  
  var pitchAxis: js.UndefOr[Vector3] = js.undefined
  
  var slerpAmount: js.UndefOr[Double] = js.undefined
  
  var upAxis: js.UndefOr[Vector3] = js.undefined
  
  var upAxisSpace: js.UndefOr[Space] = js.undefined
  
  var yawAxis: js.UndefOr[Vector3] = js.undefined
}
object AdjustRoll {
  
  inline def apply(): AdjustRoll = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustRoll]
  }
  
  extension [Self <: AdjustRoll](x: Self) {
    
    inline def setAdjustPitch(value: Double): Self = StObject.set(x, "adjustPitch", value.asInstanceOf[js.Any])
    
    inline def setAdjustPitchUndefined: Self = StObject.set(x, "adjustPitch", js.undefined)
    
    inline def setAdjustRoll(value: Double): Self = StObject.set(x, "adjustRoll", value.asInstanceOf[js.Any])
    
    inline def setAdjustRollUndefined: Self = StObject.set(x, "adjustRoll", js.undefined)
    
    inline def setAdjustYaw(value: Double): Self = StObject.set(x, "adjustYaw", value.asInstanceOf[js.Any])
    
    inline def setAdjustYawUndefined: Self = StObject.set(x, "adjustYaw", js.undefined)
    
    inline def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
    
    inline def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
    
    inline def setMaxYaw(value: Double): Self = StObject.set(x, "maxYaw", value.asInstanceOf[js.Any])
    
    inline def setMaxYawUndefined: Self = StObject.set(x, "maxYaw", js.undefined)
    
    inline def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
    
    inline def setMinPitchUndefined: Self = StObject.set(x, "minPitch", js.undefined)
    
    inline def setMinYaw(value: Double): Self = StObject.set(x, "minYaw", value.asInstanceOf[js.Any])
    
    inline def setMinYawUndefined: Self = StObject.set(x, "minYaw", js.undefined)
    
    inline def setPitchAxis(value: Vector3): Self = StObject.set(x, "pitchAxis", value.asInstanceOf[js.Any])
    
    inline def setPitchAxisUndefined: Self = StObject.set(x, "pitchAxis", js.undefined)
    
    inline def setSlerpAmount(value: Double): Self = StObject.set(x, "slerpAmount", value.asInstanceOf[js.Any])
    
    inline def setSlerpAmountUndefined: Self = StObject.set(x, "slerpAmount", js.undefined)
    
    inline def setUpAxis(value: Vector3): Self = StObject.set(x, "upAxis", value.asInstanceOf[js.Any])
    
    inline def setUpAxisSpace(value: Space): Self = StObject.set(x, "upAxisSpace", value.asInstanceOf[js.Any])
    
    inline def setUpAxisSpaceUndefined: Self = StObject.set(x, "upAxisSpace", js.undefined)
    
    inline def setUpAxisUndefined: Self = StObject.set(x, "upAxis", js.undefined)
    
    inline def setYawAxis(value: Vector3): Self = StObject.set(x, "yawAxis", value.asInstanceOf[js.Any])
    
    inline def setYawAxisUndefined: Self = StObject.set(x, "yawAxis", js.undefined)
  }
}
