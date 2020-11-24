package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestAuthorizationRequest extends js.Object {
  
  /**
    * A list of authorization info objects. Simulating authorization will create a response for each authInfo object in the list.
    */
  var authInfos: AuthInfos = js.native
  
  /**
    * The MQTT client ID.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  
  /**
    * The Cognito identity pool ID.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.native
  
  /**
    * When testing custom authorization, the policies specified here are treated as if they are attached to the principal being authorized.
    */
  var policyNamesToAdd: js.UndefOr[PolicyNames] = js.native
  
  /**
    * When testing custom authorization, the policies specified here are treated as if they are not attached to the principal being authorized.
    */
  var policyNamesToSkip: js.UndefOr[PolicyNames] = js.native
  
  /**
    * The principal. Valid principals are CertificateArn (arn:aws:iot:region:accountId:cert/certificateId), thingGroupArn (arn:aws:iot:region:accountId:thinggroup/groupName) and CognitoId (region:id).
    */
  var principal: js.UndefOr[Principal] = js.native
}
object TestAuthorizationRequest {
  
  @scala.inline
  def apply(authInfos: AuthInfos): TestAuthorizationRequest = {
    val __obj = js.Dynamic.literal(authInfos = authInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAuthorizationRequest]
  }
  
  @scala.inline
  implicit class TestAuthorizationRequestOps[Self <: TestAuthorizationRequest] (val x: Self) extends AnyVal {
    
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
    def setAuthInfosVarargs(value: AuthInfo*): Self = this.set("authInfos", js.Array(value :_*))
    
    @scala.inline
    def setAuthInfos(value: AuthInfos): Self = this.set("authInfos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: ClientId): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setCognitoIdentityPoolId(value: CognitoIdentityPoolId): Self = this.set("cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCognitoIdentityPoolId: Self = this.set("cognitoIdentityPoolId", js.undefined)
    
    @scala.inline
    def setPolicyNamesToAddVarargs(value: PolicyName*): Self = this.set("policyNamesToAdd", js.Array(value :_*))
    
    @scala.inline
    def setPolicyNamesToAdd(value: PolicyNames): Self = this.set("policyNamesToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyNamesToAdd: Self = this.set("policyNamesToAdd", js.undefined)
    
    @scala.inline
    def setPolicyNamesToSkipVarargs(value: PolicyName*): Self = this.set("policyNamesToSkip", js.Array(value :_*))
    
    @scala.inline
    def setPolicyNamesToSkip(value: PolicyNames): Self = this.set("policyNamesToSkip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyNamesToSkip: Self = this.set("policyNamesToSkip", js.undefined)
    
    @scala.inline
    def setPrincipal(value: Principal): Self = this.set("principal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrincipal: Self = this.set("principal", js.undefined)
  }
}
