package typings.awsSdkClientPinpointBrowser.typesEventStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventStream extends js.Object {
  /**
    * The ID of the application from which events should be published.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    *  Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
    *  Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
    */
  var DestinationStreamArn: js.UndefOr[String] = js.native
  /**
    * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[String] = js.native
  /**
    * The date the event stream was last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[String] = js.native
  /**
    * The IAM user who last modified the event stream.
    */
  var LastUpdatedBy: js.UndefOr[String] = js.native
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  var RoleArn: js.UndefOr[String] = js.native
}

object EventStream {
  @scala.inline
  def apply(): EventStream = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventStream]
  }
  @scala.inline
  implicit class EventStreamOps[Self <: EventStream] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    @scala.inline
    def setDestinationStreamArn(value: String): Self = this.set("DestinationStreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationStreamArn: Self = this.set("DestinationStreamArn", js.undefined)
    @scala.inline
    def setExternalId(value: String): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("ExternalId", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: String): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setLastUpdatedBy(value: String): Self = this.set("LastUpdatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedBy: Self = this.set("LastUpdatedBy", js.undefined)
    @scala.inline
    def setRoleArn(value: String): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
  
}

