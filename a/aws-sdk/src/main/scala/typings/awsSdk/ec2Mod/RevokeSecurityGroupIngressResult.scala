package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeSecurityGroupIngressResult extends js.Object {
  
  /**
    * Returns true if the request succeeds; otherwise, returns an error.
    */
  var Return: js.UndefOr[Boolean] = js.native
  
  /**
    * The inbound rules that were unknown to the service. In some cases, unknownIpPermissionSet might be in a different format from the request parameter. 
    */
  var UnknownIpPermissions: js.UndefOr[IpPermissionList] = js.native
}
object RevokeSecurityGroupIngressResult {
  
  @scala.inline
  def apply(): RevokeSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit class RevokeSecurityGroupIngressResultOps[Self <: RevokeSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
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
    def setReturn(value: Boolean): Self = this.set("Return", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturn: Self = this.set("Return", js.undefined)
    
    @scala.inline
    def setUnknownIpPermissionsVarargs(value: IpPermission*): Self = this.set("UnknownIpPermissions", js.Array(value :_*))
    
    @scala.inline
    def setUnknownIpPermissions(value: IpPermissionList): Self = this.set("UnknownIpPermissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownIpPermissions: Self = this.set("UnknownIpPermissions", js.undefined)
  }
}
