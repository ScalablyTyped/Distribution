package typings.awsSdkTypes.eventStreamMod

import typings.awsSdkTypes.httpMod.HttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventStreamRequestSigner extends js.Object {
  
  def sign(request: HttpRequest): js.Promise[HttpRequest] = js.native
}
object EventStreamRequestSigner {
  
  @scala.inline
  def apply(sign: HttpRequest => js.Promise[HttpRequest]): EventStreamRequestSigner = {
    val __obj = js.Dynamic.literal(sign = js.Any.fromFunction1(sign))
    __obj.asInstanceOf[EventStreamRequestSigner]
  }
  
  @scala.inline
  implicit class EventStreamRequestSignerOps[Self <: EventStreamRequestSigner] (val x: Self) extends AnyVal {
    
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
    def setSign(value: HttpRequest => js.Promise[HttpRequest]): Self = this.set("sign", js.Any.fromFunction1(value))
  }
}
