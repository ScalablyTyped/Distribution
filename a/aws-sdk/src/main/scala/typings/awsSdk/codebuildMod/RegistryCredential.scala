package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistryCredential extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.    The credential can use the name of the credentials only if they exist in your current AWS Region.  
    */
  var credential: NonEmptyString = js.native
  /**
    *  The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER, is for AWS Secrets Manager. 
    */
  var credentialProvider: CredentialProviderType = js.native
}

object RegistryCredential {
  @scala.inline
  def apply(credential: NonEmptyString, credentialProvider: CredentialProviderType): RegistryCredential = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialProvider = credentialProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegistryCredential]
  }
  @scala.inline
  implicit class RegistryCredentialOps[Self <: RegistryCredential] (val x: Self) extends AnyVal {
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
    def setCredential(value: NonEmptyString): Self = this.set("credential", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredentialProvider(value: CredentialProviderType): Self = this.set("credentialProvider", value.asInstanceOf[js.Any])
  }
  
}

