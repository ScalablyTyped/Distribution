package typings
package cordovaDashPluginDashContactsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Search options to filter navigator.contacts.  */

trait ContactFindOptions extends js.Object {
  /* Contact fields to be returned back. If specified, the resulting Contact object only features values for these fields. */
  var desiredFields: js.UndefOr[js.Array[ContactFieldType]] = js.undefined
  /** The search string used to find navigator.contacts. */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** Determines if the find operation returns multiple navigator.contacts. */
  var multiple: js.UndefOr[scala.Boolean] = js.undefined
}

@JSGlobal("ContactFindOptions")
@js.native
object ContactFindOptions
  extends /** Constructor for ContactFindOptions object */
ScalablyTyped.runtime.Instantiable0[ContactFindOptions]
     with /** Constructor for ContactFindOptions object */
ScalablyTyped.runtime.Instantiable1[/* filter */ java.lang.String, ContactFindOptions]
     with /** Constructor for ContactFindOptions object */
ScalablyTyped.runtime.Instantiable2[/* filter */ java.lang.String, /* multiple */ scala.Boolean, ContactFindOptions]
     with /** Constructor for ContactFindOptions object */
ScalablyTyped.runtime.Instantiable3[
      /* filter */ java.lang.String, 
      /* multiple */ scala.Boolean, 
      /* desiredFields */ js.Array[ContactFieldType], 
      ContactFindOptions
    ]

