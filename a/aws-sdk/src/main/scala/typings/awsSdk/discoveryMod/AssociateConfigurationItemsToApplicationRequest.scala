package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateConfigurationItemsToApplicationRequest extends js.Object {
  /**
    * The configuration ID of an application with which items are to be associated.
    */
  var applicationConfigurationId: ApplicationId = js.native
  /**
    * The ID of each configuration item to be associated with an application.
    */
  var configurationIds: ConfigurationIdList = js.native
}

object AssociateConfigurationItemsToApplicationRequest {
  @scala.inline
  def apply(applicationConfigurationId: ApplicationId, configurationIds: ConfigurationIdList): AssociateConfigurationItemsToApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationConfigurationId = applicationConfigurationId.asInstanceOf[js.Any], configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateConfigurationItemsToApplicationRequest]
  }
  @scala.inline
  implicit class AssociateConfigurationItemsToApplicationRequestOps[Self <: AssociateConfigurationItemsToApplicationRequest] (val x: Self) extends AnyVal {
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
    def setApplicationConfigurationId(value: ApplicationId): Self = this.set("applicationConfigurationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigurationIdsVarargs(value: ConfigurationId*): Self = this.set("configurationIds", js.Array(value :_*))
    @scala.inline
    def setConfigurationIds(value: ConfigurationIdList): Self = this.set("configurationIds", value.asInstanceOf[js.Any])
  }
  
}

