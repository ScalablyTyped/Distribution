package typings.bip174

import typings.bip174.bip174Strings.`{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }`
import typings.bip174.srcLibInterfacesMod.GlobalXpub
import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofglobalXpub extends js.Object {
  val expected: `{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }`
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
    expected: `{ masterFingerprint: Buffer; extendedPubkey: Buffer; path: string; }`
  ): TypeofglobalXpub = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofglobalXpub]
  }
}

