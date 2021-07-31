package typings.awsSdk.organizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDelegatedServicesForAccountResponse extends StObject {
  
  /**
    * The services for which the account is a delegated administrator.
    */
  var DelegatedServices: js.UndefOr[typings.awsSdk.organizationsMod.DelegatedServices] = js.undefined
  
  /**
    * If present, indicates that more output is available than is included in the current response. Use this value in the NextToken request parameter in a subsequent call to the operation to get the next part of the output. You should repeat this until the NextToken response element comes back as null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.organizationsMod.NextToken] = js.undefined
}
object ListDelegatedServicesForAccountResponse {
  
  @scala.inline
  def apply(): ListDelegatedServicesForAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDelegatedServicesForAccountResponse]
  }
  
  @scala.inline
  implicit class ListDelegatedServicesForAccountResponseMutableBuilder[Self <: ListDelegatedServicesForAccountResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegatedServices(value: DelegatedServices): Self = StObject.set(x, "DelegatedServices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegatedServicesUndefined: Self = StObject.set(x, "DelegatedServices", js.undefined)
    
    @scala.inline
    def setDelegatedServicesVarargs(value: DelegatedService*): Self = StObject.set(x, "DelegatedServices", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
