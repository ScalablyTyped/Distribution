package typings.awsSdk.ecrpublicMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchCheckLayerAvailabilityResponse extends StObject {
  
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[LayerFailureList] = js.undefined
  
  /**
    * A list of image layer objects corresponding to the image layer references in the request.
    */
  var layers: js.UndefOr[LayerList] = js.undefined
}
object BatchCheckLayerAvailabilityResponse {
  
  inline def apply(): BatchCheckLayerAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCheckLayerAvailabilityResponse]
  }
  
  extension [Self <: BatchCheckLayerAvailabilityResponse](x: Self) {
    
    inline def setFailures(value: LayerFailureList): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    inline def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    inline def setFailuresVarargs(value: LayerFailure*): Self = StObject.set(x, "failures", js.Array(value*))
    
    inline def setLayers(value: LayerList): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
  }
}
