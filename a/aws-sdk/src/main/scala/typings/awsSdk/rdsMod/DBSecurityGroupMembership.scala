package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBSecurityGroupMembership extends StObject {
  
  /**
    * The name of the DB security group.
    */
  var DBSecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * The status of the DB security group.
    */
  var Status: js.UndefOr[String] = js.native
}
object DBSecurityGroupMembership {
  
  @scala.inline
  def apply(): DBSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSecurityGroupMembership]
  }
  
  @scala.inline
  implicit class DBSecurityGroupMembershipMutableBuilder[Self <: DBSecurityGroupMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBSecurityGroupName(value: String): Self = StObject.set(x, "DBSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSecurityGroupNameUndefined: Self = StObject.set(x, "DBSecurityGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
