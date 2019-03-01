package typings
package cannonLib.CANNONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConstraintOptions extends js.Object {
  var collideConnected: js.UndefOr[scala.Boolean] = js.undefined
  var wakeUpBodies: js.UndefOr[scala.Boolean] = js.undefined
}

object IConstraintOptions {
  @scala.inline
  def apply(
    collideConnected: js.UndefOr[scala.Boolean] = js.undefined,
    wakeUpBodies: js.UndefOr[scala.Boolean] = js.undefined
  ): IConstraintOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(collideConnected)) __obj.updateDynamic("collideConnected")(collideConnected)
    if (!js.isUndefined(wakeUpBodies)) __obj.updateDynamic("wakeUpBodies")(wakeUpBodies)
    __obj.asInstanceOf[IConstraintOptions]
  }
}

