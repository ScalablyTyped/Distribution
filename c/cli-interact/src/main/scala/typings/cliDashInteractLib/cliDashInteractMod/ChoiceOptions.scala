package typings
package cliDashInteractLib.cliDashInteractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoiceOptions extends js.Object {
  var allowNoAnswer: js.UndefOr[scala.Boolean] = js.undefined
  var returnNumeric: js.UndefOr[scala.Boolean] = js.undefined
}

object ChoiceOptions {
  @scala.inline
  def apply(
    allowNoAnswer: js.UndefOr[scala.Boolean] = js.undefined,
    returnNumeric: js.UndefOr[scala.Boolean] = js.undefined
  ): ChoiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNoAnswer)) __obj.updateDynamic("allowNoAnswer")(allowNoAnswer)
    if (!js.isUndefined(returnNumeric)) __obj.updateDynamic("returnNumeric")(returnNumeric)
    __obj.asInstanceOf[ChoiceOptions]
  }
}

