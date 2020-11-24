package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageBody extends js.Object {
  
  /**
    * The message that's returned from the API.
    */
  var Message: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the request or response.
    */
  var RequestID: js.UndefOr[string] = js.native
}
object MessageBody {
  
  @scala.inline
  def apply(): MessageBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageBody]
  }
  
  @scala.inline
  implicit class MessageBodyOps[Self <: MessageBody] (val x: Self) extends AnyVal {
    
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
    def setMessage(value: string): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
    
    @scala.inline
    def setRequestID(value: string): Self = this.set("RequestID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestID: Self = this.set("RequestID", js.undefined)
  }
}
