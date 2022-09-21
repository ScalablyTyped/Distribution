package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUShaderModuleCompilationHint extends StObject {
  
  var layout: GPUPipelineLayout | GPUAutoLayoutMode
}
object GPUShaderModuleCompilationHint {
  
  inline def apply(layout: GPUPipelineLayout | GPUAutoLayoutMode): GPUShaderModuleCompilationHint = {
    val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUShaderModuleCompilationHint]
  }
  
  extension [Self <: GPUShaderModuleCompilationHint](x: Self) {
    
    inline def setLayout(value: GPUPipelineLayout | GPUAutoLayoutMode): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
  }
}
