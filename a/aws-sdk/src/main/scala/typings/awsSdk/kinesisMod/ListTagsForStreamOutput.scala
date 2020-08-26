package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForStreamOutput extends js.Object {
  /**
    * If set to true, more tags are available. To request additional tags, set ExclusiveStartTagKey to the key of the last tag returned.
    */
  var HasMoreTags: BooleanObject = js.native
  /**
    * A list of tags associated with StreamName, starting with the first tag after ExclusiveStartTagKey and up to the specified Limit. 
    */
  var Tags: TagList = js.native
}

object ListTagsForStreamOutput {
  @scala.inline
  def apply(HasMoreTags: BooleanObject, Tags: TagList): ListTagsForStreamOutput = {
    val __obj = js.Dynamic.literal(HasMoreTags = HasMoreTags.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForStreamOutput]
  }
  @scala.inline
  implicit class ListTagsForStreamOutputOps[Self <: ListTagsForStreamOutput] (val x: Self) extends AnyVal {
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
    def setHasMoreTags(value: BooleanObject): Self = this.set("HasMoreTags", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

