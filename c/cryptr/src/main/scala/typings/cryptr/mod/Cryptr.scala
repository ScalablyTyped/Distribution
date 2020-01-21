package typings.cryptr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cryptr extends js.Object {
  /** Decrypt a string. */
  def decrypt(value: String): String
  /** Encrypt a string. */
  def encrypt(value: String): String
}

object Cryptr {
  @scala.inline
  def apply(decrypt: String => String, encrypt: String => String): Cryptr = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
  
    __obj.asInstanceOf[Cryptr]
  }
}

