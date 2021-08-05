package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheSecurityGroup extends StObject {
  
  /**
    * The ARN of the cache security group,
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the cache security group.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the cache security group.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * A list of Amazon EC2 security groups that are associated with this cache security group.
    */
  var EC2SecurityGroups: js.UndefOr[EC2SecurityGroupList] = js.undefined
  
  /**
    * The AWS account ID of the cache security group owner.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
}
object CacheSecurityGroup {
  
  inline def apply(): CacheSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecurityGroup]
  }
  
  extension [Self <: CacheSecurityGroup](x: Self) {
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setCacheSecurityGroupName(value: String): Self = StObject.set(x, "CacheSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setCacheSecurityGroupNameUndefined: Self = StObject.set(x, "CacheSecurityGroupName", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEC2SecurityGroups(value: EC2SecurityGroupList): Self = StObject.set(x, "EC2SecurityGroups", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupsUndefined: Self = StObject.set(x, "EC2SecurityGroups", js.undefined)
    
    inline def setEC2SecurityGroupsVarargs(value: EC2SecurityGroup*): Self = StObject.set(x, "EC2SecurityGroups", js.Array(value :_*))
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
  }
}
