package typings
package compressionLib.compressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("compression", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): expressLib.expressMod.RequestHandler = js.native
  def apply(options: CompressionOptions): expressLib.expressMod.RequestHandler = js.native
  def filter(req: expressLib.expressMod.Request, res: expressLib.expressMod.Response): scala.Boolean = js.native
}

