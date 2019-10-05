package typings.bwipDashJs.bwipDashJsMod

import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bwip-js", "toBuffer")
@js.native
object toBuffer extends js.Object {
  def apply(opts: ToBufferOptions, callback: js.Function2[/* err */ String | Error, /* png */ Buffer, Unit]): Unit = js.native
}

