package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeClusterSecurityGroupIngressResult extends StObject {
  
  var ClusterSecurityGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSecurityGroup] = js.native
}
object RevokeClusterSecurityGroupIngressResult {
  
  @scala.inline
  def apply(): RevokeClusterSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeClusterSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit class RevokeClusterSecurityGroupIngressResultMutableBuilder[Self <: RevokeClusterSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClusterSecurityGroup(value: ClusterSecurityGroup): Self = StObject.set(x, "ClusterSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterSecurityGroupUndefined: Self = StObject.set(x, "ClusterSecurityGroup", js.undefined)
  }
}
