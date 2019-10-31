package typings.chardet.chardetMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chardet", "detectAll")
@js.native
object detectAll extends js.Object {
  def apply(buf: Buffer): js.Array[Confidence] | Null = js.native
  def apply(buf: Buffer, opts: Options): js.Array[Confidence] | Null = js.native
}

