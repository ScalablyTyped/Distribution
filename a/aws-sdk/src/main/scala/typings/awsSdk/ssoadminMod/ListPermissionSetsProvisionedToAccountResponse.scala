package typings.awsSdk.ssoadminMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionSetsProvisionedToAccountResponse extends StObject {
  
  /**
    * The pagination token for the list API. Initially the value is null. Use the output of previous API calls to make subsequent calls.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    * Defines the level of access that an AWS account has.
    */
  var PermissionSets: js.UndefOr[PermissionSetList] = js.undefined
}
object ListPermissionSetsProvisionedToAccountResponse {
  
  @scala.inline
  def apply(): ListPermissionSetsProvisionedToAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPermissionSetsProvisionedToAccountResponse]
  }
  
  @scala.inline
  implicit class ListPermissionSetsProvisionedToAccountResponseMutableBuilder[Self <: ListPermissionSetsProvisionedToAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPermissionSets(value: PermissionSetList): Self = StObject.set(x, "PermissionSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionSetsUndefined: Self = StObject.set(x, "PermissionSets", js.undefined)
    
    @scala.inline
    def setPermissionSetsVarargs(value: PermissionSetArn*): Self = StObject.set(x, "PermissionSets", js.Array(value :_*))
  }
}
