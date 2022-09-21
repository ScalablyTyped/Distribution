package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLayersResponse extends StObject {
  
  /**
    * A list of function layers.
    */
  var Layers: js.UndefOr[LayersList] = js.undefined
  
  /**
    * A pagination token returned when the response doesn't contain all layers.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
}
object ListLayersResponse {
  
  inline def apply(): ListLayersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayersResponse]
  }
  
  extension [Self <: ListLayersResponse](x: Self) {
    
    inline def setLayers(value: LayersList): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    inline def setLayersVarargs(value: LayersListItem*): Self = StObject.set(x, "Layers", js.Array(value*))
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
