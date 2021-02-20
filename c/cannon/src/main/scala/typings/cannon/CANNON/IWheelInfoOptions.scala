package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWheelInfoOptions extends StObject {
  
  var axis: js.UndefOr[Vec3] = js.native
  
  var axleLocal: js.UndefOr[Vec3] = js.native
  
  var axleWorld: js.UndefOr[Vec3] = js.native
  
  var body: js.UndefOr[Body] = js.native
  
  var chassisConnectionPointLocal: js.UndefOr[Vec3] = js.native
  
  var chassisConnectionPointWorld: js.UndefOr[Vec3] = js.native
  
  var clippedInvContactDotSuspension: js.UndefOr[Double] = js.native
  
  var customSlidingRotationalSpeed: js.UndefOr[Double] = js.native
  
  var dampingCompression: js.UndefOr[Double] = js.native
  
  var dampingRelaxation: js.UndefOr[Double] = js.native
  
  var deltaRotation: js.UndefOr[Double] = js.native
  
  var direction: js.UndefOr[Vec3] = js.native
  
  var directionLocal: js.UndefOr[Vec3] = js.native
  
  var directionWorld: js.UndefOr[Vec3] = js.native
  
  var frictionSlip: js.UndefOr[Double] = js.native
  
  var isFronmtWheel: js.UndefOr[Boolean] = js.native
  
  var maxSuspensionForce: js.UndefOr[Double] = js.native
  
  var maxSuspensionTravel: js.UndefOr[Double] = js.native
  
  var position: js.UndefOr[Vec3] = js.native
  
  var radius: js.UndefOr[Double] = js.native
  
  var rollInfluence: js.UndefOr[Double] = js.native
  
  var rotation: js.UndefOr[Double] = js.native
  
  var skidInfo: js.UndefOr[Double] = js.native
  
  var steering: js.UndefOr[Double] = js.native
  
  var suspensionForce: js.UndefOr[Double] = js.native
  
  var suspensionLength: js.UndefOr[Double] = js.native
  
  var suspensionMaxLength: js.UndefOr[Double] = js.native
  
  var suspensionRelativeVelocity: js.UndefOr[Double] = js.native
  
  var suspensionRestLength: js.UndefOr[Double] = js.native
  
  var suspensionStiffness: js.UndefOr[Double] = js.native
  
  var useCustomSlidingRotationalSpeed: js.UndefOr[Boolean] = js.native
}
object IWheelInfoOptions {
  
