package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SsmControls extends js.Object {
  /**
    * The maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources for that specific rule. You can specify a percentage, such as 10%. The default value is 10. 
    */
  var ConcurrentExecutionRatePercentage: js.UndefOr[Percentage] = js.native
  /**
    * The percentage of errors that are allowed before SSM stops running automations on non-compliant resources for that specific rule. You can specify a percentage of errors, for example 10%. If you do not specifiy a percentage, the default is 50%. For example, if you set the ErrorPercentage to 40% for 10 non-compliant resources, then SSM stops running the automations when the fifth error is received. 
    */
  var ErrorPercentage: js.UndefOr[Percentage] = js.native
}

object SsmControls {
  @scala.inline
  def apply(
    ConcurrentExecutionRatePercentage: js.UndefOr[Percentage] = js.undefined,
    ErrorPercentage: js.UndefOr[Percentage] = js.undefined
  ): SsmControls = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ConcurrentExecutionRatePercentage)) __obj.updateDynamic("ConcurrentExecutionRatePercentage")(ConcurrentExecutionRatePercentage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ErrorPercentage)) __obj.updateDynamic("ErrorPercentage")(ErrorPercentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SsmControls]
  }
}

