package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2SecurityGroup extends StObject {
  
  /**
    * The name of the EC2 Security Group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * The AWS ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field. 
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
  
  /**
    * The status of the EC2 security group.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The list of tags for the EC2 security group.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object EC2SecurityGroup {
  
  @scala.inline
  def apply(): EC2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2SecurityGroup]
  }
  
  @scala.inline
  implicit class EC2SecurityGroupMutableBuilder[Self <: EC2SecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEC2SecurityGroupName(value: String): Self = StObject.set(x, "EC2SecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupNameUndefined: Self = StObject.set(x, "EC2SecurityGroupName", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroupOwnerId(value: String): Self = StObject.set(x, "EC2SecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupOwnerIdUndefined: Self = StObject.set(x, "EC2SecurityGroupOwnerId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
