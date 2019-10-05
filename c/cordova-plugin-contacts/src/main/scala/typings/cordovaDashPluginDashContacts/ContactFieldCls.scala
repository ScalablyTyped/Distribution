package typings.cordovaDashPluginDashContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

