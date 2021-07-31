package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpcSecurityGroupMembership extends StObject {
  
  /**
    * The status of the VPC security group.
    */
  var Status: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier of the VPC security group.
    */
  var VpcSecurityGroupId: js.UndefOr[String] = js.undefined
}
object VpcSecurityGroupMembership {
  
  @scala.inline
  def apply(): VpcSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcSecurityGroupMembership]
  }
  
  @scala.inline
  implicit class VpcSecurityGroupMembershipMutableBuilder[Self <: VpcSecurityGroupMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setVpcSecurityGroupId(value: String): Self = StObject.set(x, "VpcSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcSecurityGroupIdUndefined: Self = StObject.set(x, "VpcSecurityGroupId", js.undefined)
  }
}
