package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowSourceRequest extends StObject {
  
  /**
    * The type of encryption used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[UpdateEncryption] = js.undefined
  
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow originator, and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[string] = js.undefined
  
  /**
    * The flow that is associated with the source that you want to update.
    */
  var FlowArn: string
  
  /**
    * The port that the flow will be listening on for incoming content.
    */
  var IngestPort: js.UndefOr[integer] = js.undefined
  
  /**
    * The smoothing max bitrate for RIST, RTP, and RTP-FEC streams.
    */
  var MaxBitrate: js.UndefOr[integer] = js.undefined
  
  /**
    * The maximum latency in milliseconds. This parameter applies only to RIST-based and Zixi-based streams.
    */
  var MaxLatency: js.UndefOr[integer] = js.undefined
  
  /**
    * The protocol that is used by the source.
    */
  var Protocol: js.UndefOr[typings.awsSdk.mediaconnectMod.Protocol] = js.undefined
  
  /**
    * The ARN of the source that you want to update.
    */
  var SourceArn: string
  
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the VPC Interface to configure this Source with.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.undefined
  
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[string] = js.undefined
}
object UpdateFlowSourceRequest {
  
  @scala.inline
  def apply(FlowArn: string, SourceArn: string): UpdateFlowSourceRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowSourceRequest]
  }
  
  @scala.inline
  implicit class UpdateFlowSourceRequestMutableBuilder[Self <: UpdateFlowSourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecryption(value: UpdateEncryption): Self = StObject.set(x, "Decryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecryptionUndefined: Self = StObject.set(x, "Decryption", js.undefined)
    
    @scala.inline
    def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementArnUndefined: Self = StObject.set(x, "EntitlementArn", js.undefined)
    
    @scala.inline
    def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestPort(value: integer): Self = StObject.set(x, "IngestPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestPortUndefined: Self = StObject.set(x, "IngestPort", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    @scala.inline
    def setMaxLatency(value: integer): Self = StObject.set(x, "MaxLatency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLatencyUndefined: Self = StObject.set(x, "MaxLatency", js.undefined)
    
    @scala.inline
    def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
    
    @scala.inline
    def setVpcInterfaceName(value: string): Self = StObject.set(x, "VpcInterfaceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfaceNameUndefined: Self = StObject.set(x, "VpcInterfaceName", js.undefined)
    
    @scala.inline
    def setWhitelistCidr(value: string): Self = StObject.set(x, "WhitelistCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhitelistCidrUndefined: Self = StObject.set(x, "WhitelistCidr", js.undefined)
  }
}
