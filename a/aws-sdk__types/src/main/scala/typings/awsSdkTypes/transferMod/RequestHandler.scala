package typings.awsSdkTypes.transferMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestHandler[RequestType, ResponseType, HandlerOptions] extends js.Object {
  
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  def handle(request: RequestType, handlerOptions: HandlerOptions): js.Promise[RequestHandlerOutput[ResponseType]] = js.native
  
  /**
    * metadata contains information of a handler. For example
    * 'h2' refers this handler is for handling HTTP/2 requests,
    * whereas 'h1' refers handling HTTP1 requests
    */
  var metadata: js.UndefOr[RequestHandlerMetadata] = js.native
}
object RequestHandler {
  
  @scala.inline
  def apply[RequestType, ResponseType, HandlerOptions](handle: (RequestType, HandlerOptions) => js.Promise[RequestHandlerOutput[ResponseType]]): RequestHandler[RequestType, ResponseType, HandlerOptions] = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction2(handle))
    __obj.asInstanceOf[RequestHandler[RequestType, ResponseType, HandlerOptions]]
  }
  
  @scala.inline
  implicit class RequestHandlerOps[Self <: RequestHandler[_, _, _], RequestType, ResponseType, HandlerOptions] (val x: Self with (RequestHandler[RequestType, ResponseType, HandlerOptions])) extends AnyVal {
    
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
    def setHandle(value: (RequestType, HandlerOptions) => js.Promise[RequestHandlerOutput[ResponseType]]): Self = this.set("handle", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setMetadata(value: RequestHandlerMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
  }
}
