package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WheelInfo extends js.Object {
  
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
  implicit class WheelInfoOps[Self <: WheelInfo] (val x: Self) extends AnyVal {
    
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
    def setAxleLocal(value: Vec3): Self = this.set("axleLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxleWorld(value: Vec3): Self = this.set("axleWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrake(value: Double): Self = this.set("brake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChassisConnectionPointLocal(value: Vec3): Self = this.set("chassisConnectionPointLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChassisConnectionPointWorld(value: Vec3): Self = this.set("chassisConnectionPointWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClippedInvContactDotSuspension(value: Double): Self = this.set("clippedInvContactDotSuspension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSlidingRotationalSpeed(value: Double): Self = this.set("customSlidingRotationalSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingCompression(value: Double): Self = this.set("dampingCompression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingRelaxation(value: Double): Self = this.set("dampingRelaxation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaRotation(value: Double): Self = this.set("deltaRotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionLocal(value: Vec3): Self = this.set("directionLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionWorld(value: Vec3): Self = this.set("directionWorld", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineForce(value: Double): Self = this.set("engineForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForwardImpulse(value: Double): Self = this.set("forwardImpulse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrictionSlip(value: Double): Self = this.set("frictionSlip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFrontWheel(value: Boolean): Self = this.set("isFrontWheel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInContact(value: Boolean): Self = this.set("isInContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSuspensionForce(value: Double): Self = this.set("maxSuspensionForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSuspensionTravbel(value: Double): Self = this.set("maxSuspensionTravbel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaycastResult(value: RaycastResult): Self = this.set("raycastResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollInfluence(value: Double): Self = this.set("rollInfluence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideImpulse(value: Double): Self = this.set("sideImpulse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkidInfo(value: Double): Self = this.set("skidInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSliding(value: Boolean): Self = this.set("sliding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSteering(value: Double): Self = this.set("steering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionForce(value: Double): Self = this.set("suspensionForce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionLength(value: Double): Self = this.set("suspensionLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionMaxLength(value: Double): Self = this.set("suspensionMaxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionRelativeVelocity(value: Double): Self = this.set("suspensionRelativeVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionRestLength(value: Double): Self = this.set("suspensionRestLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspensionStiffness(value: Double): Self = this.set("suspensionStiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCustomSlidingRotationalSpeed(value: Boolean): Self = this.set("useCustomSlidingRotationalSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorldTransform(value: Transform): Self = this.set("worldTransform", value.asInstanceOf[js.Any])
  }
}
