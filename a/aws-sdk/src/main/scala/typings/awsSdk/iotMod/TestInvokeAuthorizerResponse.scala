package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestInvokeAuthorizerResponse extends js.Object {
  
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
  implicit class TestInvokeAuthorizerResponseOps[Self <: TestInvokeAuthorizerResponse] (val x: Self) extends AnyVal {
    
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
    def setDisconnectAfterInSeconds(value: Seconds): Self = this.set("disconnectAfterInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisconnectAfterInSeconds: Self = this.set("disconnectAfterInSeconds", js.undefined)
    
    @scala.inline
    def setIsAuthenticated(value: IsAuthenticated): Self = this.set("isAuthenticated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAuthenticated: Self = this.set("isAuthenticated", js.undefined)
    
    @scala.inline
    def setPolicyDocumentsVarargs(value: PolicyDocument*): Self = this.set("policyDocuments", js.Array(value :_*))
    
    @scala.inline
    def setPolicyDocuments(value: PolicyDocuments): Self = this.set("policyDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyDocuments: Self = this.set("policyDocuments", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: PrincipalId): Self = this.set("principalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipalId: Self = this.set("principalId", js.undefined)
    
    @scala.inline
    def setRefreshAfterInSeconds(value: Seconds): Self = this.set("refreshAfterInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefreshAfterInSeconds: Self = this.set("refreshAfterInSeconds", js.undefined)
  }
}
