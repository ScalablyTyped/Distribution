package typings
package cordovaDashPluginDashContactsLib

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
  def remove(onSuccess: js.Function0[scala.Unit], onError: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit
  /**
       * Saves a new contact to the device contacts database, or updates an existing contact if a contact with the same id already exists.
       * @param onSuccess Success callback function invoked on success operation with che Contact object.
       * @param onError Error callback function, invoked when an error occurs.
       */
  def save(
    onSuccess: js.Function1[/* contact */ this.type, scala.Unit],
    onError: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Unit
}

@JSGlobal("Contact")
@js.native
object Contact
  extends /** Constructor of Contact object */
ScalablyTyped.runtime.Instantiable14[
      /* id */ js.UndefOr[/* id */ java.lang.String], 
      /* displayName */ js.UndefOr[/* displayName */ java.lang.String], 
      /* name */ js.UndefOr[/* name */ ContactName], 
      /* nickname */ js.UndefOr[/* nickname */ java.lang.String], 
      /* phoneNumbers */ js.UndefOr[/* phoneNumbers */ js.Array[ContactField]], 
      /* emails */ js.UndefOr[/* emails */ js.Array[ContactField]], 
      /* addresses */ js.UndefOr[/* addresses */ js.Array[ContactAddress]], 
      /* ims */ js.UndefOr[/* ims */ js.Array[ContactField]], 
      /* organizations */ js.UndefOr[/* organizations */ js.Array[ContactOrganization]], 
      /* birthday */ js.UndefOr[/* birthday */ stdLib.Date], 
      /* note */ js.UndefOr[/* note */ java.lang.String], 
      /* photos */ js.UndefOr[/* photos */ js.Array[ContactField]], 
      /* categories */ js.UndefOr[/* categories */ ContactField], 
      /* urls */ js.UndefOr[/* urls */ js.Array[ContactField]], 
      Contact
    ]

