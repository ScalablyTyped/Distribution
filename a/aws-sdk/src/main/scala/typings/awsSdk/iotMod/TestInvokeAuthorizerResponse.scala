package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInvokeAuthorizerResponse extends StObject {
  
  /**
    * The number of seconds after which the connection is terminated.
    */
  var disconnectAfterInSeconds: js.UndefOr[Seconds] = js.native
  
  /**
    * True if the token is authenticated, otherwise false.
    */
  var isAuthenticated: js.UndefOr[IsAuthenticated] = js.native
  
  /**
    * IAM policy documents.
    */
  var policyDocuments: js.UndefOr[PolicyDocuments] = js.native
  
  /**
    * The principal ID.
    */
  var principalId: js.UndefOr[PrincipalId] = js.native
  
  /**
    * The number of seconds after which the temporary credentials are refreshed.
    */
  var refreshAfterInSeconds: js.UndefOr[Seconds] = js.native
}
object TestInvokeAuthorizerResponse {
  
  @scala.inline
  def apply(): TestInvokeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestInvokeAuthorizerResponse]
  }
  
  @scala.inline
  implicit class TestInvokeAuthorizerResponseMutableBuilder[Self <: TestInvokeAuthorizerResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisconnectAfterInSeconds(value: Seconds): Self = StObject.set(x, "disconnectAfterInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnectAfterInSecondsUndefined: Self = StObject.set(x, "disconnectAfterInSeconds", js.undefined)
    
    @scala.inline
    def setIsAuthenticated(value: IsAuthenticated): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAuthenticatedUndefined: Self = StObject.set(x, "isAuthenticated", js.undefined)
    
    @scala.inline
    def setPolicyDocuments(value: PolicyDocuments): Self = StObject.set(x, "policyDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyDocumentsUndefined: Self = StObject.set(x, "policyDocuments", js.undefined)
    
    @scala.inline
    def setPolicyDocumentsVarargs(value: PolicyDocument*): Self = StObject.set(x, "policyDocuments", js.Array(value :_*))
    
    @scala.inline
    def setPrincipalId(value: PrincipalId): Self = StObject.set(x, "principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "principalId", js.undefined)
    
    @scala.inline
    def setRefreshAfterInSeconds(value: Seconds): Self = StObject.set(x, "refreshAfterInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshAfterInSecondsUndefined: Self = StObject.set(x, "refreshAfterInSeconds", js.undefined)
  }
}
