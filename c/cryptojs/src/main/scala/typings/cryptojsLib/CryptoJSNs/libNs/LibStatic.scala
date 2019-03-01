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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Base")(Base)
    __obj.updateDynamic("CipherParams")(CipherParams)
    __obj.updateDynamic("PasswordBasedCipher")(PasswordBasedCipher)
    __obj.updateDynamic("SerializableCipher")(SerializableCipher)
    __obj.updateDynamic("WordArray")(WordArray)
    __obj.asInstanceOf[LibStatic]
  }
}

