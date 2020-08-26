package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsCodeBuildProjectEnvironmentRegistryCredential extends js.Object {
  /**
    * The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.  The credential can use the name of the credentials only if they exist in your current AWS Region.  
    */
  var Credential: js.UndefOr[NonEmptyString] = js.native
  /**
    * The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER, is for AWS Secrets Manager.
    */
  var CredentialProvider: js.UndefOr[NonEmptyString] = js.native
}

object AwsCodeBuildProjectEnvironmentRegistryCredential {
  @scala.inline
  def apply(): AwsCodeBuildProjectEnvironmentRegistryCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsCodeBuildProjectEnvironmentRegistryCredential]
  }
  @scala.inline
  implicit class AwsCodeBuildProjectEnvironmentRegistryCredentialOps[Self <: AwsCodeBuildProjectEnvironmentRegistryCredential] (val x: Self) extends AnyVal {
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
    def setCredential(value: NonEmptyString): Self = this.set("Credential", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredential: Self = this.set("Credential", js.undefined)
    @scala.inline
    def setCredentialProvider(value: NonEmptyString): Self = this.set("CredentialProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentialProvider: Self = this.set("CredentialProvider", js.undefined)
  }
  
}

