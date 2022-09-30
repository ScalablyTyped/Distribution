package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlaceResponse extends StObject {
  
  /**
    * Details about the result, such as its address and position.
    */
  var Place: typings.awsSdk.locationMod.Place
}
object GetPlaceResponse {
  
  inline def apply(Place: Place): GetPlaceResponse = {
    val __obj = js.Dynamic.literal(Place = Place.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPlaceResponse]
  }
  
  extension [Self <: GetPlaceResponse](x: Self) {
    
    inline def setPlace(value: Place): Self = StObject.set(x, "Place", value.asInstanceOf[js.Any])
  }
}
