package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLayersRequest extends StObject {
  
  /**
    * A runtime identifier. For example, go1.x.
    */
  var CompatibleRuntime: js.UndefOr[Runtime] = js.undefined
  
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of layers to return.
    */
  var MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
}
object ListLayersRequest {
  
  @scala.inline
  def apply(): ListLayersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayersRequest]
  }
  
  @scala.inline
  implicit class ListLayersRequestMutableBuilder[Self <: ListLayersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompatibleRuntime(value: Runtime): Self = StObject.set(x, "CompatibleRuntime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompatibleRuntimeUndefined: Self = StObject.set(x, "CompatibleRuntime", js.undefined)
    
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
