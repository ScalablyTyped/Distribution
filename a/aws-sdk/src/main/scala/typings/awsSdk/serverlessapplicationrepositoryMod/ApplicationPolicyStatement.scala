package typings.awsSdk.serverlessapplicationrepositoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationPolicyStatement extends StObject {
  
  /**
    * For the list of actions supported for this operation, see Application 
    Permissions.
    */
  var Actions: listOfString
  
  /**
    * An array of PrinciplalOrgIDs, which corresponds to AWS IAM aws:PrincipalOrgID global condition key.
    */
  var PrincipalOrgIDs: js.UndefOr[listOfString] = js.undefined
  
  /**
    * An array of AWS account IDs, or * to make the application public.
    */
  var Principals: listOfString
  
  /**
    * A unique ID for the statement.
    */
  var StatementId: js.UndefOr[string] = js.undefined
}
object ApplicationPolicyStatement {
  
  inline def apply(Actions: listOfString, Principals: listOfString): ApplicationPolicyStatement = {
    val __obj = js.Dynamic.literal(Actions = Actions.asInstanceOf[js.Any], Principals = Principals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationPolicyStatement]
  }
  
  extension [Self <: ApplicationPolicyStatement](x: Self) {
    
    inline def setActions(value: listOfString): Self = StObject.set(x, "Actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: string*): Self = StObject.set(x, "Actions", js.Array(value*))
    
    inline def setPrincipalOrgIDs(value: listOfString): Self = StObject.set(x, "PrincipalOrgIDs", value.asInstanceOf[js.Any])
    
    inline def setPrincipalOrgIDsUndefined: Self = StObject.set(x, "PrincipalOrgIDs", js.undefined)
    
    inline def setPrincipalOrgIDsVarargs(value: string*): Self = StObject.set(x, "PrincipalOrgIDs", js.Array(value*))
    
    inline def setPrincipals(value: listOfString): Self = StObject.set(x, "Principals", value.asInstanceOf[js.Any])
    
    inline def setPrincipalsVarargs(value: string*): Self = StObject.set(x, "Principals", js.Array(value*))
    
    inline def setStatementId(value: string): Self = StObject.set(x, "StatementId", value.asInstanceOf[js.Any])
    
    inline def setStatementIdUndefined: Self = StObject.set(x, "StatementId", js.undefined)
  }
}
