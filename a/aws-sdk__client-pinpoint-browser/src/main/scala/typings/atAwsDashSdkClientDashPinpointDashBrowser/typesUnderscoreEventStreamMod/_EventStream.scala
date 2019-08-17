package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EventStream extends js.Object {
  /**
    * The ID of the application from which events should be published.
    */
  var ApplicationId: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    *  Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
    *  Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
    */
  var DestinationStreamArn: js.UndefOr[String] = js.undefined
  /**
    * (Deprecated) Your AWS account ID, which you assigned to the ExternalID key in an IAM trust policy. Used by Amazon Pinpoint to assume an IAM role. This requirement is removed, and external IDs are not recommended for IAM roles assumed by Amazon Pinpoint.
    */
  var ExternalId: js.UndefOr[String] = js.undefined
  /**
    * The date the event stream was last updated in ISO 8601 format.
    */
  var LastModifiedDate: js.UndefOr[String] = js.undefined
  /**
    * The IAM user who last modified the event stream.
    */
  var LastUpdatedBy: js.UndefOr[String] = js.undefined
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
}

object _EventStream {
  @scala.inline
  def apply(
    ApplicationId: String = null,
    DestinationStreamArn: String = null,
    ExternalId: String = null,
    LastModifiedDate: String = null,
    LastUpdatedBy: String = null,
    RoleArn: String = null
  ): _EventStream = {
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (DestinationStreamArn != null) __obj.updateDynamic("DestinationStreamArn")(DestinationStreamArn)
    if (ExternalId != null) __obj.updateDynamic("ExternalId")(ExternalId)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (LastUpdatedBy != null) __obj.updateDynamic("LastUpdatedBy")(LastUpdatedBy)
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn)
    __obj.asInstanceOf[_EventStream]
  }
}

