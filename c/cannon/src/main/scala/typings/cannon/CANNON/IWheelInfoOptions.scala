package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWheelInfoOptions extends StObject {
  
  var axis: js.UndefOr[Vec3] = js.undefined
  
  var axleLocal: js.UndefOr[Vec3] = js.undefined
  
  var axleWorld: js.UndefOr[Vec3] = js.undefined
  
  var body: js.UndefOr[Body] = js.undefined
  
  var chassisConnectionPointLocal: js.UndefOr[Vec3] = js.undefined
  
  var chassisConnectionPointWorld: js.UndefOr[Vec3] = js.undefined
  
  var clippedInvContactDotSuspension: js.UndefOr[Double] = js.undefined
  
  var customSlidingRotationalSpeed: js.UndefOr[Double] = js.undefined
  
  var dampingCompression: js.UndefOr[Double] = js.undefined
  
  var dampingRelaxation: js.UndefOr[Double] = js.undefined
  
  var deltaRotation: js.UndefOr[Double] = js.undefined
  
  var direction: js.UndefOr[Vec3] = js.undefined
  
  var directionLocal: js.UndefOr[Vec3] = js.undefined
  
  var directionWorld: js.UndefOr[Vec3] = js.undefined
  
  var frictionSlip: js.UndefOr[Double] = js.undefined
  
  var isFronmtWheel: js.UndefOr[Boolean] = js.undefined
  
  var maxSuspensionForce: js.UndefOr[Double] = js.undefined
  
  var maxSuspensionTravel: js.UndefOr[Double] = js.undefined
  
  var position: js.UndefOr[Vec3] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var rollInfluence: js.UndefOr[Double] = js.undefined
  
  var rotation: js.UndefOr[Double] = js.undefined
  
  var skidInfo: js.UndefOr[Double] = js.undefined
  
  var steering: js.UndefOr[Double] = js.undefined
  
  var suspensionForce: js.UndefOr[Double] = js.undefined
  
  var suspensionLength: js.UndefOr[Double] = js.undefined
  
  var suspensionMaxLength: js.UndefOr[Double] = js.undefined
  
  var suspensionRelativeVelocity: js.UndefOr[Double] = js.undefined
  
  var suspensionRestLength: js.UndefOr[Double] = js.undefined
  
  var suspensionStiffness: js.UndefOr[Double] = js.undefined
  
  var useCustomSlidingRotationalSpeed: js.UndefOr[Boolean] = js.undefined
}
object IWheelInfoOptions {
  
