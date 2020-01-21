package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateSecretResponse extends js.Object {
  /**
    * The ARN of the secret that was updated.  Secrets Manager automatically adds several random characters to the name at the end of the ARN when you initially create a secret. This affects only the ARN and not the actual friendly name. This ensures that if you create a new secret with the same name as an old secret that you previously deleted, then users with access to the old secret don't automatically get access to the new secret because the ARNs are different. 
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The friendly name of the secret that was updated.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  /**
    * If a new version of the secret was created by this operation, then VersionId contains the unique identifier of the new version.
    */
  var VersionId: js.UndefOr[SecretVersionIdType] = js.native
}

object UpdateSecretResponse {
  @scala.inline
  def apply(ARN: SecretARNType = null, Name: SecretNameType = null, VersionId: SecretVersionIdType = null): UpdateSecretResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSecretResponse]
  }
}

