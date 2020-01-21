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
  def apply(
    ErrorCode: ErrorCode = null,
    ErrorMessage: ErrorMessage = null,
    SequenceNumber: SequenceNumber = null,
    ShardId: ShardId = null
  ): PutRecordsResultEntry = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber.asInstanceOf[js.Any])
    if (ShardId != null) __obj.updateDynamic("ShardId")(ShardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsResultEntry]
  }
}

