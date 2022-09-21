package typings.babylonjs.BABYLON

import typings.babylonjs.GPUProgrammableStage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebGPURenderPipelineStageDescriptor extends StObject {
  
  var fragmentStage: js.UndefOr[GPUProgrammableStage] = js.undefined
  
  var vertexStage: GPUProgrammableStage
}
object IWebGPURenderPipelineStageDescriptor {
  
  inline def apply(vertexStage: GPUProgrammableStage): IWebGPURenderPipelineStageDescriptor = {
    val __obj = js.Dynamic.literal(vertexStage = vertexStage.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebGPURenderPipelineStageDescriptor]
  }
  
  extension [Self <: IWebGPURenderPipelineStageDescriptor](x: Self) {
    
    inline def setFragmentStage(value: GPUProgrammableStage): Self = StObject.set(x, "fragmentStage", value.asInstanceOf[js.Any])
    
    inline def setFragmentStageUndefined: Self = StObject.set(x, "fragmentStage", js.undefined)
    
    inline def setVertexStage(value: GPUProgrammableStage): Self = StObject.set(x, "vertexStage", value.asInstanceOf[js.Any])
  }
}
