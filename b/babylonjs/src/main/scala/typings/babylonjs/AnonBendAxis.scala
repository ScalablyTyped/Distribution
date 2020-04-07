package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.boneMod.Bone
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBendAxis extends js.Object {
  var bendAxis: js.UndefOr[Vector3] = js.undefined
  var maxAngle: js.UndefOr[Double] = js.undefined
  var poleAngle: js.UndefOr[Double] = js.undefined
  var poleTargetBone: js.UndefOr[Bone] = js.undefined
  var poleTargetLocalOffset: js.UndefOr[Vector3] = js.undefined
  var poleTargetMesh: js.UndefOr[AbstractMesh] = js.undefined
  var slerpAmount: js.UndefOr[Double] = js.undefined
  var targetMesh: js.UndefOr[AbstractMesh] = js.undefined
}

object AnonBendAxis {
  @scala.inline
  def apply(
    bendAxis: Vector3 = null,
    maxAngle: Int | Double = null,
    poleAngle: Int | Double = null,
    poleTargetBone: Bone = null,
    poleTargetLocalOffset: Vector3 = null,
    poleTargetMesh: AbstractMesh = null,
    slerpAmount: Int | Double = null,
    targetMesh: AbstractMesh = null
  ): AnonBendAxis = {
    val __obj = js.Dynamic.literal()
    if (bendAxis != null) __obj.updateDynamic("bendAxis")(bendAxis.asInstanceOf[js.Any])
    if (maxAngle != null) __obj.updateDynamic("maxAngle")(maxAngle.asInstanceOf[js.Any])
    if (poleAngle != null) __obj.updateDynamic("poleAngle")(poleAngle.asInstanceOf[js.Any])
    if (poleTargetBone != null) __obj.updateDynamic("poleTargetBone")(poleTargetBone.asInstanceOf[js.Any])
    if (poleTargetLocalOffset != null) __obj.updateDynamic("poleTargetLocalOffset")(poleTargetLocalOffset.asInstanceOf[js.Any])
    if (poleTargetMesh != null) __obj.updateDynamic("poleTargetMesh")(poleTargetMesh.asInstanceOf[js.Any])
    if (slerpAmount != null) __obj.updateDynamic("slerpAmount")(slerpAmount.asInstanceOf[js.Any])
    if (targetMesh != null) __obj.updateDynamic("targetMesh")(targetMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBendAxis]
  }
}

