package typings.bip174

import typings.bip174.bip174Strings.`Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket`
import typings.bip174.interfacesMod.GlobalXpub
import typings.bip174.interfacesMod.KeyValue
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofglobalXpub extends js.Object {
  val expected: `Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket`
  def canAddToArray(array: js.Array[GlobalXpub], item: GlobalXpub, dupeSet: Set[String]): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean
  def decode(keyVal: KeyValue): GlobalXpub
  def encode(data: GlobalXpub): KeyValue
}

object TypeofglobalXpub {
  @scala.inline
  def apply(
    canAddToArray: (js.Array[GlobalXpub], GlobalXpub, Set[String]) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.GlobalXpub */ Boolean,
    decode: KeyValue => GlobalXpub,
    encode: GlobalXpub => KeyValue,
    expected: `Leftcurlybracket masterFingerprintColon BufferSemicolon extendedPubkeyColon BufferSemicolon pathColon stringSemicolon Rightcurlybracket`
  ): TypeofglobalXpub = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofglobalXpub]
  }
}

