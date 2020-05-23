package typings.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ContactAddress object stores the properties of a single address of a contact.
  * A Contact object may include more than one address in a ContactAddress[] array.
  */
trait ContactAddress extends js.Object {
  /** The country name. */
  var country: js.UndefOr[String] = js.undefined
  /** The full address formatted for display. */
  var formatted: js.UndefOr[String] = js.undefined
  /** The city or locality. */
  var locality: js.UndefOr[String] = js.undefined
  /** The zip code or postal code. */
  var postalCode: js.UndefOr[String] = js.undefined
  /** Set to true if this ContactAddress contains the user's preferred value. */
  var pref: js.UndefOr[Boolean] = js.undefined
  /** The state or region. */
  var region: js.UndefOr[String] = js.undefined
  /** The full street address. */
  var streetAddress: js.UndefOr[String] = js.undefined
  /** A string indicating what type of field this is, home for example. */
  var `type`: js.UndefOr[String] = js.undefined
}

object ContactAddress {
  @scala.inline
  def apply(
    country: String = null,
    formatted: String = null,
    locality: String = null,
    postalCode: String = null,
    pref: js.UndefOr[Boolean] = js.undefined,
    region: String = null,
    streetAddress: String = null,
    `type`: String = null
  ): ContactAddress = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (formatted != null) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (!js.isUndefined(pref)) __obj.updateDynamic("pref")(pref.get.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactAddress]
  }
}

