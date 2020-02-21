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
  def apply(Credential: NonEmptyString = null, CredentialProvider: NonEmptyString = null): AwsCodeBuildProjectEnvironmentRegistryCredential = {
    val __obj = js.Dynamic.literal()
    if (Credential != null) __obj.updateDynamic("Credential")(Credential.asInstanceOf[js.Any])
    if (CredentialProvider != null) __obj.updateDynamic("CredentialProvider")(CredentialProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsCodeBuildProjectEnvironmentRegistryCredential]
  }
}

