package typings.browserfs.utilMod

import typings.node.Buffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/util", "buffer2Uint8array")
@js.native
object buffer2Uint8array extends js.Object {
  def apply(buff: Buffer): Uint8Array = js.native
}

