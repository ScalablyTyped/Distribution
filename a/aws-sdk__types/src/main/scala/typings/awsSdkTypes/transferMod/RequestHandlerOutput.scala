package typings.awsSdkTypes.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestHandlerOutput[ResponseType] extends js.Object {
  
  var response: ResponseType = js.native
}
object RequestHandlerOutput {
  
  @scala.inline
  def apply[ResponseType](response: ResponseType): RequestHandlerOutput[ResponseType] = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestHandlerOutput[ResponseType]]
  }
  
  @scala.inline
  implicit class RequestHandlerOutputOps[Self <: RequestHandlerOutput[_], ResponseType] (val x: Self with RequestHandlerOutput[ResponseType]) extends AnyVal {
    
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
    def setResponse(value: ResponseType): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
