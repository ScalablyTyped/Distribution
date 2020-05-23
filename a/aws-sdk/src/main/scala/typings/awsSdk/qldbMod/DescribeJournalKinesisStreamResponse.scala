package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJournalKinesisStreamResponse extends js.Object {
  /**
    * Information about the QLDB journal stream returned by a DescribeJournalS3Export request.
    */
  var Stream: js.UndefOr[JournalKinesisStreamDescription] = js.native
}

object DescribeJournalKinesisStreamResponse {
  @scala.inline
  def apply(Stream: JournalKinesisStreamDescription = null): DescribeJournalKinesisStreamResponse = {
    val __obj = js.Dynamic.literal()
    if (Stream != null) __obj.updateDynamic("Stream")(Stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJournalKinesisStreamResponse]
  }
}

