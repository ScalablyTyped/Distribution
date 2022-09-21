package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUPipelineDescriptorBase
  extends StObject
     with GPUObjectDescriptorBase {
  
  var layout: js.UndefOr[GPUPipelineLayout | GPUAutoLayoutMode] = js.undefined
}
object GPUPipelineDescriptorBase {
  
  inline def apply(): GPUPipelineDescriptorBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPUPipelineDescriptorBase]
  }
  
  extension [Self <: GPUPipelineDescriptorBase](x: Self) {
    
    inline def setLayout(value: GPUPipelineLayout | GPUAutoLayoutMode): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
  }
}
