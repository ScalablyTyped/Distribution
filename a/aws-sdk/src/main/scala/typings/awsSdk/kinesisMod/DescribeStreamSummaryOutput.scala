package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeStreamSummaryOutput extends js.Object {
  /**
    * A StreamDescriptionSummary containing information about the stream.
    */
  var StreamDescriptionSummary: typings.awsSdk.kinesisMod.StreamDescriptionSummary = js.native
}

object DescribeStreamSummaryOutput {
  @scala.inline
  def apply(StreamDescriptionSummary: StreamDescriptionSummary): DescribeStreamSummaryOutput = {
    val __obj = js.Dynamic.literal(StreamDescriptionSummary = StreamDescriptionSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeStreamSummaryOutput]
  }
  @scala.inline
  implicit class DescribeStreamSummaryOutputOps[Self <: DescribeStreamSummaryOutput] (val x: Self) extends AnyVal {
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
    def setStreamDescriptionSummary(value: StreamDescriptionSummary): Self = this.set("StreamDescriptionSummary", value.asInstanceOf[js.Any])
  }
  
}

