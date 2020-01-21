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
    * Indicates whether the contact is a person, company, association, or public organization. If you choose an option other than PERSON, you must enter an organization name, and you can't enable privacy protection for the contact.
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
  def apply(
    AddressLine1: AddressLine = null,
    AddressLine2: AddressLine = null,
    City: City = null,
    ContactType: ContactType = null,
    CountryCode: CountryCode = null,
    Email: Email = null,
    ExtraParams: ExtraParamList = null,
    Fax: ContactNumber = null,
    FirstName: ContactName = null,
    LastName: ContactName = null,
    OrganizationName: ContactName = null,
    PhoneNumber: ContactNumber = null,
    State: State = null,
    ZipCode: ZipCode = null
  ): ContactDetail = {
    val __obj = js.Dynamic.literal()
    if (AddressLine1 != null) __obj.updateDynamic("AddressLine1")(AddressLine1.asInstanceOf[js.Any])
    if (AddressLine2 != null) __obj.updateDynamic("AddressLine2")(AddressLine2.asInstanceOf[js.Any])
    if (City != null) __obj.updateDynamic("City")(City.asInstanceOf[js.Any])
    if (ContactType != null) __obj.updateDynamic("ContactType")(ContactType.asInstanceOf[js.Any])
    if (CountryCode != null) __obj.updateDynamic("CountryCode")(CountryCode.asInstanceOf[js.Any])
    if (Email != null) __obj.updateDynamic("Email")(Email.asInstanceOf[js.Any])
    if (ExtraParams != null) __obj.updateDynamic("ExtraParams")(ExtraParams.asInstanceOf[js.Any])
    if (Fax != null) __obj.updateDynamic("Fax")(Fax.asInstanceOf[js.Any])
    if (FirstName != null) __obj.updateDynamic("FirstName")(FirstName.asInstanceOf[js.Any])
    if (LastName != null) __obj.updateDynamic("LastName")(LastName.asInstanceOf[js.Any])
    if (OrganizationName != null) __obj.updateDynamic("OrganizationName")(OrganizationName.asInstanceOf[js.Any])
    if (PhoneNumber != null) __obj.updateDynamic("PhoneNumber")(PhoneNumber.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (ZipCode != null) __obj.updateDynamic("ZipCode")(ZipCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactDetail]
  }
}

