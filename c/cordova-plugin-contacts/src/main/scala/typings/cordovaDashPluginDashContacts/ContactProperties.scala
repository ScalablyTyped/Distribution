package typings.cordovaDashPluginDashContacts

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactProperties extends js.Object {
  /** An array of all the contact's addresses. */
  var addresses: js.UndefOr[js.Array[ContactAddress]] = js.undefined
  /** The birthday of the contact. */
  var birthday: js.UndefOr[Date] = js.undefined
  /** An array of all the user-defined categories associated with the contact. */
  var categories: js.UndefOr[js.Array[ContactField]] = js.undefined
  /** The name of this Contact, suitable for display to end users. */
  var displayName: js.UndefOr[String] = js.undefined
  /** An array of all the contact's email addresses. */
  var emails: js.UndefOr[js.Array[ContactField]] = js.undefined
  /** A globally unique identifier. */
  var id: js.UndefOr[String] = js.undefined
  /** An array of all the contact's IM addresses. */
  var ims: js.UndefOr[js.Array[ContactField]] = js.undefined
  /** An object containing all components of a persons name. */
  var name: js.UndefOr[ContactName] = js.undefined
  /** A casual name by which to address the contact. */
  var nickname: js.UndefOr[String] = js.undefined
  /** A note about the contact. */
  var note: js.UndefOr[String] = js.undefined
  /** An array of all the contact's organizations. */
  var organizations: js.UndefOr[js.Array[ContactOrganization]] = js.undefined
  /** An array of all the contact's phone numbers. */
  var phoneNumbers: js.UndefOr[js.Array[ContactField]] = js.undefined
  /** An array of the contact's photos. */
  var photos: js.UndefOr[js.Array[ContactField]] = js.undefined
  /** An array of web pages associated with the contact. */
  var urls: js.UndefOr[js.Array[ContactField]] = js.undefined
}

object ContactProperties {
  @scala.inline
  def apply(
    addresses: js.Array[ContactAddress] = null,
    birthday: Date = null,
    categories: js.Array[ContactField] = null,
    displayName: String = null,
    emails: js.Array[ContactField] = null,
    id: String = null,
    ims: js.Array[ContactField] = null,
    name: ContactName = null,
    nickname: String = null,
    note: String = null,
    organizations: js.Array[ContactOrganization] = null,
    phoneNumbers: js.Array[ContactField] = null,
    photos: js.Array[ContactField] = null,
    urls: js.Array[ContactField] = null
  ): ContactProperties = {
    val __obj = js.Dynamic.literal()
    if (addresses != null) __obj.updateDynamic("addresses")(addresses.asInstanceOf[js.Any])
    if (birthday != null) __obj.updateDynamic("birthday")(birthday.asInstanceOf[js.Any])
    if (categories != null) __obj.updateDynamic("categories")(categories.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ims != null) __obj.updateDynamic("ims")(ims.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (note != null) __obj.updateDynamic("note")(note.asInstanceOf[js.Any])
    if (organizations != null) __obj.updateDynamic("organizations")(organizations.asInstanceOf[js.Any])
    if (phoneNumbers != null) __obj.updateDynamic("phoneNumbers")(phoneNumbers.asInstanceOf[js.Any])
    if (photos != null) __obj.updateDynamic("photos")(photos.asInstanceOf[js.Any])
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactProperties]
  }
}

