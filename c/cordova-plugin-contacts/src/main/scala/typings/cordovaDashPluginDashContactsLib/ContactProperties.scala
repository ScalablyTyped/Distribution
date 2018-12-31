package typings
package cordovaDashPluginDashContactsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactProperties extends js.Object {
  /** An array of all the contact's addresses. */
  var addresses: js.UndefOr[js.Array[ContactAddress]] = js.undefined
  /** The birthday of the contact. */
  var birthday: js.UndefOr[stdLib.Date] = js.undefined
  /** An array of all the user-defined categories associated with the contact. */
  var categories: js.UndefOr[js.Array[ContactField]] = js.undefined
  /** The name of this Contact, suitable for display to end users. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** An array of all the contact's email addresses. */
  var emails: js.UndefOr[js.Array[ContactField]] = js.undefined
  /** A globally unique identifier. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** An array of all the contact's IM addresses. */
  var ims: js.UndefOr[js.Array[ContactField]] = js.undefined
  /** An object containing all components of a persons name. */
  var name: js.UndefOr[ContactName] = js.undefined
  /** A casual name by which to address the contact. */
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  /** A note about the contact. */
  var note: js.UndefOr[java.lang.String] = js.undefined
  /** An array of all the contact's organizations. */
  var organizations: js.UndefOr[js.Array[ContactOrganization]] = js.undefined
  /** An array of all the contact's phone numbers. */
  var phoneNumbers: js.UndefOr[js.Array[ContactField]] = js.undefined
  /** An array of the contact's photos. */
  var photos: js.UndefOr[js.Array[ContactField]] = js.undefined
  /** An array of web pages associated with the contact. */
  var urls: js.UndefOr[js.Array[ContactField]] = js.undefined
}

