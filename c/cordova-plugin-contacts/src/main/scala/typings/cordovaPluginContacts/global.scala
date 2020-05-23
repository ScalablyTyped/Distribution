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
import typings.std.Error
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
    /**
      * Removes the contact from the device contacts database, otherwise executes an error callback with a ContactError object.
      * @param onSuccess Success callback function invoked on success operation.
      * @param onError Error callback function, invoked when an error occurs.
      */
    /* CompleteClass */
    override def remove(onSuccess: js.Function0[Unit], onError: js.Function1[/* error */ Error, Unit]): Unit = js.native
    /**
      * Saves a new contact to the device contacts database, or updates an existing contact if a contact with the same id already exists.
      * @param onSuccess Success callback function invoked on success operation with che Contact object.
      * @param onError Error callback function, invoked when an error occurs.
      */
    /* CompleteClass */
    override def save(
      onSuccess: js.Function1[/* contact */ this.type, Unit],
      onError: js.Function1[/* error */ Error, Unit]
    ): Unit = js.native
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
    /** Error code */
    /* CompleteClass */
    override var code: Double = js.native
    /** Error message */
    /* CompleteClass */
    override var message: String = js.native
  }
  
  @js.native
  /** Constructor for ContactField object */
  class ContactField ()
    extends typings.cordovaPluginContacts.ContactField {
    def this(`type`: String) = this()
    def this(`type`: String, value: String) = this()
    def this(`type`: String, value: String, pref: Boolean) = this()
    /** Set to true if this ContactField contains the user's preferred value. */
    /* CompleteClass */
    override var pref: Boolean = js.native
    /** A string that indicates what type of field this is, home for example. */
    /* CompleteClass */
    override var `type`: String = js.native
    /** The value of the field, such as a phone number or email address. */
    /* CompleteClass */
    override var value: String = js.native
  }
  
  @js.native
  /** Constructor for ContactFindOptions object */
  class ContactFindOptions ()
    extends typings.cordovaPluginContacts.ContactFindOptions {
    def this(filter: String) = this()
    def this(filter: String, multiple: Boolean) = this()
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
    def this(pref: Boolean, `type`: String) = this()
    def this(pref: Boolean, `type`: String, name: String) = this()
    def this(pref: Boolean, `type`: String, name: String, department: String) = this()
    def this(pref: Boolean, `type`: String, name: String, department: String, title: String) = this()
  }
  
  @js.native
  object Contact
    extends /** Constructor of Contact object */
  Instantiable14[
          js.UndefOr[/* id */ String], 
          js.UndefOr[/* displayName */ String], 
          js.UndefOr[/* name */ typings.cordovaPluginContacts.ContactName], 
          js.UndefOr[/* nickname */ String], 
          js.UndefOr[/* phoneNumbers */ js.Array[typings.cordovaPluginContacts.ContactField]], 
          js.UndefOr[/* emails */ js.Array[typings.cordovaPluginContacts.ContactField]], 
          js.UndefOr[/* addresses */ js.Array[typings.cordovaPluginContacts.ContactAddress]], 
          js.UndefOr[/* ims */ js.Array[typings.cordovaPluginContacts.ContactField]], 
          js.UndefOr[/* organizations */ js.Array[typings.cordovaPluginContacts.ContactOrganization]], 
          js.UndefOr[/* birthday */ Date], 
          js.UndefOr[/* note */ String], 
          js.UndefOr[/* photos */ js.Array[typings.cordovaPluginContacts.ContactField]], 
          js.UndefOr[/* categories */ typings.cordovaPluginContacts.ContactField], 
          js.UndefOr[/* urls */ js.Array[typings.cordovaPluginContacts.ContactField]], 
          typings.cordovaPluginContacts.Contact
        ]
  
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
       with Instantiable2[/* type */ String, /* value */ String, typings.cordovaPluginContacts.ContactField]
       with Instantiable3[
          /* type */ String, 
          /* value */ String, 
          /* pref */ Boolean, 
          typings.cordovaPluginContacts.ContactField
        ]
  
  @js.native
  object ContactFindOptions
    extends /** Constructor for ContactFindOptions object */
  Instantiable0[typings.cordovaPluginContacts.ContactFindOptions]
       with Instantiable1[/* filter */ String, typings.cordovaPluginContacts.ContactFindOptions]
       with Instantiable2[
          /* filter */ String, 
          /* multiple */ Boolean, 
          typings.cordovaPluginContacts.ContactFindOptions
        ]
       with Instantiable3[
          /* filter */ String, 
          /* multiple */ Boolean, 
          /* desiredFields */ js.Array[ContactFieldType], 
          typings.cordovaPluginContacts.ContactFindOptions
        ]
  
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
          typings.cordovaPluginContacts.ContactName
        ]
  
  @js.native
  object ContactOrganization
    extends /** Constructor for ContactOrganization object */
  Instantiable0[typings.cordovaPluginContacts.ContactOrganization]
       with Instantiable1[/* pref */ Boolean, typings.cordovaPluginContacts.ContactOrganization]
       with Instantiable2[
          /* pref */ Boolean, 
          /* type */ String, 
          typings.cordovaPluginContacts.ContactOrganization
        ]
       with Instantiable3[
          /* pref */ Boolean, 
          /* type */ String, 
          /* name */ String, 
          typings.cordovaPluginContacts.ContactOrganization
        ]
       with Instantiable4[
          /* pref */ Boolean, 
          /* type */ String, 
          /* name */ String, 
          /* department */ String, 
          typings.cordovaPluginContacts.ContactOrganization
        ]
       with Instantiable5[
          /* pref */ Boolean, 
          /* type */ String, 
          /* name */ String, 
          /* department */ String, 
          /* title */ String, 
          typings.cordovaPluginContacts.ContactOrganization
        ]
  
}

