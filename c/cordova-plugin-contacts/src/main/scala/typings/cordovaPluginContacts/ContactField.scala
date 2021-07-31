package typings.cordovaPluginContacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait ContactField extends StObject {
  
  /** Set to true if this ContactField contains the user's preferred value. */
  var pref: Boolean
  
  /** A string that indicates what type of field this is, home for example. */
  var `type`: String
  
  /** The value of the field, such as a phone number or email address. */
  var value: String
}
object ContactField {
  
  @scala.inline
  def apply(pref: Boolean, `type`: String, value: String): ContactField = {
    val __obj = js.Dynamic.literal(pref = pref.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactField]
  }
  
  @scala.inline
  implicit class ContactFieldMutableBuilder[Self <: ContactField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPref(value: Boolean): Self = StObject.set(x, "pref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
