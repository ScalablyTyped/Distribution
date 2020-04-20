package typings.bip174

import typings.bip174.bip174Strings.Buffer
import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.NonWitnessUtxo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofnonWitnessUtxo extends js.Object {
  val expected: Buffer
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean
  def decode(keyVal: KeyValue): NonWitnessUtxo
  def encode(data: NonWitnessUtxo): KeyValue
}

object TypeofnonWitnessUtxo {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean,
    decode: KeyValue => NonWitnessUtxo,
    encode: NonWitnessUtxo => KeyValue,
    expected: Buffer
  ): TypeofnonWitnessUtxo = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofnonWitnessUtxo]
  }
}

