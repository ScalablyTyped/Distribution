package typings.cesium.mod

import typings.cesium.mod.GeocoderService.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GeocoderService")
@js.native
open class GeocoderService () extends StObject {
  
  /**
    * @param query - The query to be sent to the geocoder service
    * @param [type = GeocodeType.SEARCH] - The type of geocode to perform.
    */
  def geocode(query: String): js.Promise[js.Array[Result]] = js.native
  def geocode(query: String, `type`: GeocodeType): js.Promise[js.Array[Result]] = js.native
}
object GeocoderService {
  
  /**
    * @property displayName - The display name for a location
    * @property destination - The bounding box for a location
    */
  trait Result extends StObject {
    
    var destination: Rectangle | Cartesian3
    
    var displayName: String
  }
  object Result {
    
    inline def apply(destination: Rectangle | Cartesian3, displayName: String): Result = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: Rectangle | Cartesian3): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
}
