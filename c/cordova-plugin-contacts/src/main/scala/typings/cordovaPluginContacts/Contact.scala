package typings.cordovaPluginContacts

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Contact object represents a user's contact. Contacts can be created, stored, or removed
  * from the device contacts database. Contacts can also be retrieved (individually or in bulk)
  * from the database by invoking the navigator.contacts.find method.
  */
trait Contact extends ContactProperties {
  /**
    * Removes the contact from the device contacts database, otherwise executes an error callback with a ContactError object.
    * @param onSuccess Success callback function invoked on success operation.
    * @param onError Error callback function, invoked when an error occurs.
    */
  def remove(onSuccess: js.Function0[Unit], onError: js.Function1[/* error */ Error, Unit]): Unit
  /**
    * Saves a new contact to the device contacts database, or updates an existing contact if a contact with the same id already exists.
    * @param onSuccess Success callback function invoked on success operation with che Contact object.
    * @param onError Error callback function, invoked when an error occurs.
    */
  def save(
    onSuccess: js.Function1[/* contact */ this.type, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): Unit
}

object Contact {
  @scala.inline
  def apply(
    remove: (js.Function0[Unit], js.Function1[/* error */ Error, Unit]) => Unit,
    save: (js.Function1[Contact, Unit], js.Function1[/* error */ Error, Unit]) => Unit,
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
  ): Contact = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction2(remove), save = js.Any.fromFunction2(save))
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
    __obj.asInstanceOf[Contact]
  }
}

