package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  /**
    * The unique arn of the channel.
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The class for this channel. STANDARD for a channel with two pipelines or SINGLE_PIPELINE for a channel with one pipeline.
    */
  var ChannelClass: js.UndefOr[typings.awsSdk.medialiveMod.ChannelClass] = js.native
  /**
    * A list of destinations of the channel. For UDP outputs, there is one
  destination per output. For other types (HLS, for example), there is
  one destination per packager.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.native
  /**
    * The endpoints where outgoing connections initiate from
    */
  var EgressEndpoints: js.UndefOr[listOfChannelEgressEndpoint] = js.native
  var EncoderSettings: js.UndefOr[typings.awsSdk.medialiveMod.EncoderSettings] = js.native
  /**
    * The unique id of the channel.
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * List of input attachments for channel.
    */
  var InputAttachments: js.UndefOr[listOfInputAttachment] = js.native
  var InputSpecification: js.UndefOr[typings.awsSdk.medialiveMod.InputSpecification] = js.native
  /**
    * The log level being written to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typings.awsSdk.medialiveMod.LogLevel] = js.native
  /**
    * The name of the channel. (user-mutable)
    */
  var Name: js.UndefOr[string] = js.native
  /**
    * Runtime details for the pipelines of a running channel.
    */
  var PipelineDetails: js.UndefOr[listOfPipelineDetail] = js.native
  /**
    * The number of currently healthy pipelines.
    */
  var PipelinesRunningCount: js.UndefOr[integer] = js.native
  /**
    * The Amazon Resource Name (ARN) of the role assumed when running the Channel.
    */
  var RoleArn: js.UndefOr[string] = js.native
  var State: js.UndefOr[ChannelState] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsSdk.medialiveMod.Tags] = js.native
}

object Channel {
  @scala.inline
  def apply(): Channel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setChannelClass(value: ChannelClass): Self = this.set("ChannelClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelClass: Self = this.set("ChannelClass", js.undefined)
    @scala.inline
    def setDestinationsVarargs(value: OutputDestination*): Self = this.set("Destinations", js.Array(value :_*))
    @scala.inline
    def setDestinations(value: listOfOutputDestination): Self = this.set("Destinations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinations: Self = this.set("Destinations", js.undefined)
    @scala.inline
    def setEgressEndpointsVarargs(value: ChannelEgressEndpoint*): Self = this.set("EgressEndpoints", js.Array(value :_*))
    @scala.inline
    def setEgressEndpoints(value: listOfChannelEgressEndpoint): Self = this.set("EgressEndpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgressEndpoints: Self = this.set("EgressEndpoints", js.undefined)
    @scala.inline
    def setEncoderSettings(value: EncoderSettings): Self = this.set("EncoderSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncoderSettings: Self = this.set("EncoderSettings", js.undefined)
    @scala.inline
    def setId(value: string): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
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
    def setPipelineDetailsVarargs(value: PipelineDetail*): Self = this.set("PipelineDetails", js.Array(value :_*))
    @scala.inline
    def setPipelineDetails(value: listOfPipelineDetail): Self = this.set("PipelineDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelineDetails: Self = this.set("PipelineDetails", js.undefined)
    @scala.inline
    def setPipelinesRunningCount(value: integer): Self = this.set("PipelinesRunningCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePipelinesRunningCount: Self = this.set("PipelinesRunningCount", js.undefined)
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    @scala.inline
    def setState(value: ChannelState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

