package typings.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ContactOrganization object stores a contact's organization properties. A Contact object stores
  * one or more ContactOrganization objects in an array.
  */
@js.native
trait ContactOrganization extends js.Object {
  
  /** The department the contract works for. */
  var department: js.UndefOr[String] = js.native
  
  /** The name of the organization. */
  var name: js.UndefOr[String] = js.native
  
  /** Set to true if this ContactOrganization contains the user's preferred value. */
  var pref: js.UndefOr[Boolean] = js.native
  
  /** The contact's title at the organization. */
  var title: js.UndefOr[String] = js.native
  
  /** A string that indicates what type of field this is, home for example. */
  var `type`: js.UndefOr[String] = js.native
}
object ContactOrganization {
  
  @scala.inline
  def apply(): ContactOrganization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactOrganization]
  }
  
  @scala.inline
  implicit class ContactOrganizationOps[Self <: ContactOrganization] (val x: Self) extends AnyVal {
    
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
    def setDepartment(value: String): Self = this.set("department", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepartment: Self = this.set("department", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPref(value: Boolean): Self = this.set("pref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePref: Self = this.set("pref", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
