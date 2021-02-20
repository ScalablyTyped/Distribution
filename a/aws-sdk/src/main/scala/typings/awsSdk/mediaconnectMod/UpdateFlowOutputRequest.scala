package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateFlowOutputRequest extends StObject {
  
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[listOfString] = js.native
  
  /**
    * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The IP address where you want to send the output.
    */
  var Destination: js.UndefOr[string] = js.native
  
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[UpdateEncryption] = js.native
  
  /**
    * The flow that is associated with the output that you want to update.
    */
  var FlowArn: string = js.native
  
  /**
    * The maximum latency in milliseconds for Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.native
  
  /**
    * The ARN of the output that you want to update.
    */
  var OutputArn: string = js.native
  
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[integer] = js.native
  
  /**
    * The protocol to use for the output.
    */
  var Protocol: js.UndefOr[typings.awsSdk.mediaconnectMod.Protocol] = js.native
  
  /**
    * The remote ID for the Zixi-pull stream.
    */
  var RemoteId: js.UndefOr[string] = js.native
  
  /**
    * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
    */
  var SmoothingLatency: js.UndefOr[integer] = js.native
  
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.native
  
  /**
    * The name of the VPC interface attachment to use for this output.
    */
  var VpcInterfaceAttachment: js.UndefOr[typings.awsSdk.mediaconnectMod.VpcInterfaceAttachment] = js.native
}
object UpdateFlowOutputRequest {
  
  @scala.inline
  def apply(FlowArn: string, OutputArn: string): UpdateFlowOutputRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], OutputArn = OutputArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowOutputRequest]
  }
  
  @scala.inline
  implicit class UpdateFlowOutputRequestMutableBuilder[Self <: UpdateFlowOutputRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrAllowList(value: listOfString): Self = StObject.set(x, "CidrAllowList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrAllowListUndefined: Self = StObject.set(x, "CidrAllowList", js.undefined)
    
    @scala.inline
    def setCidrAllowListVarargs(value: string*): Self = StObject.set(x, "CidrAllowList", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDestination(value: string): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    @scala.inline
    def setEncryption(value: UpdateEncryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLatency(value: integer): Self = StObject.set(x, "MaxLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLatencyUndefined: Self = StObject.set(x, "MaxLatency", js.undefined)
    
    @scala.inline
    def setOutputArn(value: string): Self = StObject.set(x, "OutputArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setRemoteId(value: string): Self = StObject.set(x, "RemoteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoteIdUndefined: Self = StObject.set(x, "RemoteId", js.undefined)
    
    @scala.inline
    def setSmoothingLatency(value: integer): Self = StObject.set(x, "SmoothingLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothingLatencyUndefined: Self = StObject.set(x, "SmoothingLatency", js.undefined)
    
    @scala.inline
    def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
    
    @scala.inline
    def setVpcInterfaceAttachment(value: VpcInterfaceAttachment): Self = StObject.set(x, "VpcInterfaceAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfaceAttachmentUndefined: Self = StObject.set(x, "VpcInterfaceAttachment", js.undefined)
  }
}
