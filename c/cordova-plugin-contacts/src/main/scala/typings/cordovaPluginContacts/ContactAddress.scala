package typings.cordovaPluginContacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The ContactAddress object stores the properties of a single address of a contact.
  * A Contact object may include more than one address in a ContactAddress[] array.
  */
trait ContactAddress extends StObject {
  
  /** The country name. */
  var country: js.UndefOr[String] = js.undefined
  
  /** The full address formatted for display. */
  var formatted: js.UndefOr[String] = js.undefined
  
  /** The city or locality. */
  var locality: js.UndefOr[String] = js.undefined
  
  /** The zip code or postal code. */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /** Set to true if this ContactAddress contains the user's preferred value. */
  var pref: js.UndefOr[Boolean] = js.undefined
  
  /** The state or region. */
  var region: js.UndefOr[String] = js.undefined
  
  /** The full street address. */
  var streetAddress: js.UndefOr[String] = js.undefined
  
  /** A string indicating what type of field this is, home for example. */
  var `type`: js.UndefOr[String] = js.undefined
}
object ContactAddress {
  
  @scala.inline
  def apply(): ContactAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactAddress]
  }
  
  @scala.inline
  implicit class ContactAddressMutableBuilder[Self <: ContactAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setFormatted(value: String): Self = StObject.set(x, "formatted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormattedUndefined: Self = StObject.set(x, "formatted", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = StObject.set(x, "locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalityUndefined: Self = StObject.set(x, "locality", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setPref(value: Boolean): Self = StObject.set(x, "pref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefUndefined: Self = StObject.set(x, "pref", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    @scala.inline
    def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
