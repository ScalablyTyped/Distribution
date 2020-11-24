package typings.awsServerlessExpress.mod

import typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typings.awsLambda.handlerMod.Context
import typings.awsServerlessExpress.awsServerlessExpressStrings.CONTEXT_SUCCEED
import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-serverless-express", "proxy")
@js.native
object proxy_CONTEXTSUCCEED extends js.Object {
  
  def apply(server: Server, event: APIGatewayProxyEvent, context: Context, resolutionMode: CONTEXT_SUCCEED): ProxyResult = js.native
}
