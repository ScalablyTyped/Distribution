package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WheelInfo extends StObject {
  
  var axleLocal: Vec3 = js.native
  
  var axleWorld: Vec3 = js.native
  
  var brake: Double = js.native
  
  var chassisConnectionPointLocal: Vec3 = js.native
  
  var chassisConnectionPointWorld: Vec3 = js.native
  
  var clippedInvContactDotSuspension: Double = js.native
  
  var customSlidingRotationalSpeed: Double = js.native
  
  var dampingCompression: Double = js.native
  
  var dampingRelaxation: Double = js.native
  
  var deltaRotation: Double = js.native
  
  var directionLocal: Vec3 = js.native
  
  var directionWorld: Vec3 = js.native
  
  var engineForce: Double = js.native
  
  var forwardImpulse: Double = js.native
  
  var frictionSlip: Double = js.native
  
  var isFrontWheel: Boolean = js.native
  
  var isInContact: Boolean = js.native
  
  var maxSuspensionForce: Double = js.native
  
  var maxSuspensionTravbel: Double = js.native
  
  var radius: Double = js.native
  
  var raycastResult: RaycastResult = js.native
  
  var rollInfluence: Double = js.native
  
  var rotation: Double = js.native
  
  var sideImpulse: Double = js.native
  
  var skidInfo: Double = js.native
  
  var sliding: Boolean = js.native
  
  var steering: Double = js.native
  
  var suspensionForce: Double = js.native
  
  var suspensionLength: Double = js.native
  
  var suspensionMaxLength: Double = js.native
  
  var suspensionRelativeVelocity: Double = js.native
  
  var suspensionRestLength: Double = js.native
  
  var suspensionStiffness: Double = js.native
  
  var useCustomSlidingRotationalSpeed: Boolean = js.native
  
  var worldTransform: Transform = js.native
}
object WheelInfo {
  
