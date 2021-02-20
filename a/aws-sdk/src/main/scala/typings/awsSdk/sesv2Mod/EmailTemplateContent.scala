package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailTemplateContent extends StObject {
  
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
  implicit class EmailTemplateContentMutableBuilder[Self <: EmailTemplateContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtml(value: EmailTemplateHtml): Self = StObject.set(x, "Html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "Html", js.undefined)
    
    @scala.inline
    def setSubject(value: EmailTemplateSubject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    @scala.inline
    def setText(value: EmailTemplateText): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
