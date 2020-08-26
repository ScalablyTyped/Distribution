package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountDetails extends js.Object {
  /**
    * Additional email addresses where updates are sent about your account review process.
    */
  var AdditionalContactEmailAddresses: js.UndefOr[typings.awsSdk.sesv2Mod.AdditionalContactEmailAddresses] = js.native
  /**
    * The language you would prefer for the case. The contact language can be one of ENGLISH or JAPANESE.
    */
  var ContactLanguage: js.UndefOr[typings.awsSdk.sesv2Mod.ContactLanguage] = js.native
  /**
    * The type of email your account is sending. The mail type can be one of the following:    MARKETING – Most of your sending traffic is to keep your customers informed of your latest offering.    TRANSACTIONAL – Most of your sending traffic is to communicate during a transaction with a customer.  
    */
  var MailType: js.UndefOr[typings.awsSdk.sesv2Mod.MailType] = js.native
  /**
    * Information about the review of the latest details you submitted.
    */
  var ReviewDetails: js.UndefOr[typings.awsSdk.sesv2Mod.ReviewDetails] = js.native
  /**
    * A description of the types of email that you plan to send.
    */
  var UseCaseDescription: js.UndefOr[typings.awsSdk.sesv2Mod.UseCaseDescription] = js.native
  /**
    * The URL of your website. This information helps us better understand the type of content that you plan to send.
    */
  var WebsiteURL: js.UndefOr[typings.awsSdk.sesv2Mod.WebsiteURL] = js.native
}

object AccountDetails {
  @scala.inline
  def apply(): AccountDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountDetails]
  }
  @scala.inline
  implicit class AccountDetailsOps[Self <: AccountDetails] (val x: Self) extends AnyVal {
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
    def setMailType(value: MailType): Self = this.set("MailType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMailType: Self = this.set("MailType", js.undefined)
    @scala.inline
    def setReviewDetails(value: ReviewDetails): Self = this.set("ReviewDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReviewDetails: Self = this.set("ReviewDetails", js.undefined)
    @scala.inline
    def setUseCaseDescription(value: UseCaseDescription): Self = this.set("UseCaseDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCaseDescription: Self = this.set("UseCaseDescription", js.undefined)
    @scala.inline
    def setWebsiteURL(value: WebsiteURL): Self = this.set("WebsiteURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsiteURL: Self = this.set("WebsiteURL", js.undefined)
  }
  
}

