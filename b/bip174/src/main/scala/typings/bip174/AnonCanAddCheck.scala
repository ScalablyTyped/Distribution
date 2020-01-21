package typings.bip174

import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.RedeemScript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCanAddCheck extends js.Object {
  var expected: String
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.RedeemScript */ Boolean
  def decode(keyVal: KeyValue): RedeemScript
  def encode(data: RedeemScript): KeyValue
}

object AnonCanAddCheck {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.RedeemScript */ Boolean,
    decode: KeyValue => RedeemScript,
    encode: RedeemScript => KeyValue,
    expected: String
  ): AnonCanAddCheck = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCanAddCheck]
  }
}

