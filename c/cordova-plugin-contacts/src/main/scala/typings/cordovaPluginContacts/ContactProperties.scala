package typings.cordovaPluginContacts

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactProperties extends StObject {
  
  /** An array of all the contact's addresses. */
  var addresses: js.UndefOr[js.Array[ContactAddress]] = js.undefined
  
  /** The birthday of the contact. */
  var birthday: js.UndefOr[Date] = js.undefined
  
  /** An array of all the user-defined categories associated with the contact. */
  var categories: js.UndefOr[js.Array[ContactField]] = js.undefined
  
  /** The name of this Contact, suitable for display to end users. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** An array of all the contact's email addresses. */
  var emails: js.UndefOr[js.Array[ContactField]] = js.undefined
  
  /** A globally unique identifier. */
  var id: js.UndefOr[String] = js.undefined
  
  /** An array of all the contact's IM addresses. */
  var ims: js.UndefOr[js.Array[ContactField]] = js.undefined
  
  /** An object containing all components of a persons name. */
  var name: js.UndefOr[ContactName] = js.undefined
  
  /** A casual name by which to address the contact. */
  var nickname: js.UndefOr[String] = js.undefined
  
  /** A note about the contact. */
  var note: js.UndefOr[String] = js.undefined
  
  /** An array of all the contact's organizations. */
  var organizations: js.UndefOr[js.Array[ContactOrganization]] = js.undefined
  
  /** An array of all the contact's phone numbers. */
  var phoneNumbers: js.UndefOr[js.Array[ContactField]] = js.undefined
  
  /** An array of the contact's photos. */
  var photos: js.UndefOr[js.Array[ContactField]] = js.undefined
  
  /** An array of web pages associated with the contact. */
  var urls: js.UndefOr[js.Array[ContactField]] = js.undefined
}
object ContactProperties {
  
  @scala.inline
  def apply(): ContactProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactProperties]
  }
  
  @scala.inline
  implicit class ContactPropertiesMutableBuilder[Self <: ContactProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddresses(value: js.Array[ContactAddress]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    @scala.inline
    def setAddressesVarargs(value: ContactAddress*): Self = StObject.set(x, "addresses", js.Array(value :_*))
    
    @scala.inline
    def setBirthday(value: Date): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
    @scala.inline
    def setCategories(value: js.Array[ContactField]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: ContactField*): Self = StObject.set(x, "categories", js.Array(value :_*))
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmails(value: js.Array[ContactField]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: ContactField*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setIms(value: js.Array[ContactField]): Self = StObject.set(x, "ims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImsUndefined: Self = StObject.set(x, "ims", js.undefined)
    
    @scala.inline
    def setImsVarargs(value: ContactField*): Self = StObject.set(x, "ims", js.Array(value :_*))
    
    @scala.inline
    def setName(value: ContactName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setOrganizations(value: js.Array[ContactOrganization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    @scala.inline
    def setOrganizationsVarargs(value: ContactOrganization*): Self = StObject.set(x, "organizations", js.Array(value :_*))
    
    @scala.inline
    def setPhoneNumbers(value: js.Array[ContactField]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    @scala.inline
    def setPhoneNumbersVarargs(value: ContactField*): Self = StObject.set(x, "phoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setPhotos(value: js.Array[ContactField]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    @scala.inline
    def setPhotosVarargs(value: ContactField*): Self = StObject.set(x, "photos", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: js.Array[ContactField]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: ContactField*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
