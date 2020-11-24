package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNetworkInterfaceAttributeResult extends js.Object {
  
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
  implicit class DescribeNetworkInterfaceAttributeResultOps[Self <: DescribeNetworkInterfaceAttributeResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttachment(value: NetworkInterfaceAttachment): Self = this.set("Attachment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachment: Self = this.set("Attachment", js.undefined)
    
    @scala.inline
    def setDescription(value: AttributeValue): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: GroupIdentifier*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: GroupIdentifierList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setSourceDestCheck(value: AttributeBooleanValue): Self = this.set("SourceDestCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDestCheck: Self = this.set("SourceDestCheck", js.undefined)
  }
}
