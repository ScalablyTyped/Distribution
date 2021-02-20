package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListLayerVersionsRequest extends StObject {
  
  /**
    * A runtime identifier. For example, go1.x.
    */
  var CompatibleRuntime: js.UndefOr[Runtime] = js.native
  
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName = js.native
  
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of versions to return.
    */
  var MaxItems: js.UndefOr[MaxLayerListItems] = js.native
}
object ListLayerVersionsRequest {
  
  @scala.inline
  def apply(LayerName: LayerName): ListLayerVersionsRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLayerVersionsRequest]
  }
  
  @scala.inline
  implicit class ListLayerVersionsRequestMutableBuilder[Self <: ListLayerVersionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleRuntime(value: Runtime): Self = StObject.set(x, "CompatibleRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleRuntimeUndefined: Self = StObject.set(x, "CompatibleRuntime", js.undefined)
    
    @scala.inline
    def setLayerName(value: LayerName): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: MaxLayerListItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
