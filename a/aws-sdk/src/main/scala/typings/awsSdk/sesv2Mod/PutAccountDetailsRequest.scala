package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAccountDetailsRequest extends StObject {
  
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
  implicit class PutAccountDetailsRequestMutableBuilder[Self <: PutAccountDetailsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalContactEmailAddresses(value: AdditionalContactEmailAddresses): Self = StObject.set(x, "AdditionalContactEmailAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalContactEmailAddressesUndefined: Self = StObject.set(x, "AdditionalContactEmailAddresses", js.undefined)
    
    @scala.inline
    def setAdditionalContactEmailAddressesVarargs(value: AdditionalContactEmailAddress*): Self = StObject.set(x, "AdditionalContactEmailAddresses", js.Array(value :_*))
    
    @scala.inline
    def setContactLanguage(value: ContactLanguage): Self = StObject.set(x, "ContactLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactLanguageUndefined: Self = StObject.set(x, "ContactLanguage", js.undefined)
    
    @scala.inline
    def setMailType(value: MailType): Self = StObject.set(x, "MailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductionAccessEnabled(value: EnabledWrapper): Self = StObject.set(x, "ProductionAccessEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductionAccessEnabledUndefined: Self = StObject.set(x, "ProductionAccessEnabled", js.undefined)
    
    @scala.inline
    def setUseCaseDescription(value: UseCaseDescription): Self = StObject.set(x, "UseCaseDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsiteURL(value: WebsiteURL): Self = StObject.set(x, "WebsiteURL", value.asInstanceOf[js.Any])
  }
}
