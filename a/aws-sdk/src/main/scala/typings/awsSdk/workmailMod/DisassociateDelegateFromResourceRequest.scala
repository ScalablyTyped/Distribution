package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateDelegateFromResourceRequest extends js.Object {
  /**
    * The identifier for the member (user, group) to be removed from the resource's delegates.
    */
  var EntityId: WorkMailIdentifier = js.native
  /**
    * The identifier for the organization under which the resource exists.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The identifier of the resource from which delegates' set members are removed. 
    */
  var ResourceId: typings.awsSdk.workmailMod.ResourceId = js.native
}

object DisassociateDelegateFromResourceRequest {
  @scala.inline
  def apply(EntityId: WorkMailIdentifier, OrganizationId: OrganizationId, ResourceId: ResourceId): DisassociateDelegateFromResourceRequest = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], ResourceId = ResourceId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DisassociateDelegateFromResourceRequest]
  }
}

