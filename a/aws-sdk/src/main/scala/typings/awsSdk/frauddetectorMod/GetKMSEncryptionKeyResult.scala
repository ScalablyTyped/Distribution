package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetKMSEncryptionKeyResult extends js.Object {
  /**
    * The KMS encryption key.
    */
  var kmsKey: js.UndefOr[KMSKey] = js.native
}

object GetKMSEncryptionKeyResult {
  @scala.inline
  def apply(): GetKMSEncryptionKeyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKMSEncryptionKeyResult]
  }
  @scala.inline
  implicit class GetKMSEncryptionKeyResultOps[Self <: GetKMSEncryptionKeyResult] (val x: Self) extends AnyVal {
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
    def setKmsKey(value: KMSKey): Self = this.set("kmsKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKey: Self = this.set("kmsKey", js.undefined)
  }
  
}

