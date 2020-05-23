package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAccessControlRuleRequest extends js.Object {
  /**
    * The name of the access control rule.
    */
  var Name: AccessControlRuleName = js.native
  /**
    * The identifier for the organization.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object DeleteAccessControlRuleRequest {
  @scala.inline
  def apply(Name: AccessControlRuleName, OrganizationId: OrganizationId): DeleteAccessControlRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessControlRuleRequest]
  }
}

