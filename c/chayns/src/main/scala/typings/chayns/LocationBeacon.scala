package typings.chayns

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// chayns.getLocationBeacons()
@js.native
trait LocationBeacon extends StObject {
  
  var id: Double = js.native
  
  var latitude: Double = js.native
  
  var longitude: Double = js.native
  
  var pushMessage: String = js.native
}
object LocationBeacon {
  
  @scala.inline
  def apply(id: Double, latitude: Double, longitude: Double, pushMessage: String): LocationBeacon = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], pushMessage = pushMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationBeacon]
  }
  
  @scala.inline
  implicit class LocationBeaconMutableBuilder[Self <: LocationBeacon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPushMessage(value: String): Self = StObject.set(x, "pushMessage", value.asInstanceOf[js.Any])
  }
}
