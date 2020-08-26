package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagStreamInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to remove tags from.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream that you want to remove tags from.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.native
  /**
    * A list of the keys of the tags that you want to remove.
    */
  var TagKeyList: typings.awsSdk.kinesisvideoMod.TagKeyList = js.native
}

object UntagStreamInput {
  @scala.inline
  def apply(TagKeyList: TagKeyList): UntagStreamInput = {
    val __obj = js.Dynamic.literal(TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagStreamInput]
  }
  @scala.inline
  implicit class UntagStreamInputOps[Self <: UntagStreamInput] (val x: Self) extends AnyVal {
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
    def setTagKeyListVarargs(value: TagKey*): Self = this.set("TagKeyList", js.Array(value :_*))
    @scala.inline
    def setTagKeyList(value: TagKeyList): Self = this.set("TagKeyList", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamARN(value: ResourceARN): Self = this.set("StreamARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamARN: Self = this.set("StreamARN", js.undefined)
    @scala.inline
    def setStreamName(value: StreamName): Self = this.set("StreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamName: Self = this.set("StreamName", js.undefined)
  }
  
}

