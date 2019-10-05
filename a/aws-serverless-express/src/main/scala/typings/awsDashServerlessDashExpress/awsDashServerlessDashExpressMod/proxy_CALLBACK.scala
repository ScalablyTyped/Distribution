package typings.awsDashServerlessDashExpress.awsDashServerlessDashExpressMod

import typings.awsDashLambda.awsDashLambdaMod.Context
import typings.awsDashServerlessDashExpress.awsDashServerlessDashExpressStrings.CALLBACK
import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-serverless-express", "proxy")
@js.native
object proxy_CALLBACK extends js.Object {
  def apply(server: Server, event: js.Any, context: Context, resolutionMode: CALLBACK): ProxyResult = js.native
  def apply(
    server: Server,
    event: js.Any,
    context: Context,
    resolutionMode: CALLBACK,
    callback: js.Function2[/* error */ js.Any, /* response */ Response, Unit]
  ): ProxyResult = js.native
}

