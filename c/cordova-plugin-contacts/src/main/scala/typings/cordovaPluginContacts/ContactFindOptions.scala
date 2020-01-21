package typings.cordovaPluginContacts

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Search options to filter navigator.contacts.  */
trait ContactFindOptions extends js.Object {
  /* Contact fields to be returned back. If specified, the resulting Contact object only features values for these fields. */
  var desiredFields: js.UndefOr[js.Array[ContactFieldType]] = js.undefined
  /** The search string used to find navigator.contacts. */
  var filter: js.UndefOr[String] = js.undefined
  /** Determines if the find operation returns multiple navigator.contacts. */
  var multiple: js.UndefOr[Boolean] = js.undefined
}

@JSGlobal("ContactFindOptions")
@js.native
object ContactFindOptions
  extends /** Constructor for ContactFindOptions object */
Instantiable0[ContactFindOptions]
     with Instantiable1[/* filter */ String, ContactFindOptions]
     with Instantiable2[/* filter */ String, /* multiple */ Boolean, ContactFindOptions]
     with Instantiable3[
      /* filter */ String, 
      /* multiple */ Boolean, 
      /* desiredFields */ js.Array[ContactFieldType], 
      ContactFindOptions
    ]

