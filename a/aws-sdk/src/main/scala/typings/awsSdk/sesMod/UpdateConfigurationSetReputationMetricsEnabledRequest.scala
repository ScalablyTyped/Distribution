package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConfigurationSetReputationMetricsEnabledRequest extends js.Object {
  /**
    * The name of the configuration set that you want to update.
    */
  var ConfigurationSetName: typings.awsSdk.sesMod.ConfigurationSetName = js.native
  /**
    * Describes whether or not Amazon SES will publish reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch.
    */
  var Enabled: typings.awsSdk.sesMod.Enabled = js.native
}

object UpdateConfigurationSetReputationMetricsEnabledRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName, Enabled: Enabled): UpdateConfigurationSetReputationMetricsEnabledRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateConfigurationSetReputationMetricsEnabledRequest]
  }
}

