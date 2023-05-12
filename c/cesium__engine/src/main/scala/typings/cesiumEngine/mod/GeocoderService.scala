package typings.cesiumEngine.mod

import typings.cesiumEngine.mod.GeocoderService.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "GeocoderService")
@js.native
open class GeocoderService () extends StObject {
  
  /**
    * Gets the credit to display after a geocode is performed. Typically this is used to credit
    * the geocoder service.
    */
  val credit: js.UndefOr[Credit] = js.native
  
  /**
    * @param query - The query to be sent to the geocoder service
    * @param [type = GeocodeType.SEARCH] - The type of geocode to perform.
    */
  def geocode(query: String): js.Promise[js.Array[Result]] = js.native
  def geocode(query: String, `type`: GeocodeType): js.Promise[js.Array[Result]] = js.native
}
/* static members */
object GeocoderService {
  
  @JSImport("@cesium/engine", "GeocoderService")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses credits from the geocoder result attributions, if present.
    * @param geocoderResult - The geocoder result
    * @returns A list of credits if present in the result, otherwise undefined
    */
  inline def getCreditsFromResult(geocoderResult: Result): js.UndefOr[js.Array[Credit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCreditsFromResult")(geocoderResult.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[Credit]]]
  
  /**
    * @property displayName - The display name for a location
    * @property destination - The bounding box for a location
    */
  trait Result extends StObject {
    
    var attributions: js.UndefOr[js.Array[js.Object]] = js.undefined
    
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
      
      inline def setAttributions(value: js.Array[js.Object]): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: js.Object*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setDestination(value: Rectangle | Cartesian3): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    }
  }
}
