package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityGroupMembership extends StObject {
  
  /**
    * The identifier of the cache security group.
    */
  var SecurityGroupId: js.UndefOr[String] = js.native
  
  /**
    * The status of the cache security group membership. The status changes whenever a cache security group is modified, or when the cache security groups assigned to a cluster are modified.
    */
  var Status: js.UndefOr[String] = js.native
}
object SecurityGroupMembership {
  
  @scala.inline
  def apply(): SecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupMembership]
  }
  
  @scala.inline
  implicit class SecurityGroupMembershipMutableBuilder[Self <: SecurityGroupMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityGroupId(value: String): Self = StObject.set(x, "SecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdUndefined: Self = StObject.set(x, "SecurityGroupId", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
