package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignEmailMessage extends js.Object {
  
  /**
    * The body of the email for recipients whose email clients don't render HTML content.
    */
  var Body: js.UndefOr[string] = js.native
  
  /**
    * The verified email address to send the email from. The default address is the FromAddress specified for the email channel for the application.
    */
  var FromAddress: js.UndefOr[string] = js.native
  
  /**
    * The body of the email, in HTML format, for recipients whose email clients render HTML content.
    */
  var HtmlBody: js.UndefOr[string] = js.native
  
  /**
    * The subject line, or title, of the email.
    */
  var Title: js.UndefOr[string] = js.native
}
object CampaignEmailMessage {
  
  @scala.inline
  def apply(): CampaignEmailMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignEmailMessage]
  }
  
  @scala.inline
  implicit class CampaignEmailMessageOps[Self <: CampaignEmailMessage] (val x: Self) extends AnyVal {
    
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
    def setBody(value: string): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setFromAddress(value: string): Self = this.set("FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddress: Self = this.set("FromAddress", js.undefined)
    
    @scala.inline
    def setHtmlBody(value: string): Self = this.set("HtmlBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlBody: Self = this.set("HtmlBody", js.undefined)
    
    @scala.inline
    def setTitle(value: string): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
}
