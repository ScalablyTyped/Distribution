package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GrantConstraints extends js.Object {
  /**
    * A list of key-value pairs that must match the encryption context in the cryptographic operation request. The grant allows the operation only when the encryption context in the request is the same as the encryption context specified in this constraint.
    */
  var EncryptionContextEquals: js.UndefOr[EncryptionContextType] = js.native
  /**
    * A list of key-value pairs that must be included in the encryption context of the cryptographic operation request. The grant allows the cryptographic operation only when the encryption context in the request includes the key-value pairs specified in this constraint, although it can include additional key-value pairs.
    */
  var EncryptionContextSubset: js.UndefOr[EncryptionContextType] = js.native
}

object GrantConstraints {
  @scala.inline
  def apply(): GrantConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrantConstraints]
  }
  @scala.inline
  implicit class GrantConstraintsOps[Self <: GrantConstraints] (val x: Self) extends AnyVal {
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
    def setEncryptionContextEquals(value: EncryptionContextType): Self = this.set("EncryptionContextEquals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionContextEquals: Self = this.set("EncryptionContextEquals", js.undefined)
    @scala.inline
    def setEncryptionContextSubset(value: EncryptionContextType): Self = this.set("EncryptionContextSubset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionContextSubset: Self = this.set("EncryptionContextSubset", js.undefined)
  }
  
}

