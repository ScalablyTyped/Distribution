package typings.contractProxyKit

import typings.ethers.typesMod.Arrayish
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofbase64 extends js.Object {
  def decode(textData: String): Uint8Array
  def encode(data: Arrayish): String
}

object Typeofbase64 {
  @scala.inline
  def apply(decode: String => Uint8Array, encode: Arrayish => String): Typeofbase64 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Typeofbase64]
  }
}

