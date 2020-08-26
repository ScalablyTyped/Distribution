package typings.awsSdk.qldbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJournalKinesisStreamResponse extends js.Object {
  /**
    * The unique ID that QLDB assigns to each QLDB journal stream.
    */
  var StreamId: js.UndefOr[UniqueId] = js.native
}

object CancelJournalKinesisStreamResponse {
  @scala.inline
  def apply(): CancelJournalKinesisStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelJournalKinesisStreamResponse]
  }
  @scala.inline
  implicit class CancelJournalKinesisStreamResponseOps[Self <: CancelJournalKinesisStreamResponse] (val x: Self) extends AnyVal {
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
    def setStreamId(value: UniqueId): Self = this.set("StreamId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStreamId: Self = this.set("StreamId", js.undefined)
  }
  
}

