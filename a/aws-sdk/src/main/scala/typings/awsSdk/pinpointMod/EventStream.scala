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
  def apply(
    ApplicationId: string,
    DestinationStreamArn: string,
    RoleArn: string,
    ExternalId: string = null,
    LastModifiedDate: string = null,
    LastUpdatedBy: string = null
  ): EventStream = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], DestinationStreamArn = DestinationStreamArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (LastUpdatedBy != null) __obj.updateDynamic("LastUpdatedBy")(LastUpdatedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventStream]
  }
}

