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

