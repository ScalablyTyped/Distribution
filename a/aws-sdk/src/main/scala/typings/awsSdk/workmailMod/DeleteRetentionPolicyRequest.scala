package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRetentionPolicyRequest extends js.Object {
  /**
    * The retention policy ID.
    */
  var Id: ShortString = js.native
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object DeleteRetentionPolicyRequest {
  @scala.inline
  def apply(Id: ShortString, OrganizationId: OrganizationId): DeleteRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRetentionPolicyRequest]
  }
}

