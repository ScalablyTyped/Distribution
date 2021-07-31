package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /**
    * The physical address.
    */
  var Address: js.UndefOr[String] = js.undefined
  
  /**
    * The latitude.
    */
  var Latitude: js.UndefOr[String] = js.undefined
  
  /**
    * The longitude.
    */
  var Longitude: js.UndefOr[String] = js.undefined
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationMutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setLatitude(value: String): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "Latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: String): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "Longitude", js.undefined)
  }
}
