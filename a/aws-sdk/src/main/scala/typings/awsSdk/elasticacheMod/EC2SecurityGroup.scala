package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EC2SecurityGroup extends StObject {
  
  /**
    * The name of the Amazon EC2 security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * The AWS account ID of the Amazon EC2 security group owner.
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.native
  
  /**
    * The status of the Amazon EC2 security group.
    */
  var Status: js.UndefOr[String] = js.native
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
  }
}
