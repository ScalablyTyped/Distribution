package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutConfigurationSetReputationOptionsRequest extends js.Object {
  /**
    * The name of the configuration set that you want to enable or disable reputation metric tracking for.
    */
  var ConfigurationSetName: typings.awsSdk.sesv2Mod.ConfigurationSetName = js.native
  /**
    * If true, tracking of reputation metrics is enabled for the configuration set. If false, tracking of reputation metrics is disabled for the configuration set.
    */
  var ReputationMetricsEnabled: js.UndefOr[Enabled] = js.native
}

object PutConfigurationSetReputationOptionsRequest {
  @scala.inline
  def apply(ConfigurationSetName: ConfigurationSetName): PutConfigurationSetReputationOptionsRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutConfigurationSetReputationOptionsRequest]
  }
  @scala.inline
  implicit class PutConfigurationSetReputationOptionsRequestOps[Self <: PutConfigurationSetReputationOptionsRequest] (val x: Self) extends AnyVal {
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
    def setReputationMetricsEnabled(value: Enabled): Self = this.set("ReputationMetricsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReputationMetricsEnabled: Self = this.set("ReputationMetricsEnabled", js.undefined)
  }
  
}

