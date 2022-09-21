package typings.awsSdk.lambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLayerVersionsRequest extends StObject {
  
  /**
    * The compatible instruction set architecture.
    */
  var CompatibleArchitecture: js.UndefOr[Architecture] = js.undefined
  
  /**
    * A runtime identifier. For example, go1.x.
    */
  var CompatibleRuntime: js.UndefOr[Runtime] = js.undefined
  
  /**
    * The name or Amazon Resource Name (ARN) of the layer.
    */
  var LayerName: typings.awsSdk.lambdaMod.LayerName
  
  /**
    * A pagination token returned by a previous call.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of versions to return.
    */
  var MaxItems: js.UndefOr[MaxLayerListItems] = js.undefined
}
object ListLayerVersionsRequest {
  
  inline def apply(LayerName: LayerName): ListLayerVersionsRequest = {
    val __obj = js.Dynamic.literal(LayerName = LayerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLayerVersionsRequest]
  }
  
  extension [Self <: ListLayerVersionsRequest](x: Self) {
    
    inline def setCompatibleArchitecture(value: Architecture): Self = StObject.set(x, "CompatibleArchitecture", value.asInstanceOf[js.Any])
    
    inline def setCompatibleArchitectureUndefined: Self = StObject.set(x, "CompatibleArchitecture", js.undefined)
    
    inline def setCompatibleRuntime(value: Runtime): Self = StObject.set(x, "CompatibleRuntime", value.asInstanceOf[js.Any])
    
    inline def setCompatibleRuntimeUndefined: Self = StObject.set(x, "CompatibleRuntime", js.undefined)
    
    inline def setLayerName(value: LayerName): Self = StObject.set(x, "LayerName", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: MaxLayerListItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
