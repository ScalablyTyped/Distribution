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
/** Constructor for ContactFindOptions object */
class ContactFindOptionsCls () extends ContactFindOptions {
  def this(filter: java.lang.String) = this()
  def this(filter: java.lang.String, multiple: scala.Boolean) = this()
  def this(filter: java.lang.String, multiple: scala.Boolean, desiredFields: js.Array[ContactFieldType]) = this()
}

@JSGlobal("ContactFindOptions")
@js.native
object ContactFindOptions
  extends /** Constructor for ContactFindOptions object */
org.scalablytyped.runtime.Instantiable0[ContactFindOptions]
     with org.scalablytyped.runtime.Instantiable1[/* filter */ java.lang.String, ContactFindOptions]
     with org.scalablytyped.runtime.Instantiable2[/* filter */ java.lang.String, /* multiple */ scala.Boolean, ContactFindOptions]
     with org.scalablytyped.runtime.Instantiable3[
      /* filter */ java.lang.String, 
      /* multiple */ scala.Boolean, 
      /* desiredFields */ js.Array[ContactFieldType], 
      ContactFindOptions
    ]

