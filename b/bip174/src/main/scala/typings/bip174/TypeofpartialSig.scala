package typings.bip174

import typings.bip174.bip174Strings.`{ pubkey: Buffer; signature: Buffer; }`
import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.PartialSig
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofpartialSig extends js.Object {
  val expected: `{ pubkey: Buffer; signature: Buffer; }`
  def canAddToArray(array: js.Array[PartialSig], item: PartialSig, dupeSet: Set[String]): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean
  def decode(keyVal: KeyValue): PartialSig
  def encode(pSig: PartialSig): KeyValue
}

object TypeofpartialSig {
  @scala.inline
  def apply(
    canAddToArray: (js.Array[PartialSig], PartialSig, Set[String]) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.PartialSig */ Boolean,
    decode: KeyValue => PartialSig,
    encode: PartialSig => KeyValue,
    expected: `{ pubkey: Buffer; signature: Buffer; }`
  ): TypeofpartialSig = {
    val __obj = js.Dynamic.literal(canAddToArray = js.Any.fromFunction3(canAddToArray), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofpartialSig]
  }
}

