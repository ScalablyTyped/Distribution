package typings.cordovaPluginContacts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ContactAddress object stores the properties of a single address of a contact.
  * A Contact object may include more than one address in a ContactAddress[] array.
  */
@js.native
trait ContactAddress extends js.Object {
  
  /** The country name. */
  var country: js.UndefOr[String] = js.native
  
  /** The full address formatted for display. */
  var formatted: js.UndefOr[String] = js.native
  
  /** The city or locality. */
  var locality: js.UndefOr[String] = js.native
  
  /** The zip code or postal code. */
  var postalCode: js.UndefOr[String] = js.native
  
  /** Set to true if this ContactAddress contains the user's preferred value. */
  var pref: js.UndefOr[Boolean] = js.native
  
  /** The state or region. */
  var region: js.UndefOr[String] = js.native
  
  /** The full street address. */
  var streetAddress: js.UndefOr[String] = js.native
  
  /** A string indicating what type of field this is, home for example. */
  var `type`: js.UndefOr[String] = js.native
}
object ContactAddress {
  
  @scala.inline
  def apply(): ContactAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactAddress]
  }
  
  @scala.inline
  implicit class ContactAddressOps[Self <: ContactAddress] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setFormatted(value: String): Self = this.set("formatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatted: Self = this.set("formatted", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setPref(value: Boolean): Self = this.set("pref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePref: Self = this.set("pref", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setStreetAddress(value: String): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreetAddress: Self = this.set("streetAddress", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
