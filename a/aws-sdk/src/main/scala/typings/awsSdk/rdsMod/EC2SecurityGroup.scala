package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EC2SecurityGroup extends StObject {
  
  /**
    * Specifies the id of the EC2 security group.
    */
  var EC2SecurityGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the name of the EC2 security group.
    */
  var EC2SecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon Web Services ID of the owner of the EC2 security group specified in the EC2SecurityGroupName field.
    */
  var EC2SecurityGroupOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Provides the status of the EC2 security group. Status can be "authorizing", "authorized", "revoking", and "revoked".
    */
  var Status: js.UndefOr[String] = js.undefined
}
object EC2SecurityGroup {
  
  inline def apply(): EC2SecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EC2SecurityGroup]
  }
  
  extension [Self <: EC2SecurityGroup](x: Self) {
    
    inline def setEC2SecurityGroupId(value: String): Self = StObject.set(x, "EC2SecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupIdUndefined: Self = StObject.set(x, "EC2SecurityGroupId", js.undefined)
    
    inline def setEC2SecurityGroupName(value: String): Self = StObject.set(x, "EC2SecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupNameUndefined: Self = StObject.set(x, "EC2SecurityGroupName", js.undefined)
    
    inline def setEC2SecurityGroupOwnerId(value: String): Self = StObject.set(x, "EC2SecurityGroupOwnerId", value.asInstanceOf[js.Any])
    
    inline def setEC2SecurityGroupOwnerIdUndefined: Self = StObject.set(x, "EC2SecurityGroupOwnerId", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
