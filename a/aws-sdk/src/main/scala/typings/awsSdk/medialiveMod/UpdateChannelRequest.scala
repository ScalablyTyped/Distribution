package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelRequest extends StObject {
  
  /**
    * Specification of CDI inputs for this channel
    */
  var CdiInputSpecification: js.UndefOr[typings.awsSdk.medialiveMod.CdiInputSpecification] = js.undefined
  
  /**
    * channel ID
    */
  var ChannelId: string
  
  /**
    * A list of output destinations for this channel.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.undefined
  
  /**
    * The encoder settings for this channel.
    */
  var EncoderSettings: js.UndefOr[typings.awsSdk.medialiveMod.EncoderSettings] = js.undefined
  
  var InputAttachments: js.UndefOr[listOfInputAttachment] = js.undefined
  
  /**
    * Specification of network and file inputs for this channel
    */
  var InputSpecification: js.UndefOr[typings.awsSdk.medialiveMod.InputSpecification] = js.undefined
  
  /**
    * The log level to write to CloudWatch Logs.
    */
  var LogLevel: js.UndefOr[typings.awsSdk.medialiveMod.LogLevel] = js.undefined
  
  /**
    * The name of the channel.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * An optional Amazon Resource Name (ARN) of the role to assume when running the Channel. If you do not specify this on an update call but the role was previously set that role will be removed.
    */
  var RoleArn: js.UndefOr[string] = js.undefined
}
object UpdateChannelRequest {
  
  @scala.inline
  def apply(ChannelId: string): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  
  @scala.inline
  implicit class UpdateChannelRequestMutableBuilder[Self <: UpdateChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCdiInputSpecification(value: CdiInputSpecification): Self = StObject.set(x, "CdiInputSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCdiInputSpecificationUndefined: Self = StObject.set(x, "CdiInputSpecification", js.undefined)
    
    @scala.inline
    def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
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
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
