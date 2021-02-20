package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source extends StObject {
  
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.native
  
  /**
    * The type of encryption that is used on the content ingested from this source.
    */
  var Decryption: js.UndefOr[Encryption] = js.native
  
  /**
    * A description for the source. This value is not used or seen outside of the current AWS Elemental MediaConnect account.
    */
  var Description: js.UndefOr[string] = js.native
  
  /**
    * The ARN of the entitlement that allows you to subscribe to content that comes from another AWS account. The entitlement is set by the content originator and the ARN is generated as part of the originator's flow.
    */
  var EntitlementArn: js.UndefOr[string] = js.native
  
  /**
    * The IP address that the flow will be listening on for incoming content.
    */
  var IngestIp: js.UndefOr[string] = js.native
  
  /**
    * The port that the flow will be listening on for incoming content.
    */
  var IngestPort: js.UndefOr[integer] = js.native
  
  /**
    * The name of the source.
    */
  var Name: string = js.native
  
  /**
    * The ARN of the source.
    */
  var SourceArn: string = js.native
  
  /**
    * Attributes related to the transport stream that are used in the source.
    */
  var Transport: js.UndefOr[typings.awsSdk.mediaconnectMod.Transport] = js.native
  
  /**
    * The name of the VPC Interface this Source is configured with.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.native
  
  /**
    * The range of IP addresses that should be allowed to contribute content to your source. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var WhitelistCidr: js.UndefOr[string] = js.native
}
object Source {
  
  @scala.inline
  def apply(Name: string, SourceArn: string): Source = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTransferSubscriberFeePercent(value: integer): Self = StObject.set(x, "DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferSubscriberFeePercentUndefined: Self = StObject.set(x, "DataTransferSubscriberFeePercent", js.undefined)
    
    @scala.inline
    def setDecryption(value: Encryption): Self = StObject.set(x, "Decryption", value.asInstanceOf[js.Any])
    
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
    def setIngestIp(value: string): Self = StObject.set(x, "IngestIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestIpUndefined: Self = StObject.set(x, "IngestIp", js.undefined)
    
    @scala.inline
    def setIngestPort(value: integer): Self = StObject.set(x, "IngestPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngestPortUndefined: Self = StObject.set(x, "IngestPort", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceArn(value: string): Self = StObject.set(x, "SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransport(value: Transport): Self = StObject.set(x, "Transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "Transport", js.undefined)
    
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
