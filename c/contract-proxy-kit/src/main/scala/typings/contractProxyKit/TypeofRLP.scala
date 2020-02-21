package typings.contractProxyKit

import typings.ethers.typesMod.Arrayish
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofRLP extends js.Object {
  def decode(data: Arrayish): js.Any
  def encode(`object`: js.Any): String
}

object TypeofRLP {
  @scala.inline
  def apply(decode: Arrayish => js.Any, encode: js.Any => String): TypeofRLP = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[TypeofRLP]
  }
}

