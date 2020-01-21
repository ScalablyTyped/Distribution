package typings.cliInteract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChoiceOptions extends js.Object {
  var allowNoAnswer: js.UndefOr[Boolean] = js.undefined
  var returnNumeric: js.UndefOr[Boolean] = js.undefined
}

object ChoiceOptions {
  @scala.inline
  def apply(
    allowNoAnswer: js.UndefOr[Boolean] = js.undefined,
    returnNumeric: js.UndefOr[Boolean] = js.undefined
  ): ChoiceOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowNoAnswer)) __obj.updateDynamic("allowNoAnswer")(allowNoAnswer.asInstanceOf[js.Any])
    if (!js.isUndefined(returnNumeric)) __obj.updateDynamic("returnNumeric")(returnNumeric.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChoiceOptions]
  }
}

