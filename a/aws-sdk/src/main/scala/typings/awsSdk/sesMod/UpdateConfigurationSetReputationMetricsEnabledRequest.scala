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
  @scala.inline
  implicit class UpdateConfigurationSetReputationMetricsEnabledRequestOps[Self <: UpdateConfigurationSetReputationMetricsEnabledRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationSetName(value: ConfigurationSetName): Self = this.set("ConfigurationSetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Enabled): Self = this.set("Enabled", value.asInstanceOf[js.Any])
  }
  
}

