package typings.braintreeDashWeb.braintreeDashWebMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedFieldsFieldMaskInput extends js.Object {
  /**
    * The character to use when masking the input.
    * @default '•'
    */
  var character: js.UndefOr[String] = js.undefined
  /**
    * Only applicable for the credit card field. Whether or not to show the last 4 digits of the card when masking.
    */
  var showLastFour: js.UndefOr[Boolean] = js.undefined
}

object HostedFieldsFieldMaskInput {
  @scala.inline
  def apply(character: String = null, showLastFour: js.UndefOr[Boolean] = js.undefined): HostedFieldsFieldMaskInput = {
    val __obj = js.Dynamic.literal()
    if (character != null) __obj.updateDynamic("character")(character)
    if (!js.isUndefined(showLastFour)) __obj.updateDynamic("showLastFour")(showLastFour)
    __obj.asInstanceOf[HostedFieldsFieldMaskInput]
  }
}

