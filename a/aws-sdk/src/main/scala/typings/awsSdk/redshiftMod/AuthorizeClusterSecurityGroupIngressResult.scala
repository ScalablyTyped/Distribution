package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeClusterSecurityGroupIngressResult extends StObject {
  
  var ClusterSecurityGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSecurityGroup] = js.undefined
}
object AuthorizeClusterSecurityGroupIngressResult {
  
  @scala.inline
  def apply(): AuthorizeClusterSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeClusterSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit class AuthorizeClusterSecurityGroupIngressResultMutableBuilder[Self <: AuthorizeClusterSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSecurityGroup(value: ClusterSecurityGroup): Self = StObject.set(x, "ClusterSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSecurityGroupUndefined: Self = StObject.set(x, "ClusterSecurityGroup", js.undefined)
  }
}
