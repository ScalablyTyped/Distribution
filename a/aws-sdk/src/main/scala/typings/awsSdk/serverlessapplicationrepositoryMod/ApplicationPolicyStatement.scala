package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationPolicyStatement extends StObject {
  
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
  implicit class ApplicationPolicyStatementMutableBuilder[Self <: ApplicationPolicyStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: listOfString): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: string*): Self = StObject.set(x, "Actions", js.Array(value :_*))
    
    @scala.inline
    def setPrincipalOrgIDs(value: listOfString): Self = StObject.set(x, "PrincipalOrgIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalOrgIDsUndefined: Self = StObject.set(x, "PrincipalOrgIDs", js.undefined)
    
    @scala.inline
    def setPrincipalOrgIDsVarargs(value: string*): Self = StObject.set(x, "PrincipalOrgIDs", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: listOfString): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsVarargs(value: string*): Self = StObject.set(x, "Principals", js.Array(value :_*))
    
    @scala.inline
    def setStatementId(value: string): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatementIdUndefined: Self = StObject.set(x, "StatementId", js.undefined)
  }
}
