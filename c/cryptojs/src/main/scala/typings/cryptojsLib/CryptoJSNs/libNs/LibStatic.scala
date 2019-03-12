package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibStatic extends js.Object {
  var Base: cryptojsLib.CryptoJSNs.libNs.Base
  var CipherParams: cryptojsLib.CryptoJSNs.libNs.CipherParams
  var PasswordBasedCipher: cryptojsLib.CryptoJSNs.libNs.PasswordBasedCipher
  var SerializableCipher: cryptojsLib.CryptoJSNs.libNs.SerializableCipher
  var WordArray: cryptojsLib.CryptoJSNs.libNs.WordArray
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

