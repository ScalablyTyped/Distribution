package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListStreamsInput extends js.Object {
  /**
    * The maximum number of streams to return in the response. The default is 10,000.
    */
  var MaxResults: js.UndefOr[ListStreamsInputLimit] = js.native
  /**
    * If you specify this parameter, when the result of a ListStreams operation is truncated, the call returns the NextToken in the response. To get another batch of streams, provide this token in your next request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.kinesisvideoMod.NextToken] = js.native
  /**
    * Optional: Returns only streams that satisfy a specific condition. Currently, you can specify only the prefix of a stream name as a condition. 
    */
  var StreamNameCondition: js.UndefOr[typings.awsSdk.kinesisvideoMod.StreamNameCondition] = js.native
}

object ListStreamsInput {
  @scala.inline
  def apply(): ListStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsInput]
  }
  @scala.inline
  implicit class ListStreamsInputOps[Self <: ListStreamsInput] (val x: Self) extends AnyVal {
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
    def setMaxResults(value: ListStreamsInputLimit): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setStreamNameCondition(value: StreamNameCondition): Self = this.set("StreamNameCondition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamNameCondition: Self = this.set("StreamNameCondition", js.undefined)
  }
  
}

