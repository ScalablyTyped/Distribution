package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePrivateDnsNamespaceRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed CreatePrivateDnsNamespace requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * The name that you want to assign to this namespace. When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon Route 53 private hosted zone that has the same name as the namespace.
    */
  var Name: NamespaceName = js.native
  /**
    * The tags to add to the namespace. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the Amazon VPC that you want to associate the namespace with.
    */
  var Vpc: ResourceId = js.native
}

object CreatePrivateDnsNamespaceRequest {
  @scala.inline
  def apply(
    Name: NamespaceName,
    Vpc: ResourceId,
    CreatorRequestId: ResourceId = null,
    Description: ResourceDescription = null,
    Tags: TagList = null
  ): CreatePrivateDnsNamespaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Vpc = Vpc.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePrivateDnsNamespaceRequest]
  }
}

