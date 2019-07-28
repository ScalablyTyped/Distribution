package typings.compression.compressionMod

import typings.express.expressMod.Request
import typings.express.expressMod.RequestHandler
import typings.express.expressMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("compression", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: CompressionOptions): RequestHandler = js.native
  def filter(req: Request, res: Response): Boolean = js.native
}

