package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPSCoordinates extends StObject {
  
  /**
    * The latitude coordinate of the location.
    */
  var Latitude: double = js.native
  
  /**
    * The longitude coordinate of the location.
    */
  var Longitude: double = js.native
}
object GPSCoordinates {
  
  @scala.inline
  def apply(Latitude: double, Longitude: double): GPSCoordinates = {
    val __obj = js.Dynamic.literal(Latitude = Latitude.asInstanceOf[js.Any], Longitude = Longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPSCoordinates]
  }
  
  @scala.inline
  implicit class GPSCoordinatesMutableBuilder[Self <: GPSCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatitude(value: double): Self = StObject.set(x, "Latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitude(value: double): Self = StObject.set(x, "Longitude", value.asInstanceOf[js.Any])
  }
}
