package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KMSKey extends js.Object {
  /**
    * The encryption key ARN.
    */
  var kmsEncryptionKeyArn: js.UndefOr[KmsEncryptionKeyArn] = js.native
}

object KMSKey {
  @scala.inline
  def apply(): KMSKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KMSKey]
  }
  @scala.inline
  implicit class KMSKeyOps[Self <: KMSKey] (val x: Self) extends AnyVal {
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
    def setKmsEncryptionKeyArn(value: KmsEncryptionKeyArn): Self = this.set("kmsEncryptionKeyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsEncryptionKeyArn: Self = this.set("kmsEncryptionKeyArn", js.undefined)
  }
  
}

