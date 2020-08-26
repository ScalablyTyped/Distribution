package typings.chrome.chrome.enterprise.platformKeys

import typings.std.SubtleCrypto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Token extends js.Object {
  /**
    * Uniquely identifies this Token.
    * Static IDs are "user" and "system", referring to the platform's user-specific and the system-wide hardware token, respectively. Any other tokens (with other identifiers) might be returned by enterprise.platformKeys.getTokens.
    */
  var id: String = js.native
  /**
    * Implements the WebCrypto's SubtleCrypto interface. The cryptographic operations, including key generation, are hardware-backed.
    * Only non-extractable RSASSA-PKCS1-V1_5 keys with modulusLength up to 2048 can be generated. Each key can be used for signing data at most once.
    * Keys generated on a specific Token cannot be used with any other Tokens, nor can they be used with window.crypto.subtle. Equally, Key objects created with window.crypto.subtle cannot be used with this interface.
    */
  var subtleCrypto: SubtleCrypto = js.native
}

object Token {
  @scala.inline
  def apply(id: String, subtleCrypto: SubtleCrypto): Token = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], subtleCrypto = subtleCrypto.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtleCrypto(value: SubtleCrypto): Self = this.set("subtleCrypto", value.asInstanceOf[js.Any])
  }
  
}

