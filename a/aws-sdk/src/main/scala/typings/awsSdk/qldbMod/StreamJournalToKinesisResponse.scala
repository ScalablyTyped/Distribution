package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamJournalToKinesisResponse extends js.Object {
  /**
    * The unique ID that QLDB assigns to each QLDB journal stream.
    */
  var StreamId: js.UndefOr[UniqueId] = js.native
}

object StreamJournalToKinesisResponse {
  @scala.inline
  def apply(StreamId: UniqueId = null): StreamJournalToKinesisResponse = {
    val __obj = js.Dynamic.literal()
    if (StreamId != null) __obj.updateDynamic("StreamId")(StreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamJournalToKinesisResponse]
  }
}

