package typings
package cordovaDashPluginDashContactsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ContactOrganization object stores a contact's organization properties. A Contact object stores
  * one or more ContactOrganization objects in an array.
  */
trait ContactOrganization extends js.Object {
  /** The department the contract works for. */
  var department: js.UndefOr[java.lang.String] = js.undefined
  /** The name of the organization. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Set to true if this ContactOrganization contains the user's preferred value. */
  var pref: js.UndefOr[scala.Boolean] = js.undefined
  /** The contact's title at the organization. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** A string that indicates what type of field this is, home for example. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

@JSGlobal("ContactOrganization")
@js.native
object ContactOrganization
  extends /** Constructor for ContactOrganization object */
org.scalablytyped.runtime.Instantiable0[ContactOrganization]
     with org.scalablytyped.runtime.Instantiable1[/* pref */ scala.Boolean, ContactOrganization]
     with org.scalablytyped.runtime.Instantiable2[/* pref */ scala.Boolean, /* type */ java.lang.String, ContactOrganization]
     with org.scalablytyped.runtime.Instantiable3[
      /* pref */ scala.Boolean, 
      /* type */ java.lang.String, 
      /* name */ java.lang.String, 
      ContactOrganization
    ]
     with org.scalablytyped.runtime.Instantiable4[
      /* pref */ scala.Boolean, 
      /* type */ java.lang.String, 
      /* name */ java.lang.String, 
      /* department */ java.lang.String, 
      ContactOrganization
    ]
     with org.scalablytyped.runtime.Instantiable5[
      /* pref */ scala.Boolean, 
      /* type */ java.lang.String, 
      /* name */ java.lang.String, 
      /* department */ java.lang.String, 
      /* title */ java.lang.String, 
      ContactOrganization
    ]

