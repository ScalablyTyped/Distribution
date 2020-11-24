package typings.awsSdk.connectparticipantMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SendMessageResponse extends js.Object {
  
  /**
    * The time when the message was sent. It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example, 2019-11-08T02:41:28.172Z.
    */
  var AbsoluteTime: js.UndefOr[Instant] = js.native
  
  /**
    * The ID of the message.
    */
  var Id: js.UndefOr[ChatItemId] = js.native
}
object SendMessageResponse {
  
  @scala.inline
  def apply(): SendMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendMessageResponse]
  }
  
  @scala.inline
  implicit class SendMessageResponseOps[Self <: SendMessageResponse] (val x: Self) extends AnyVal {
    
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
    def setAbsoluteTime(value: Instant): Self = this.set("AbsoluteTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsoluteTime: Self = this.set("AbsoluteTime", js.undefined)
    
    @scala.inline
    def setId(value: ChatItemId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
}
