package typings.awsServerlessExpress.mod

import typings.awsLambda.mod.APIGatewayProxyEvent
import typings.awsLambda.mod.Context
import typings.awsServerlessExpress.awsServerlessExpressStrings.CONTEXT_SUCCEED
import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-serverless-express", "proxy")
@js.native
object proxy_CONTEXTSUCCEED extends js.Object {
  def apply(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: CONTEXT_SUCCEED): ProxyResult = js.native
}

