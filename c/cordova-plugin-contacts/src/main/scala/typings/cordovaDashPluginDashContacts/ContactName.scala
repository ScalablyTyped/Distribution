package typings.cordovaDashPluginDashContacts

import org.scalablytyped.runtime.Instantiable6
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

@JSGlobal("ContactName")
@js.native
class ContactNameCls protected () extends ContactName {
  /** Constructor for ContactName object */
  def this(
    formatted: js.UndefOr[String],
    familyName: js.UndefOr[String],
    givenName: js.UndefOr[String],
    middleName: js.UndefOr[String],
    honorificPrefix: js.UndefOr[String],
    honorificSuffix: js.UndefOr[String]
  ) = this()
}

@JSGlobal("ContactName")
@js.native
object ContactName
  extends /** Constructor for ContactName object */
Instantiable6[
      js.UndefOr[/* formatted */ String], 
      js.UndefOr[/* familyName */ String], 
      js.UndefOr[/* givenName */ String], 
      js.UndefOr[/* middleName */ String], 
      js.UndefOr[/* honorificPrefix */ String], 
      js.UndefOr[/* honorificSuffix */ String], 
      ContactName
    ]

