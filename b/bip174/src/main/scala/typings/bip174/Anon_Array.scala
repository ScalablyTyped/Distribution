package typings.bip174

import typings.bip174.srcLibInterfacesMod.Bip32Derivation
import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var expected: String
  def canAddToArray(array: js.Array[Bip32Derivation], item: Bip32Derivation, dupeSet: Set[String]): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.Bip32Derivation */ Boolean
  def decode(keyVal: KeyValue): Bip32Derivation
  def encode(data: Bip32Derivation): KeyValue
}

object Anon_Array {
  @scala.inline
  def apply(
    canAddToArray: (js.Array[Bip32Derivation], Bip32Derivation, Set[String]) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.Bip32Derivation */ Boolean,
    decode: KeyValue => Bip32Derivation,
    encode: Bip32Derivation => KeyValue,
    expected: String
  ): Anon_Array = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Array]
  }
}

