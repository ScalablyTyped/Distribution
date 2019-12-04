package typings.bip174

import typings.bip174.srcLibInterfacesMod.KeyValue
import typings.bip174.srcLibInterfacesMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofunsignedTx extends js.Object {
  def encode(data: Transaction): KeyValue
}

object TypeofunsignedTx {
  @scala.inline
  def apply(encode: Transaction => KeyValue): TypeofunsignedTx = {
    val __obj = js.Dynamic.literal(encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[TypeofunsignedTx]
  }
}

