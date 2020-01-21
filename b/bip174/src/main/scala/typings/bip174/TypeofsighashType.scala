package typings.bip174

import typings.bip174.bip174Strings.number
import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.SighashType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofsighashType extends js.Object {
  val expected: number
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.SighashType */ Boolean
  def decode(keyVal: KeyValue): SighashType
  def encode(data: SighashType): KeyValue
}

object TypeofsighashType {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.SighashType */ Boolean,
    decode: KeyValue => SighashType,
    encode: SighashType => KeyValue,
    expected: number
  ): TypeofsighashType = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofsighashType]
  }
}

