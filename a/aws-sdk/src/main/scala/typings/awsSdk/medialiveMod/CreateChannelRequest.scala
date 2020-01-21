package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateChannelRequest extends js.Object {
  /**
    * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one pipeline.
    */
  var ChannelClass: js.UndefOr[typings.awsSdk.medialiveMod.ChannelClass] = js.native
  var Destinations: js.UndefOr[listOfOutputDestination] = js.native
  var EncoderSettings: js.UndefOr[typings.awsSdk.medialiveMod.EncoderSettings] = js.native
  /**
    * List of input attachments for channel.
    */
  var InputAttachments: js.UndefOr[listOfInputAttachment] = js.native
  /**
    * Specification of input for this channel (max. bitrate, resolution, codec, etc.)
    */
  var InputSpecification: js.UndefOr[typings.awsSdk.medialiveMod.InputSpecification] = js.native
  /**
    * The log level to write to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typings.awsSdk.medialiveMod.LogLevel] = js.native
  /**
    * Name of channel.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Unique request ID to be specified. This is needed to prevent retries from
  creating multiple resources.
    */
  var RequestId: js.UndefOr[string] = js.native
  /**
    * Deprecated field that's only usable by whitelisted customers.
    */
  var Reserved: js.UndefOr[string] = js.native
  /**
    * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel.
    */
  var RoleArn: js.UndefOr[string] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
}

object CreateChannelRequest {
  @scala.inline
  def apply(
    ChannelClass: ChannelClass = null,
    Destinations: listOfOutputDestination = null,
    EncoderSettings: EncoderSettings = null,
    InputAttachments: listOfInputAttachment = null,
    InputSpecification: InputSpecification = null,
    LogLevel: LogLevel = null,
    Name: string = null,
    RequestId: string = null,
    Reserved: string = null,
    RoleArn: string = null,
    Tags: Tags = null
  ): CreateChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ChannelClass != null) __obj.updateDynamic("ChannelClass")(ChannelClass.asInstanceOf[js.Any])
    if (Destinations != null) __obj.updateDynamic("Destinations")(Destinations.asInstanceOf[js.Any])
    if (EncoderSettings != null) __obj.updateDynamic("EncoderSettings")(EncoderSettings.asInstanceOf[js.Any])
    if (InputAttachments != null) __obj.updateDynamic("InputAttachments")(InputAttachments.asInstanceOf[js.Any])
    if (InputSpecification != null) __obj.updateDynamic("InputSpecification")(InputSpecification.asInstanceOf[js.Any])
    if (LogLevel != null) __obj.updateDynamic("LogLevel")(LogLevel.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Reserved != null) __obj.updateDynamic("Reserved")(Reserved.asInstanceOf[js.Any])
    if (RoleArn != null) __obj.updateDynamic("RoleArn")(RoleArn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelRequest]
  }
}

