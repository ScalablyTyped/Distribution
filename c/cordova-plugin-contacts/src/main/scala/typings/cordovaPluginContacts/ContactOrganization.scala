package typings.cordovaPluginContacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ContactOrganization object stores a contact's organization properties. A Contact object stores
  * one or more ContactOrganization objects in an array.
  */
trait ContactOrganization extends StObject {
  
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
object ContactOrganization {
  
  @scala.inline
  def apply(): ContactOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactOrganization]
  }
  
  @scala.inline
  implicit class ContactOrganizationMutableBuilder[Self <: ContactOrganization] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepartment(value: String): Self = StObject.set(x, "department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepartmentUndefined: Self = StObject.set(x, "department", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPref(value: Boolean): Self = StObject.set(x, "pref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefUndefined: Self = StObject.set(x, "pref", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
