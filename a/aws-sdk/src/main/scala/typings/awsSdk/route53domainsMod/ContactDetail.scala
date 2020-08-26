package typings.awsSdk.route53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactDetail extends js.Object {
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
  implicit class ContactDetailOps[Self <: ContactDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressLine1(value: AddressLine): Self = this.set("AddressLine1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLine1: Self = this.set("AddressLine1", js.undefined)
    @scala.inline
    def setAddressLine2(value: AddressLine): Self = this.set("AddressLine2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLine2: Self = this.set("AddressLine2", js.undefined)
    @scala.inline
    def setCity(value: City): Self = this.set("City", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCity: Self = this.set("City", js.undefined)
    @scala.inline
    def setContactType(value: ContactType): Self = this.set("ContactType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactType: Self = this.set("ContactType", js.undefined)
    @scala.inline
    def setCountryCode(value: CountryCode): Self = this.set("CountryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryCode: Self = this.set("CountryCode", js.undefined)
    @scala.inline
    def setEmail(value: Email): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("Email", js.undefined)
    @scala.inline
    def setExtraParamsVarargs(value: ExtraParam*): Self = this.set("ExtraParams", js.Array(value :_*))
    @scala.inline
    def setExtraParams(value: ExtraParamList): Self = this.set("ExtraParams", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraParams: Self = this.set("ExtraParams", js.undefined)
    @scala.inline
    def setFax(value: ContactNumber): Self = this.set("Fax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFax: Self = this.set("Fax", js.undefined)
    @scala.inline
    def setFirstName(value: ContactName): Self = this.set("FirstName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstName: Self = this.set("FirstName", js.undefined)
    @scala.inline
    def setLastName(value: ContactName): Self = this.set("LastName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastName: Self = this.set("LastName", js.undefined)
    @scala.inline
    def setOrganizationName(value: ContactName): Self = this.set("OrganizationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizationName: Self = this.set("OrganizationName", js.undefined)
    @scala.inline
    def setPhoneNumber(value: ContactNumber): Self = this.set("PhoneNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumber: Self = this.set("PhoneNumber", js.undefined)
    @scala.inline
    def setState(value: State): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setZipCode(value: ZipCode): Self = this.set("ZipCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZipCode: Self = this.set("ZipCode", js.undefined)
  }
  
}

