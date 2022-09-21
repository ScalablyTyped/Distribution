package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLayerVersionsResponse extends StObject {
  
  /**
    * A list of versions.
    */
  var LayerVersions: js.UndefOr[LayerVersionsList] = js.undefined
  
  /**
    * A pagination token returned when the response doesn't contain all versions.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}
object ListLayerVersionsResponse {
  
  inline def apply(): ListLayerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayerVersionsResponse]
  }
  
  extension [Self <: ListLayerVersionsResponse](x: Self) {
    
    inline def setLayerVersions(value: LayerVersionsList): Self = StObject.set(x, "LayerVersions", value.asInstanceOf[js.Any])
    
    inline def setLayerVersionsUndefined: Self = StObject.set(x, "LayerVersions", js.undefined)
    
    inline def setLayerVersionsVarargs(value: LayerVersionsListItem*): Self = StObject.set(x, "LayerVersions", js.Array(value*))
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
