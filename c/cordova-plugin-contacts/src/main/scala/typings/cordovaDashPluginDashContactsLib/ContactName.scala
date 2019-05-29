package typings
package cordovaDashPluginDashContactsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains different kinds of information about a Contact object's name. */
trait ContactName extends js.Object {
  /** The contact's family name. */
  var familyName: js.UndefOr[java.lang.String] = js.undefined
  /** The complete name of the contact. */
  var formatted: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's given name. */
  var givenName: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's prefix (example Mr. or Dr.) */
  var honorificPrefix: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's suffix (example Esq.). */
  var honorificSuffix: js.UndefOr[java.lang.String] = js.undefined
  /** The contact's middle name. */
  var middleName: js.UndefOr[java.lang.String] = js.undefined
}

@JSGlobal("ContactName")
@js.native
class ContactNameCls protected () extends ContactName {
  /** Constructor for ContactName object */
  def this(formatted: js.UndefOr[java.lang.String], familyName: js.UndefOr[java.lang.String], givenName: js.UndefOr[java.lang.String], middleName: js.UndefOr[java.lang.String], honorificPrefix: js.UndefOr[java.lang.String], honorificSuffix: js.UndefOr[java.lang.String]) = this()
}

@JSGlobal("ContactName")
@js.native
object ContactName
  extends /** Constructor for ContactName object */
org.scalablytyped.runtime.Instantiable6[
      js.UndefOr[/* formatted */ java.lang.String], 
      js.UndefOr[/* familyName */ java.lang.String], 
      js.UndefOr[/* givenName */ java.lang.String], 
      js.UndefOr[/* middleName */ java.lang.String], 
      js.UndefOr[/* honorificPrefix */ java.lang.String], 
      js.UndefOr[/* honorificSuffix */ java.lang.String], 
      ContactName
    ]

