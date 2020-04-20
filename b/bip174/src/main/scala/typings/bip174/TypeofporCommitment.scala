package typings.bip174

import typings.bip174.bip174Strings.string
import typings.bip174.interfacesMod.KeyValue
import typings.bip174.interfacesMod.PorCommitment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofporCommitment extends js.Object {
  val expected: string
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean
  def decode(keyVal: KeyValue): PorCommitment
  def encode(data: PorCommitment): KeyValue
}

object TypeofporCommitment {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is bip174.bip174/src/lib/interfaces.PorCommitment */ Boolean,
    decode: KeyValue => PorCommitment,
    encode: PorCommitment => KeyValue,
    expected: string
  ): TypeofporCommitment = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofporCommitment]
  }
}

