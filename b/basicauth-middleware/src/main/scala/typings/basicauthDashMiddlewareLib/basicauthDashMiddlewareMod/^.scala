package typings
package basicauthDashMiddlewareLib.basicauthDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("basicauth-middleware", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(checkFnOrUsers: (js.Array[js.Tuple2[java.lang.String, java.lang.String]]) | CheckFunction): expressLib.expressMod.RequestHandler = js.native
  def apply(
    checkFnOrUsers: (js.Array[js.Tuple2[java.lang.String, java.lang.String]]) | CheckFunction,
    realm: java.lang.String
  ): expressLib.expressMod.RequestHandler = js.native
  def apply(username: java.lang.String, password: java.lang.String): expressLib.expressMod.RequestHandler = js.native
  def apply(username: java.lang.String, password: java.lang.String, realm: java.lang.String): expressLib.expressMod.RequestHandler = js.native
}

