package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDefaultRetentionPolicyRequest extends js.Object {
  /**
    * The organization ID.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
}

object GetDefaultRetentionPolicyRequest {
  @scala.inline
  def apply(OrganizationId: OrganizationId): GetDefaultRetentionPolicyRequest = {
    val __obj = js.Dynamic.literal(OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDefaultRetentionPolicyRequest]
  }
}

