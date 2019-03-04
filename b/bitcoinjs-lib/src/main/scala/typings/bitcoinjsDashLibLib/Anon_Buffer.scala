package typings
package bitcoinjsDashLibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  def check(script: nodeLib.Buffer): scala.Boolean
  def decode(buffer: nodeLib.Buffer): js.Array[nodeLib.Buffer]
  def encode(commitment: nodeLib.Buffer): nodeLib.Buffer
}

object Anon_Buffer {
  @scala.inline
  def apply(
    check: js.Function1[nodeLib.Buffer, scala.Boolean],
    decode: js.Function1[nodeLib.Buffer, js.Array[nodeLib.Buffer]],
    encode: js.Function1[nodeLib.Buffer, nodeLib.Buffer]
  ): Anon_Buffer = {
    val __obj = js.Dynamic.literal(check = check, decode = decode, encode = encode)
  
    __obj.asInstanceOf[Anon_Buffer]
  }
}