  inline def apply(): IWheelInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWheelInfoOptions]
  }
  
  extension [Self <: IWheelInfoOptions](x: Self) {
    
    inline def setAxis(value: Vec3): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setAxleLocal(value: Vec3): Self = StObject.set(x, "axleLocal", value.asInstanceOf[js.Any])
    
    inline def setAxleLocalUndefined: Self = StObject.set(x, "axleLocal", js.undefined)
    
    inline def setAxleWorld(value: Vec3): Self = StObject.set(x, "axleWorld", value.asInstanceOf[js.Any])
    
    inline def setAxleWorldUndefined: Self = StObject.set(x, "axleWorld", js.undefined)
    
    inline def setBody(value: Body): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setChassisConnectionPointLocal(value: Vec3): Self = StObject.set(x, "chassisConnectionPointLocal", value.asInstanceOf[js.Any])
    
    inline def setChassisConnectionPointLocalUndefined: Self = StObject.set(x, "chassisConnectionPointLocal", js.undefined)
    
    inline def setChassisConnectionPointWorld(value: Vec3): Self = StObject.set(x, "chassisConnectionPointWorld", value.asInstanceOf[js.Any])
    
    inline def setChassisConnectionPointWorldUndefined: Self = StObject.set(x, "chassisConnectionPointWorld", js.undefined)
    
    inline def setClippedInvContactDotSuspension(value: Double): Self = StObject.set(x, "clippedInvContactDotSuspension", value.asInstanceOf[js.Any])
    
    inline def setClippedInvContactDotSuspensionUndefined: Self = StObject.set(x, "clippedInvContactDotSuspension", js.undefined)
    
    inline def setCustomSlidingRotationalSpeed(value: Double): Self = StObject.set(x, "customSlidingRotationalSpeed", value.asInstanceOf[js.Any])
    
    inline def setCustomSlidingRotationalSpeedUndefined: Self = StObject.set(x, "customSlidingRotationalSpeed", js.undefined)
    
    inline def setDampingCompression(value: Double): Self = StObject.set(x, "dampingCompression", value.asInstanceOf[js.Any])
    
    inline def setDampingCompressionUndefined: Self = StObject.set(x, "dampingCompression", js.undefined)
    
    inline def setDampingRelaxation(value: Double): Self = StObject.set(x, "dampingRelaxation", value.asInstanceOf[js.Any])
    
    inline def setDampingRelaxationUndefined: Self = StObject.set(x, "dampingRelaxation", js.undefined)
    
    inline def setDeltaRotation(value: Double): Self = StObject.set(x, "deltaRotation", value.asInstanceOf[js.Any])
    
    inline def setDeltaRotationUndefined: Self = StObject.set(x, "deltaRotation", js.undefined)
    
    inline def setDirection(value: Vec3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionLocal(value: Vec3): Self = StObject.set(x, "directionLocal", value.asInstanceOf[js.Any])
    
    inline def setDirectionLocalUndefined: Self = StObject.set(x, "directionLocal", js.undefined)
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDirectionWorld(value: Vec3): Self = StObject.set(x, "directionWorld", value.asInstanceOf[js.Any])
    
    inline def setDirectionWorldUndefined: Self = StObject.set(x, "directionWorld", js.undefined)
    
    inline def setFrictionSlip(value: Double): Self = StObject.set(x, "frictionSlip", value.asInstanceOf[js.Any])
    
    inline def setFrictionSlipUndefined: Self = StObject.set(x, "frictionSlip", js.undefined)
    
    inline def setIsFronmtWheel(value: Boolean): Self = StObject.set(x, "isFronmtWheel", value.asInstanceOf[js.Any])
    
    inline def setIsFronmtWheelUndefined: Self = StObject.set(x, "isFronmtWheel", js.undefined)
    
    inline def setMaxSuspensionForce(value: Double): Self = StObject.set(x, "maxSuspensionForce", value.asInstanceOf[js.Any])
    
    inline def setMaxSuspensionForceUndefined: Self = StObject.set(x, "maxSuspensionForce", js.undefined)
    
    inline def setMaxSuspensionTravel(value: Double): Self = StObject.set(x, "maxSuspensionTravel", value.asInstanceOf[js.Any])
    
    inline def setMaxSuspensionTravelUndefined: Self = StObject.set(x, "maxSuspensionTravel", js.undefined)
    
    inline def setPosition(value: Vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setRollInfluence(value: Double): Self = StObject.set(x, "rollInfluence", value.asInstanceOf[js.Any])
    
    inline def setRollInfluenceUndefined: Self = StObject.set(x, "rollInfluence", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setSkidInfo(value: Double): Self = StObject.set(x, "skidInfo", value.asInstanceOf[js.Any])
    
    inline def setSkidInfoUndefined: Self = StObject.set(x, "skidInfo", js.undefined)
    
    inline def setSteering(value: Double): Self = StObject.set(x, "steering", value.asInstanceOf[js.Any])
    
    inline def setSteeringUndefined: Self = StObject.set(x, "steering", js.undefined)
    
    inline def setSuspensionForce(value: Double): Self = StObject.set(x, "suspensionForce", value.asInstanceOf[js.Any])
    
    inline def setSuspensionForceUndefined: Self = StObject.set(x, "suspensionForce", js.undefined)
    
    inline def setSuspensionLength(value: Double): Self = StObject.set(x, "suspensionLength", value.asInstanceOf[js.Any])
    
    inline def setSuspensionLengthUndefined: Self = StObject.set(x, "suspensionLength", js.undefined)
    
    inline def setSuspensionMaxLength(value: Double): Self = StObject.set(x, "suspensionMaxLength", value.asInstanceOf[js.Any])
    
    inline def setSuspensionMaxLengthUndefined: Self = StObject.set(x, "suspensionMaxLength", js.undefined)
    
    inline def setSuspensionRelativeVelocity(value: Double): Self = StObject.set(x, "suspensionRelativeVelocity", value.asInstanceOf[js.Any])
    
    inline def setSuspensionRelativeVelocityUndefined: Self = StObject.set(x, "suspensionRelativeVelocity", js.undefined)
    
    inline def setSuspensionRestLength(value: Double): Self = StObject.set(x, "suspensionRestLength", value.asInstanceOf[js.Any])
    
    inline def setSuspensionRestLengthUndefined: Self = StObject.set(x, "suspensionRestLength", js.undefined)
    
    inline def setSuspensionStiffness(value: Double): Self = StObject.set(x, "suspensionStiffness", value.asInstanceOf[js.Any])
    
    inline def setSuspensionStiffnessUndefined: Self = StObject.set(x, "suspensionStiffness", js.undefined)
    
    inline def setUseCustomSlidingRotationalSpeed(value: Boolean): Self = StObject.set(x, "useCustomSlidingRotationalSpeed", value.asInstanceOf[js.Any])
    
    inline def setUseCustomSlidingRotationalSpeedUndefined: Self = StObject.set(x, "useCustomSlidingRotationalSpeed", js.undefined)
  }
}
