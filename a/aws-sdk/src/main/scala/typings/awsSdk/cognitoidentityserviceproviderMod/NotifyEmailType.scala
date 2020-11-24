package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyEmailType extends js.Object {
  
  /**
    * The HTML body.
    */
  var HtmlBody: js.UndefOr[EmailNotificationBodyType] = js.native
  
  /**
    * The subject.
    */
  var Subject: EmailNotificationSubjectType = js.native
  
  /**
    * The text body.
    */
  var TextBody: js.UndefOr[EmailNotificationBodyType] = js.native
}
object NotifyEmailType {
  
  @scala.inline
  def apply(Subject: EmailNotificationSubjectType): NotifyEmailType = {
    val __obj = js.Dynamic.literal(Subject = Subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyEmailType]
  }
  
  @scala.inline
  implicit class NotifyEmailTypeOps[Self <: NotifyEmailType] (val x: Self) extends AnyVal {
    
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
    def setSubject(value: EmailNotificationSubjectType): Self = this.set("Subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlBody(value: EmailNotificationBodyType): Self = this.set("HtmlBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlBody: Self = this.set("HtmlBody", js.undefined)
    
    @scala.inline
    def setTextBody(value: EmailNotificationBodyType): Self = this.set("TextBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextBody: Self = this.set("TextBody", js.undefined)
  }
}
