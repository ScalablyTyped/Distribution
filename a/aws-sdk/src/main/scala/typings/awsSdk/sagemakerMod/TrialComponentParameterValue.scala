package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrialComponentParameterValue extends js.Object {
  /**
    * The numeric value of a numeric hyperparameter. If you specify a value for this parameter, you can't specify the StringValue parameter.
    */
  var NumberValue: js.UndefOr[DoubleParameterValue] = js.native
  /**
    * The string value of a categorical hyperparameter. If you specify a value for this parameter, you can't specify the NumberValue parameter.
    */
  var StringValue: js.UndefOr[StringParameterValue] = js.native
}

object TrialComponentParameterValue {
  @scala.inline
  def apply(
    NumberValue: js.UndefOr[DoubleParameterValue] = js.undefined,
    StringValue: StringParameterValue = null
  ): TrialComponentParameterValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NumberValue)) __obj.updateDynamic("NumberValue")(NumberValue.get.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrialComponentParameterValue]
  }
}

