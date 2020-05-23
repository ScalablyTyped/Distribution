package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConeTwistConstraintOptions extends js.Object {
  var axisA: js.UndefOr[Vec3] = js.undefined
  var axisB: js.UndefOr[Vec3] = js.undefined
  var maxForce: js.UndefOr[Double] = js.undefined
  var pivotA: js.UndefOr[Vec3] = js.undefined
  var pivotB: js.UndefOr[Vec3] = js.undefined
}

object IConeTwistConstraintOptions {
  @scala.inline
  def apply(
    axisA: Vec3 = null,
    axisB: Vec3 = null,
    maxForce: js.UndefOr[Double] = js.undefined,
    pivotA: Vec3 = null,
    pivotB: Vec3 = null
  ): IConeTwistConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (axisA != null) __obj.updateDynamic("axisA")(axisA.asInstanceOf[js.Any])
    if (axisB != null) __obj.updateDynamic("axisB")(axisB.asInstanceOf[js.Any])
    if (!js.isUndefined(maxForce)) __obj.updateDynamic("maxForce")(maxForce.get.asInstanceOf[js.Any])
    if (pivotA != null) __obj.updateDynamic("pivotA")(pivotA.asInstanceOf[js.Any])
    if (pivotB != null) __obj.updateDynamic("pivotB")(pivotB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConeTwistConstraintOptions]
  }
}

