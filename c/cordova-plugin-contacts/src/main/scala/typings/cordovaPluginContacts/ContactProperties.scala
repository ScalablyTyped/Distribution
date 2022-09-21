package typings.cordovaPluginContacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactProperties extends StObject {
  
  /** An array of all the contact's addresses. */
  var addresses: js.UndefOr[js.Array[ContactAddress]] = js.undefined
  
  /** The birthday of the contact. */
  var birthday: js.UndefOr[js.Date] = js.undefined
  
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
  
  inline def apply(): ContactProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactProperties]
  }
  
  extension [Self <: ContactProperties](x: Self) {
    
    inline def setAddresses(value: js.Array[ContactAddress]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setAddressesUndefined: Self = StObject.set(x, "addresses", js.undefined)
    
    inline def setAddressesVarargs(value: ContactAddress*): Self = StObject.set(x, "addresses", js.Array(value*))
    
    inline def setBirthday(value: js.Date): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
    
    inline def setBirthdayUndefined: Self = StObject.set(x, "birthday", js.undefined)
    
    inline def setCategories(value: js.Array[ContactField]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: ContactField*): Self = StObject.set(x, "categories", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmails(value: js.Array[ContactField]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: ContactField*): Self = StObject.set(x, "emails", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIms(value: js.Array[ContactField]): Self = StObject.set(x, "ims", value.asInstanceOf[js.Any])
    
    inline def setImsUndefined: Self = StObject.set(x, "ims", js.undefined)
    
    inline def setImsVarargs(value: ContactField*): Self = StObject.set(x, "ims", js.Array(value*))
    
    inline def setName(value: ContactName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
    
    inline def setNicknameUndefined: Self = StObject.set(x, "nickname", js.undefined)
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    inline def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    inline def setOrganizations(value: js.Array[ContactOrganization]): Self = StObject.set(x, "organizations", value.asInstanceOf[js.Any])
    
    inline def setOrganizationsUndefined: Self = StObject.set(x, "organizations", js.undefined)
    
    inline def setOrganizationsVarargs(value: ContactOrganization*): Self = StObject.set(x, "organizations", js.Array(value*))
    
    inline def setPhoneNumbers(value: js.Array[ContactField]): Self = StObject.set(x, "phoneNumbers", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumbersUndefined: Self = StObject.set(x, "phoneNumbers", js.undefined)
    
    inline def setPhoneNumbersVarargs(value: ContactField*): Self = StObject.set(x, "phoneNumbers", js.Array(value*))
    
    inline def setPhotos(value: js.Array[ContactField]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setPhotosVarargs(value: ContactField*): Self = StObject.set(x, "photos", js.Array(value*))
    
    inline def setUrls(value: js.Array[ContactField]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    inline def setUrlsVarargs(value: ContactField*): Self = StObject.set(x, "urls", js.Array(value*))
  }
}
