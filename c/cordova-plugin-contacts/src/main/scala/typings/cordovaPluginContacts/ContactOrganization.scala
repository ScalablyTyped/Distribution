package typings.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ContactOrganization object stores a contact's organization properties. A Contact object stores
  * one or more ContactOrganization objects in an array.
  */
trait ContactOrganization extends js.Object {
  /** The department the contract works for. */
  var department: js.UndefOr[String] = js.undefined
  /** The name of the organization. */
  var name: js.UndefOr[String] = js.undefined
  /** Set to true if this ContactOrganization contains the user's preferred value. */
  var pref: js.UndefOr[Boolean] = js.undefined
  /** The contact's title at the organization. */
  var title: js.UndefOr[String] = js.undefined
  /** A string that indicates what type of field this is, home for example. */
  var `type`: js.UndefOr[String] = js.undefined
}

object ContactOrganization {
  @scala.inline
  def apply(
    department: String = null,
    name: String = null,
    pref: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    `type`: String = null
  ): ContactOrganization = {
    val __obj = js.Dynamic.literal()
    if (department != null) __obj.updateDynamic("department")(department.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(pref)) __obj.updateDynamic("pref")(pref.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactOrganization]
  }
}

