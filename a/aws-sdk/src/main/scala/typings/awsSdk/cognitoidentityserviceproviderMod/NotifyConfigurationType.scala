package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotifyConfigurationType extends js.Object {
  
  /**
    * Email template used when a detected risk event is blocked.
    */
  var BlockEmail: js.UndefOr[NotifyEmailType] = js.native
  
  /**
    * The email address that is sending the email. It must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES.
    */
  var From: js.UndefOr[StringType] = js.native
  
  /**
    * The MFA email template used when MFA is challenged as part of a detected risk.
    */
  var MfaEmail: js.UndefOr[NotifyEmailType] = js.native
  
  /**
    * The email template used when a detected risk event is allowed.
    */
  var NoActionEmail: js.UndefOr[NotifyEmailType] = js.native
  
  /**
    * The destination to which the receiver of an email should reply to.
    */
  var ReplyTo: js.UndefOr[StringType] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. It permits Amazon Cognito to send for the email address specified in the From parameter.
    */
  var SourceArn: ArnType = js.native
}
object NotifyConfigurationType {
  
  @scala.inline
  def apply(SourceArn: ArnType): NotifyConfigurationType = {
    val __obj = js.Dynamic.literal(SourceArn = SourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyConfigurationType]
  }
  
  @scala.inline
  implicit class NotifyConfigurationTypeOps[Self <: NotifyConfigurationType] (val x: Self) extends AnyVal {
    
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
    def setSourceArn(value: ArnType): Self = this.set("SourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockEmail(value: NotifyEmailType): Self = this.set("BlockEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockEmail: Self = this.set("BlockEmail", js.undefined)
    
    @scala.inline
    def setFrom(value: StringType): Self = this.set("From", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("From", js.undefined)
    
    @scala.inline
    def setMfaEmail(value: NotifyEmailType): Self = this.set("MfaEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMfaEmail: Self = this.set("MfaEmail", js.undefined)
    
    @scala.inline
    def setNoActionEmail(value: NotifyEmailType): Self = this.set("NoActionEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoActionEmail: Self = this.set("NoActionEmail", js.undefined)
    
    @scala.inline
    def setReplyTo(value: StringType): Self = this.set("ReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplyTo: Self = this.set("ReplyTo", js.undefined)
  }
}
