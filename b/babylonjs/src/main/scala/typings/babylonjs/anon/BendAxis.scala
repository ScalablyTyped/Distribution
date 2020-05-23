package typings.babylonjs.anon

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.boneMod.Bone
import typings.babylonjs.mathVectorMod.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BendAxis extends js.Object {
  var bendAxis: js.UndefOr[Vector3] = js.undefined
  var maxAngle: js.UndefOr[Double] = js.undefined
  var poleAngle: js.UndefOr[Double] = js.undefined
  var poleTargetBone: js.UndefOr[Bone] = js.undefined
  var poleTargetLocalOffset: js.UndefOr[Vector3] = js.undefined
  var poleTargetMesh: js.UndefOr[AbstractMesh] = js.undefined
  var slerpAmount: js.UndefOr[Double] = js.undefined
  var targetMesh: js.UndefOr[AbstractMesh] = js.undefined
}

object BendAxis {
  @scala.inline
  def apply(
    bendAxis: Vector3 = null,
    maxAngle: js.UndefOr[Double] = js.undefined,
    poleAngle: js.UndefOr[Double] = js.undefined,
    poleTargetBone: Bone = null,
    poleTargetLocalOffset: Vector3 = null,
    poleTargetMesh: AbstractMesh = null,
    slerpAmount: js.UndefOr[Double] = js.undefined,
    targetMesh: AbstractMesh = null
  ): BendAxis = {
    val __obj = js.Dynamic.literal()
    if (bendAxis != null) __obj.updateDynamic("bendAxis")(bendAxis.asInstanceOf[js.Any])
    if (!js.isUndefined(maxAngle)) __obj.updateDynamic("maxAngle")(maxAngle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(poleAngle)) __obj.updateDynamic("poleAngle")(poleAngle.get.asInstanceOf[js.Any])
    if (poleTargetBone != null) __obj.updateDynamic("poleTargetBone")(poleTargetBone.asInstanceOf[js.Any])
    if (poleTargetLocalOffset != null) __obj.updateDynamic("poleTargetLocalOffset")(poleTargetLocalOffset.asInstanceOf[js.Any])
    if (poleTargetMesh != null) __obj.updateDynamic("poleTargetMesh")(poleTargetMesh.asInstanceOf[js.Any])
    if (!js.isUndefined(slerpAmount)) __obj.updateDynamic("slerpAmount")(slerpAmount.get.asInstanceOf[js.Any])
    if (targetMesh != null) __obj.updateDynamic("targetMesh")(targetMesh.asInstanceOf[js.Any])
    __obj.asInstanceOf[BendAxis]
  }
}

