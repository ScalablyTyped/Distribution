package typings.babylonjs.anon

import typings.babylonjs.mathAxisMod.Space
import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdjustPitch extends StObject {
  
  var adjustPitch: js.UndefOr[Double] = js.native
  
  var adjustRoll: js.UndefOr[Double] = js.native
  
  var adjustYaw: js.UndefOr[Double] = js.native
  
  var maxPitch: js.UndefOr[Double] = js.native
  
  var maxYaw: js.UndefOr[Double] = js.native
  
  var minPitch: js.UndefOr[Double] = js.native
  
  var minYaw: js.UndefOr[Double] = js.native
  
  var pitchAxis: js.UndefOr[Vector3] = js.native
  
  var slerpAmount: js.UndefOr[Double] = js.native
  
  var upAxis: js.UndefOr[Vector3] = js.native
  
  var upAxisSpace: js.UndefOr[Space] = js.native
  
  var yawAxis: js.UndefOr[Vector3] = js.native
}
object AdjustPitch {
  
  @scala.inline
  def apply(): AdjustPitch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdjustPitch]
  }
  
  @scala.inline
  implicit class AdjustPitchMutableBuilder[Self <: AdjustPitch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustPitch(value: Double): Self = StObject.set(x, "adjustPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustPitchUndefined: Self = StObject.set(x, "adjustPitch", js.undefined)
    
    @scala.inline
    def setAdjustRoll(value: Double): Self = StObject.set(x, "adjustRoll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustRollUndefined: Self = StObject.set(x, "adjustRoll", js.undefined)
    
    @scala.inline
    def setAdjustYaw(value: Double): Self = StObject.set(x, "adjustYaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdjustYawUndefined: Self = StObject.set(x, "adjustYaw", js.undefined)
    
    @scala.inline
    def setMaxPitch(value: Double): Self = StObject.set(x, "maxPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPitchUndefined: Self = StObject.set(x, "maxPitch", js.undefined)
    
    @scala.inline
    def setMaxYaw(value: Double): Self = StObject.set(x, "maxYaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxYawUndefined: Self = StObject.set(x, "maxYaw", js.undefined)
    
    @scala.inline
    def setMinPitch(value: Double): Self = StObject.set(x, "minPitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinPitchUndefined: Self = StObject.set(x, "minPitch", js.undefined)
    
    @scala.inline
    def setMinYaw(value: Double): Self = StObject.set(x, "minYaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinYawUndefined: Self = StObject.set(x, "minYaw", js.undefined)
    
    @scala.inline
    def setPitchAxis(value: Vector3): Self = StObject.set(x, "pitchAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPitchAxisUndefined: Self = StObject.set(x, "pitchAxis", js.undefined)
    
    @scala.inline
    def setSlerpAmount(value: Double): Self = StObject.set(x, "slerpAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlerpAmountUndefined: Self = StObject.set(x, "slerpAmount", js.undefined)
    
    @scala.inline
    def setUpAxis(value: Vector3): Self = StObject.set(x, "upAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpAxisSpace(value: Space): Self = StObject.set(x, "upAxisSpace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpAxisSpaceUndefined: Self = StObject.set(x, "upAxisSpace", js.undefined)
    
    @scala.inline
    def setUpAxisUndefined: Self = StObject.set(x, "upAxis", js.undefined)
    
    @scala.inline
    def setYawAxis(value: Vector3): Self = StObject.set(x, "yawAxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYawAxisUndefined: Self = StObject.set(x, "yawAxis", js.undefined)
  }
}
