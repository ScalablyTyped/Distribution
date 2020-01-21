package typings.awsSdkMiddlewareSdkGlacier

import typings.awsSdkTypes.middlewareMod.BuildHandler
import typings.awsSdkTypes.middlewareMod.BuildHandlerArguments
import typings.awsSdkTypes.middlewareMod.HandlerExecutionContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@aws-sdk/middleware-sdk-glacier/build/add-glacier-api-version", JSImport.Namespace)
@js.native
object addGlacierApiVersionMod extends js.Object {
  def addGlacierApiVersion(next: BuildHandler[_, _, _], context: HandlerExecutionContext): js.Function1[/* args */ BuildHandlerArguments[_, _], js.Promise[_]] = js.native
}

