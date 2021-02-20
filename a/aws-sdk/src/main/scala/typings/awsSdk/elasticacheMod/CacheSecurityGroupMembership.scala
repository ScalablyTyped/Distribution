package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CacheSecurityGroupMembership extends StObject {
  
  /**
    * The name of the cache security group.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * The membership status in the cache security group. The status changes when a cache security group is modified, or when the cache security groups assigned to a cluster are modified.
    */
  var Status: js.UndefOr[String] = js.native
}
object CacheSecurityGroupMembership {
  
  @scala.inline
  def apply(): CacheSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecurityGroupMembership]
  }
  
  @scala.inline
  implicit class CacheSecurityGroupMembershipMutableBuilder[Self <: CacheSecurityGroupMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSecurityGroupName(value: String): Self = StObject.set(x, "CacheSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSecurityGroupNameUndefined: Self = StObject.set(x, "CacheSecurityGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
