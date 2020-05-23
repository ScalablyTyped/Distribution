package typings.awsServerlessExpress.anon

import typings.awsServerlessExpress.middlewareMod.NonFunctionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var context: NonFunctionProperties[typings.awsLambda.handlerMod.Context]
  var event: OmitAPIGatewayProxyEventb
}

object Context {
  @scala.inline
  def apply(
    context: NonFunctionProperties[typings.awsLambda.handlerMod.Context],
    event: OmitAPIGatewayProxyEventb
  ): Context = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

