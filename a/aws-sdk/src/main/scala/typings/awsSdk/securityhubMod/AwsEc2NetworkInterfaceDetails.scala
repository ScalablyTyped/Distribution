package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2NetworkInterfaceDetails extends StObject {
  
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[AwsEc2NetworkInterfaceAttachment] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Security groups for the network interface.
    */
  var SecurityGroups: js.UndefOr[AwsEc2NetworkInterfaceSecurityGroupList] = js.undefined
  
  /**
    * Indicates whether traffic to or from the instance is validated.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.undefined
}
object AwsEc2NetworkInterfaceDetails {
  
  inline def apply(): AwsEc2NetworkInterfaceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceDetails]
  }
  
  extension [Self <: AwsEc2NetworkInterfaceDetails](x: Self) {
    
    inline def setAttachment(value: AwsEc2NetworkInterfaceAttachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    inline def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    inline def setNetworkInterfaceId(value: NonEmptyString): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setSecurityGroups(value: AwsEc2NetworkInterfaceSecurityGroupList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    inline def setSecurityGroupsVarargs(value: AwsEc2NetworkInterfaceSecurityGroup*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    inline def setSourceDestCheck(value: Boolean): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    inline def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
  }
}
