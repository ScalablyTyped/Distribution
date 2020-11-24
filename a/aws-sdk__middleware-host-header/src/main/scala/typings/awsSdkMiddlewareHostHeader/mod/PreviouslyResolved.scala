package typings.awsSdkMiddlewareHostHeader.mod

import typings.awsSdkTypes.transferMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviouslyResolved extends js.Object {
  
  var requestHandler: RequestHandler[_, _, js.Object] = js.native
}
object PreviouslyResolved {
  
  @scala.inline
  def apply(requestHandler: RequestHandler[_, _, js.Object]): PreviouslyResolved = {
    val __obj = js.Dynamic.literal(requestHandler = requestHandler.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviouslyResolved]
  }
  
  @scala.inline
  implicit class PreviouslyResolvedOps[Self <: PreviouslyResolved] (val x: Self) extends AnyVal {
    
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
    def setRequestHandler(value: RequestHandler[_, _, js.Object]): Self = this.set("requestHandler", value.asInstanceOf[js.Any])
  }
}
