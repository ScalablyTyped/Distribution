package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventStream extends js.Object {
  /**
    * The unique identifier for the application to publish event data for.
    */
  var ApplicationId: string = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream to publish event data to. For a Kinesis data stream, the ARN format is: arn:aws:kinesis:region:account-id:stream/stream_name
    For a Kinesis Data Firehose delivery stream, the ARN format is: arn:aws:firehose:region:account-id:deliverystream/stream_name
    
    */
  var DestinationStreamArn: string = js.native
  /**
    * (Deprecated) Your AWS account ID, which you assigned to an external ID key in an IAM trust policy. Amazon Pinpoint previously used this value to assume an IAM role when publishing event data, but we removed this requirement. We don't recommend use of external IDs for IAM roles that are assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[string] = js.native
  /**
    * The date, in ISO 8601 format, when the event stream was last modified.
    */
  var LastModifiedDate: js.UndefOr[string] = js.native
  /**
    * The IAM user who last modified the event stream.
    */
  var LastUpdatedBy: js.UndefOr[string] = js.native
  /**
    * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the stream in your AWS account.
    */
  var RoleArn: string = js.native
}

object EventStream {
  @scala.inline
  def apply(ApplicationId: string, DestinationStreamArn: string, RoleArn: string): EventStream = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], DestinationStreamArn = DestinationStreamArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationStreamArn(value: string): Self = this.set("DestinationStreamArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalId(value: string): Self = this.set("ExternalId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalId: Self = this.set("ExternalId", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: string): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setLastUpdatedBy(value: string): Self = this.set("LastUpdatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedBy: Self = this.set("LastUpdatedBy", js.undefined)
  }
  
}

