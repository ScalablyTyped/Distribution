package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeoMatchSetResponse extends StObject {
  
  /**
    * Information about the GeoMatchSet that you specified in the GetGeoMatchSet request. This includes the Type, which for a GeoMatchContraint is always Country, as well as the Value, which is the identifier for a specific country.
    */
  var GeoMatchSet: js.UndefOr[typings.awsSdk.clientsWafMod.GeoMatchSet] = js.undefined
}
object GetGeoMatchSetResponse {
  
  inline def apply(): GetGeoMatchSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGeoMatchSetResponse]
  }
  
  extension [Self <: GetGeoMatchSetResponse](x: Self) {
    
    inline def setGeoMatchSet(value: GeoMatchSet): Self = StObject.set(x, "GeoMatchSet", value.asInstanceOf[js.Any])
    
    inline def setGeoMatchSetUndefined: Self = StObject.set(x, "GeoMatchSet", js.undefined)
  }
}
