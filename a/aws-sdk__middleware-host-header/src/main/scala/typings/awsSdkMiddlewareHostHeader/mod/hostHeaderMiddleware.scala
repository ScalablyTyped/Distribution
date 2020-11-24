package typings.awsSdkMiddlewareHostHeader.mod

import typings.awsSdkTypes.middlewareMod.BuildMiddleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@aws-sdk/middleware-host-header", "hostHeaderMiddleware")
@js.native
object hostHeaderMiddleware extends js.Object {
  
  def apply[Input /* <: js.Object */, Output /* <: js.Object */](options: HostHeaderResolvedConfig): BuildMiddleware[Input, Output] = js.native
}
