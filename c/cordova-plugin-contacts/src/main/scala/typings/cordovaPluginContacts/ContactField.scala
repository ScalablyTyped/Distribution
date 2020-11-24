package typings.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait ContactField extends js.Object {
  
  /** Set to true if this ContactField contains the user's preferred value. */
  var pref: Boolean = js.native
  
  /** A string that indicates what type of field this is, home for example. */
  var `type`: String = js.native
  
  /** The value of the field, such as a phone number or email address. */
  var value: String = js.native
}
object ContactField {
  
  @scala.inline
  def apply(pref: Boolean, `type`: String, value: String): ContactField = {
    val __obj = js.Dynamic.literal(pref = pref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactField]
  }
  
  @scala.inline
  implicit class ContactFieldOps[Self <: ContactField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPref(value: Boolean): Self = this.set("pref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
