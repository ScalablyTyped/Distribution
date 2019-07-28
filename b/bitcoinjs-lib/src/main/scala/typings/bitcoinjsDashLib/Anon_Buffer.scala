package typings.bitcoinjsDashLib

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  def check(script: Buffer): Boolean
  def decode(buffer: Buffer): js.Array[Buffer]
  def encode(commitment: Buffer): Buffer
}

object Anon_Buffer {
  @scala.inline
  def apply(check: Buffer => Boolean, decode: Buffer => js.Array[Buffer], encode: Buffer => Buffer): Anon_Buffer = {
    val __obj = js.Dynamic.literal(check = js.Any.fromFunction1(check), decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

