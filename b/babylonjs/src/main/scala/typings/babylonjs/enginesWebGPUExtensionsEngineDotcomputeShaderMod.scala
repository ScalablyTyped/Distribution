package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUExtensionsEngineDotcomputeShaderMod {
  
  /* augmented module */
  object babylonjsEnginesWebgpuEngineAugmentingMod {
    
    trait WebGPUEngine extends StObject {
      
      /** @internal */
      def _createComputePipelineStageDescriptor(computeShader: String, defines: Nullable[String], entryPoint: String): GPUProgrammableStage
    }
    object WebGPUEngine {
      
      inline def apply(_createComputePipelineStageDescriptor: (String, Nullable[String], String) => GPUProgrammableStage): WebGPUEngine = {
        val __obj = js.Dynamic.literal(_createComputePipelineStageDescriptor = js.Any.fromFunction3(_createComputePipelineStageDescriptor))
        __obj.asInstanceOf[WebGPUEngine]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: WebGPUEngine] (val x: Self) extends AnyVal {
        
        inline def set_createComputePipelineStageDescriptor(value: (String, Nullable[String], String) => GPUProgrammableStage): Self = StObject.set(x, "_createComputePipelineStageDescriptor", js.Any.fromFunction3(value))
      }
    }
  }
}
