package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddOutputRequest extends StObject {
  
  /**
    * The range of IP addresses that should be allowed to initiate output requests to this flow. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrAllowList: js.UndefOr[listOfString] = js.undefined
  
  /**
    * A description of the output. This description appears only on the AWS Elemental MediaConnect console and will not be seen by the end user.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The IP address from which video will be sent to output destinations.
    */
  var Destination: js.UndefOr[string] = js.undefined
  
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[typings.awsSdk.mediaconnectMod.Encryption] = js.undefined
  
  /**
    * The maximum latency in milliseconds for Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The name of the output. This value must be unique within the current flow.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[integer] = js.undefined
  
  /**
    * The protocol to use for the output.
    */
  var Protocol: typings.awsSdk.mediaconnectMod.Protocol
  
  /**
    * The remote ID for the Zixi-pull output stream.
    */
  var RemoteId: js.UndefOr[string] = js.undefined
  
  /**
    * The smoothing latency in milliseconds for RIST, RTP, and RTP-FEC streams.
    */
  var SmoothingLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the VPC interface attachment to use for this output.
    */
  var VpcInterfaceAttachment: js.UndefOr[typings.awsSdk.mediaconnectMod.VpcInterfaceAttachment] = js.undefined
}
object AddOutputRequest {
  
  @scala.inline
  def apply(Protocol: Protocol): AddOutputRequest = {
    val __obj = js.Dynamic.literal(Protocol = Protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddOutputRequest]
  }
  
  @scala.inline
  implicit class AddOutputRequestMutableBuilder[Self <: AddOutputRequest] (val x: Self) extends AnyVal {
    
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
    def setEncryption(value: Encryption): Self = StObject.set(x, "Encryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionUndefined: Self = StObject.set(x, "Encryption", js.undefined)
    
    @scala.inline
    def setMaxLatency(value: integer): Self = StObject.set(x, "MaxLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLatencyUndefined: Self = StObject.set(x, "MaxLatency", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
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
