package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheSecurityGroup extends StObject {
  
  /**
    * The ARN of the cache security group,
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * The name of the cache security group.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * The description of the cache security group.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * A list of Amazon EC2 security groups that are associated with this cache security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.native
  
  /**
    * The AWS account ID of the cache security group owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
}
object CacheSecurityGroup {
  
  @scala.inline
  def apply(): CacheSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecurityGroup]
  }
  
  @scala.inline
  implicit class CacheSecurityGroupMutableBuilder[Self <: CacheSecurityGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setCacheSecurityGroupName(value: String): Self = StObject.set(x, "CacheSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSecurityGroupNameUndefined: Self = StObject.set(x, "CacheSecurityGroupName", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroups(value: EC2SecurityGroupList): Self = StObject.set(x, "EC2SecurityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEC2SecurityGroupsUndefined: Self = StObject.set(x, "EC2SecurityGroups", js.undefined)
    
    @scala.inline
    def setEC2SecurityGroupsVarargs(value: EC2SecurityGroup*): Self = StObject.set(x, "EC2SecurityGroups", js.Array(value :_*))
    
    @scala.inline
    def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
  }
}
