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
  @scala.inline
  implicit class AssociateDelegateToResourceRequestOps[Self <: AssociateDelegateToResourceRequest] (val x: Self) extends AnyVal {
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
    def setEntityId(value: WorkMailIdentifier): Self = this.set("EntityId", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = this.set("OrganizationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
  }
  
}

