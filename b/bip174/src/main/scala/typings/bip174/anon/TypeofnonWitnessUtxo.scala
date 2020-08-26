package typings.bip174.anon

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.NonWitnessUtxo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofnonWitnessUtxo extends js.Object {
  val expected: /* "Buffer" */ String = js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean = js.native
  def decode(keyVal: KeyValue): NonWitnessUtxo = js.native
  def encode(data: NonWitnessUtxo): KeyValue = js.native
}

object TypeofnonWitnessUtxo {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean,
    decode: KeyValue => NonWitnessUtxo,
    encode: NonWitnessUtxo => KeyValue,
    expected: /* "Buffer" */ String
  ): TypeofnonWitnessUtxo = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofnonWitnessUtxo]
  }
  @scala.inline
  implicit class TypeofnonWitnessUtxoOps[Self <: TypeofnonWitnessUtxo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCanAdd(value: (js.Any, js.Any) => Boolean): Self = this.set("canAdd", js.Any.fromFunction2(value))
    @scala.inline
    def setCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.NonWitnessUtxo */ Boolean): Self = this.set("check", js.Any.fromFunction1(value))
    @scala.inline
    def setDecode(value: KeyValue => NonWitnessUtxo): Self = this.set("decode", js.Any.fromFunction1(value))
    @scala.inline
    def setEncode(value: NonWitnessUtxo => KeyValue): Self = this.set("encode", js.Any.fromFunction1(value))
    @scala.inline
    def setExpected(value: /* "Buffer" */ String): Self = this.set("expected", value.asInstanceOf[js.Any])
  }
  
}

