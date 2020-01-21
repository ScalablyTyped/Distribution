package typings.awsSdk.secretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteSecretResponse extends js.Object {
  /**
    * The ARN of the secret that is now scheduled for deletion.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * The date and time after which this secret can be deleted by Secrets Manager and can no longer be restored. This value is the date and time of the delete request plus the number of days specified in RecoveryWindowInDays.
    */
  var DeletionDate: js.UndefOr[DeletionDateType] = js.native
  /**
    * The friendly name of the secret that is now scheduled for deletion.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
}

object DeleteSecretResponse {
  @scala.inline
  def apply(ARN: SecretARNType = null, DeletionDate: DeletionDateType = null, Name: SecretNameType = null): DeleteSecretResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (DeletionDate != null) __obj.updateDynamic("DeletionDate")(DeletionDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSecretResponse]
  }
}

