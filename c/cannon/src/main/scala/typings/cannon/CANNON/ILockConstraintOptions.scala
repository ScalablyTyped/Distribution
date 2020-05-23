package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILockConstraintOptions extends js.Object {
  var maxForce: js.UndefOr[Double] = js.undefined
}

object ILockConstraintOptions {
  @scala.inline
  def apply(maxForce: js.UndefOr[Double] = js.undefined): ILockConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxForce)) __obj.updateDynamic("maxForce")(maxForce.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILockConstraintOptions]
  }
}

