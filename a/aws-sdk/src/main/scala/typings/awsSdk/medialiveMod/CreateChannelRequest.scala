package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateChannelRequest extends StObject {
  
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
  implicit class CreateChannelRequestMutableBuilder[Self <: CreateChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdiInputSpecification(value: CdiInputSpecification): Self = StObject.set(x, "CdiInputSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdiInputSpecificationUndefined: Self = StObject.set(x, "CdiInputSpecification", js.undefined)
    
    @scala.inline
    def setChannelClass(value: ChannelClass): Self = StObject.set(x, "ChannelClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelClassUndefined: Self = StObject.set(x, "ChannelClass", js.undefined)
    
    @scala.inline
    def setDestinations(value: listOfOutputDestination): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    @scala.inline
    def setDestinationsVarargs(value: OutputDestination*): Self = StObject.set(x, "Destinations", js.Array(value :_*))
    
    @scala.inline
    def setEncoderSettings(value: EncoderSettings): Self = StObject.set(x, "EncoderSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoderSettingsUndefined: Self = StObject.set(x, "EncoderSettings", js.undefined)
    
    @scala.inline
    def setInputAttachments(value: listOfInputAttachment): Self = StObject.set(x, "InputAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputAttachmentsUndefined: Self = StObject.set(x, "InputAttachments", js.undefined)
    
    @scala.inline
    def setInputAttachmentsVarargs(value: InputAttachment*): Self = StObject.set(x, "InputAttachments", js.Array(value :_*))
    
    @scala.inline
    def setInputSpecification(value: InputSpecification): Self = StObject.set(x, "InputSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSpecificationUndefined: Self = StObject.set(x, "InputSpecification", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel): Self = StObject.set(x, "LogLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogLevelUndefined: Self = StObject.set(x, "LogLevel", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRequestId(value: string): Self = StObject.set(x, "RequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "RequestId", js.undefined)
    
    @scala.inline
    def setReserved(value: string): Self = StObject.set(x, "Reserved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedUndefined: Self = StObject.set(x, "Reserved", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
