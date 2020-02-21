package typings.bufferSplit

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("buffer-split", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(buf: Buffer, splitBuf: Buffer): js.Array[Buffer] = js.native
  def apply(buf: Buffer, splitBuf: Buffer, includeDelim: Boolean): js.Array[Buffer] = js.native
}

