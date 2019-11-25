package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreWriteEventStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _WriteEventStream extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
    *  Firehose ARN: arn:aws:firehose:REGION:ACCOUNT_ID:deliverystream/STREAM_NAME
    *  Kinesis ARN: arn:aws:kinesis:REGION:ACCOUNT_ID:stream/STREAM_NAME
    */
  var DestinationStreamArn: js.UndefOr[String] = js.undefined
  /**
    * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
    */
  var RoleArn: js.UndefOr[String] = js.undefined
}

object _WriteEventStream {
  @scala.inline
  def apply(DestinationStreamArn: String = null, RoleArn: String = null): _WriteEventStream = {
    val __obj = js.Dynamic.literal()
    if (DestinationStreamArn != null) __obj.updateDynamic("DestinationStreamArn")(DestinationStreamArn.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[_WriteEventStream]
  }
}

