package typings.cordovaDashPluginDashContacts

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The ContactField object is a reusable component that represents contact fields generically.
  * Each ContactField object contains a value, type, and pref property. A Contact object stores
  * several properties in ContactField[] arrays, such as phone numbers and email addresses.
  *
  * In most instances, there are no pre-determined values for a ContactField object's type attribute.
  * For example, a phone number can specify type values of home, work, mobile, iPhone,
  * or any other value that is supported by a particular device platform's contact database.
  * However, for the Contact photos field, the type field indicates the format of the returned image:
  * url when the value attribute contains a URL to the photo image, or base64 when the value
  * contains a base64-encoded image string.
  */
trait ContactField extends js.Object {
  /** Set to true if this ContactField contains the user's preferred value. */
  var pref: Boolean
  /** A string that indicates what type of field this is, home for example. */
  var `type`: String
  /** The value of the field, such as a phone number or email address. */
  var value: String
}

@JSGlobal("ContactField")
@js.native
/** Constructor for ContactField object */
class ContactFieldCls () extends ContactField {
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

@JSGlobal("ContactField")
@js.native
object ContactField
  extends /** Constructor for ContactField object */
Instantiable0[ContactField]
     with Instantiable1[/* type */ String, ContactField]
     with Instantiable2[/* type */ String, /* value */ String, ContactField]
     with Instantiable3[/* type */ String, /* value */ String, /* pref */ Boolean, ContactField]

