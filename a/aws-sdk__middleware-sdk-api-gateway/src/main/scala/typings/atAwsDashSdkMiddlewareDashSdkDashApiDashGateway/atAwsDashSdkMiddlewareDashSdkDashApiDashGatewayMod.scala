package typings.atAwsDashSdkMiddlewareDashSdkDashApiDashGateway

import typings.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandler
import typings.atAwsDashSdkTypes.buildMiddlewareMod.BuildHandlerArguments
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-sdk-api-gateway", JSImport.Namespace)
@js.native
object atAwsDashSdkMiddlewareDashSdkDashApiDashGatewayMod extends js.Object {
  def acceptsHeader(next: BuildHandler[_, _, Uint8Array]): js.Function1[/* args */ BuildHandlerArguments[_, _], js.Promise[_]] = js.native
}

