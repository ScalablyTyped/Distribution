package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WheelInfo extends js.Object {
  var axleLocal: Vec3
  var axleWorld: Vec3
  var brake: Double
  var chassisConnectionPointLocal: Vec3
  var chassisConnectionPointWorld: Vec3
  var clippedInvContactDotSuspension: Double
  var customSlidingRotationalSpeed: Double
  var dampingCompression: Double
  var dampingRelaxation: Double
  var deltaRotation: Double
  var directionLocal: Vec3
  var directionWorld: Vec3
  var engineForce: Double
  var forwardImpulse: Double
  var frictionSlip: Double
  var isFrontWheel: Boolean
  var isInContact: Boolean
  var maxSuspensionForce: Double
  var maxSuspensionTravbel: Double
  var radius: Double
  var raycastResult: RaycastResult
  var rollInfluence: Double
  var rotation: Double
  var sideImpulse: Double
  var skidInfo: Double
  var sliding: Boolean
  var steering: Double
  var suspensionForce: Double
  var suspensionLength: Double
  var suspensionMaxLength: Double
  var suspensionRelativeVelocity: Double
  var suspensionRestLength: Double
  var suspensionStiffness: Double
  var useCustomSlidingRotationalSpeed: Boolean
  var worldTransform: Transform
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
}

