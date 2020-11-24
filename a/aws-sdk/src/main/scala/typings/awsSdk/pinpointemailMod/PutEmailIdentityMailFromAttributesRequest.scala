package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEmailIdentityMailFromAttributesRequest extends js.Object {
  
  /**
    * The action that you want Amazon Pinpoint to take if it can't read the required MX record when you send an email. When you set this value to UseDefaultValue, Amazon Pinpoint uses amazonses.com as the MAIL FROM domain. When you set this value to RejectMessage, Amazon Pinpoint returns a MailFromDomainNotVerified error, and doesn't attempt to deliver the email. These behaviors are taken when the custom MAIL FROM domain configuration is in the Pending, Failed, and TemporaryFailure states.
    */
  var BehaviorOnMxFailure: js.UndefOr[typings.awsSdk.pinpointemailMod.BehaviorOnMxFailure] = js.native
  
  /**
    * The verified email identity that you want to set up the custom MAIL FROM domain for.
    */
  var EmailIdentity: Identity = js.native
  
  /**
    *  The custom MAIL FROM domain that you want the verified identity to use. The MAIL FROM domain must meet the following criteria:   It has to be a subdomain of the verified identity.   It can't be used to receive email.   It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback forwarding emails.  
    */
  var MailFromDomain: js.UndefOr[MailFromDomainName] = js.native
}
object PutEmailIdentityMailFromAttributesRequest {
  
  @scala.inline
  def apply(EmailIdentity: Identity): PutEmailIdentityMailFromAttributesRequest = {
    val __obj = js.Dynamic.literal(EmailIdentity = EmailIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEmailIdentityMailFromAttributesRequest]
  }
  
  @scala.inline
  implicit class PutEmailIdentityMailFromAttributesRequestOps[Self <: PutEmailIdentityMailFromAttributesRequest] (val x: Self) extends AnyVal {
    
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
    def setEmailIdentity(value: Identity): Self = this.set("EmailIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviorOnMxFailure(value: BehaviorOnMxFailure): Self = this.set("BehaviorOnMxFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehaviorOnMxFailure: Self = this.set("BehaviorOnMxFailure", js.undefined)
    
    @scala.inline
    def setMailFromDomain(value: MailFromDomainName): Self = this.set("MailFromDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailFromDomain: Self = this.set("MailFromDomain", js.undefined)
  }
}
