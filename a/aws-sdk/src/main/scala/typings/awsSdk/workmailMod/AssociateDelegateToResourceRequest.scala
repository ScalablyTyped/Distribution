package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateDelegateToResourceRequest extends js.Object {
  /**
    * The member (user or group) to associate to the resource.
    */
  var EntityId: WorkMailIdentifier = js.native
  /**
    * The organization under which the resource exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The resource for which members (users or groups) are associated.
    */
  var ResourceId: typings.awsSdk.workmailMod.ResourceId = js.native
}

object AssociateDelegateToResourceRequest {
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId, ResourceId: ResourceId): AssociateDelegateToResourceRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateDelegateToResourceRequest]
  }
}

