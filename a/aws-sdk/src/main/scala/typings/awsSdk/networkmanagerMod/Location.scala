package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /**
    * The physical address.
    */
  var Address: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The latitude.
    */
  var Latitude: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The longitude.
    */
  var Longitude: js.UndefOr[ConstrainedString] = js.undefined
}
object Location {
  
  inline def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setAddress(value: ConstrainedString): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setLatitude(value: ConstrainedString): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "Latitude", js.undefined)
    
    inline def setLongitude(value: ConstrainedString): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "Longitude", js.undefined)
  }
}