  @scala.inline
  def apply(
    axleLocal: Vec3,
    axleWorld: Vec3,
    brake: Double,
    chassisConnectionPointLocal: Vec3,
    chassisConnectionPointWorld: Vec3,
    clippedInvContactDotSuspension: Double,
    customSlidingRotationalSpeed: Double,
    dampingCompression: Double,
    dampingRelaxation: Double,
    deltaRotation: Double,
    directionLocal: Vec3,
    directionWorld: Vec3,
    engineForce: Double,
    forwardImpulse: Double,
    frictionSlip: Double,
    isFrontWheel: Boolean,
    isInContact: Boolean,
    maxSuspensionForce: Double,
    maxSuspensionTravbel: Double,
    radius: Double,
    raycastResult: RaycastResult,
    rollInfluence: Double,
    rotation: Double,
    sideImpulse: Double,
    skidInfo: Double,
    sliding: Boolean,
    steering: Double,
    suspensionForce: Double,
    suspensionLength: Double,
    suspensionMaxLength: Double,
    suspensionRelativeVelocity: Double,
    suspensionRestLength: Double,
    suspensionStiffness: Double,
    useCustomSlidingRotationalSpeed: Boolean,
    worldTransform: Transform
  ): WheelInfo = {
    val __obj = js.Dynamic.literal(axleLocal = axleLocal.asInstanceOf[js.Any], axleWorld = axleWorld.asInstanceOf[js.Any], brake = brake.asInstanceOf[js.Any], chassisConnectionPointLocal = chassisConnectionPointLocal.asInstanceOf[js.Any], chassisConnectionPointWorld = chassisConnectionPointWorld.asInstanceOf[js.Any], clippedInvContactDotSuspension = clippedInvContactDotSuspension.asInstanceOf[js.Any], customSlidingRotationalSpeed = customSlidingRotationalSpeed.asInstanceOf[js.Any], dampingCompression = dampingCompression.asInstanceOf[js.Any], dampingRelaxation = dampingRelaxation.asInstanceOf[js.Any], deltaRotation = deltaRotation.asInstanceOf[js.Any], directionLocal = directionLocal.asInstanceOf[js.Any], directionWorld = directionWorld.asInstanceOf[js.Any], engineForce = engineForce.asInstanceOf[js.Any], forwardImpulse = forwardImpulse.asInstanceOf[js.Any], frictionSlip = frictionSlip.asInstanceOf[js.Any], isFrontWheel = isFrontWheel.asInstanceOf[js.Any], isInContact = isInContact.asInstanceOf[js.Any], maxSuspensionForce = maxSuspensionForce.asInstanceOf[js.Any], maxSuspensionTravbel = maxSuspensionTravbel.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], raycastResult = raycastResult.asInstanceOf[js.Any], rollInfluence = rollInfluence.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], sideImpulse = sideImpulse.asInstanceOf[js.Any], skidInfo = skidInfo.asInstanceOf[js.Any], sliding = sliding.asInstanceOf[js.Any], steering = steering.asInstanceOf[js.Any], suspensionForce = suspensionForce.asInstanceOf[js.Any], suspensionLength = suspensionLength.asInstanceOf[js.Any], suspensionMaxLength = suspensionMaxLength.asInstanceOf[js.Any], suspensionRelativeVelocity = suspensionRelativeVelocity.asInstanceOf[js.Any], suspensionRestLength = suspensionRestLength.asInstanceOf[js.Any], suspensionStiffness = suspensionStiffness.asInstanceOf[js.Any], useCustomSlidingRotationalSpeed = useCustomSlidingRotationalSpeed.asInstanceOf[js.Any], worldTransform = worldTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[WheelInfo]
  }
  
  @scala.inline
  implicit class WheelInfoMutableBuilder[Self <: WheelInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxleLocal(value: Vec3): Self = StObject.set(x, "axleLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxleWorld(value: Vec3): Self = StObject.set(x, "axleWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrake(value: Double): Self = StObject.set(x, "brake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChassisConnectionPointLocal(value: Vec3): Self = StObject.set(x, "chassisConnectionPointLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChassisConnectionPointWorld(value: Vec3): Self = StObject.set(x, "chassisConnectionPointWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippedInvContactDotSuspension(value: Double): Self = StObject.set(x, "clippedInvContactDotSuspension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSlidingRotationalSpeed(value: Double): Self = StObject.set(x, "customSlidingRotationalSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingCompression(value: Double): Self = StObject.set(x, "dampingCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingRelaxation(value: Double): Self = StObject.set(x, "dampingRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaRotation(value: Double): Self = StObject.set(x, "deltaRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionLocal(value: Vec3): Self = StObject.set(x, "directionLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionWorld(value: Vec3): Self = StObject.set(x, "directionWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineForce(value: Double): Self = StObject.set(x, "engineForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardImpulse(value: Double): Self = StObject.set(x, "forwardImpulse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionSlip(value: Double): Self = StObject.set(x, "frictionSlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFrontWheel(value: Boolean): Self = StObject.set(x, "isFrontWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInContact(value: Boolean): Self = StObject.set(x, "isInContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSuspensionForce(value: Double): Self = StObject.set(x, "maxSuspensionForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSuspensionTravbel(value: Double): Self = StObject.set(x, "maxSuspensionTravbel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaycastResult(value: RaycastResult): Self = StObject.set(x, "raycastResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollInfluence(value: Double): Self = StObject.set(x, "rollInfluence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideImpulse(value: Double): Self = StObject.set(x, "sideImpulse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkidInfo(value: Double): Self = StObject.set(x, "skidInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliding(value: Boolean): Self = StObject.set(x, "sliding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteering(value: Double): Self = StObject.set(x, "steering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionForce(value: Double): Self = StObject.set(x, "suspensionForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionLength(value: Double): Self = StObject.set(x, "suspensionLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionMaxLength(value: Double): Self = StObject.set(x, "suspensionMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionRelativeVelocity(value: Double): Self = StObject.set(x, "suspensionRelativeVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionRestLength(value: Double): Self = StObject.set(x, "suspensionRestLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionStiffness(value: Double): Self = StObject.set(x, "suspensionStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomSlidingRotationalSpeed(value: Boolean): Self = StObject.set(x, "useCustomSlidingRotationalSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldTransform(value: Transform): Self = StObject.set(x, "worldTransform", value.asInstanceOf[js.Any])
  }
}
