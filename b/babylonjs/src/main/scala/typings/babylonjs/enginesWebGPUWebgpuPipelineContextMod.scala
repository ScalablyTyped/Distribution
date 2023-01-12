package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Fragment
import typings.babylonjs.enginesIpipelinecontextMod.IPipelineContext
import typings.babylonjs.enginesWebGPUWebgpuShaderProcessingContextMod.WebGPUShaderProcessingContext
import typings.babylonjs.enginesWebgpuEngineMod.WebGPUEngine
import typings.babylonjs.materialsUniformBufferMod.UniformBuffer
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesWebGPUWebgpuPipelineContextMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuPipelineContext", "WebGPUPipelineContext")
  @js.native
  open class WebGPUPipelineContext protected ()
    extends StObject
       with IPipelineContext {
    def this(shaderProcessingContext: WebGPUShaderProcessingContext, engine: WebGPUEngine) = this()
    
    def _handlesSpectorRebuildCallback(): Unit = js.native
    
    /* protected */ var _leftOverUniformsByName: StringDictionary[String] = js.native
    
    /** @internal */
    @JSName("_name")
    var _name_WebGPUPipelineContext: String = js.native
    
    var bindGroupLayouts: js.Array[GPUBindGroupLayout] = js.native
    
    /** @internal */
    /**
      * Build the uniform buffer used in the material.
      */
    def buildUniformLayout(): Unit = js.native
    
    var engine: WebGPUEngine = js.native
    
    @JSName("isAsync")
    def isAsync_MWebGPUPipelineContext: Boolean = js.native
    
    @JSName("isReady")
    def isReady_MWebGPUPipelineContext: Boolean = js.native
    
    var onCompiled: js.UndefOr[js.Function0[Unit]] = js.native
    
    var shaderProcessingContext: WebGPUShaderProcessingContext = js.native
    
    var sources: Fragment = js.native
    
    var stages: Nullable[IWebGPURenderPipelineStageDescriptor] = js.native
    
    /**
      * Stores the left-over uniform buffer
      */
    var uniformBuffer: Nullable[UniformBuffer] = js.native
  }
  
  trait IWebGPURenderPipelineStageDescriptor extends StObject {
    
    var fragmentStage: js.UndefOr[GPUProgrammableStage] = js.undefined
    
    var vertexStage: GPUProgrammableStage
  }
  object IWebGPURenderPipelineStageDescriptor {
    
    inline def apply(vertexStage: GPUProgrammableStage): IWebGPURenderPipelineStageDescriptor = {
      val __obj = js.Dynamic.literal(vertexStage = vertexStage.asInstanceOf[js.Any])
      __obj.asInstanceOf[IWebGPURenderPipelineStageDescriptor]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IWebGPURenderPipelineStageDescriptor] (val x: Self) extends AnyVal {
      
      inline def setFragmentStage(value: GPUProgrammableStage): Self = StObject.set(x, "fragmentStage", value.asInstanceOf[js.Any])
      
      inline def setFragmentStageUndefined: Self = StObject.set(x, "fragmentStage", js.undefined)
      
      inline def setVertexStage(value: GPUProgrammableStage): Self = StObject.set(x, "vertexStage", value.asInstanceOf[js.Any])
    }
  }
}
