package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AbortMultipartUploadInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: String = js.native
  /**
    * The upload ID of the multipart upload to delete.
    */
  var uploadId: String = js.native
  /**
    * The name of the vault.
    */
  var vaultName: String = js.native
}

object AbortMultipartUploadInput {
  @scala.inline
  def apply(accountId: String, uploadId: String, vaultName: String): AbortMultipartUploadInput = {
    val __obj = js.Dynamic.literal(accountId = accountId.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any], vaultName = vaultName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbortMultipartUploadInput]
  }
}

