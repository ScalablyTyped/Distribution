package typings.cannon.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockConstraintOptions extends js.Object {
  var maxForce: js.UndefOr[Double] = js.undefined
}

object ILockConstraintOptions {
  @scala.inline
  def apply(maxForce: Int | Double = null): ILockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (maxForce != null) __obj.updateDynamic("maxForce")(maxForce.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockConstraintOptions]
  }
}

