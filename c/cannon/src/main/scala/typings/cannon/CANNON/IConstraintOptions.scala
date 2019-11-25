package typings.cannon.CANNON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstraintOptions extends js.Object {
  var collideConnected: js.UndefOr[Boolean] = js.undefined
  var wakeUpBodies: js.UndefOr[Boolean] = js.undefined
}

object IConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[Boolean] = js.undefined,
    wakeUpBodies: js.UndefOr[Boolean] = js.undefined
  ): IConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected.asInstanceOf[js.Any])
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConstraintOptions]
  }
}

