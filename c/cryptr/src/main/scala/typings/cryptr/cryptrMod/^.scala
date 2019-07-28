package typings.cryptr.cryptrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cryptr", JSImport.Namespace)
@js.native
class ^ protected () extends Cryptr {
  /**
  	 * Cryptr provides a mechanism for aes-256-ctr encryption/decryption.
  	 * @param secret key used for encryption/decryption
  	 */
  def this(secret: String) = this()
  /** Decrypt a string. */
  /* CompleteClass */
  override def decrypt(value: String): String = js.native
  /** Encrypt a string. */
  /* CompleteClass */
  override def encrypt(value: String): String = js.native
}

