package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateTemplateMessageBody extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the message template that was created.
    */
  var Arn: js.UndefOr[string] = js.native
  
  /**
    * The message that's returned from the API for the request to create the message template.
    */
  var Message: js.UndefOr[string] = js.native
  
  /**
    * The unique identifier for the request to create the message template.
    */
  var RequestID: js.UndefOr[string] = js.native
}
object CreateTemplateMessageBody {
  
  @scala.inline
  def apply(): CreateTemplateMessageBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTemplateMessageBody]
  }
  
  @scala.inline
  implicit class CreateTemplateMessageBodyOps[Self <: CreateTemplateMessageBody] (val x: Self) extends AnyVal {
    
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
    def setArn(value: string): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
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
