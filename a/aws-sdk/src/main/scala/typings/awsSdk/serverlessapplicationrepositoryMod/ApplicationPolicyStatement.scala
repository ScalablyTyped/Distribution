package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationPolicyStatement extends js.Object {
  
  /**
    * For the list of actions supported for this operation, see Application 
    Permissions.
    */
  var Actions: listOfString = js.native
  
  /**
    * An array of PrinciplalOrgIDs, which corresponds to AWS IAM aws:PrincipalOrgID global condition key.
    */
  var PrincipalOrgIDs: js.UndefOr[listOfString] = js.native
  
  /**
    * An array of AWS account IDs, or * to make the application public.
    */
  var Principals: listOfString = js.native
  
  /**
    * A unique ID for the statement.
    */
  var StatementId: js.UndefOr[string] = js.native
}
object ApplicationPolicyStatement {
  
  @scala.inline
  def apply(Actions: listOfString, Principals: listOfString): ApplicationPolicyStatement = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Principals = Principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationPolicyStatement]
  }
  
  @scala.inline
  implicit class ApplicationPolicyStatementOps[Self <: ApplicationPolicyStatement] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: string*): Self = this.set("Actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: listOfString): Self = this.set("Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsVarargs(value: string*): Self = this.set("Principals", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: listOfString): Self = this.set("Principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalOrgIDsVarargs(value: string*): Self = this.set("PrincipalOrgIDs", js.Array(value :_*))
    
    @scala.inline
    def setPrincipalOrgIDs(value: listOfString): Self = this.set("PrincipalOrgIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalOrgIDs: Self = this.set("PrincipalOrgIDs", js.undefined)
    
    @scala.inline
    def setStatementId(value: string): Self = this.set("StatementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatementId: Self = this.set("StatementId", js.undefined)
  }
}
