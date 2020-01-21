package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EncryptionAtRest extends js.Object {
  /**
    * The encryption-at-rest mode for encrypting Data Catalog data.
    */
  var CatalogEncryptionMode: typings.awsSdk.glueMod.CatalogEncryptionMode = js.native
  /**
    * The ID of the AWS KMS key to use for encryption at rest.
    */
  var SseAwsKmsKeyId: js.UndefOr[NameString] = js.native
}

object EncryptionAtRest {
  @scala.inline
  def apply(CatalogEncryptionMode: CatalogEncryptionMode, SseAwsKmsKeyId: NameString = null): EncryptionAtRest = {
    val __obj = js.Dynamic.literal(CatalogEncryptionMode = CatalogEncryptionMode.asInstanceOf[js.Any])
    if (SseAwsKmsKeyId != null) __obj.updateDynamic("SseAwsKmsKeyId")(SseAwsKmsKeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAtRest]
  }
}

