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
    clippedInvContactDotSuspension: Int | Double = null,
    customSlidingRotationalSpeed: Int | Double = null,
    dampingCompression: Int | Double = null,
    dampingRelaxation: Int | Double = null,
    deltaRotation: Int | Double = null,
    direction: Vec3 = null,
    directionLocal: Vec3 = null,
    directionWorld: Vec3 = null,
    frictionSlip: Int | Double = null,
    isFronmtWheel: js.UndefOr[Boolean] = js.undefined,
    maxSuspensionForce: Int | Double = null,
    maxSuspensionTravel: Int | Double = null,
    position: Vec3 = null,
    radius: Int | Double = null,
    rollInfluence: Int | Double = null,
    rotation: Int | Double = null,
    skidInfo: Int | Double = null,
    steering: Int | Double = null,
    suspensionForce: Int | Double = null,
    suspensionLength: Int | Double = null,
    suspensionMaxLength: Int | Double = null,
    suspensionRelativeVelocity: Int | Double = null,
    suspensionRestLength: Int | Double = null,
    suspensionStiffness: Int | Double = null,
    useCustomSlidingRotationalSpeed: js.UndefOr[Boolean] = js.undefined
  ): IWheelInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (axleLocal != null) __obj.updateDynamic("axleLocal")(axleLocal.asInstanceOf[js.Any])
    if (axleWorld != null) __obj.updateDynamic("axleWorld")(axleWorld.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (chassisConnectionPointLocal != null) __obj.updateDynamic("chassisConnectionPointLocal")(chassisConnectionPointLocal.asInstanceOf[js.Any])
    if (chassisConnectionPointWorld != null) __obj.updateDynamic("chassisConnectionPointWorld")(chassisConnectionPointWorld.asInstanceOf[js.Any])
    if (clippedInvContactDotSuspension != null) __obj.updateDynamic("clippedInvContactDotSuspension")(clippedInvContactDotSuspension.asInstanceOf[js.Any])
    if (customSlidingRotationalSpeed != null) __obj.updateDynamic("customSlidingRotationalSpeed")(customSlidingRotationalSpeed.asInstanceOf[js.Any])
    if (dampingCompression != null) __obj.updateDynamic("dampingCompression")(dampingCompression.asInstanceOf[js.Any])
    if (dampingRelaxation != null) __obj.updateDynamic("dampingRelaxation")(dampingRelaxation.asInstanceOf[js.Any])
    if (deltaRotation != null) __obj.updateDynamic("deltaRotation")(deltaRotation.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (directionLocal != null) __obj.updateDynamic("directionLocal")(directionLocal.asInstanceOf[js.Any])
    if (directionWorld != null) __obj.updateDynamic("directionWorld")(directionWorld.asInstanceOf[js.Any])
    if (frictionSlip != null) __obj.updateDynamic("frictionSlip")(frictionSlip.asInstanceOf[js.Any])
    if (!js.isUndefined(isFronmtWheel)) __obj.updateDynamic("isFronmtWheel")(isFronmtWheel.asInstanceOf[js.Any])
    if (maxSuspensionForce != null) __obj.updateDynamic("maxSuspensionForce")(maxSuspensionForce.asInstanceOf[js.Any])
    if (maxSuspensionTravel != null) __obj.updateDynamic("maxSuspensionTravel")(maxSuspensionTravel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (rollInfluence != null) __obj.updateDynamic("rollInfluence")(rollInfluence.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (skidInfo != null) __obj.updateDynamic("skidInfo")(skidInfo.asInstanceOf[js.Any])
    if (steering != null) __obj.updateDynamic("steering")(steering.asInstanceOf[js.Any])
    if (suspensionForce != null) __obj.updateDynamic("suspensionForce")(suspensionForce.asInstanceOf[js.Any])
    if (suspensionLength != null) __obj.updateDynamic("suspensionLength")(suspensionLength.asInstanceOf[js.Any])
    if (suspensionMaxLength != null) __obj.updateDynamic("suspensionMaxLength")(suspensionMaxLength.asInstanceOf[js.Any])
    if (suspensionRelativeVelocity != null) __obj.updateDynamic("suspensionRelativeVelocity")(suspensionRelativeVelocity.asInstanceOf[js.Any])
    if (suspensionRestLength != null) __obj.updateDynamic("suspensionRestLength")(suspensionRestLength.asInstanceOf[js.Any])
    if (suspensionStiffness != null) __obj.updateDynamic("suspensionStiffness")(suspensionStiffness.asInstanceOf[js.Any])
    if (!js.isUndefined(useCustomSlidingRotationalSpeed)) __obj.updateDynamic("useCustomSlidingRotationalSpeed")(useCustomSlidingRotationalSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWheelInfoOptions]
  }
}

