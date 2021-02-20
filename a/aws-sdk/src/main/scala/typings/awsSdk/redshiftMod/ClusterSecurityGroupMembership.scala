package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSecurityGroupMembership extends StObject {
  
  /**
    * The name of the cluster security group.
    */
  var ClusterSecurityGroupName: js.UndefOr[String] = js.native
  
  /**
    * The status of the cluster security group.
    */
  var Status: js.UndefOr[String] = js.native
}
object ClusterSecurityGroupMembership {
  
  @scala.inline
  def apply(): ClusterSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSecurityGroupMembership]
  }
  
  @scala.inline
  implicit class ClusterSecurityGroupMembershipMutableBuilder[Self <: ClusterSecurityGroupMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSecurityGroupName(value: String): Self = StObject.set(x, "ClusterSecurityGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSecurityGroupNameUndefined: Self = StObject.set(x, "ClusterSecurityGroupName", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
