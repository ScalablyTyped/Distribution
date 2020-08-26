package typings.cordovaPluginContacts

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContactProperties extends js.Object {
  /** An array of all the contact's addresses. */
  var addresses: js.UndefOr[js.Array[ContactAddress]] = js.native
  /** The birthday of the contact. */
  var birthday: js.UndefOr[Date] = js.native
  /** An array of all the user-defined categories associated with the contact. */
  var categories: js.UndefOr[js.Array[ContactField]] = js.native
  /** The name of this Contact, suitable for display to end users. */
  var displayName: js.UndefOr[String] = js.native
  /** An array of all the contact's email addresses. */
  var emails: js.UndefOr[js.Array[ContactField]] = js.native
  /** A globally unique identifier. */
  var id: js.UndefOr[String] = js.native
  /** An array of all the contact's IM addresses. */
  var ims: js.UndefOr[js.Array[ContactField]] = js.native
  /** An object containing all components of a persons name. */
  var name: js.UndefOr[ContactName] = js.native
  /** A casual name by which to address the contact. */
  var nickname: js.UndefOr[String] = js.native
  /** A note about the contact. */
  var note: js.UndefOr[String] = js.native
  /** An array of all the contact's organizations. */
  var organizations: js.UndefOr[js.Array[ContactOrganization]] = js.native
  /** An array of all the contact's phone numbers. */
  var phoneNumbers: js.UndefOr[js.Array[ContactField]] = js.native
  /** An array of the contact's photos. */
  var photos: js.UndefOr[js.Array[ContactField]] = js.native
  /** An array of web pages associated with the contact. */
  var urls: js.UndefOr[js.Array[ContactField]] = js.native
}

object ContactProperties {
  @scala.inline
  def apply(): ContactProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactProperties]
  }
  @scala.inline
  implicit class ContactPropertiesOps[Self <: ContactProperties] (val x: Self) extends AnyVal {
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
    def setAddressesVarargs(value: ContactAddress*): Self = this.set("addresses", js.Array(value :_*))
    @scala.inline
    def setAddresses(value: js.Array[ContactAddress]): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddresses: Self = this.set("addresses", js.undefined)
    @scala.inline
    def setBirthday(value: Date): Self = this.set("birthday", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBirthday: Self = this.set("birthday", js.undefined)
    @scala.inline
    def setCategoriesVarargs(value: ContactField*): Self = this.set("categories", js.Array(value :_*))
    @scala.inline
    def setCategories(value: js.Array[ContactField]): Self = this.set("categories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategories: Self = this.set("categories", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setEmailsVarargs(value: ContactField*): Self = this.set("emails", js.Array(value :_*))
    @scala.inline
    def setEmails(value: js.Array[ContactField]): Self = this.set("emails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImsVarargs(value: ContactField*): Self = this.set("ims", js.Array(value :_*))
    @scala.inline
    def setIms(value: js.Array[ContactField]): Self = this.set("ims", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIms: Self = this.set("ims", js.undefined)
    @scala.inline
    def setName(value: ContactName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    @scala.inline
    def setOrganizationsVarargs(value: ContactOrganization*): Self = this.set("organizations", js.Array(value :_*))
    @scala.inline
    def setOrganizations(value: js.Array[ContactOrganization]): Self = this.set("organizations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganizations: Self = this.set("organizations", js.undefined)
    @scala.inline
    def setPhoneNumbersVarargs(value: ContactField*): Self = this.set("phoneNumbers", js.Array(value :_*))
    @scala.inline
    def setPhoneNumbers(value: js.Array[ContactField]): Self = this.set("phoneNumbers", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoneNumbers: Self = this.set("phoneNumbers", js.undefined)
    @scala.inline
    def setPhotosVarargs(value: ContactField*): Self = this.set("photos", js.Array(value :_*))
    @scala.inline
    def setPhotos(value: js.Array[ContactField]): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: ContactField*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[ContactField]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}

