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
}

