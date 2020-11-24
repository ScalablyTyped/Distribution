package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEmailIdentityResponse extends js.Object {
  
  /**
    * An object that contains information about the DKIM attributes for the identity.
    */
  var DkimAttributes: js.UndefOr[typings.awsSdk.sesv2Mod.DkimAttributes] = js.native
  
  /**
    * The feedback forwarding configuration for the identity. If the value is true, you receive email notifications when bounce or complaint events occur. These notifications are sent to the address that you specified in the Return-Path header of the original email. You're required to have a method of tracking bounces and complaints. If you haven't set up another mechanism for receiving bounce or complaint notifications (for example, by setting up an event destination), you receive an email notification when these events occur (even if this setting is disabled).
    */
  var FeedbackForwardingStatus: js.UndefOr[Enabled] = js.native
  
  /**
    * The email identity type.
    */
  var IdentityType: js.UndefOr[typings.awsSdk.sesv2Mod.IdentityType] = js.native
  
  /**
    * An object that contains information about the Mail-From attributes for the email identity.
    */
  var MailFromAttributes: js.UndefOr[typings.awsSdk.sesv2Mod.MailFromAttributes] = js.native
  
  /**
    * A map of policy names to policies.
    */
  var Policies: js.UndefOr[PolicyMap] = js.native
  
  /**
    * An array of objects that define the tags (keys and values) that are associated with the email identity.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
  /**
    * Specifies whether or not the identity is verified. You can only send email from verified email addresses or domains. For more information about verifying identities, see the Amazon Pinpoint User Guide.
    */
  var VerifiedForSendingStatus: js.UndefOr[Enabled] = js.native
}
object GetEmailIdentityResponse {
  
  @scala.inline
  def apply(): GetEmailIdentityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEmailIdentityResponse]
  }
  
  @scala.inline
  implicit class GetEmailIdentityResponseOps[Self <: GetEmailIdentityResponse] (val x: Self) extends AnyVal {
    
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
    def setDkimAttributes(value: DkimAttributes): Self = this.set("DkimAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDkimAttributes: Self = this.set("DkimAttributes", js.undefined)
    
    @scala.inline
    def setFeedbackForwardingStatus(value: Enabled): Self = this.set("FeedbackForwardingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeedbackForwardingStatus: Self = this.set("FeedbackForwardingStatus", js.undefined)
    
    @scala.inline
    def setIdentityType(value: IdentityType): Self = this.set("IdentityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityType: Self = this.set("IdentityType", js.undefined)
    
    @scala.inline
    def setMailFromAttributes(value: MailFromAttributes): Self = this.set("MailFromAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMailFromAttributes: Self = this.set("MailFromAttributes", js.undefined)
    
    @scala.inline
    def setPolicies(value: PolicyMap): Self = this.set("Policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("Policies", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVerifiedForSendingStatus(value: Enabled): Self = this.set("VerifiedForSendingStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerifiedForSendingStatus: Self = this.set("VerifiedForSendingStatus", js.undefined)
  }
}
