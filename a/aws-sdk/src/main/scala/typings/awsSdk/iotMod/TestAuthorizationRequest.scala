package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The principal.
    */
  var principal: js.UndefOr[Principal] = js.native
}

object TestAuthorizationRequest {
  @scala.inline
  def apply(
    authInfos: AuthInfos,
    clientId: ClientId = null,
    cognitoIdentityPoolId: CognitoIdentityPoolId = null,
    policyNamesToAdd: PolicyNames = null,
    policyNamesToSkip: PolicyNames = null,
    principal: Principal = null
  ): TestAuthorizationRequest = {
    val __obj = js.Dynamic.literal(authInfos = authInfos.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (cognitoIdentityPoolId != null) __obj.updateDynamic("cognitoIdentityPoolId")(cognitoIdentityPoolId.asInstanceOf[js.Any])
    if (policyNamesToAdd != null) __obj.updateDynamic("policyNamesToAdd")(policyNamesToAdd.asInstanceOf[js.Any])
    if (policyNamesToSkip != null) __obj.updateDynamic("policyNamesToSkip")(policyNamesToSkip.asInstanceOf[js.Any])
    if (principal != null) __obj.updateDynamic("principal")(principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestAuthorizationRequest]
  }
}

