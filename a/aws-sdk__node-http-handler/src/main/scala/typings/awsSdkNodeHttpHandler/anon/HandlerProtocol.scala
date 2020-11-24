package typings.awsSdkNodeHttpHandler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandlerProtocol extends js.Object {
  
  var handlerProtocol: String = js.native
}
object HandlerProtocol {
  
  @scala.inline
  def apply(handlerProtocol: String): HandlerProtocol = {
    val __obj = js.Dynamic.literal(handlerProtocol = handlerProtocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerProtocol]
  }
  
  @scala.inline
  implicit class HandlerProtocolOps[Self <: HandlerProtocol] (val x: Self) extends AnyVal {
    
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
    def setHandlerProtocol(value: String): Self = this.set("handlerProtocol", value.asInstanceOf[js.Any])
  }
}
