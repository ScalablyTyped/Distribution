package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPrimitiveState extends StObject {
  
  var cullMode: js.UndefOr[GPUCullMode] = js.undefined
  
  var frontFace: js.UndefOr[GPUFrontFace] = js.undefined
  
  var stripIndexFormat: js.UndefOr[GPUIndexFormat] = js.undefined
  
  var topology: js.UndefOr[GPUPrimitiveTopology] = js.undefined
  
  // Requires "depth-clip-control" feature.
  var unclippedDepth: js.UndefOr[Boolean] = js.undefined
}
object GPUPrimitiveState {
  
  inline def apply(): GPUPrimitiveState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUPrimitiveState]
  }
  
  extension [Self <: GPUPrimitiveState](x: Self) {
    
    inline def setCullMode(value: GPUCullMode): Self = StObject.set(x, "cullMode", value.asInstanceOf[js.Any])
    
    inline def setCullModeUndefined: Self = StObject.set(x, "cullMode", js.undefined)
    
    inline def setFrontFace(value: GPUFrontFace): Self = StObject.set(x, "frontFace", value.asInstanceOf[js.Any])
    
    inline def setFrontFaceUndefined: Self = StObject.set(x, "frontFace", js.undefined)
    
    inline def setStripIndexFormat(value: GPUIndexFormat): Self = StObject.set(x, "stripIndexFormat", value.asInstanceOf[js.Any])
    
    inline def setStripIndexFormatUndefined: Self = StObject.set(x, "stripIndexFormat", js.undefined)
    
    inline def setTopology(value: GPUPrimitiveTopology): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
    
    inline def setTopologyUndefined: Self = StObject.set(x, "topology", js.undefined)
    
    inline def setUnclippedDepth(value: Boolean): Self = StObject.set(x, "unclippedDepth", value.asInstanceOf[js.Any])
    
    inline def setUnclippedDepthUndefined: Self = StObject.set(x, "unclippedDepth", js.undefined)
  }
}
