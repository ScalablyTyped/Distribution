package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRemediationConfigurationsRequest extends js.Object {
  /**
    * A list of AWS Config rule names of remediation configurations for which you want details. 
    */
  var ConfigRuleNames: typings.awsSdk.configserviceMod.ConfigRuleNames = js.native
}

object DescribeRemediationConfigurationsRequest {
  @scala.inline
  def apply(ConfigRuleNames: ConfigRuleNames): DescribeRemediationConfigurationsRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleNames = ConfigRuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRemediationConfigurationsRequest]
  }
}

