package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RevokeDBSecurityGroupIngressResult extends js.Object {
  
  var DBSecurityGroup: js.UndefOr[typings.awsSdk.rdsMod.DBSecurityGroup] = js.native
}
object RevokeDBSecurityGroupIngressResult {
  
  @scala.inline
  def apply(): RevokeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevokeDBSecurityGroupIngressResult]
  }
  
  @scala.inline
  implicit class RevokeDBSecurityGroupIngressResultOps[Self <: RevokeDBSecurityGroupIngressResult] (val x: Self) extends AnyVal {
    
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
    def setDBSecurityGroup(value: DBSecurityGroup): Self = this.set("DBSecurityGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDBSecurityGroup: Self = this.set("DBSecurityGroup", js.undefined)
  }
}
