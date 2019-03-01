package typings
package babylonjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BendAxis extends js.Object {
  var bendAxis: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
  var maxAngle: js.UndefOr[scala.Double] = js.undefined
  var poleAngle: js.UndefOr[scala.Double] = js.undefined
  var poleTargetBone: js.UndefOr[babylonjsLib.BABYLONNs.Bone] = js.undefined
  var poleTargetLocalOffset: js.UndefOr[babylonjsLib.BABYLONNs.Vector3] = js.undefined
  var poleTargetMesh: js.UndefOr[babylonjsLib.BABYLONNs.AbstractMesh] = js.undefined
  var slerpAmount: js.UndefOr[scala.Double] = js.undefined
  var targetMesh: js.UndefOr[babylonjsLib.BABYLONNs.AbstractMesh] = js.undefined
}

object Anon_BendAxis {
  @scala.inline
  def apply(
    bendAxis: babylonjsLib.BABYLONNs.Vector3 = null,
    maxAngle: scala.Int | scala.Double = null,
    poleAngle: scala.Int | scala.Double = null,
    poleTargetBone: babylonjsLib.BABYLONNs.Bone = null,
    poleTargetLocalOffset: babylonjsLib.BABYLONNs.Vector3 = null,
    poleTargetMesh: babylonjsLib.BABYLONNs.AbstractMesh = null,
    slerpAmount: scala.Int | scala.Double = null,
    targetMesh: babylonjsLib.BABYLONNs.AbstractMesh = null
  ): Anon_BendAxis = {
    val __obj = js.Dynamic.literal()
    if (bendAxis != null) __obj.updateDynamic("bendAxis")(bendAxis)
    if (maxAngle != null) __obj.updateDynamic("maxAngle")(maxAngle.asInstanceOf[js.Any])
    if (poleAngle != null) __obj.updateDynamic("poleAngle")(poleAngle.asInstanceOf[js.Any])
    if (poleTargetBone != null) __obj.updateDynamic("poleTargetBone")(poleTargetBone)
    if (poleTargetLocalOffset != null) __obj.updateDynamic("poleTargetLocalOffset")(poleTargetLocalOffset)
    if (poleTargetMesh != null) __obj.updateDynamic("poleTargetMesh")(poleTargetMesh)
    if (slerpAmount != null) __obj.updateDynamic("slerpAmount")(slerpAmount.asInstanceOf[js.Any])
    if (targetMesh != null) __obj.updateDynamic("targetMesh")(targetMesh)
    __obj.asInstanceOf[Anon_BendAxis]
  }
}

