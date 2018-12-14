package typings
package cordovaDashPluginDashContactsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * The ContactAddress object stores the properties of a single address of a contact.
 * A Contact object may include more than one address in a ContactAddress[] array.
 */

trait ContactAddress extends js.Object {
  /** The country name. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** The full address formatted for display. */
  var formatted: js.UndefOr[java.lang.String] = js.undefined
  /** The city or locality. */
  var locality: js.UndefOr[java.lang.String] = js.undefined
  /** The zip code or postal code. */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /** Set to true if this ContactAddress contains the user's preferred value. */
  var pref: js.UndefOr[scala.Boolean] = js.undefined
  /** The state or region. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** The full street address. */
  var streetAddress: js.UndefOr[java.lang.String] = js.undefined
  /** A string indicating what type of field this is, home for example. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

@JSGlobal("ContactAddress")
@js.native
object ContactAddress
  extends /** Constructor of ContactAddress object */
org.scalablytyped.runtime.Instantiable8[
      /* pref */ js.UndefOr[/* pref */ scala.Boolean], 
      /* type */ js.UndefOr[/* type */ java.lang.String], 
      /* formatted */ js.UndefOr[/* formatted */ java.lang.String], 
      /* streetAddress */ js.UndefOr[/* streetAddress */ java.lang.String], 
      /* locality */ js.UndefOr[/* locality */ java.lang.String], 
      /* region */ js.UndefOr[/* region */ java.lang.String], 
      /* postalCode */ js.UndefOr[/* postalCode */ java.lang.String], 
      /* country */ js.UndefOr[/* country */ java.lang.String], 
      ContactAddress
    ]

