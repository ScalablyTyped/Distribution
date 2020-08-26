package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsRequest extends js.Object {
  /**
    * Specifies the ARN of the trail to which one or more tags will be added. The format of a trail ARN is:  arn:aws:cloudtrail:us-east-2:123456789012:trail/MyTrail 
    */
  var ResourceId: String = js.native
  /**
    * Contains a list of CloudTrail tags, up to a limit of 50
    */
  var TagsList: js.UndefOr[typings.awsSdk.cloudtrailMod.TagsList] = js.native
}

object AddTagsRequest {
  @scala.inline
  def apply(ResourceId: String): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsRequest]
  }
  @scala.inline
  implicit class AddTagsRequestOps[Self <: AddTagsRequest] (val x: Self) extends AnyVal {
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
    def setResourceId(value: String): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsListVarargs(value: Tag*): Self = this.set("TagsList", js.Array(value :_*))
    @scala.inline
    def setTagsList(value: TagsList): Self = this.set("TagsList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagsList: Self = this.set("TagsList", js.undefined)
  }
  
}

