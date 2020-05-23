package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWheelInfoOptions extends js.Object {
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
  @scala.inline
  def apply(
    axis: Vec3 = null,
    axleLocal: Vec3 = null,
    axleWorld: Vec3 = null,
    body: Body = null,
    chassisConnectionPointLocal: Vec3 = null,
    chassisConnectionPointWorld: Vec3 = null,
    clippedInvContactDotSuspension: js.UndefOr[Double] = js.undefined,
    customSlidingRotationalSpeed: js.UndefOr[Double] = js.undefined,
    dampingCompression: js.UndefOr[Double] = js.undefined,
    dampingRelaxation: js.UndefOr[Double] = js.undefined,
    deltaRotation: js.UndefOr[Double] = js.undefined,
    direction: Vec3 = null,
    directionLocal: Vec3 = null,
    directionWorld: Vec3 = null,
    frictionSlip: js.UndefOr[Double] = js.undefined,
    isFronmtWheel: js.UndefOr[Boolean] = js.undefined,
    maxSuspensionForce: js.UndefOr[Double] = js.undefined,
    maxSuspensionTravel: js.UndefOr[Double] = js.undefined,
    position: Vec3 = null,
    radius: js.UndefOr[Double] = js.undefined,
    rollInfluence: js.UndefOr[Double] = js.undefined,
    rotation: js.UndefOr[Double] = js.undefined,
    skidInfo: js.UndefOr[Double] = js.undefined,
    steering: js.UndefOr[Double] = js.undefined,
    suspensionForce: js.UndefOr[Double] = js.undefined,
    suspensionLength: js.UndefOr[Double] = js.undefined,
    suspensionMaxLength: js.UndefOr[Double] = js.undefined,
    suspensionRelativeVelocity: js.UndefOr[Double] = js.undefined,
    suspensionRestLength: js.UndefOr[Double] = js.undefined,
    suspensionStiffness: js.UndefOr[Double] = js.undefined,
    useCustomSlidingRotationalSpeed: js.UndefOr[Boolean] = js.undefined
  ): IWheelInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (axleLocal != null) __obj.updateDynamic("axleLocal")(axleLocal.asInstanceOf[js.Any])
    if (axleWorld != null) __obj.updateDynamic("axleWorld")(axleWorld.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (chassisConnectionPointLocal != null) __obj.updateDynamic("chassisConnectionPointLocal")(chassisConnectionPointLocal.asInstanceOf[js.Any])
    if (chassisConnectionPointWorld != null) __obj.updateDynamic("chassisConnectionPointWorld")(chassisConnectionPointWorld.asInstanceOf[js.Any])
    if (!js.isUndefined(clippedInvContactDotSuspension)) __obj.updateDynamic("clippedInvContactDotSuspension")(clippedInvContactDotSuspension.get.asInstanceOf[js.Any])
    if (!js.isUndefined(customSlidingRotationalSpeed)) __obj.updateDynamic("customSlidingRotationalSpeed")(customSlidingRotationalSpeed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dampingCompression)) __obj.updateDynamic("dampingCompression")(dampingCompression.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dampingRelaxation)) __obj.updateDynamic("dampingRelaxation")(dampingRelaxation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaRotation)) __obj.updateDynamic("deltaRotation")(deltaRotation.get.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (directionLocal != null) __obj.updateDynamic("directionLocal")(directionLocal.asInstanceOf[js.Any])
    if (directionWorld != null) __obj.updateDynamic("directionWorld")(directionWorld.asInstanceOf[js.Any])
    if (!js.isUndefined(frictionSlip)) __obj.updateDynamic("frictionSlip")(frictionSlip.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isFronmtWheel)) __obj.updateDynamic("isFronmtWheel")(isFronmtWheel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSuspensionForce)) __obj.updateDynamic("maxSuspensionForce")(maxSuspensionForce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSuspensionTravel)) __obj.updateDynamic("maxSuspensionTravel")(maxSuspensionTravel.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(radius)) __obj.updateDynamic("radius")(radius.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rollInfluence)) __obj.updateDynamic("rollInfluence")(rollInfluence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rotation)) __obj.updateDynamic("rotation")(rotation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skidInfo)) __obj.updateDynamic("skidInfo")(skidInfo.get.asInstanceOf[js.Any])
    if (!js.isUndefined(steering)) __obj.updateDynamic("steering")(steering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suspensionForce)) __obj.updateDynamic("suspensionForce")(suspensionForce.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suspensionLength)) __obj.updateDynamic("suspensionLength")(suspensionLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suspensionMaxLength)) __obj.updateDynamic("suspensionMaxLength")(suspensionMaxLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suspensionRelativeVelocity)) __obj.updateDynamic("suspensionRelativeVelocity")(suspensionRelativeVelocity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suspensionRestLength)) __obj.updateDynamic("suspensionRestLength")(suspensionRestLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(suspensionStiffness)) __obj.updateDynamic("suspensionStiffness")(suspensionStiffness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomSlidingRotationalSpeed)) __obj.updateDynamic("useCustomSlidingRotationalSpeed")(useCustomSlidingRotationalSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWheelInfoOptions]
  }
}

