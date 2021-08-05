package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetSourceRequest extends StObject {
  
  /**
    * The type of encryption that is used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[Encryption] = js.undefined
  
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the entitlement that allows you to subscribe to this flow. The entitlement is set by the flow originator, and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[string] = js.undefined
  
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
    * The name of the source.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The protocol that is used by the source.
    */
  var Protocol: js.UndefOr[typings.awsSdk.mediaconnectMod.Protocol] = js.undefined
  
  /**
    * The stream ID that you want to use for this transport. This parameter applies only to Zixi-based streams.
    */
  var StreamId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the VPC interface to use for this source.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.undefined
  
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[string] = js.undefined
}
object SetSourceRequest {
  
  inline def apply(): SetSourceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetSourceRequest]
  }
  
  extension [Self <: SetSourceRequest](x: Self) {
    
    inline def setDecryption(value: Encryption): Self = StObject.set(x, "Decryption", value.asInstanceOf[js.Any])
    
    inline def setDecryptionUndefined: Self = StObject.set(x, "Decryption", js.undefined)
    
    inline def setDescription(value: string): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    inline def setEntitlementArnUndefined: Self = StObject.set(x, "EntitlementArn", js.undefined)
    
    inline def setIngestPort(value: integer): Self = StObject.set(x, "IngestPort", value.asInstanceOf[js.Any])
    
    inline def setIngestPortUndefined: Self = StObject.set(x, "IngestPort", js.undefined)
    
    inline def setMaxBitrate(value: integer): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setMaxLatency(value: integer): Self = StObject.set(x, "MaxLatency", value.asInstanceOf[js.Any])
    
    inline def setMaxLatencyUndefined: Self = StObject.set(x, "MaxLatency", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setProtocol(value: Protocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
    
    inline def setVpcInterfaceName(value: string): Self = StObject.set(x, "VpcInterfaceName", value.asInstanceOf[js.Any])
    
    inline def setVpcInterfaceNameUndefined: Self = StObject.set(x, "VpcInterfaceName", js.undefined)
    
    inline def setWhitelistCidr(value: string): Self = StObject.set(x, "WhitelistCidr", value.asInstanceOf[js.Any])
    
    inline def setWhitelistCidrUndefined: Self = StObject.set(x, "WhitelistCidr", js.undefined)
  }
}
