package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactDetail extends StObject {
  
  /**
    * First line of the contact's address.
    */
  var AddressLine1: js.UndefOr[AddressLine] = js.native
  
  /**
    * Second line of contact's address, if any.
    */
  var AddressLine2: js.UndefOr[AddressLine] = js.native
  
  /**
    * The city of the contact's address.
    */
  var City: js.UndefOr[typings.awsSdk.route53domainsMod.City] = js.native
  
  /**
    * Indicates whether the contact is a person, company, association, or public organization. Note the following:   If you specify a value other than PERSON, you must also specify a value for OrganizationName.   For some TLDs, the privacy protection available depends on the value that you specify for Contact Type. For the privacy protection settings for your TLD, see Domains that You Can Register with Amazon Route 53 in the Amazon Route 53 Developer Guide    For .es domains, if you specify PERSON, you must specify INDIVIDUAL for the value of ES_LEGAL_FORM.  
    */
  var ContactType: js.UndefOr[typings.awsSdk.route53domainsMod.ContactType] = js.native
  
  /**
    * Code for the country of the contact's address.
    */
  var CountryCode: js.UndefOr[typings.awsSdk.route53domainsMod.CountryCode] = js.native
  
  /**
    * Email address of the contact.
    */
  var Email: js.UndefOr[typings.awsSdk.route53domainsMod.Email] = js.native
  
  /**
    * A list of name-value pairs for parameters required by certain top-level domains.
    */
  var ExtraParams: js.UndefOr[ExtraParamList] = js.native
  
  /**
    * Fax number of the contact. Constraints: Phone number must be specified in the format "+[country dialing code].[number including any area code]". For example, a US phone number might appear as "+1.1234567890".
    */
  var Fax: js.UndefOr[ContactNumber] = js.native
  
  /**
    * First name of contact.
    */
  var FirstName: js.UndefOr[ContactName] = js.native
  
  /**
    * Last name of contact.
    */
  var LastName: js.UndefOr[ContactName] = js.native
  
  /**
    * Name of the organization for contact types other than PERSON.
    */
  var OrganizationName: js.UndefOr[ContactName] = js.native
  
  /**
    * The phone number of the contact. Constraints: Phone number must be specified in the format "+[country dialing code].[number including any area code&gt;]". For example, a US phone number might appear as "+1.1234567890".
    */
  var PhoneNumber: js.UndefOr[ContactNumber] = js.native
  
  /**
    * The state or province of the contact's city.
    */
  var State: js.UndefOr[typings.awsSdk.route53domainsMod.State] = js.native
  
  /**
    * The zip or postal code of the contact's address.
    */
  var ZipCode: js.UndefOr[typings.awsSdk.route53domainsMod.ZipCode] = js.native
}
object ContactDetail {
  
  @scala.inline
  def apply(): ContactDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactDetail]
  }
  
  @scala.inline
  implicit class ContactDetailMutableBuilder[Self <: ContactDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressLine1(value: AddressLine): Self = StObject.set(x, "AddressLine1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLine1Undefined: Self = StObject.set(x, "AddressLine1", js.undefined)
    
    @scala.inline
    def setAddressLine2(value: AddressLine): Self = StObject.set(x, "AddressLine2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressLine2Undefined: Self = StObject.set(x, "AddressLine2", js.undefined)
    
    @scala.inline
    def setCity(value: City): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    @scala.inline
    def setContactType(value: ContactType): Self = StObject.set(x, "ContactType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactTypeUndefined: Self = StObject.set(x, "ContactType", js.undefined)
    
    @scala.inline
    def setCountryCode(value: CountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    @scala.inline
    def setEmail(value: Email): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setExtraParams(value: ExtraParamList): Self = StObject.set(x, "ExtraParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraParamsUndefined: Self = StObject.set(x, "ExtraParams", js.undefined)
    
    @scala.inline
    def setExtraParamsVarargs(value: ExtraParam*): Self = StObject.set(x, "ExtraParams", js.Array(value :_*))
    
    @scala.inline
    def setFax(value: ContactNumber): Self = StObject.set(x, "Fax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxUndefined: Self = StObject.set(x, "Fax", js.undefined)
    
    @scala.inline
    def setFirstName(value: ContactName): Self = StObject.set(x, "FirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "FirstName", js.undefined)
    
    @scala.inline
    def setLastName(value: ContactName): Self = StObject.set(x, "LastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "LastName", js.undefined)
    
    @scala.inline
    def setOrganizationName(value: ContactName): Self = StObject.set(x, "OrganizationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationNameUndefined: Self = StObject.set(x, "OrganizationName", js.undefined)
    
    @scala.inline
    def setPhoneNumber(value: ContactNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    @scala.inline
    def setState(value: State): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setZipCode(value: ZipCode): Self = StObject.set(x, "ZipCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZipCodeUndefined: Self = StObject.set(x, "ZipCode", js.undefined)
  }
}
