package typings.awsSdkCredentialProviderCognitoIdentity.fromCognitoIdentityMod

import typings.awsSdkTypes.credentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CognitoIdentityCredentials extends Credentials {
  
  /**
    * The Cognito ID returned by the last call to AWS.CognitoIdentity.getOpenIdToken().
    */
  var identityId: String = js.native
}
object CognitoIdentityCredentials {
  
  @scala.inline
  def apply(accessKeyId: String, identityId: String, secretAccessKey: String): CognitoIdentityCredentials = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], identityId = identityId.asInstanceOf[js.Any], secretAccessKey = secretAccessKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoIdentityCredentials]
  }
  
  @scala.inline
  implicit class CognitoIdentityCredentialsOps[Self <: CognitoIdentityCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdentityId(value: String): Self = this.set("identityId", value.asInstanceOf[js.Any])
  }
}
