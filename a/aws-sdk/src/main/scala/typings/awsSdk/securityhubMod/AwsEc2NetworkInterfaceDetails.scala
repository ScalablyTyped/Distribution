package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2NetworkInterfaceDetails extends StObject {
  
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[AwsEc2NetworkInterfaceAttachment] = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Security groups for the network interface.
    */
  var SecurityGroups: js.UndefOr[AwsEc2NetworkInterfaceSecurityGroupList] = js.native
  
  /**
    * Indicates whether traffic to or from the instance is validated.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.native
}
object AwsEc2NetworkInterfaceDetails {
  
  @scala.inline
  def apply(): AwsEc2NetworkInterfaceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2NetworkInterfaceDetails]
  }
  
  @scala.inline
  implicit class AwsEc2NetworkInterfaceDetailsMutableBuilder[Self <: AwsEc2NetworkInterfaceDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: AwsEc2NetworkInterfaceAttachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NonEmptyString): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setSecurityGroups(value: AwsEc2NetworkInterfaceSecurityGroupList): Self = StObject.set(x, "SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsUndefined: Self = StObject.set(x, "SecurityGroups", js.undefined)
    
    @scala.inline
    def setSecurityGroupsVarargs(value: AwsEc2NetworkInterfaceSecurityGroup*): Self = StObject.set(x, "SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSourceDestCheck(value: Boolean): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
  }
}
