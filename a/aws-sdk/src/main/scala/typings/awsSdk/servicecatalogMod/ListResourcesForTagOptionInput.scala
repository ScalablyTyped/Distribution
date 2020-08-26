package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListResourcesForTagOptionInput extends js.Object {
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.servicecatalogMod.PageSize] = js.native
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.native
  /**
    * The resource type.    Portfolio     Product   
    */
  var ResourceType: js.UndefOr[typings.awsSdk.servicecatalogMod.ResourceType] = js.native
  /**
    * The TagOption identifier.
    */
  var TagOptionId: typings.awsSdk.servicecatalogMod.TagOptionId = js.native
}

object ListResourcesForTagOptionInput {
  @scala.inline
  def apply(TagOptionId: TagOptionId): ListResourcesForTagOptionInput = {
    val __obj = js.Dynamic.literal(TagOptionId = TagOptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesForTagOptionInput]
  }
  @scala.inline
  implicit class ListResourcesForTagOptionInputOps[Self <: ListResourcesForTagOptionInput] (val x: Self) extends AnyVal {
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
    def setTagOptionId(value: TagOptionId): Self = this.set("TagOptionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    @scala.inline
    def setPageToken(value: PageToken): Self = this.set("PageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("PageToken", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
  }
  
}

