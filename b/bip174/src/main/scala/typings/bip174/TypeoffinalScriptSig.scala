package typings.bip174

import typings.bip174.bip174Strings.Buffer
import typings.bip174.srcLibInterfacesMod.FinalScriptSig
import typings.bip174.srcLibInterfacesMod.KeyValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeoffinalScriptSig extends js.Object {
  val expected: Buffer
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean
  def decode(keyVal: KeyValue): FinalScriptSig
  def encode(data: FinalScriptSig): KeyValue
}

object TypeoffinalScriptSig {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.FinalScriptSig */ Boolean,
    decode: KeyValue => FinalScriptSig,
    encode: FinalScriptSig => KeyValue,
    expected: Buffer
  ): TypeoffinalScriptSig = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeoffinalScriptSig]
  }
}

