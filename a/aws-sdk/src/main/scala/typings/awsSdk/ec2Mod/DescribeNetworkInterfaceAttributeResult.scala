package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNetworkInterfaceAttributeResult extends StObject {
  
  /**
    * The attachment (if any) of the network interface.
    */
  var Attachment: js.UndefOr[NetworkInterfaceAttachment] = js.native
  
  /**
    * The description of the network interface.
    */
  var Description: js.UndefOr[AttributeValue] = js.native
  
  /**
    * The security groups associated with the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether source/destination checking is enabled.
    */
  var SourceDestCheck: js.UndefOr[AttributeBooleanValue] = js.native
}
object DescribeNetworkInterfaceAttributeResult {
  
  @scala.inline
  def apply(): DescribeNetworkInterfaceAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInterfaceAttributeResult]
  }
  
  @scala.inline
  implicit class DescribeNetworkInterfaceAttributeResultMutableBuilder[Self <: DescribeNetworkInterfaceAttributeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachment(value: NetworkInterfaceAttachment): Self = StObject.set(x, "Attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentUndefined: Self = StObject.set(x, "Attachment", js.undefined)
    
    @scala.inline
    def setDescription(value: AttributeValue): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setGroups(value: GroupIdentifierList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: GroupIdentifier*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setSourceDestCheck(value: AttributeBooleanValue): Self = StObject.set(x, "SourceDestCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDestCheckUndefined: Self = StObject.set(x, "SourceDestCheck", js.undefined)
  }
}
