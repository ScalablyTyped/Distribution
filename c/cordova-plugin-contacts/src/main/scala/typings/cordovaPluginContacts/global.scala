package typings.cordovaPluginContacts

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable14
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.Instantiable6
import org.scalablytyped.runtime.Instantiable8
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Contact protected ()
    extends typings.cordovaPluginContacts.Contact {
    /** Constructor of Contact object */
    def this(
      id: js.UndefOr[String],
      displayName: js.UndefOr[String],
      name: js.UndefOr[typings.cordovaPluginContacts.ContactName],
      nickname: js.UndefOr[String],
      phoneNumbers: js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactField]],
      emails: js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactField]],
      addresses: js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactAddress]],
      ims: js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactField]],
      organizations: js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactOrganization]],
      birthday: js.UndefOr[Date],
      note: js.UndefOr[String],
      photos: js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactField]],
      categories: js.UndefOr[typings.cordovaPluginContacts.ContactField],
      urls: js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactField]]
    ) = this()
  }
  
  @js.native
  class ContactAddress protected ()
    extends typings.cordovaPluginContacts.ContactAddress {
    /** Constructor of ContactAddress object */
    def this(
      pref: js.UndefOr[Boolean],
      `type`: js.UndefOr[String],
      formatted: js.UndefOr[String],
      streetAddress: js.UndefOr[String],
      locality: js.UndefOr[String],
      region: js.UndefOr[String],
      postalCode: js.UndefOr[String],
      country: js.UndefOr[String]
    ) = this()
  }
  
  @js.native
  class ContactError protected ()
    extends typings.cordovaPluginContacts.ContactError {
    def this(code: Double) = this()
  }
  
  @js.native
  /** Constructor for ContactField object */
  class ContactField ()
    extends typings.cordovaPluginContacts.ContactField {
    def this(`type`: String) = this()
    def this(`type`: js.UndefOr[scala.Nothing], value: String) = this()
    def this(`type`: String, value: String) = this()
    def this(`type`: js.UndefOr[scala.Nothing], value: js.UndefOr[scala.Nothing], pref: Boolean) = this()
    def this(`type`: js.UndefOr[scala.Nothing], value: String, pref: Boolean) = this()
    def this(`type`: String, value: js.UndefOr[scala.Nothing], pref: Boolean) = this()
    def this(`type`: String, value: String, pref: Boolean) = this()
  }
  
  @js.native
  /** Constructor for ContactFindOptions object */
  class ContactFindOptions ()
    extends typings.cordovaPluginContacts.ContactFindOptions {
    def this(filter: String) = this()
    def this(filter: js.UndefOr[scala.Nothing], multiple: Boolean) = this()
    def this(filter: String, multiple: Boolean) = this()
    def this(
      filter: js.UndefOr[scala.Nothing],
      multiple: js.UndefOr[scala.Nothing],
      desiredFields: js.Array[ContactFieldType]
    ) = this()
    def this(filter: js.UndefOr[scala.Nothing], multiple: Boolean, desiredFields: js.Array[ContactFieldType]) = this()
    def this(filter: String, multiple: js.UndefOr[scala.Nothing], desiredFields: js.Array[ContactFieldType]) = this()
    def this(filter: String, multiple: Boolean, desiredFields: js.Array[ContactFieldType]) = this()
  }
  
  @js.native
  class ContactName protected ()
    extends typings.cordovaPluginContacts.ContactName {
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
  
  @js.native
  /** Constructor for ContactOrganization object */
  class ContactOrganization ()
    extends typings.cordovaPluginContacts.ContactOrganization {
    def this(pref: Boolean) = this()
    def this(pref: js.UndefOr[scala.Nothing], `type`: String) = this()
    def this(pref: Boolean, `type`: String) = this()
    def this(pref: js.UndefOr[scala.Nothing], `type`: js.UndefOr[scala.Nothing], name: String) = this()
    def this(pref: js.UndefOr[scala.Nothing], `type`: String, name: String) = this()
    def this(pref: Boolean, `type`: js.UndefOr[scala.Nothing], name: String) = this()
    def this(pref: Boolean, `type`: String, name: String) = this()
    def this(
      pref: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      department: String
    ) = this()
    def this(
      pref: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: String,
      department: String
    ) = this()
    def this(
      pref: js.UndefOr[scala.Nothing],
      `type`: String,
      name: js.UndefOr[scala.Nothing],
      department: String
    ) = this()
    def this(pref: js.UndefOr[scala.Nothing], `type`: String, name: String, department: String) = this()
    def this(
      pref: Boolean,
      `type`: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      department: String
    ) = this()
    def this(pref: Boolean, `type`: js.UndefOr[scala.Nothing], name: String, department: String) = this()
    def this(pref: Boolean, `type`: String, name: js.UndefOr[scala.Nothing], department: String) = this()
    def this(pref: Boolean, `type`: String, name: String, department: String) = this()
    def this(
      pref: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      department: js.UndefOr[scala.Nothing],
      title: String
    ) = this()
    def this(
      pref: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      department: String,
      title: String
    ) = this()
    def this(
      pref: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: String,
      department: js.UndefOr[scala.Nothing],
      title: String
    ) = this()
    def this(
      pref: js.UndefOr[scala.Nothing],
      `type`: js.UndefOr[scala.Nothing],
      name: String,
      department: String,
      title: String
    ) = this()
    def this(
      pref: js.UndefOr[scala.Nothing],
      `type`: String,
      name: js.UndefOr[scala.Nothing],
      department: js.UndefOr[scala.Nothing],
      title: String
    ) = this()
    def this(
      pref: js.UndefOr[scala.Nothing],
      `type`: String,
      name: js.UndefOr[scala.Nothing],
      department: String,
      title: String
    ) = this()
    def this(
      pref: js.UndefOr[scala.Nothing],
      `type`: String,
      name: String,
      department: js.UndefOr[scala.Nothing],
      title: String
    ) = this()
    def this(pref: js.UndefOr[scala.Nothing], `type`: String, name: String, department: String, title: String) = this()
    def this(
      pref: Boolean,
      `type`: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      department: js.UndefOr[scala.Nothing],
      title: String
    ) = this()
    def this(
      pref: Boolean,
      `type`: js.UndefOr[scala.Nothing],
      name: js.UndefOr[scala.Nothing],
      department: String,
      title: String
    ) = this()
    def this(
      pref: Boolean,
      `type`: js.UndefOr[scala.Nothing],
      name: String,
      department: js.UndefOr[scala.Nothing],
      title: String
    ) = this()
    def this(pref: Boolean, `type`: js.UndefOr[scala.Nothing], name: String, department: String, title: String) = this()
    def this(
      pref: Boolean,
      `type`: String,
      name: js.UndefOr[scala.Nothing],
      department: js.UndefOr[scala.Nothing],
      title: String
    ) = this()
    def this(pref: Boolean, `type`: String, name: js.UndefOr[scala.Nothing], department: String, title: String) = this()
    def this(pref: Boolean, `type`: String, name: String, department: js.UndefOr[scala.Nothing], title: String) = this()
    def this(pref: Boolean, `type`: String, name: String, department: String, title: String) = this()
  }
  
  @js.native
  object Contact
    extends /** Constructor of Contact object */
  Instantiable14[
          /* id */ js.UndefOr[String], 
          /* displayName */ js.UndefOr[String], 
          /* name */ js.UndefOr[typings.cordovaPluginContacts.ContactName], 
          /* nickname */ js.UndefOr[String], 
          /* phoneNumbers */ js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactField]], 
          /* emails */ js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactField]], 
          /* addresses */ js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactAddress]], 
          /* ims */ js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactField]], 
          /* organizations */ js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactOrganization]], 
          /* birthday */ js.UndefOr[Date], 
          /* note */ js.UndefOr[String], 
          /* photos */ js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactField]], 
          /* categories */ js.UndefOr[typings.cordovaPluginContacts.ContactField], 
          /* urls */ js.UndefOr[js.Array[typings.cordovaPluginContacts.ContactField]], 
          typings.cordovaPluginContacts.Contact
        ]
  
  @js.native
  object ContactAddress
    extends /** Constructor of ContactAddress object */
  Instantiable8[
          /* pref */ js.UndefOr[Boolean], 
          /* type */ js.UndefOr[String], 
          /* formatted */ js.UndefOr[String], 
          /* streetAddress */ js.UndefOr[String], 
          /* locality */ js.UndefOr[String], 
          /* region */ js.UndefOr[String], 
          /* postalCode */ js.UndefOr[String], 
          /* country */ js.UndefOr[String], 
          typings.cordovaPluginContacts.ContactAddress
        ]
  
  @js.native
  object ContactError
    extends Instantiable1[/* code */ Double, typings.cordovaPluginContacts.ContactError] {
    var INVALID_ARGUMENT_ERROR: Double = js.native
    var IO_ERROR: Double = js.native
    var NOT_SUPPORTED_ERROR: Double = js.native
    var PENDING_OPERATION_ERROR: Double = js.native
    var PERMISSION_DENIED_ERROR: Double = js.native
    var TIMEOUT_ERROR: Double = js.native
    var UNKNOWN_ERROR: Double = js.native
  }
  
  @js.native
  object ContactField
    extends /** Constructor for ContactField object */
  Instantiable0[typings.cordovaPluginContacts.ContactField]
       with Instantiable1[/* type */ String, typings.cordovaPluginContacts.ContactField]
       with Instantiable2[
          js.UndefOr[/* type */ String], 
          /* value */ String, 
          typings.cordovaPluginContacts.ContactField
        ]
       with Instantiable3[
          js.UndefOr[/* type */ String], 
          js.UndefOr[/* value */ String], 
          /* pref */ Boolean, 
          typings.cordovaPluginContacts.ContactField
        ]
  
  @js.native
  object ContactFindOptions
    extends /** Constructor for ContactFindOptions object */
  Instantiable0[typings.cordovaPluginContacts.ContactFindOptions]
       with Instantiable1[/* filter */ String, typings.cordovaPluginContacts.ContactFindOptions]
       with Instantiable2[
          js.UndefOr[/* filter */ String], 
          /* multiple */ Boolean, 
          typings.cordovaPluginContacts.ContactFindOptions
        ]
       with Instantiable3[
          js.UndefOr[/* filter */ String], 
          js.UndefOr[/* multiple */ Boolean], 
          /* desiredFields */ js.Array[ContactFieldType], 
          typings.cordovaPluginContacts.ContactFindOptions
        ]
  
  @js.native
  object ContactName
    extends /** Constructor for ContactName object */
  Instantiable6[
          /* formatted */ js.UndefOr[String], 
          /* familyName */ js.UndefOr[String], 
          /* givenName */ js.UndefOr[String], 
          /* middleName */ js.UndefOr[String], 
          /* honorificPrefix */ js.UndefOr[String], 
          /* honorificSuffix */ js.UndefOr[String], 
          typings.cordovaPluginContacts.ContactName
        ]
  
  @js.native
  object ContactOrganization
    extends /** Constructor for ContactOrganization object */
  Instantiable0[typings.cordovaPluginContacts.ContactOrganization]
       with Instantiable1[/* pref */ Boolean, typings.cordovaPluginContacts.ContactOrganization]
       with Instantiable2[
          js.UndefOr[/* pref */ Boolean], 
          /* type */ String, 
          typings.cordovaPluginContacts.ContactOrganization
        ]
       with Instantiable3[
          js.UndefOr[/* pref */ Boolean], 
          js.UndefOr[/* type */ String], 
          /* name */ String, 
          typings.cordovaPluginContacts.ContactOrganization
        ]
       with Instantiable4[
          js.UndefOr[/* pref */ Boolean], 
          js.UndefOr[/* type */ String], 
          js.UndefOr[/* name */ String], 
          /* department */ String, 
          typings.cordovaPluginContacts.ContactOrganization
        ]
       with Instantiable5[
          js.UndefOr[/* pref */ Boolean], 
          js.UndefOr[/* type */ String], 
          js.UndefOr[/* name */ String], 
          js.UndefOr[/* department */ String], 
          /* title */ String, 
          typings.cordovaPluginContacts.ContactOrganization
        ]
  
}

