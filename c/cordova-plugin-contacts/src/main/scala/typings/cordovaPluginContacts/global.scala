package typings.cordovaPluginContacts

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Contact")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactAddress")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactError")
  @js.native
  class ContactError protected ()
    extends typings.cordovaPluginContacts.ContactError {
    def this(code: Double) = this()
  }
  object ContactError {
    
    @JSGlobal("ContactError")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("ContactError.INVALID_ARGUMENT_ERROR")
    @js.native
    def INVALID_ARGUMENT_ERROR: Double = js.native
    @scala.inline
    def INVALID_ARGUMENT_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ARGUMENT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.IO_ERROR")
    @js.native
    def IO_ERROR: Double = js.native
    @scala.inline
    def IO_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IO_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.NOT_SUPPORTED_ERROR")
    @js.native
    def NOT_SUPPORTED_ERROR: Double = js.native
    @scala.inline
    def NOT_SUPPORTED_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_SUPPORTED_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.PENDING_OPERATION_ERROR")
    @js.native
    def PENDING_OPERATION_ERROR: Double = js.native
    @scala.inline
    def PENDING_OPERATION_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PENDING_OPERATION_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.PERMISSION_DENIED_ERROR")
    @js.native
    def PERMISSION_DENIED_ERROR: Double = js.native
    @scala.inline
    def PERMISSION_DENIED_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERMISSION_DENIED_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.TIMEOUT_ERROR")
    @js.native
    def TIMEOUT_ERROR: Double = js.native
    @scala.inline
    def TIMEOUT_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TIMEOUT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSGlobal("ContactError.UNKNOWN_ERROR")
    @js.native
    def UNKNOWN_ERROR: Double = js.native
    @scala.inline
    def UNKNOWN_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNKNOWN_ERROR")(x.asInstanceOf[js.Any])
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactField")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactFindOptions")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactName")
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
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("ContactOrganization")
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
}
