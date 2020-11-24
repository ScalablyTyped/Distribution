package typings.awsSdkClientPinpointBrowser.typesCampaignEmailMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CampaignEmailMessage extends js.Object {
  
  /**
    * The email text body.
    */
  var Body: js.UndefOr[String] = js.native
  
  /**
    * The email address used to send the email from. Defaults to use FromAddress specified in the Email Channel.
    */
  var FromAddress: js.UndefOr[String] = js.native
  
  /**
    * The email html body.
    */
  var HtmlBody: js.UndefOr[String] = js.native
  
  /**
    * The email title (Or subject).
    */
  var Title: js.UndefOr[String] = js.native
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
    def setBody(value: String): Self = this.set("Body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("Body", js.undefined)
    
    @scala.inline
    def setFromAddress(value: String): Self = this.set("FromAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromAddress: Self = this.set("FromAddress", js.undefined)
    
    @scala.inline
    def setHtmlBody(value: String): Self = this.set("HtmlBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlBody: Self = this.set("HtmlBody", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("Title", js.undefined)
  }
}
