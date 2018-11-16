package typings
package basicauthDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("basicauth-middleware", JSImport.Namespace)
@js.native
object basicauthDashMiddlewareMod extends js.Object {
  def apply(
    checkFnOrUsers: (js.Array[js.Tuple2[java.lang.String, java.lang.String]]) | basicauthDashMiddlewareLib.CheckFunction
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(
    checkFnOrUsers: (js.Array[js.Tuple2[java.lang.String, java.lang.String]]) | basicauthDashMiddlewareLib.CheckFunction,
    realm: java.lang.String
  ): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(username: java.lang.String, password: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(username: java.lang.String, password: java.lang.String, realm: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
}

