package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitiateMultipartUploadInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String = js.native
  /**
    * The archive description that you are uploading in parts. The part size must be a megabyte (1024 KB) multiplied by a power of 2, for example 1048576 (1 MB), 2097152 (2 MB), 4194304 (4 MB), 8388608 (8 MB), and so on. The minimum allowable part size is 1 MB, and the maximum is 4 GB (4096 MB).
    */
  var archiveDescription: js.UndefOr[String] = js.native
  /**
    * The size of each part except the last, in bytes. The last part can be smaller than this part size.
    */
  var partSize: js.UndefOr[String] = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object InitiateMultipartUploadInput {
  @scala.inline
  def apply(accountId: String, vaultName: String): InitiateMultipartUploadInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiateMultipartUploadInput]
  }
  @scala.inline
  implicit class InitiateMultipartUploadInputOps[Self <: InitiateMultipartUploadInput] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVaultName(value: String): Self = this.set("vaultName", value.asInstanceOf[js.Any])
    @scala.inline
    def setArchiveDescription(value: String): Self = this.set("archiveDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArchiveDescription: Self = this.set("archiveDescription", js.undefined)
    @scala.inline
    def setPartSize(value: String): Self = this.set("partSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartSize: Self = this.set("partSize", js.undefined)
  }
  
}

