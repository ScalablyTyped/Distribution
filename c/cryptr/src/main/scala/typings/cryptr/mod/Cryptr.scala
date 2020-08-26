package typings.cryptr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cryptr extends js.Object {
  /** Decrypt a string. */
  def decrypt(value: String): String = js.native
  /** Encrypt a string. */
  def encrypt(value: String): String = js.native
}

object Cryptr {
  @scala.inline
  def apply(decrypt: String => String, encrypt: String => String): Cryptr = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
    __obj.asInstanceOf[Cryptr]
  }
  @scala.inline
  implicit class CryptrOps[Self <: Cryptr] (val x: Self) extends AnyVal {
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
    def setDecrypt(value: String => String): Self = this.set("decrypt", js.Any.fromFunction1(value))
    @scala.inline
    def setEncrypt(value: String => String): Self = this.set("encrypt", js.Any.fromFunction1(value))
  }
  
}

