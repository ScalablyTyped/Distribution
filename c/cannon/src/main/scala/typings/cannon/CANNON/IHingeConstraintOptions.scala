package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHingeConstraintOptions extends js.Object {
  var axisA: js.UndefOr[Vec3] = js.undefined
  var axisB: js.UndefOr[Vec3] = js.undefined
  var maxForce: js.UndefOr[Double] = js.undefined
  var pivotA: js.UndefOr[Vec3] = js.undefined
  var pivotB: js.UndefOr[Vec3] = js.undefined
}

object IHingeConstraintOptions {
  @scala.inline
  def apply(
    axisA: Vec3 = null,
    axisB: Vec3 = null,
    maxForce: Int | Double = null,
    pivotA: Vec3 = null,
    pivotB: Vec3 = null
  ): IHingeConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (axisA != null) __obj.updateDynamic("axisA")(axisA.asInstanceOf[js.Any])
    if (axisB != null) __obj.updateDynamic("axisB")(axisB.asInstanceOf[js.Any])
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (pivotA != null) __obj.updateDynamic("pivotA")(pivotA.asInstanceOf[js.Any])
    if (pivotB != null) __obj.updateDynamic("pivotB")(pivotB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHingeConstraintOptions]
  }
}

