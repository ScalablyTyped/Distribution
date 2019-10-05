package typings.basicDashAuth.basicDashAuthMod

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("basic-auth", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // See https://github.com/jshttp/basic-auth/blob/v1.1.0/index.js#L49
  def apply(req: IncomingMessage): js.UndefOr[BasicAuthResult] = js.native
}

