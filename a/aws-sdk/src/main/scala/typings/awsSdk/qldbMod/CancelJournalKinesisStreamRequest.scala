package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJournalKinesisStreamRequest extends js.Object {
  /**
    * The name of the ledger.
    */
  var LedgerName: typings.awsSdk.qldbMod.LedgerName = js.native
  /**
    * The unique ID that QLDB assigns to each QLDB journal stream.
    */
  var StreamId: UniqueId = js.native
}

object CancelJournalKinesisStreamRequest {
  @scala.inline
  def apply(LedgerName: LedgerName, StreamId: UniqueId): CancelJournalKinesisStreamRequest = {
    val __obj = js.Dynamic.literal(LedgerName = LedgerName.asInstanceOf[js.Any], StreamId = StreamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJournalKinesisStreamRequest]
  }
  @scala.inline
  implicit class CancelJournalKinesisStreamRequestOps[Self <: CancelJournalKinesisStreamRequest] (val x: Self) extends AnyVal {
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
    def setLedgerName(value: LedgerName): Self = this.set("LedgerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreamId(value: UniqueId): Self = this.set("StreamId", value.asInstanceOf[js.Any])
  }
  
}

