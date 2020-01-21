package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigRulesResponse extends js.Object {
  /**
    * The details about your AWS Config rules.
    */
  var ConfigRules: js.UndefOr[typings.awsSdk.configserviceMod.ConfigRules] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeConfigRulesResponse {
  @scala.inline
  def apply(ConfigRules: ConfigRules = null, NextToken: String = null): DescribeConfigRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (ConfigRules != null) __obj.updateDynamic("ConfigRules")(ConfigRules.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigRulesResponse]
  }
}

