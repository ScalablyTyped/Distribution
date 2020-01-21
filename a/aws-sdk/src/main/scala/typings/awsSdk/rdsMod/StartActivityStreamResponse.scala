package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartActivityStreamResponse extends js.Object {
  /**
    * Indicates whether or not the database activity stream will start as soon as possible, regardless of the maintenance window for the database.
    */
  var ApplyImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The name of the Amazon Kinesis data stream to be used for the database activity stream.
    */
  var KinesisStreamName: js.UndefOr[String] = js.native
  /**
    * The AWS KMS key identifier for encryption of messages in the database activity stream.
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * The mode of the database activity stream.
    */
  var Mode: js.UndefOr[ActivityStreamMode] = js.native
  /**
    * The status of the database activity stream.
    */
  var Status: js.UndefOr[ActivityStreamStatus] = js.native
}

object StartActivityStreamResponse {
  @scala.inline
  def apply(
    ApplyImmediately: js.UndefOr[scala.Boolean] = js.undefined,
    KinesisStreamName: String = null,
    KmsKeyId: String = null,
    Mode: ActivityStreamMode = null,
    Status: ActivityStreamStatus = null
  ): StartActivityStreamResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately.asInstanceOf[js.Any])
    if (KinesisStreamName != null) __obj.updateDynamic("KinesisStreamName")(KinesisStreamName.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (Mode != null) __obj.updateDynamic("Mode")(Mode.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartActivityStreamResponse]
  }
}

