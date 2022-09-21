package typings.babylonjs.BABYLON

import typings.babylonjs.GPUBindGroupLayout
import typings.babylonjs.anon.Fragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGPUPipelineContext
  extends StObject
     with IPipelineContext {
  
  def _handlesSpectorRebuildCallback(): Unit = js.native
  
  /* protected */ var _leftOverUniformsByName: org.scalablytyped.runtime.StringDictionary[String] = js.native
  
  /** @hidden */
  @JSName("_name")
  var _name_WebGPUPipelineContext: String = js.native
  
  var bindGroupLayouts: js.Array[GPUBindGroupLayout] = js.native
  
  /** @hidden */
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
