package typings.awsServerlessExpress.anon

import typings.awsServerlessExpress.middlewareMod.NonFunctionProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
  var context: NonFunctionProperties[typings.awsLambda.handlerMod.Context] = js.native
  
  var event: OmitAPIGatewayProxyEventb = js.native
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
  
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContext(value: NonFunctionProperties[typings.awsLambda.handlerMod.Context]): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent(value: OmitAPIGatewayProxyEventb): Self = this.set("event", value.asInstanceOf[js.Any])
  }
}
