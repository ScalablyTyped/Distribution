package typings.cordovaDashPluginDashContacts

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
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

@JSGlobal("ContactOrganization")
@js.native
object ContactOrganization
  extends /** Constructor for ContactOrganization object */
Instantiable0[ContactOrganization]
     with Instantiable1[/* pref */ Boolean, ContactOrganization]
     with Instantiable2[/* pref */ Boolean, /* type */ String, ContactOrganization]
     with Instantiable3[/* pref */ Boolean, /* type */ String, /* name */ String, ContactOrganization]
     with Instantiable4[
      /* pref */ Boolean, 
      /* type */ String, 
      /* name */ String, 
      /* department */ String, 
      ContactOrganization
    ]
     with Instantiable5[
      /* pref */ Boolean, 
      /* type */ String, 
      /* name */ String, 
      /* department */ String, 
      /* title */ String, 
      ContactOrganization
    ]

