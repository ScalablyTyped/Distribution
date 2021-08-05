package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactDetail extends StObject {
  
  /**
    * First line of the contact's address.
    */
  var AddressLine1: js.UndefOr[AddressLine] = js.undefined
  
  /**
    * Second line of contact's address, if any.
    */
  var AddressLine2: js.UndefOr[AddressLine] = js.undefined
  
  /**
    * The city of the contact's address.
    */
  var City: js.UndefOr[typings.awsSdk.route53domainsMod.City] = js.undefined
  
  /**
    * Indicates whether the contact is a person, company, association, or public organization. Note the following:   If you specify a value other than PERSON, you must also specify a value for OrganizationName.   For some TLDs, the privacy protection available depends on the value that you specify for Contact Type. For the privacy protection settings for your TLD, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide    For .es domains, if you specify PERSON, you must specify INDIVIDUAL for the value of ES_LEGAL_FORM.  
    */
  var ContactType: js.UndefOr[typings.awsSdk.route53domainsMod.ContactType] = js.undefined
  
  /**
    * Code for the country of the contact's address.
    */
  var CountryCode: js.UndefOr[typings.awsSdk.route53domainsMod.CountryCode] = js.undefined
  
  /**
    * Email address of the contact.
    */
  var Email: js.UndefOr[typings.awsSdk.route53domainsMod.Email] = js.undefined
  
  /**
    * A list of name-value pairs for parameters required by certain top-level domains.
    */
  var ExtraParams: js.UndefOr[ExtraParamList] = js.undefined
  
  /**
    * Fax number of the contact. Constraints: Phone number must be specified in the format "+[country dialing code].[number including any area code]". For example, a US phone number might appear as "+1.1234567890".
    */
  var Fax: js.UndefOr[ContactNumber] = js.undefined
  
  /**
    * First name of contact.
    */
  var FirstName: js.UndefOr[ContactName] = js.undefined
  
  /**
    * Last name of contact.
    */
  var LastName: js.UndefOr[ContactName] = js.undefined
  
  /**
    * Name of the organization for contact types other than PERSON.
    */
  var OrganizationName: js.UndefOr[ContactName] = js.undefined
  
  /**
    * The phone number of the contact. Constraints: Phone number must be specified in the format "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might appear as "+1.1234567890".
    */
  var PhoneNumber: js.UndefOr[ContactNumber] = js.undefined
  
  /**
    * The state or province of the contact's city.
    */
  var State: js.UndefOr[typings.awsSdk.route53domainsMod.State] = js.undefined
  
  /**
    * The zip or postal code of the contact's address.
    */
  var ZipCode: js.UndefOr[typings.awsSdk.route53domainsMod.ZipCode] = js.undefined
}
object ContactDetail {
  
  inline def apply(): ContactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactDetail]
  }
  
  extension [Self <: ContactDetail](x: Self) {
    
    inline def setAddressLine1(value: AddressLine): Self = StObject.set(x, "AddressLine1", value.asInstanceOf[js.Any])
    
    inline def setAddressLine1Undefined: Self = StObject.set(x, "AddressLine1", js.undefined)
    
    inline def setAddressLine2(value: AddressLine): Self = StObject.set(x, "AddressLine2", value.asInstanceOf[js.Any])
    
    inline def setAddressLine2Undefined: Self = StObject.set(x, "AddressLine2", js.undefined)
    
    inline def setCity(value: City): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setContactType(value: ContactType): Self = StObject.set(x, "ContactType", value.asInstanceOf[js.Any])
    
    inline def setContactTypeUndefined: Self = StObject.set(x, "ContactType", js.undefined)
    
    inline def setCountryCode(value: CountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    inline def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    inline def setExtraParams(value: ExtraParamList): Self = StObject.set(x, "ExtraParams", value.asInstanceOf[js.Any])
    
    inline def setExtraParamsUndefined: Self = StObject.set(x, "ExtraParams", js.undefined)
    
    inline def setExtraParamsVarargs(value: ExtraParam*): Self = StObject.set(x, "ExtraParams", js.Array(value :_*))
    
    inline def setFax(value: ContactNumber): Self = StObject.set(x, "Fax", value.asInstanceOf[js.Any])
    
    inline def setFaxUndefined: Self = StObject.set(x, "Fax", js.undefined)
    
    inline def setFirstName(value: ContactName): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    inline def setLastName(value: ContactName): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    inline def setOrganizationName(value: ContactName): Self = StObject.set(x, "OrganizationName", value.asInstanceOf[js.Any])
    
    inline def setOrganizationNameUndefined: Self = StObject.set(x, "OrganizationName", js.undefined)
    
    inline def setPhoneNumber(value: ContactNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setZipCode(value: ZipCode): Self = StObject.set(x, "ZipCode", value.asInstanceOf[js.Any])
    
    inline def setZipCodeUndefined: Self = StObject.set(x, "ZipCode", js.undefined)
  }
}
