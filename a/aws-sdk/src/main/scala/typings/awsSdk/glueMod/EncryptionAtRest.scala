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
  def apply(CatalogEncryptionMode: CatalogEncryptionMode): EncryptionAtRest = {
    val __obj = js.Dynamic.literal(CatalogEncryptionMode = CatalogEncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionAtRest]
  }
  @scala.inline
  implicit class EncryptionAtRestOps[Self <: EncryptionAtRest] (val x: Self) extends AnyVal {
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
    def setCatalogEncryptionMode(value: CatalogEncryptionMode): Self = this.set("CatalogEncryptionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setSseAwsKmsKeyId(value: NameString): Self = this.set("SseAwsKmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSseAwsKmsKeyId: Self = this.set("SseAwsKmsKeyId", js.undefined)
  }
  
}

