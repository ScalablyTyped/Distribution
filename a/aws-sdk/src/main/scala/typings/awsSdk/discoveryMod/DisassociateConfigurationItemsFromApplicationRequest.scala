package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateConfigurationItemsFromApplicationRequest extends js.Object {
  /**
    * Configuration ID of an application from which each item is disassociated.
    */
  var applicationConfigurationId: ApplicationId = js.native
  /**
    * Configuration ID of each item to be disassociated from an application.
    */
  var configurationIds: ConfigurationIdList = js.native
}

object DisassociateConfigurationItemsFromApplicationRequest {
  @scala.inline
  def apply(applicationConfigurationId: ApplicationId, configurationIds: ConfigurationIdList): DisassociateConfigurationItemsFromApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationConfigurationId = applicationConfigurationId.asInstanceOf[js.Any], configurationIds = configurationIds.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateConfigurationItemsFromApplicationRequest]
  }
}