  @scala.inline
  def apply(): IWheelInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWheelInfoOptions]
  }
  
  @scala.inline
  implicit class IWheelInfoOptionsMutableBuilder[Self <: IWheelInfoOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: Vec3): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setAxleLocal(value: Vec3): Self = StObject.set(x, "axleLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxleLocalUndefined: Self = StObject.set(x, "axleLocal", js.undefined)
    
    @scala.inline
    def setAxleWorld(value: Vec3): Self = StObject.set(x, "axleWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxleWorldUndefined: Self = StObject.set(x, "axleWorld", js.undefined)
    
    @scala.inline
    def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setChassisConnectionPointLocal(value: Vec3): Self = StObject.set(x, "chassisConnectionPointLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChassisConnectionPointLocalUndefined: Self = StObject.set(x, "chassisConnectionPointLocal", js.undefined)
    
    @scala.inline
    def setChassisConnectionPointWorld(value: Vec3): Self = StObject.set(x, "chassisConnectionPointWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChassisConnectionPointWorldUndefined: Self = StObject.set(x, "chassisConnectionPointWorld", js.undefined)
    
    @scala.inline
    def setClippedInvContactDotSuspension(value: Double): Self = StObject.set(x, "clippedInvContactDotSuspension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippedInvContactDotSuspensionUndefined: Self = StObject.set(x, "clippedInvContactDotSuspension", js.undefined)
    
    @scala.inline
    def setCustomSlidingRotationalSpeed(value: Double): Self = StObject.set(x, "customSlidingRotationalSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSlidingRotationalSpeedUndefined: Self = StObject.set(x, "customSlidingRotationalSpeed", js.undefined)
    
    @scala.inline
    def setDampingCompression(value: Double): Self = StObject.set(x, "dampingCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingCompressionUndefined: Self = StObject.set(x, "dampingCompression", js.undefined)
    
    @scala.inline
    def setDampingRelaxation(value: Double): Self = StObject.set(x, "dampingRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingRelaxationUndefined: Self = StObject.set(x, "dampingRelaxation", js.undefined)
    
    @scala.inline
    def setDeltaRotation(value: Double): Self = StObject.set(x, "deltaRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaRotationUndefined: Self = StObject.set(x, "deltaRotation", js.undefined)
    
    @scala.inline
    def setDirection(value: Vec3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionLocal(value: Vec3): Self = StObject.set(x, "directionLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionLocalUndefined: Self = StObject.set(x, "directionLocal", js.undefined)
    
    @scala.inline
    def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    @scala.inline
    def setDirectionWorld(value: Vec3): Self = StObject.set(x, "directionWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionWorldUndefined: Self = StObject.set(x, "directionWorld", js.undefined)
    
    @scala.inline
    def setFrictionSlip(value: Double): Self = StObject.set(x, "frictionSlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionSlipUndefined: Self = StObject.set(x, "frictionSlip", js.undefined)
    
    @scala.inline
    def setIsFronmtWheel(value: Boolean): Self = StObject.set(x, "isFronmtWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFronmtWheelUndefined: Self = StObject.set(x, "isFronmtWheel", js.undefined)
    
    @scala.inline
    def setMaxSuspensionForce(value: Double): Self = StObject.set(x, "maxSuspensionForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSuspensionForceUndefined: Self = StObject.set(x, "maxSuspensionForce", js.undefined)
    
    @scala.inline
    def setMaxSuspensionTravel(value: Double): Self = StObject.set(x, "maxSuspensionTravel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSuspensionTravelUndefined: Self = StObject.set(x, "maxSuspensionTravel", js.undefined)
    
    @scala.inline
    def setPosition(value: Vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    @scala.inline
    def setRollInfluence(value: Double): Self = StObject.set(x, "rollInfluence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollInfluenceUndefined: Self = StObject.set(x, "rollInfluence", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    @scala.inline
    def setSkidInfo(value: Double): Self = StObject.set(x, "skidInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkidInfoUndefined: Self = StObject.set(x, "skidInfo", js.undefined)
    
    @scala.inline
    def setSteering(value: Double): Self = StObject.set(x, "steering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteeringUndefined: Self = StObject.set(x, "steering", js.undefined)
    
    @scala.inline
    def setSuspensionForce(value: Double): Self = StObject.set(x, "suspensionForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionForceUndefined: Self = StObject.set(x, "suspensionForce", js.undefined)
    
    @scala.inline
    def setSuspensionLength(value: Double): Self = StObject.set(x, "suspensionLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionLengthUndefined: Self = StObject.set(x, "suspensionLength", js.undefined)
    
    @scala.inline
    def setSuspensionMaxLength(value: Double): Self = StObject.set(x, "suspensionMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionMaxLengthUndefined: Self = StObject.set(x, "suspensionMaxLength", js.undefined)
    
    @scala.inline
    def setSuspensionRelativeVelocity(value: Double): Self = StObject.set(x, "suspensionRelativeVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionRelativeVelocityUndefined: Self = StObject.set(x, "suspensionRelativeVelocity", js.undefined)
    
    @scala.inline
    def setSuspensionRestLength(value: Double): Self = StObject.set(x, "suspensionRestLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionRestLengthUndefined: Self = StObject.set(x, "suspensionRestLength", js.undefined)
    
    @scala.inline
    def setSuspensionStiffness(value: Double): Self = StObject.set(x, "suspensionStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionStiffnessUndefined: Self = StObject.set(x, "suspensionStiffness", js.undefined)
    
    @scala.inline
    def setUseCustomSlidingRotationalSpeed(value: Boolean): Self = StObject.set(x, "useCustomSlidingRotationalSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomSlidingRotationalSpeedUndefined: Self = StObject.set(x, "useCustomSlidingRotationalSpeed", js.undefined)
  }
}
