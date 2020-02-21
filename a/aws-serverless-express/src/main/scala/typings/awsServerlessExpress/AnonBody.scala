package typings.awsServerlessExpress

import typings.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
import typings.awsLambda.handerMod.Context
import typings.awsServerlessExpress.awsServerlessExpressStrings.body
import typings.awsServerlessExpress.middlewareMod.NonFunctionProperties
import typings.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var context: NonFunctionProperties[Context]
  var event: Omit[APIGatewayProxyEvent, body]
}

object AnonBody {
  @scala.inline
  def apply(context: NonFunctionProperties[Context], event: Omit[APIGatewayProxyEvent, body]): AnonBody = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBody]
  }
}

