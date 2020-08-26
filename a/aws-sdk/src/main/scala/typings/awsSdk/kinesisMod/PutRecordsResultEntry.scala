package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordsResultEntry extends js.Object {
  /**
    * The error code for an individual record result. ErrorCodes can be either ProvisionedThroughputExceededException or InternalFailure.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.kinesisMod.ErrorCode] = js.native
  /**
    * The error message for an individual record result. An ErrorCode value of ProvisionedThroughputExceededException has an error message that includes the account ID, stream name, and shard ID. An ErrorCode value of InternalFailure has the error message "Internal Service Failure".
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.kinesisMod.ErrorMessage] = js.native
  /**
    * The sequence number for an individual record result.
    */
  var SequenceNumber: js.UndefOr[typings.awsSdk.kinesisMod.SequenceNumber] = js.native
  /**
    * The shard ID for an individual record result.
    */
  var ShardId: js.UndefOr[typings.awsSdk.kinesisMod.ShardId] = js.native
}

object PutRecordsResultEntry {
  @scala.inline
  def apply(): PutRecordsResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRecordsResultEntry]
  }
  @scala.inline
  implicit class PutRecordsResultEntryOps[Self <: PutRecordsResultEntry] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setSequenceNumber(value: SequenceNumber): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceNumber: Self = this.set("SequenceNumber", js.undefined)
    @scala.inline
    def setShardId(value: ShardId): Self = this.set("ShardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShardId: Self = this.set("ShardId", js.undefined)
  }
  
}

