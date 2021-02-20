package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeChannelResponse extends StObject {
  
  /**
    * The unique arn of the channel.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * Specification of CDI inputs for this channel
    */
  var CdiInputSpecification: js.UndefOr[typings.awsSdk.medialiveMod.CdiInputSpecification] = js.native
  
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
  
  /**
    * Specification of network and file inputs for this channel
    */
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
object DescribeChannelResponse {
  
  @scala.inline
  def apply(): DescribeChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeChannelResponse]
  }
  
  @scala.inline
  implicit class DescribeChannelResponseMutableBuilder[Self <: DescribeChannelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
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
    def setEgressEndpoints(value: listOfChannelEgressEndpoint): Self = StObject.set(x, "EgressEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressEndpointsUndefined: Self = StObject.set(x, "EgressEndpoints", js.undefined)
    
    @scala.inline
    def setEgressEndpointsVarargs(value: ChannelEgressEndpoint*): Self = StObject.set(x, "EgressEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setEncoderSettings(value: EncoderSettings): Self = StObject.set(x, "EncoderSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoderSettingsUndefined: Self = StObject.set(x, "EncoderSettings", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
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
    def setPipelineDetails(value: listOfPipelineDetail): Self = StObject.set(x, "PipelineDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineDetailsUndefined: Self = StObject.set(x, "PipelineDetails", js.undefined)
    
    @scala.inline
    def setPipelineDetailsVarargs(value: PipelineDetail*): Self = StObject.set(x, "PipelineDetails", js.Array(value :_*))
    
    @scala.inline
    def setPipelinesRunningCount(value: integer): Self = StObject.set(x, "PipelinesRunningCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelinesRunningCountUndefined: Self = StObject.set(x, "PipelinesRunningCount", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setState(value: ChannelState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
