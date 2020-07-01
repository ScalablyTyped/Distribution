package typings.awsSdk.servicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreatePublicDnsNamespaceRequest extends js.Object {
  /**
    * A unique string that identifies the request and that allows failed CreatePublicDnsNamespace requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.native
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.native
  /**
    * The name that you want to assign to this namespace.
    */
  var Name: NamespaceName = js.native
  /**
    * The tags to add to the namespace. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreatePublicDnsNamespaceRequest {
  @scala.inline
  def apply(
    Name: NamespaceName,
    CreatorRequestId: ResourceId = null,
    Description: ResourceDescription = null,
    Tags: TagList = null
  ): CreatePublicDnsNamespaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublicDnsNamespaceRequest]
  }
}

