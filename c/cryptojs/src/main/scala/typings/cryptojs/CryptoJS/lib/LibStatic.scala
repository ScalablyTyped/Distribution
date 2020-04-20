package typings.cryptojs.CryptoJS.lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LibStatic extends js.Object {
  var Base: typings.cryptojs.CryptoJS.lib.Base
  var CipherParams: typings.cryptojs.CryptoJS.lib.CipherParams
  var PasswordBasedCipher: typings.cryptojs.CryptoJS.lib.PasswordBasedCipher
  var SerializableCipher: typings.cryptojs.CryptoJS.lib.SerializableCipher
  var WordArray: typings.cryptojs.CryptoJS.lib.WordArray
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
    val __obj = js.Dynamic.literal(Base = Base.asInstanceOf[js.Any], CipherParams = CipherParams.asInstanceOf[js.Any], PasswordBasedCipher = PasswordBasedCipher.asInstanceOf[js.Any], SerializableCipher = SerializableCipher.asInstanceOf[js.Any], WordArray = WordArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[LibStatic]
  }
}

