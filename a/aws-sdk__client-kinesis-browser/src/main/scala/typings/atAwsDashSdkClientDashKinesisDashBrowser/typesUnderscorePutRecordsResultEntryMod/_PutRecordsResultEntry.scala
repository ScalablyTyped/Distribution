package typings.atAwsDashSdkClientDashKinesisDashBrowser.typesUnderscorePutRecordsResultEntryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PutRecordsResultEntry extends js.Object {
  /**
    * <p>The error code for an individual record result. <code>ErrorCodes</code> can be either <code>ProvisionedThroughputExceededException</code> or <code>InternalFailure</code>.</p>
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  /**
    * <p>The error message for an individual record result. An <code>ErrorCode</code> value of <code>ProvisionedThroughputExceededException</code> has an error message that includes the account ID, stream name, and shard ID. An <code>ErrorCode</code> value of <code>InternalFailure</code> has the error message <code>"Internal Service Failure"</code>.</p>
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  /**
    * <p>The sequence number for an individual record result.</p>
    */
  var SequenceNumber: js.UndefOr[String] = js.undefined
  /**
    * <p>The shard ID for an individual record result.</p>
    */
  var ShardId: js.UndefOr[String] = js.undefined
}

object _PutRecordsResultEntry {
  @scala.inline
  def apply(
    ErrorCode: String = null,
    ErrorMessage: String = null,
    SequenceNumber: String = null,
    ShardId: String = null
  ): _PutRecordsResultEntry = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (SequenceNumber != null) __obj.updateDynamic("SequenceNumber")(SequenceNumber)
    if (ShardId != null) __obj.updateDynamic("ShardId")(ShardId)
    __obj.asInstanceOf[_PutRecordsResultEntry]
  }
}

