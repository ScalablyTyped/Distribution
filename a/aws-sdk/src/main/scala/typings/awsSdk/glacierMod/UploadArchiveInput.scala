package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadArchiveInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String = js.native
  /**
    * The optional description of the archive you are uploading.
    */
  var archiveDescription: js.UndefOr[String] = js.native
  /**
    * The data to upload.
    */
  var body: js.UndefOr[Stream] = js.native
  /**
    * The SHA256 tree hash of the data being uploaded.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object UploadArchiveInput {
  @scala.inline
  def apply(
    accountId: String,
    vaultName: String,
    archiveDescription: String = null,
    body: Stream = null,
    checksum: String = null
  ): UploadArchiveInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    if (archiveDescription != null) __obj.updateDynamic("archiveDescription")(archiveDescription.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadArchiveInput]
  }
}

