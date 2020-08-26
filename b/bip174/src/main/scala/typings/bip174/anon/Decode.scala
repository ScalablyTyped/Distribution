package typings.bip174.anon

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.WitnessScript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decode extends js.Object {
  var expected: String = js.native
  def canAdd(currentData: js.Any, newData: js.Any): Boolean = js.native
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.WitnessScript */ Boolean = js.native
  def decode(keyVal: KeyValue): WitnessScript = js.native
  def encode(data: WitnessScript): KeyValue = js.native
}

object Decode {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.WitnessScript */ Boolean,
    decode: KeyValue => WitnessScript,
    encode: WitnessScript => KeyValue,
    expected: String
  ): Decode = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decode]
  }
  @scala.inline
  implicit class DecodeOps[Self <: Decode] (val x: Self) extends AnyVal {
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
    def setCheck(value: js.Any => /* is bip174.bip174/src/lib/interfaces.WitnessScript */ Boolean): Self = this.set("check", js.Any.fromFunction1(value))
    @scala.inline
    def setDecode(value: KeyValue => WitnessScript): Self = this.set("decode", js.Any.fromFunction1(value))
    @scala.inline
    def setEncode(value: WitnessScript => KeyValue): Self = this.set("encode", js.Any.fromFunction1(value))
    @scala.inline
    def setExpected(value: String): Self = this.set("expected", value.asInstanceOf[js.Any])
  }
  
}

