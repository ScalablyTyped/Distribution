package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTagsForStreamInput extends js.Object {
  /**
    * If you specify this parameter and the result of a ListTagsForStream call is truncated, the response includes a token that you can use in the next request to fetch the next batch of tags.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the stream that you want to list tags for.
    */
  var StreamARN: js.UndefOr[ResourceARN] = js.native
  /**
    * The name of the stream that you want to list tags for.
    */
  var StreamName: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamName] = js.native
}

object ListTagsForStreamInput {
  @scala.inline
  def apply(): ListTagsForStreamInput = {
    val __obj = js.Dynamic.literal()
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
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
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

