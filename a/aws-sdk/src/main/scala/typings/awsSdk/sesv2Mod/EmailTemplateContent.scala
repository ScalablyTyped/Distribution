package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailTemplateContent extends js.Object {
  
  /**
    * The HTML body of the email.
    */
  var Html: js.UndefOr[EmailTemplateHtml] = js.native
  
  /**
    * The subject line of the email.
    */
  var Subject: js.UndefOr[EmailTemplateSubject] = js.native
  
  /**
    * The email body that will be visible to recipients whose email clients do not display HTML.
    */
  var Text: js.UndefOr[EmailTemplateText] = js.native
}
object EmailTemplateContent {
  
  @scala.inline
  def apply(): EmailTemplateContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailTemplateContent]
  }
  
  @scala.inline
  implicit class EmailTemplateContentOps[Self <: EmailTemplateContent] (val x: Self) extends AnyVal {
    
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
    def setHtml(value: EmailTemplateHtml): Self = this.set("Html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml: Self = this.set("Html", js.undefined)
    
    @scala.inline
    def setSubject(value: EmailTemplateSubject): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("Subject", js.undefined)
    
    @scala.inline
    def setText(value: EmailTemplateText): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("Text", js.undefined)
  }
}
