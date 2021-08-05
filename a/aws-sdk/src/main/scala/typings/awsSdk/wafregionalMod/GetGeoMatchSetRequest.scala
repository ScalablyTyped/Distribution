package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetGeoMatchSetRequest extends StObject {
  
  /**
    * The GeoMatchSetId of the GeoMatchSet that you want to get. GeoMatchSetId is returned by CreateGeoMatchSet and by ListGeoMatchSets.
    */
  var GeoMatchSetId: ResourceId
}
object GetGeoMatchSetRequest {
  
  inline def apply(GeoMatchSetId: ResourceId): GetGeoMatchSetRequest = {
    val __obj = js.Dynamic.literal(GeoMatchSetId = GeoMatchSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetGeoMatchSetRequest]
  }
  
  extension [Self <: GetGeoMatchSetRequest](x: Self) {
    
    inline def setGeoMatchSetId(value: ResourceId): Self = StObject.set(x, "GeoMatchSetId", value.asInstanceOf[js.Any])
  }
}
