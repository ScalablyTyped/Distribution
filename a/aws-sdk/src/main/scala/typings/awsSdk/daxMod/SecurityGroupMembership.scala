package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupMembership extends StObject {
  
  /**
    * The unique ID for this security group.
    */
  var SecurityGroupIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The status of this security group.
    */
  var Status: js.UndefOr[String] = js.undefined
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
    def setSecurityGroupIdentifier(value: String): Self = StObject.set(x, "SecurityGroupIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdentifierUndefined: Self = StObject.set(x, "SecurityGroupIdentifier", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
