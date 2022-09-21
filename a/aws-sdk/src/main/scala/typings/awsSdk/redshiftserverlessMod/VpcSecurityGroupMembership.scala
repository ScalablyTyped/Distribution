package typings.awsSdk.redshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcSecurityGroupMembership extends StObject {
  
  /**
    * The status of the VPC security group.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the VPC security group.
    */
  var vpcSecurityGroupId: js.UndefOr[VpcSecurityGroupId] = js.undefined
}
object VpcSecurityGroupMembership {
  
  inline def apply(): VpcSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcSecurityGroupMembership]
  }
  
  extension [Self <: VpcSecurityGroupMembership](x: Self) {
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setVpcSecurityGroupId(value: VpcSecurityGroupId): Self = StObject.set(x, "vpcSecurityGroupId", value.asInstanceOf[js.Any])
    
    inline def setVpcSecurityGroupIdUndefined: Self = StObject.set(x, "vpcSecurityGroupId", js.undefined)
  }
}
