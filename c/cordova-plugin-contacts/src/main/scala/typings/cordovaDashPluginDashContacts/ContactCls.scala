package typings.cordovaDashPluginDashContacts

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Contact")
@js.native
class ContactCls protected () extends Contact {
  /** Constructor of Contact object */
  def this(
    id: js.UndefOr[String],
    displayName: js.UndefOr[String],
    name: js.UndefOr[ContactName],
    nickname: js.UndefOr[String],
    phoneNumbers: js.UndefOr[js.Array[ContactField]],
    emails: js.UndefOr[js.Array[ContactField]],
    addresses: js.UndefOr[js.Array[ContactAddress]],
    ims: js.UndefOr[js.Array[ContactField]],
    organizations: js.UndefOr[js.Array[ContactOrganization]],
    birthday: js.UndefOr[Date],
    note: js.UndefOr[String],
    photos: js.UndefOr[js.Array[ContactField]],
    categories: js.UndefOr[ContactField],
    urls: js.UndefOr[js.Array[ContactField]]
  ) = this()
  /**
    * Removes the contact from the device contacts database, otherwise executes an error callback with a ContactError object.
    * @param onSuccess Success callback function invoked on success operation.
    * @param onError Error callback function, invoked when an error occurs.
    */
  /* CompleteClass */
  override def remove(onSuccess: js.Function0[Unit], onError: js.Function1[/* error */ Error, Unit]): Unit = js.native
  /**
    * Saves a new contact to the device contacts database, or updates an existing contact if a contact with the same id already exists.
    * @param onSuccess Success callback function invoked on success operation with che Contact object.
    * @param onError Error callback function, invoked when an error occurs.
    */
  /* CompleteClass */
  override def save(
    onSuccess: js.Function1[/* contact */ this.type, Unit],
    onError: js.Function1[/* error */ Error, Unit]
  ): Unit = js.native
}

