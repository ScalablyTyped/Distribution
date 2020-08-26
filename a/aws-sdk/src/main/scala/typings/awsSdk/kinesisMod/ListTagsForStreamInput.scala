package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForStreamInput extends js.Object {
  /**
    * The key to use as the starting point for the list of tags. If this parameter is set, ListTagsForStream gets all tags that occur after ExclusiveStartTagKey. 
    */
  var ExclusiveStartTagKey: js.UndefOr[TagKey] = js.native
  /**
    * The number of tags to return. If this number is less than the total number of tags associated with the stream, HasMoreTags is set to true. To list additional tags, set ExclusiveStartTagKey to the last key in the response.
    */
  var Limit: js.UndefOr[ListTagsForStreamInputLimit] = js.native
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

object ListTagsForStreamInput {
  @scala.inline
  def apply(StreamName: StreamName): ListTagsForStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForStreamInput]
  }
  @scala.inline
  implicit class ListTagsForStreamInputOps[Self <: ListTagsForStreamInput] (val x: Self) extends AnyVal {
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
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def setExclusiveStartTagKey(value: TagKey): Self = this.set("ExclusiveStartTagKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExclusiveStartTagKey: Self = this.set("ExclusiveStartTagKey", js.undefined)
    @scala.inline
    def setLimit(value: ListTagsForStreamInputLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
  }
  
}

