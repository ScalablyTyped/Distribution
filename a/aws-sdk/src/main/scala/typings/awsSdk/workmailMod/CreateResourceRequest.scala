package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateResourceRequest extends js.Object {
  /**
    * The name of the new resource.
    */
  var Name: ResourceName = js.native
  /**
    * The identifier associated with the organization for which the resource is created.
    */
  var OrganizationId: typings.awsSdk.workmailMod.OrganizationId = js.native
  /**
    * The type of the new resource. The available types are equipment and room.
    */
  var Type: ResourceType = js.native
}

object CreateResourceRequest {
  @scala.inline
  def apply(Name: ResourceName, OrganizationId: OrganizationId, Type: ResourceType): CreateResourceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateResourceRequest]
  }
}

