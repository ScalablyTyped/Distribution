package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteArchiveInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String = js.native
  /**
    * The ID of the archive to delete.
    */
  var archiveId: String = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object DeleteArchiveInput {
  @scala.inline
  def apply(accountId: String, archiveId: String, vaultName: String): DeleteArchiveInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], archiveId = archiveId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteArchiveInput]
  }
}

