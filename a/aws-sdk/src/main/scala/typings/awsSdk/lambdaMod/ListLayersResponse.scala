package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLayersResponse extends StObject {
  
  /**
    * A list of function layers.
    */
  var Layers: js.UndefOr[LayersList] = js.native
  
  /**
    * A pagination token returned when the response doesn't contain all layers.
    */
  var NextMarker: js.UndefOr[String] = js.native
}
object ListLayersResponse {
  
  @scala.inline
  def apply(): ListLayersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayersResponse]
  }
  
  @scala.inline
  implicit class ListLayersResponseMutableBuilder[Self <: ListLayersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayers(value: LayersList): Self = StObject.set(x, "Layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayersUndefined: Self = StObject.set(x, "Layers", js.undefined)
    
    @scala.inline
    def setLayersVarargs(value: LayersListItem*): Self = StObject.set(x, "Layers", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
