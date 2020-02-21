package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAccessControlRulesRequest extends js.Object {
  /**
    * The identifier for the organization.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object ListAccessControlRulesRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId): ListAccessControlRulesRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListAccessControlRulesRequest]
  }
}

