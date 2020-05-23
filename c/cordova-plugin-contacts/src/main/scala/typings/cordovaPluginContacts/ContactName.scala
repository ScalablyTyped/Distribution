package typings.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains different kinds of information about a Contact object's name. */
trait ContactName extends js.Object {
  /** The contact's family name. */
  var familyName: js.UndefOr[String] = js.undefined
  /** The complete name of the contact. */
  var formatted: js.UndefOr[String] = js.undefined
  /** The contact's given name. */
  var givenName: js.UndefOr[String] = js.undefined
  /** The contact's prefix (example Mr. or Dr.) */
  var honorificPrefix: js.UndefOr[String] = js.undefined
  /** The contact's suffix (example Esq.). */
  var honorificSuffix: js.UndefOr[String] = js.undefined
  /** The contact's middle name. */
  var middleName: js.UndefOr[String] = js.undefined
}

object ContactName {
  @scala.inline
  def apply(
    familyName: String = null,
    formatted: String = null,
    givenName: String = null,
    honorificPrefix: String = null,
    honorificSuffix: String = null,
    middleName: String = null
  ): ContactName = {
    val __obj = js.Dynamic.literal()
    if (familyName != null) __obj.updateDynamic("familyName")(familyName.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (givenName != null) __obj.updateDynamic("givenName")(givenName.asInstanceOf[js.Any])
    if (honorificPrefix != null) __obj.updateDynamic("honorificPrefix")(honorificPrefix.asInstanceOf[js.Any])
    if (honorificSuffix != null) __obj.updateDynamic("honorificSuffix")(honorificSuffix.asInstanceOf[js.Any])
    if (middleName != null) __obj.updateDynamic("middleName")(middleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactName]
  }
}

