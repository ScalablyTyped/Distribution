package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigurationsRequest extends js.Object {
  /**
    * One or more configuration IDs.
    */
  var configurationIds: ConfigurationIdList = js.native
}

object DescribeConfigurationsRequest {
  @scala.inline
  def apply(configurationIds: ConfigurationIdList): DescribeConfigurationsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationsRequest]
  }
  @scala.inline
  implicit class DescribeConfigurationsRequestOps[Self <: DescribeConfigurationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfigurationIdsVarargs(value: ConfigurationId*): Self = this.set("configurationIds", js.Array(value :_*))
    @scala.inline
    def setConfigurationIds(value: ConfigurationIdList): Self = this.set("configurationIds", value.asInstanceOf[js.Any])
  }
  
}

