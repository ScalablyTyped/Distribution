package typings
package cryptrLib.cryptrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cryptr extends js.Object {
  /** Decrypt a string. */
  def decrypt(value: java.lang.String): java.lang.String
  /** Encrypt a string. */
  def encrypt(value: java.lang.String): java.lang.String
}

object Cryptr {
  @scala.inline
  def apply(decrypt: java.lang.String => java.lang.String, encrypt: java.lang.String => java.lang.String): Cryptr = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
  
    __obj.asInstanceOf[Cryptr]
  }
}

