package typings.awsSdkMiddlewareSdkApiGateway

import typings.awsSdkTypes.middlewareMod.BuildHandler
import typings.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-sdk-api-gateway", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def acceptsHeader(next: BuildHandler[_, _, Uint8Array]): js.Function1[/* args */ BuildHandlerArguments[_, _], js.Promise[_]] = js.native
}

