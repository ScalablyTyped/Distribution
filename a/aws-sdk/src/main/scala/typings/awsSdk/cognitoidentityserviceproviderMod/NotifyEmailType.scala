package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyEmailType extends StObject {
  
  /**
    * The HTML body.
    */
  var HtmlBody: js.UndefOr[EmailNotificationBodyType] = js.undefined
  
  /**
    * The subject.
    */
  var Subject: EmailNotificationSubjectType
  
  /**
    * The text body.
    */
  var TextBody: js.UndefOr[EmailNotificationBodyType] = js.undefined
}
object NotifyEmailType {
  
  @scala.inline
  def apply(Subject: EmailNotificationSubjectType): NotifyEmailType = {
    val __obj = js.Dynamic.literal(Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyEmailType]
  }
  
  @scala.inline
  implicit class NotifyEmailTypeMutableBuilder[Self <: NotifyEmailType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlBody(value: EmailNotificationBodyType): Self = StObject.set(x, "HtmlBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlBodyUndefined: Self = StObject.set(x, "HtmlBody", js.undefined)
    
    @scala.inline
    def setSubject(value: EmailNotificationSubjectType): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBody(value: EmailNotificationBodyType): Self = StObject.set(x, "TextBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextBodyUndefined: Self = StObject.set(x, "TextBody", js.undefined)
  }
}
