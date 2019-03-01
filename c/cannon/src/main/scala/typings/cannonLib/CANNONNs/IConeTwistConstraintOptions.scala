package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConeTwistConstraintOptions extends js.Object {
  var axisA: js.UndefOr[Vec3] = js.undefined
  var axisB: js.UndefOr[Vec3] = js.undefined
  var maxForce: js.UndefOr[scala.Double] = js.undefined
  var pivotA: js.UndefOr[Vec3] = js.undefined
  var pivotB: js.UndefOr[Vec3] = js.undefined
}

object IConeTwistConstraintOptions {
  @scala.inline
  def apply(
    axisA: Vec3 = null,
    axisB: Vec3 = null,
    maxForce: scala.Int | scala.Double = null,
    pivotA: Vec3 = null,
    pivotB: Vec3 = null
  ): IConeTwistConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (axisA != null) __obj.updateDynamic("axisA")(axisA)
    if (axisB != null) __obj.updateDynamic("axisB")(axisB)
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    if (pivotA != null) __obj.updateDynamic("pivotA")(pivotA)
    if (pivotB != null) __obj.updateDynamic("pivotB")(pivotB)
    __obj.asInstanceOf[IConeTwistConstraintOptions]
  }
}

