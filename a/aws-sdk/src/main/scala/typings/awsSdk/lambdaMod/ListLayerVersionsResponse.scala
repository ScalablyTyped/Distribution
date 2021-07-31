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
  
  @scala.inline
  def apply(): ListLayerVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayerVersionsResponse]
  }
  
  @scala.inline
  implicit class ListLayerVersionsResponseMutableBuilder[Self <: ListLayerVersionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLayerVersions(value: LayerVersionsList): Self = StObject.set(x, "LayerVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerVersionsUndefined: Self = StObject.set(x, "LayerVersions", js.undefined)
    
    @scala.inline
    def setLayerVersionsVarargs(value: LayerVersionsListItem*): Self = StObject.set(x, "LayerVersions", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
