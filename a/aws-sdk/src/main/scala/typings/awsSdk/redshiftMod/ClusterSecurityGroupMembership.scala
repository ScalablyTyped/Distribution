package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterSecurityGroupMembership extends StObject {
  
  /**
    * The name of the cluster security group.
    */
  var ClusterSecurityGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the cluster security group.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object ClusterSecurityGroupMembership {
  
  inline def apply(): ClusterSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSecurityGroupMembership]
  }
  
  extension [Self <: ClusterSecurityGroupMembership](x: Self) {
    
    inline def setClusterSecurityGroupName(value: String): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    inline def setClusterSecurityGroupNameUndefined: Self = StObject.set(x, "ClusterSecurityGroupName", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
