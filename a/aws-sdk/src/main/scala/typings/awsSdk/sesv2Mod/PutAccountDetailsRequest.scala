package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccountDetailsRequest extends js.Object {
  /**
    * Additional email addresses that you would like to be notified regarding Amazon SES matters.
    */
  var AdditionalContactEmailAddresses: js.UndefOr[typings.awsSdk.sesv2Mod.AdditionalContactEmailAddresses] = js.native
  /**
    * The language you would prefer to be contacted with.
    */
  var ContactLanguage: js.UndefOr[typings.awsSdk.sesv2Mod.ContactLanguage] = js.native
  /**
    * The type of email your account will send.
    */
  var MailType: typings.awsSdk.sesv2Mod.MailType = js.native
  /**
    * Indicates whether or not your account should have production access in the current AWS Region. If the value is false, then your account is in the sandbox. When your account is in the sandbox, you can only send email to verified identities. Additionally, the maximum number of emails you can send in a 24-hour period (your sending quota) is 200, and the maximum number of emails you can send per second (your maximum sending rate) is 1. If the value is true, then your account has production access. When your account has production access, you can send email to any address. The sending quota and maximum sending rate for your account vary based on your specific use case.
    */
  var ProductionAccessEnabled: js.UndefOr[EnabledWrapper] = js.native
  /**
    * A description of the types of email that you plan to send.
    */
  var UseCaseDescription: typings.awsSdk.sesv2Mod.UseCaseDescription = js.native
  /**
    * The URL of your website. This information helps us better understand the type of content that you plan to send.
    */
  var WebsiteURL: typings.awsSdk.sesv2Mod.WebsiteURL = js.native
}

object PutAccountDetailsRequest {
  @scala.inline
  def apply(MailType: MailType, UseCaseDescription: UseCaseDescription, WebsiteURL: WebsiteURL): PutAccountDetailsRequest = {
    val __obj = js.Dynamic.literal(MailType = MailType.asInstanceOf[js.Any], UseCaseDescription = UseCaseDescription.asInstanceOf[js.Any], WebsiteURL = WebsiteURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountDetailsRequest]
  }
  @scala.inline
  implicit class PutAccountDetailsRequestOps[Self <: PutAccountDetailsRequest] (val x: Self) extends AnyVal {
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
    def setMailType(value: MailType): Self = this.set("MailType", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseCaseDescription(value: UseCaseDescription): Self = this.set("UseCaseDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebsiteURL(value: WebsiteURL): Self = this.set("WebsiteURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdditionalContactEmailAddressesVarargs(value: AdditionalContactEmailAddress*): Self = this.set("AdditionalContactEmailAddresses", js.Array(value :_*))
    @scala.inline
    def setAdditionalContactEmailAddresses(value: AdditionalContactEmailAddresses): Self = this.set("AdditionalContactEmailAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalContactEmailAddresses: Self = this.set("AdditionalContactEmailAddresses", js.undefined)
    @scala.inline
    def setContactLanguage(value: ContactLanguage): Self = this.set("ContactLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactLanguage: Self = this.set("ContactLanguage", js.undefined)
    @scala.inline
    def setProductionAccessEnabled(value: EnabledWrapper): Self = this.set("ProductionAccessEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductionAccessEnabled: Self = this.set("ProductionAccessEnabled", js.undefined)
  }
  
}

