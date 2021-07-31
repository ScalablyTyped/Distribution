package typings.awsSdk.ecrMod

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
  
  @scala.inline
  def apply(): BatchCheckLayerAvailabilityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchCheckLayerAvailabilityResponse]
  }
  
  @scala.inline
  implicit class BatchCheckLayerAvailabilityResponseMutableBuilder[Self <: BatchCheckLayerAvailabilityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailures(value: LayerFailureList): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailuresUndefined: Self = StObject.set(x, "failures", js.undefined)
    
    @scala.inline
    def setFailuresVarargs(value: LayerFailure*): Self = StObject.set(x, "failures", js.Array(value :_*))
    
    @scala.inline
    def setLayers(value: LayerList): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value :_*))
  }
}
