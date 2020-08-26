package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToStreamInput extends js.Object {
  /**
    * The name of the stream.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
  /**
    * A set of up to 10 key-value pairs to use to create the tags.
    */
  var Tags: TagMap = js.native
}

object AddTagsToStreamInput {
  @scala.inline
  def apply(StreamName: StreamName, Tags: TagMap): AddTagsToStreamInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToStreamInput]
  }
  @scala.inline
  implicit class AddTagsToStreamInputOps[Self <: AddTagsToStreamInput] (val x: Self) extends AnyVal {
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
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
  }
  
}

