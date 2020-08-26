package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelRequest extends js.Object {
  /**
    * channel ID
    */
  var ChannelId: string = js.native
  /**
    * A list of output destinations for this channel.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.native
  /**
    * The encoder settings for this channel.
    */
  var EncoderSettings: js.UndefOr[typings.awsSdk.medialiveMod.EncoderSettings] = js.native
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
    * The name of the channel.
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not specify this on an update call but the role was previously set that role will be removed.
    */
  var RoleArn: js.UndefOr[string] = js.native
}

object UpdateChannelRequest {
  @scala.inline
  def apply(ChannelId: string): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  @scala.inline
  implicit class UpdateChannelRequestOps[Self <: UpdateChannelRequest] (val x: Self) extends AnyVal {
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
    def setChannelId(value: string): Self = this.set("ChannelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationsVarargs(value: OutputDestination*): Self = this.set("Destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: listOfOutputDestination): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("Destinations", js.undefined)
    @scala.inline
    def setEncoderSettings(value: EncoderSettings): Self = this.set("EncoderSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoderSettings: Self = this.set("EncoderSettings", js.undefined)
    @scala.inline
    def setInputAttachmentsVarargs(value: InputAttachment*): Self = this.set("InputAttachments", js.Array(value :_*))
    @scala.inline
    def setInputAttachments(value: listOfInputAttachment): Self = this.set("InputAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputAttachments: Self = this.set("InputAttachments", js.undefined)
    @scala.inline
    def setInputSpecification(value: InputSpecification): Self = this.set("InputSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputSpecification: Self = this.set("InputSpecification", js.undefined)
    @scala.inline
    def setLogLevel(value: LogLevel): Self = this.set("LogLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogLevel: Self = this.set("LogLevel", js.undefined)
    @scala.inline
    def setName(value: string): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
  }
  
}

