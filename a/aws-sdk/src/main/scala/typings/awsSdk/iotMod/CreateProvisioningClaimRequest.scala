package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProvisioningClaimRequest extends js.Object {
  /**
    * The name of the provisioning template to use.
    */
  var templateName: TemplateName = js.native
}

object CreateProvisioningClaimRequest {
  @scala.inline
  def apply(templateName: TemplateName): CreateProvisioningClaimRequest = {
    val __obj = js.Dynamic.literal(templateName = templateName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateProvisioningClaimRequest]
  }
}

