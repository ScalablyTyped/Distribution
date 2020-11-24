package typings.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateServiceRoleToAccountResponse extends js.Object {
  
  /**
    * The time when the service role was associated with the account.
    */
  var AssociatedAt: js.UndefOr[string] = js.native
}
object AssociateServiceRoleToAccountResponse {
  
  @scala.inline
  def apply(): AssociateServiceRoleToAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateServiceRoleToAccountResponse]
  }
  
  @scala.inline
  implicit class AssociateServiceRoleToAccountResponseOps[Self <: AssociateServiceRoleToAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociatedAt(value: string): Self = this.set("AssociatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedAt: Self = this.set("AssociatedAt", js.undefined)
  }
}
