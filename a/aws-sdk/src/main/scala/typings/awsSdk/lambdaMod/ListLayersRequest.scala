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
  
  inline def apply(): ListLayersRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLayersRequest]
  }
  
  extension [Self <: ListLayersRequest](x: Self) {
    
    inline def setCompatibleRuntime(value: Runtime): Self = StObject.set(x, "CompatibleRuntime", value.asInstanceOf[js.Any])
    
    inline def setCompatibleRuntimeUndefined: Self = StObject.set(x, "CompatibleRuntime", js.undefined)
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: MaxLayerListItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
