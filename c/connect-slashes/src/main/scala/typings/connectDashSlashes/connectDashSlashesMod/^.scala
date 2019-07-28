package typings.connectDashSlashes.connectDashSlashesMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("connect-slashes", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * @see https://github.com/avinoamr/connect-slashes#usage
    */
  def apply(): RequestHandler = js.native
  def apply(addTrailingSlashes: Boolean): RequestHandler = js.native
  def apply(addTrailingSlashes: Boolean, options: Options): RequestHandler = js.native
}

