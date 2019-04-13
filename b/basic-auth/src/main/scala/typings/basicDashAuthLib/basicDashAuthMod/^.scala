package typings
package basicDashAuthLib.basicDashAuthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("basic-auth", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // See https://github.com/jshttp/basic-auth/blob/v1.1.0/index.js#L49
  def apply(req: nodeLib.httpMod.IncomingMessage): js.UndefOr[BasicAuthResult] = js.native
  /**
    * Parse basic auth to object.
    */
  def parse(authorizationHeader: java.lang.String): js.UndefOr[BasicAuthResult] = js.native
}

