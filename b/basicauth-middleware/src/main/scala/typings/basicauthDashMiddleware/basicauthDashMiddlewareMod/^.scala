package typings.basicauthDashMiddleware.basicauthDashMiddlewareMod

import typings.express.expressMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("basicauth-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(checkFnOrUsers: (js.Array[js.Tuple2[String, String]]) | CheckFunction): RequestHandler = js.native
  def apply(checkFnOrUsers: (js.Array[js.Tuple2[String, String]]) | CheckFunction, realm: String): RequestHandler = js.native
  def apply(username: String, password: String): RequestHandler = js.native
  def apply(username: String, password: String, realm: String): RequestHandler = js.native
}

