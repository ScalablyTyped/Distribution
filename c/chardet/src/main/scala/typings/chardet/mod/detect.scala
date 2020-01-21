package typings.chardet.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chardet", "detect")
@js.native
object detect extends js.Object {
  def apply(buf: Buffer): String | Null = js.native
  def apply(buf: Buffer, opts: Options): String | Null = js.native
}

