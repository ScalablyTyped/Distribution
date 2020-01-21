package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceIdentifier extends js.Object {
  /**
    * The account with which the resource is associated.
    */
  var account: js.UndefOr[AwsAccountId] = js.native
  /**
    * The ID of the CA certificate used to authorize the certificate.
    */
  var caCertificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The client ID.
    */
  var clientId: js.UndefOr[ClientId] = js.native
  /**
    * The ID of the Amazon Cognito identity pool.
    */
  var cognitoIdentityPoolId: js.UndefOr[CognitoIdentityPoolId] = js.native
  /**
    * The ID of the certificate attached to the resource.
    */
  var deviceCertificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The ARN of the IAM role that has overly permissive actions.
    */
  var iamRoleArn: js.UndefOr[RoleArn] = js.native
  /**
    * The version of the policy associated with the resource.
    */
  var policyVersionIdentifier: js.UndefOr[PolicyVersionIdentifier] = js.native
  /**
    * The ARN of the role alias that has overly permissive actions.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.native
}

object ResourceIdentifier {
  @scala.inline
  def apply(
    account: AwsAccountId = null,
    caCertificateId: CertificateId = null,
    clientId: ClientId = null,
    cognitoIdentityPoolId: CognitoIdentityPoolId = null,
    deviceCertificateId: CertificateId = null,
    iamRoleArn: RoleArn = null,
    policyVersionIdentifier: PolicyVersionIdentifier = null,
    roleAliasArn: RoleAliasArn = null
  ): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (caCertificateId != null) __obj.updateDynamic("caCertificateId")(caCertificateId.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (cognitoIdentityPoolId != null) __obj.updateDynamic("cognitoIdentityPoolId")(cognitoIdentityPoolId.asInstanceOf[js.Any])
    if (deviceCertificateId != null) __obj.updateDynamic("deviceCertificateId")(deviceCertificateId.asInstanceOf[js.Any])
    if (iamRoleArn != null) __obj.updateDynamic("iamRoleArn")(iamRoleArn.asInstanceOf[js.Any])
    if (policyVersionIdentifier != null) __obj.updateDynamic("policyVersionIdentifier")(policyVersionIdentifier.asInstanceOf[js.Any])
    if (roleAliasArn != null) __obj.updateDynamic("roleAliasArn")(roleAliasArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceIdentifier]
  }
}

