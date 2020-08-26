package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamSummaryInput extends js.Object {
  /**
    * The name of the stream to describe.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

object DescribeStreamSummaryInput {
  @scala.inline
  def apply(StreamName: StreamName): DescribeStreamSummaryInput = {
    val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamSummaryInput]
  }
  @scala.inline
  implicit class DescribeStreamSummaryInputOps[Self <: DescribeStreamSummaryInput] (val x: Self) extends AnyVal {
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
  }
  
}

