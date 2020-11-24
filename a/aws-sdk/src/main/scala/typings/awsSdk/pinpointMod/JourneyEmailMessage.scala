package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JourneyEmailMessage extends js.Object {
  
  /**
    * The verified email address to send the email message from. The default address is the FromAddress specified for the email channel for the application.
    */
  var FromAddress: js.UndefOr[string] = js.native
}
object JourneyEmailMessage {
  
  @scala.inline
  def apply(): JourneyEmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyEmailMessage]
  }
  
  @scala.inline
  implicit class JourneyEmailMessageOps[Self <: JourneyEmailMessage] (val x: Self) extends AnyVal {
    
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
    def setFromAddress(value: string): Self = this.set("FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddress: Self = this.set("FromAddress", js.undefined)
  }
}
