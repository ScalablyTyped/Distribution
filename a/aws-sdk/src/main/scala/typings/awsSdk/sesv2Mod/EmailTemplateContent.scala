package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailTemplateContent extends StObject {
  
  /**
    * The HTML body of the email.
    */
  var Html: js.UndefOr[EmailTemplateHtml] = js.undefined
  
  /**
    * The subject line of the email.
    */
  var Subject: js.UndefOr[EmailTemplateSubject] = js.undefined
  
  /**
    * The email body that will be visible to recipients whose email clients do not display HTML.
    */
  var Text: js.UndefOr[EmailTemplateText] = js.undefined
}
object EmailTemplateContent {
  
  inline def apply(): EmailTemplateContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailTemplateContent]
  }
  
  extension [Self <: EmailTemplateContent](x: Self) {
    
    inline def setHtml(value: EmailTemplateHtml): Self = StObject.set(x, "Html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "Html", js.undefined)
    
    inline def setSubject(value: EmailTemplateSubject): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "Subject", js.undefined)
    
    inline def setText(value: EmailTemplateText): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
