package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompleteVaultLockInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID. This value must match the AWS account ID associated with the credentials used to sign the request. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon Glacier uses the AWS account ID associated with the credentials used to sign the request. If you specify your account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String = js.native
  /**
    * The lockId value is the lock ID obtained from a InitiateVaultLock request.
    */
  var lockId: String = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object CompleteVaultLockInput {
  @scala.inline
  def apply(accountId: String, lockId: String, vaultName: String): CompleteVaultLockInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], lockId = lockId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteVaultLockInput]
  }
}

