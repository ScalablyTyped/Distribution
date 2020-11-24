package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelRequest extends js.Object {
  
  /**
    * Specification of CDI inputs for this channel
    */
  var CdiInputSpecification: js.UndefOr[typings.awsSdk.medialiveMod.CdiInputSpecification] = js.native
  
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
    * Specification of network and file inputs for this channel
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
  def apply(): CreateChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateChannelRequest]
  }
  
  @scala.inline
  implicit class CreateChannelRequestOps[Self <: CreateChannelRequest] (val x: Self) extends AnyVal {
    
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
    def setCdiInputSpecification(value: CdiInputSpecification): Self = this.set("CdiInputSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCdiInputSpecification: Self = this.set("CdiInputSpecification", js.undefined)
    
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
    def setRequestId(value: string): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("RequestId", js.undefined)
    
    @scala.inline
    def setReserved(value: string): Self = this.set("Reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReserved: Self = this.set("Reserved", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = this.set("RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleArn: Self = this.set("RoleArn", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
