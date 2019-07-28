package typings.cryptojs.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibStatic extends js.Object {
  var Base: typings.cryptojs.CryptoJSNs.libNs.Base
  var CipherParams: typings.cryptojs.CryptoJSNs.libNs.CipherParams
  var PasswordBasedCipher: typings.cryptojs.CryptoJSNs.libNs.PasswordBasedCipher
  var SerializableCipher: typings.cryptojs.CryptoJSNs.libNs.SerializableCipher
  var WordArray: typings.cryptojs.CryptoJSNs.libNs.WordArray
}

object LibStatic {
  @scala.inline
  def apply(
    Base: Base,
    CipherParams: CipherParams,
    PasswordBasedCipher: PasswordBasedCipher,
    SerializableCipher: SerializableCipher,
    WordArray: WordArray
  ): LibStatic = {
    val __obj = js.Dynamic.literal(Base = Base, CipherParams = CipherParams, PasswordBasedCipher = PasswordBasedCipher, SerializableCipher = SerializableCipher, WordArray = WordArray)
  
    __obj.asInstanceOf[LibStatic]
  }
}

