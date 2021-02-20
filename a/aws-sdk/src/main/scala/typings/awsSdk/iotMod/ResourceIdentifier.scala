package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceIdentifier extends StObject {
  
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
  implicit class ResourceIdentifierMutableBuilder[Self <: ResourceIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: AwsAccountId): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setCaCertificateId(value: CertificateId): Self = StObject.set(x, "caCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaCertificateIdUndefined: Self = StObject.set(x, "caCertificateId", js.undefined)
    
    @scala.inline
    def setClientId(value: ClientId): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setCognitoIdentityPoolId(value: CognitoIdentityPoolId): Self = StObject.set(x, "cognitoIdentityPoolId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoIdentityPoolIdUndefined: Self = StObject.set(x, "cognitoIdentityPoolId", js.undefined)
    
    @scala.inline
    def setDeviceCertificateId(value: CertificateId): Self = StObject.set(x, "deviceCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceCertificateIdUndefined: Self = StObject.set(x, "deviceCertificateId", js.undefined)
    
    @scala.inline
    def setIamRoleArn(value: RoleArn): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
    
    @scala.inline
    def setPolicyVersionIdentifier(value: PolicyVersionIdentifier): Self = StObject.set(x, "policyVersionIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionIdentifierUndefined: Self = StObject.set(x, "policyVersionIdentifier", js.undefined)
    
    @scala.inline
    def setRoleAliasArn(value: RoleAliasArn): Self = StObject.set(x, "roleAliasArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleAliasArnUndefined: Self = StObject.set(x, "roleAliasArn", js.undefined)
  }
}
