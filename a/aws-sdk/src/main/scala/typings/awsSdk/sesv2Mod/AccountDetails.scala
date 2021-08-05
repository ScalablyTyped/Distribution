package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountDetails extends StObject {
  
  /**
    * Additional email addresses where updates are sent about your account review process.
    */
  var AdditionalContactEmailAddresses: js.UndefOr[typings.awsSdk.sesv2Mod.AdditionalContactEmailAddresses] = js.undefined
  
  /**
    * The language you would prefer for the case. The contact language can be one of ENGLISH or JAPANESE.
    */
  var ContactLanguage: js.UndefOr[typings.awsSdk.sesv2Mod.ContactLanguage] = js.undefined
  
  /**
    * The type of email your account is sending. The mail type can be one of the following:    MARKETING – Most of your sending traffic is to keep your customers informed of your latest offering.    TRANSACTIONAL – Most of your sending traffic is to communicate during a transaction with a customer.  
    */
  var MailType: js.UndefOr[typings.awsSdk.sesv2Mod.MailType] = js.undefined
  
  /**
    * Information about the review of the latest details you submitted.
    */
  var ReviewDetails: js.UndefOr[typings.awsSdk.sesv2Mod.ReviewDetails] = js.undefined
  
  /**
    * A description of the types of email that you plan to send.
    */
  var UseCaseDescription: js.UndefOr[typings.awsSdk.sesv2Mod.UseCaseDescription] = js.undefined
  
  /**
    * The URL of your website. This information helps us better understand the type of content that you plan to send.
    */
  var WebsiteURL: js.UndefOr[typings.awsSdk.sesv2Mod.WebsiteURL] = js.undefined
}
object AccountDetails {
  
  inline def apply(): AccountDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountDetails]
  }
  
  extension [Self <: AccountDetails](x: Self) {
    
    inline def setAdditionalContactEmailAddresses(value: AdditionalContactEmailAddresses): Self = StObject.set(x, "AdditionalContactEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setAdditionalContactEmailAddressesUndefined: Self = StObject.set(x, "AdditionalContactEmailAddresses", js.undefined)
    
    inline def setAdditionalContactEmailAddressesVarargs(value: AdditionalContactEmailAddress*): Self = StObject.set(x, "AdditionalContactEmailAddresses", js.Array(value :_*))
    
    inline def setContactLanguage(value: ContactLanguage): Self = StObject.set(x, "ContactLanguage", value.asInstanceOf[js.Any])
    
    inline def setContactLanguageUndefined: Self = StObject.set(x, "ContactLanguage", js.undefined)
    
    inline def setMailType(value: MailType): Self = StObject.set(x, "MailType", value.asInstanceOf[js.Any])
    
    inline def setMailTypeUndefined: Self = StObject.set(x, "MailType", js.undefined)
    
    inline def setReviewDetails(value: ReviewDetails): Self = StObject.set(x, "ReviewDetails", value.asInstanceOf[js.Any])
    
    inline def setReviewDetailsUndefined: Self = StObject.set(x, "ReviewDetails", js.undefined)
    
    inline def setUseCaseDescription(value: UseCaseDescription): Self = StObject.set(x, "UseCaseDescription", value.asInstanceOf[js.Any])
    
    inline def setUseCaseDescriptionUndefined: Self = StObject.set(x, "UseCaseDescription", js.undefined)
    
    inline def setWebsiteURL(value: WebsiteURL): Self = StObject.set(x, "WebsiteURL", value.asInstanceOf[js.Any])
    
    inline def setWebsiteURLUndefined: Self = StObject.set(x, "WebsiteURL", js.undefined)
  }
}
