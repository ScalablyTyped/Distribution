package typings
package cryptojsLib.CryptoJSNs.libNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibStatic extends js.Object {
  var Base: Base
  var CipherParams: CipherParams
  var PasswordBasedCipher: PasswordBasedCipher
  var SerializableCipher: SerializableCipher
  var WordArray: WordArray
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

