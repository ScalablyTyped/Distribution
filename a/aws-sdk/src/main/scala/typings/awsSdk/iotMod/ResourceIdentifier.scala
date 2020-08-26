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
  def apply(): ResourceIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceIdentifier]
  }
  @scala.inline
  implicit class ResourceIdentifierOps[Self <: ResourceIdentifier] (val x: Self) extends AnyVal {
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
    def setAccount(value: AwsAccountId): Self = this.set("account", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccount: Self = this.set("account", js.undefined)
    @scala.inline
    def setCaCertificateId(value: CertificateId): Self = this.set("caCertificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaCertificateId: Self = this.set("caCertificateId", js.undefined)
    @scala.inline
    def setClientId(value: ClientId): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    @scala.inline
    def setCognitoIdentityPoolId(value: CognitoIdentityPoolId): Self = this.set("cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCognitoIdentityPoolId: Self = this.set("cognitoIdentityPoolId", js.undefined)
    @scala.inline
    def setDeviceCertificateId(value: CertificateId): Self = this.set("deviceCertificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceCertificateId: Self = this.set("deviceCertificateId", js.undefined)
    @scala.inline
    def setIamRoleArn(value: RoleArn): Self = this.set("iamRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIamRoleArn: Self = this.set("iamRoleArn", js.undefined)
    @scala.inline
    def setPolicyVersionIdentifier(value: PolicyVersionIdentifier): Self = this.set("policyVersionIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyVersionIdentifier: Self = this.set("policyVersionIdentifier", js.undefined)
    @scala.inline
    def setRoleAliasArn(value: RoleAliasArn): Self = this.set("roleAliasArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleAliasArn: Self = this.set("roleAliasArn", js.undefined)
  }
  
}

