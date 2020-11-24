package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthorizeClusterSecurityGroupIngressResult extends js.Object {
  
  var ClusterSecurityGroup: js.UndefOr[typings.awsSdk.redshiftMod.ClusterSecurityGroup] = js.native
}
object AuthorizeClusterSecurityGroupIngressResult {
  
  @scala.inline
  def apply(): AuthorizeClusterSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthorizeClusterSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit class AuthorizeClusterSecurityGroupIngressResultOps[Self <: AuthorizeClusterSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClusterSecurityGroup(value: ClusterSecurityGroup): Self = this.set("ClusterSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterSecurityGroup: Self = this.set("ClusterSecurityGroup", js.undefined)
  }
}
