package typings
package cryptrLib.cryptrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cryptr", JSImport.Namespace)
@js.native
class namespaced protected () extends Cryptr {
  /**
  	 * Cryptr provides a mechanism for aes-256-ctr encryption/decryption.
  	 * @param secret key used for encryption/decryption
  	 */
  def this(secret: java.lang.String) = this()
  /** Decrypt a string. */
  /* CompleteClass */
  override def decrypt(value: java.lang.String): java.lang.String = js.native
  /** Encrypt a string. */
  /* CompleteClass */
  override def encrypt(value: java.lang.String): java.lang.String = js.native
}

