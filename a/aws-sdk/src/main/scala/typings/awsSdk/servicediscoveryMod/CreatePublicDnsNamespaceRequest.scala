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
  def apply(Name: NamespaceName): CreatePublicDnsNamespaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePublicDnsNamespaceRequest]
  }
  @scala.inline
  implicit class CreatePublicDnsNamespaceRequestOps[Self <: CreatePublicDnsNamespaceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: NamespaceName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatorRequestId(value: ResourceId): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
    @scala.inline
    def setDescription(value: ResourceDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

