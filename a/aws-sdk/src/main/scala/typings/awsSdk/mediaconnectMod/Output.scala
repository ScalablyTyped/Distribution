package typings.awsSdk.mediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Output extends StObject {
  
  /**
    * Percentage from 0-100 of the data transfer cost to be billed to the subscriber.
    */
  var DataTransferSubscriberFeePercent: js.UndefOr[integer] = js.undefined
  
  /**
    * A description of the output.
    */
  var Description: js.UndefOr[string] = js.undefined
  
  /**
    * The address where you want to send the output.
    */
  var Destination: js.UndefOr[string] = js.undefined
  
  /**
    * The type of key used for the encryption. If no keyType is provided, the service will use the default setting (static-key).
    */
  var Encryption: js.UndefOr[typings.awsSdk.mediaconnectMod.Encryption] = js.undefined
  
  /**
    * The ARN of the entitlement on the originator''s flow. This value is relevant only on entitled flows.
    */
  var EntitlementArn: js.UndefOr[string] = js.undefined
  
  /**
    * The input ARN of the AWS Elemental MediaLive channel. This parameter is relevant only for outputs that were added by creating a MediaLive input.
    */
  var MediaLiveInputArn: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the output. This value must be unique within the current flow.
    */
  var Name: string
  
  /**
    * The ARN of the output.
    */
  var OutputArn: string
  
  /**
    * The port to use when content is distributed to this output.
    */
  var Port: js.UndefOr[integer] = js.undefined
  
  /**
    * Attributes related to the transport stream that are used in the output.
    */
  var Transport: js.UndefOr[typings.awsSdk.mediaconnectMod.Transport] = js.undefined
  
  /**
    * The name of the VPC interface attachment to use for this output.
    */
  var VpcInterfaceAttachment: js.UndefOr[typings.awsSdk.mediaconnectMod.VpcInterfaceAttachment] = js.undefined
}
object Output {
  
  @scala.inline
  def apply(Name: string, OutputArn: string): Output = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OutputArn = OutputArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
  
  @scala.inline
  implicit class OutputMutableBuilder[Self <: Output] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTransferSubscriberFeePercent(value: integer): Self = StObject.set(x, "DataTransferSubscriberFeePercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransferSubscriberFeePercentUndefined: Self = StObject.set(x, "DataTransferSubscriberFeePercent", js.undefined)
    
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
    def setEntitlementArn(value: string): Self = StObject.set(x, "EntitlementArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitlementArnUndefined: Self = StObject.set(x, "EntitlementArn", js.undefined)
    
    @scala.inline
    def setMediaLiveInputArn(value: string): Self = StObject.set(x, "MediaLiveInputArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaLiveInputArnUndefined: Self = StObject.set(x, "MediaLiveInputArn", js.undefined)
    
    @scala.inline
    def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputArn(value: string): Self = StObject.set(x, "OutputArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setTransport(value: Transport): Self = StObject.set(x, "Transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransportUndefined: Self = StObject.set(x, "Transport", js.undefined)
    
    @scala.inline
    def setVpcInterfaceAttachment(value: VpcInterfaceAttachment): Self = StObject.set(x, "VpcInterfaceAttachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcInterfaceAttachmentUndefined: Self = StObject.set(x, "VpcInterfaceAttachment", js.undefined)
  }
}
