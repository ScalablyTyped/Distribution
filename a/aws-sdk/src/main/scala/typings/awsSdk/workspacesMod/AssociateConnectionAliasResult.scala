package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssociateConnectionAliasResult extends js.Object {
  
  /**
    * The identifier of the connection alias association. You use the connection identifier in the DNS TXT record when you're configuring your DNS routing policies. 
    */
  var ConnectionIdentifier: js.UndefOr[typings.awsSdk.workspacesMod.ConnectionIdentifier] = js.native
}
object AssociateConnectionAliasResult {
  
  @scala.inline
  def apply(): AssociateConnectionAliasResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateConnectionAliasResult]
  }
  
  @scala.inline
  implicit class AssociateConnectionAliasResultOps[Self <: AssociateConnectionAliasResult] (val x: Self) extends AnyVal {
    
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
    def setConnectionIdentifier(value: ConnectionIdentifier): Self = this.set("ConnectionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionIdentifier: Self = this.set("ConnectionIdentifier", js.undefined)
  }
}
