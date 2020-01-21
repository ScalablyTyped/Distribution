package typings.browserfs.utilMod

import typings.node.Buffer
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/util", "buffer2ArrayBuffer")
@js.native
object buffer2ArrayBuffer extends js.Object {
  def apply(buff: Buffer): ArrayBuffer = js.native
}

