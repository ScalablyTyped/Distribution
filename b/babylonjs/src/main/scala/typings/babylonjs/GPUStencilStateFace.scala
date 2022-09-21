package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUStencilStateFace extends StObject {
  
  var compare: js.UndefOr[GPUCompareFunction] = js.undefined
  
  var depthFailOp: js.UndefOr[GPUStencilOperation] = js.undefined
  
  var failOp: js.UndefOr[GPUStencilOperation] = js.undefined
  
  var passOp: js.UndefOr[GPUStencilOperation] = js.undefined
}
object GPUStencilStateFace {
  
  inline def apply(): GPUStencilStateFace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUStencilStateFace]
  }
  
  extension [Self <: GPUStencilStateFace](x: Self) {
    
    inline def setCompare(value: GPUCompareFunction): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
    
    inline def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
    
    inline def setDepthFailOp(value: GPUStencilOperation): Self = StObject.set(x, "depthFailOp", value.asInstanceOf[js.Any])
    
    inline def setDepthFailOpUndefined: Self = StObject.set(x, "depthFailOp", js.undefined)
    
    inline def setFailOp(value: GPUStencilOperation): Self = StObject.set(x, "failOp", value.asInstanceOf[js.Any])
    
    inline def setFailOpUndefined: Self = StObject.set(x, "failOp", js.undefined)
    
    inline def setPassOp(value: GPUStencilOperation): Self = StObject.set(x, "passOp", value.asInstanceOf[js.Any])
    
    inline def setPassOpUndefined: Self = StObject.set(x, "passOp", js.undefined)
  }
}
