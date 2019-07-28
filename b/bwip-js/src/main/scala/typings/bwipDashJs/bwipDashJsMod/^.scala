package typings.bwipDashJs.bwipDashJsMod

import typings.node.Buffer
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bwip-js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(req: IncomingMessage, res: ServerResponse): Unit = js.native
  def apply(req: IncomingMessage, res: ServerResponse, opts: ToBufferOptions): Unit = js.native
  def loadFont(fontName: String, sizeMulti: Double, fontFile: String): Unit = js.native
  def toBuffer(opts: ToBufferOptions, callback: js.Function2[/* err */ String | Error, /* png */ Buffer, Unit]): Unit = js.native
}

