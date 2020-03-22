package typings.awsServerlessExpress

import typings.awsLambda.handlerMod.Context
import typings.awsServerlessExpress.middlewareMod.NonFunctionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: NonFunctionProperties[Context]
  var event: OmitAPIGatewayProxyEventb
}

object AnonContext {
  @scala.inline
  def apply(context: NonFunctionProperties[Context], event: OmitAPIGatewayProxyEventb): AnonContext = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContext]
  }
}

