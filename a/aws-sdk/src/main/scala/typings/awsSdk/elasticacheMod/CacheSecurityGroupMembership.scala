package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheSecurityGroupMembership extends StObject {
  
  /**
    * The name of the cache security group.
    */
  var CacheSecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The membership status in the cache security group. The status changes when a cache security group is modified, or when the cache security groups assigned to a cluster are modified.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object CacheSecurityGroupMembership {
  
  inline def apply(): CacheSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheSecurityGroupMembership]
  }
  
  extension [Self <: CacheSecurityGroupMembership](x: Self) {
    
    inline def setCacheSecurityGroupName(value: String): Self = StObject.set(x, "CacheSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setCacheSecurityGroupNameUndefined: Self = StObject.set(x, "CacheSecurityGroupName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
