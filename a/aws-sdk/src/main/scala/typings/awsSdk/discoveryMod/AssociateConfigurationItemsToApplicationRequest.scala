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
}

