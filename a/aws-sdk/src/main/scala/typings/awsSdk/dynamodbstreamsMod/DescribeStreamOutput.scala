package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamOutput extends js.Object {
  /**
    * A complete description of the stream, including its creation date and time, the DynamoDB table associated with the stream, the shard IDs within the stream, and the beginning and ending sequence numbers of stream records within the shards.
    */
  var StreamDescription: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.StreamDescription] = js.native
}

object DescribeStreamOutput {
  @scala.inline
  def apply(): DescribeStreamOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamOutput]
  }
  @scala.inline
  implicit class DescribeStreamOutputOps[Self <: DescribeStreamOutput] (val x: Self) extends AnyVal {
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
    def setStreamDescription(value: StreamDescription): Self = this.set("StreamDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamDescription: Self = this.set("StreamDescription", js.undefined)
  }
  
}

