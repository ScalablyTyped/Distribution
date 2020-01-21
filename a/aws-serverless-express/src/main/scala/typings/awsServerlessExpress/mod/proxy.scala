package typings.awsServerlessExpress.mod

import typings.awsLambda.mod.APIGatewayProxyEvent
import typings.awsLambda.mod.Context
import typings.node.httpMod.Server
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-serverless-express", "proxy")
@js.native
object proxy extends js.Object {
  def apply(server: Server, event: APIGatewayProxyEvent, context: Context): Server = js.native
}

