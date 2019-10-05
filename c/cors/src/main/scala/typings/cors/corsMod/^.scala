package typings.cors.corsMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cors", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: CorsOptions): RequestHandler = js.native
  def apply(options: CorsOptionsDelegate): RequestHandler = js.native
}

