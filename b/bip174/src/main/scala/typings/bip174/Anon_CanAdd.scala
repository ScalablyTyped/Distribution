package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CanAdd extends js.Object {
  var expected: String
  def canAdd(currentData: js.Any, newData: js.Any): Boolean
  def check(data: js.Any): /* is node.Buffer */ Boolean
  def decode(keyVal: KeyValue): Buffer
  def encode(data: Buffer): KeyValue
}

object Anon_CanAdd {
  @scala.inline
  def apply(
    canAdd: (js.Any, js.Any) => Boolean,
    check: js.Any => /* is node.Buffer */ Boolean,
    decode: KeyValue => Buffer,
    encode: Buffer => KeyValue,
    expected: String
  ): Anon_CanAdd = {
    val __obj = js.Dynamic.literal(canAdd = js.Any.fromFunction2(canAdd), check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CanAdd]
  }
}

