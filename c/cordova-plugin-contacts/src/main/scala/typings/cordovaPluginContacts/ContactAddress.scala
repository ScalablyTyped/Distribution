package typings.cordovaPluginContacts

import org.scalablytyped.runtime.Instantiable8
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

@JSGlobal("ContactAddress")
@js.native
object ContactAddress
  extends /** Constructor of ContactAddress object */
Instantiable8[
      js.UndefOr[/* pref */ Boolean], 
      js.UndefOr[/* type */ String], 
      js.UndefOr[/* formatted */ String], 
      js.UndefOr[/* streetAddress */ String], 
      js.UndefOr[/* locality */ String], 
      js.UndefOr[/* region */ String], 
      js.UndefOr[/* postalCode */ String], 
      js.UndefOr[/* country */ String], 
      ContactAddress
    ]

