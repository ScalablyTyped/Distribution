package typings
package cannonLib.CANNONNs

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
  var clippedInvContactDotSuspension: js.UndefOr[scala.Double] = js.undefined
  var customSlidingRotationalSpeed: js.UndefOr[scala.Double] = js.undefined
  var dampingCompression: js.UndefOr[scala.Double] = js.undefined
  var dampingRelaxation: js.UndefOr[scala.Double] = js.undefined
  var deltaRotation: js.UndefOr[scala.Double] = js.undefined
  var direction: js.UndefOr[Vec3] = js.undefined
  var directionLocal: js.UndefOr[Vec3] = js.undefined
  var directionWorld: js.UndefOr[Vec3] = js.undefined
  var frictionSlip: js.UndefOr[scala.Double] = js.undefined
  var isFronmtWheel: js.UndefOr[scala.Boolean] = js.undefined
  var maxSuspensionForce: js.UndefOr[scala.Double] = js.undefined
  var maxSuspensionTravel: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[Vec3] = js.undefined
  var radius: js.UndefOr[scala.Double] = js.undefined
  var rollInfluence: js.UndefOr[scala.Double] = js.undefined
  var rotation: js.UndefOr[scala.Double] = js.undefined
  var skidInfo: js.UndefOr[scala.Double] = js.undefined
  var steering: js.UndefOr[scala.Double] = js.undefined
  var suspensionForce: js.UndefOr[scala.Double] = js.undefined
  var suspensionLength: js.UndefOr[scala.Double] = js.undefined
  var suspensionMaxLength: js.UndefOr[scala.Double] = js.undefined
  var suspensionRelativeVelocity: js.UndefOr[scala.Double] = js.undefined
  var suspensionRestLength: js.UndefOr[scala.Double] = js.undefined
  var suspensionStiffness: js.UndefOr[scala.Double] = js.undefined
  var useCustomSlidingRotationalSpeed: js.UndefOr[scala.Boolean] = js.undefined
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
    clippedInvContactDotSuspension: scala.Int | scala.Double = null,
    customSlidingRotationalSpeed: scala.Int | scala.Double = null,
    dampingCompression: scala.Int | scala.Double = null,
    dampingRelaxation: scala.Int | scala.Double = null,
    deltaRotation: scala.Int | scala.Double = null,
    direction: Vec3 = null,
    directionLocal: Vec3 = null,
    directionWorld: Vec3 = null,
    frictionSlip: scala.Int | scala.Double = null,
    isFronmtWheel: js.UndefOr[scala.Boolean] = js.undefined,
    maxSuspensionForce: scala.Int | scala.Double = null,
    maxSuspensionTravel: scala.Int | scala.Double = null,
    position: Vec3 = null,
    radius: scala.Int | scala.Double = null,
    rollInfluence: scala.Int | scala.Double = null,
    rotation: scala.Int | scala.Double = null,
    skidInfo: scala.Int | scala.Double = null,
    steering: scala.Int | scala.Double = null,
    suspensionForce: scala.Int | scala.Double = null,
    suspensionLength: scala.Int | scala.Double = null,
    suspensionMaxLength: scala.Int | scala.Double = null,
    suspensionRelativeVelocity: scala.Int | scala.Double = null,
    suspensionRestLength: scala.Int | scala.Double = null,
    suspensionStiffness: scala.Int | scala.Double = null,
    useCustomSlidingRotationalSpeed: js.UndefOr[scala.Boolean] = js.undefined
  ): IWheelInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis)
    if (axleLocal != null) __obj.updateDynamic("axleLocal")(axleLocal)
    if (axleWorld != null) __obj.updateDynamic("axleWorld")(axleWorld)
    if (body != null) __obj.updateDynamic("body")(body)
    if (chassisConnectionPointLocal != null) __obj.updateDynamic("chassisConnectionPointLocal")(chassisConnectionPointLocal)
    if (chassisConnectionPointWorld != null) __obj.updateDynamic("chassisConnectionPointWorld")(chassisConnectionPointWorld)
    if (clippedInvContactDotSuspension != null) __obj.updateDynamic("clippedInvContactDotSuspension")(clippedInvContactDotSuspension.asInstanceOf[js.Any])
    if (customSlidingRotationalSpeed != null) __obj.updateDynamic("customSlidingRotationalSpeed")(customSlidingRotationalSpeed.asInstanceOf[js.Any])
    if (dampingCompression != null) __obj.updateDynamic("dampingCompression")(dampingCompression.asInstanceOf[js.Any])
    if (dampingRelaxation != null) __obj.updateDynamic("dampingRelaxation")(dampingRelaxation.asInstanceOf[js.Any])
    if (deltaRotation != null) __obj.updateDynamic("deltaRotation")(deltaRotation.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (directionLocal != null) __obj.updateDynamic("directionLocal")(directionLocal)
    if (directionWorld != null) __obj.updateDynamic("directionWorld")(directionWorld)
    if (frictionSlip != null) __obj.updateDynamic("frictionSlip")(frictionSlip.asInstanceOf[js.Any])
    if (!js.isUndefined(isFronmtWheel)) __obj.updateDynamic("isFronmtWheel")(isFronmtWheel)
    if (maxSuspensionForce != null) __obj.updateDynamic("maxSuspensionForce")(maxSuspensionForce.asInstanceOf[js.Any])
    if (maxSuspensionTravel != null) __obj.updateDynamic("maxSuspensionTravel")(maxSuspensionTravel.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
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
    if (!js.isUndefined(useCustomSlidingRotationalSpeed)) __obj.updateDynamic("useCustomSlidingRotationalSpeed")(useCustomSlidingRotationalSpeed)
    __obj.asInstanceOf[IWheelInfoOptions]
  }
}

