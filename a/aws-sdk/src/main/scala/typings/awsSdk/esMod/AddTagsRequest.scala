package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsRequest extends js.Object {
  /**
    *  Specify the ARN for which you want to add the tags.
    */
  var ARN: typings.awsSdk.esMod.ARN = js.native
  /**
    *  List of Tag that need to be added for the Elasticsearch domain. 
    */
  var TagList: typings.awsSdk.esMod.TagList = js.native
}

object AddTagsRequest {
  @scala.inline
  def apply(ARN: ARN, TagList: TagList): AddTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
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
    def setARN(value: ARN): Self = this.set("ARN", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = this.set("TagList", js.Array(value :_*))
    @scala.inline
    def setTagList(value: TagList): Self = this.set("TagList", value.asInstanceOf[js.Any])
  }
  
}

