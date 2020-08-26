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
  def apply(): StartActivityStreamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartActivityStreamResponse]
  }
  @scala.inline
  implicit class StartActivityStreamResponseOps[Self <: StartActivityStreamResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplyImmediately(value: Boolean): Self = this.set("ApplyImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplyImmediately: Self = this.set("ApplyImmediately", js.undefined)
    @scala.inline
    def setKinesisStreamName(value: String): Self = this.set("KinesisStreamName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisStreamName: Self = this.set("KinesisStreamName", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setMode(value: ActivityStreamMode): Self = this.set("Mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("Mode", js.undefined)
    @scala.inline
    def setStatus(value: ActivityStreamStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
  
}

