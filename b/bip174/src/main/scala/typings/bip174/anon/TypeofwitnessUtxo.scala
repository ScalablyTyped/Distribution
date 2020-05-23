package typings.bip174.anon

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.WitnessUtxo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofwitnessUtxo extends js.Object {
  val expected: /* "{ script: Buffer; value: number; }" */ String
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean
  def decode(keyVal: KeyValue): WitnessUtxo
  def encode(data: WitnessUtxo): KeyValue
}

object TypeofwitnessUtxo {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.WitnessUtxo */ Boolean,
    decode: KeyValue => WitnessUtxo,
    encode: WitnessUtxo => KeyValue,
    expected: /* "{ script: Buffer; value: number; }" */ String
  ): TypeofwitnessUtxo = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofwitnessUtxo]
  }
}

