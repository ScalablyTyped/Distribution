package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.anon.Pipeline
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgpuCacheRenderPipelineMod {
  
  @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline")
  @js.native
  abstract class WebGPUCacheRenderPipeline protected () extends StObject {
    def this(device: GPUDevice, emptyVertexBuffer: VertexBuffer, useTextureStage: Boolean) = this()
    
    /* private */ var _alphaBlendEnabled: Any = js.native
    
    /* private */ var _alphaBlendEqParams: Any = js.native
    
    /* private */ var _alphaBlendFuncParams: Any = js.native
    
    /* private */ var _alphaToCoverageEnabled: Any = js.native
    
    /* private */ var _clampDepth: Any = js.native
    
    /* private */ var _colorFormat: Any = js.native
    
    /* private */ var _colorStates: Any = js.native
    
    /* private */ var _createPipelineLayout: Any = js.native
    
    /* private */ var _createPipelineLayoutWithTextureStage: Any = js.native
    
    /* private */ var _createRenderPipeline: Any = js.native
    
    /* private */ var _cullEnabled: Any = js.native
    
    /* private */ var _cullFace: Any = js.native
    
    /* private */ var _depthBias: Any = js.native
    
    /* private */ var _depthBiasClamp: Any = js.native
    
    /* private */ var _depthBiasSlopeScale: Any = js.native
    
    /* private */ var _depthCompare: Any = js.native
    
    /* private */ var _depthStencilFormat: Any = js.native
    
    /* private */ var _depthStencilState: Any = js.native
    
    /* private */ var _depthTestEnabled: Any = js.native
    
    /* private */ var _depthWriteEnabled: Any = js.native
    
    /* private */ var _device: Any = js.native
    
    /* private */ var _emptyVertexBuffer: Any = js.native
    
    /* private */ var _frontFace: Any = js.native
    
    /* private */ var _getAphaBlendState: Any = js.native
    
    /* private */ var _getColorBlendState: Any = js.native
    
    /* protected */ def _getRenderPipeline(param: Pipeline): Unit = js.native
    
    /* private */ var _getVertexInputDescriptor: Any = js.native
    
    /* private */ var _indexBuffer: Any = js.native
    
    /* private */ var _isDirty: Any = js.native
    
    /* private */ var _kMaxVertexBufferStride: Any = js.native
    
    /* private */ var _mrtAttachments1: Any = js.native
    
    /* private */ var _mrtAttachments2: Any = js.native
    
    /* private */ var _mrtEnabledMask: Any = js.native
    
    /* private */ var _mrtFormats: Any = js.native
    
    /* private */ var _overrideVertexBuffers: Any = js.native
    
    /* private */ var _parameter: Any = js.native
    
    /* private */ var _rasterizationState: Any = js.native
    
    /* private */ var _setColorStates: Any = js.native
    
    /* private */ var _setDepthStencilState: Any = js.native
    
    /* private */ var _setRasterizationState: Any = js.native
    
    /* protected */ def _setRenderPipeline(param: Pipeline): Unit = js.native
    
    /* private */ var _setShaderStage: Any = js.native
    
    /* private */ var _setTextureState: Any = js.native
    
    /* private */ var _setVertexState: Any = js.native
    
    /* private */ var _shaderId: Any = js.native
    
    /* protected */ var _stateDirtyLowestIndex: Double = js.native
    
    /* protected */ var _states: js.Array[Double] = js.native
    
    /* protected */ var _statesLength: Double = js.native
    
    /* private */ var _stencilEnabled: Any = js.native
    
    /* private */ var _stencilFrontCompare: Any = js.native
    
    /* private */ var _stencilFrontDepthFailOp: Any = js.native
    
    /* private */ var _stencilFrontFailOp: Any = js.native
    
    /* private */ var _stencilFrontPassOp: Any = js.native
    
    /* private */ var _stencilReadMask: Any = js.native
    
    /* private */ var _stencilWriteMask: Any = js.native
    
    /* private */ var _textureState: Any = js.native
    
    /* private */ var _useTextureStage: Any = js.native
    
    /* private */ var _vertexBuffers: Any = js.native
    
    /* private */ var _webgpuColorFormat: Any = js.native
    
    /* private */ var _webgpuDepthStencilFormat: Any = js.native
    
    /* private */ var _writeMask: Any = js.native
    
    def colorFormats: js.Array[GPUTextureFormat | Null] = js.native
    
    var disabled: Boolean = js.native
    
    def endFrame(): Unit = js.native
    
    def getRenderPipeline(fillMode: Double, effect: Effect, sampleCount: Double): GPURenderPipeline = js.native
    def getRenderPipeline(fillMode: Double, effect: Effect, sampleCount: Double, textureState: Double): GPURenderPipeline = js.native
    
    var lastStateDirtyLowestIndex: Double = js.native
    
    val mrtAttachments: js.Array[Double] = js.native
    
    val mrtTextureArray: js.Array[InternalTexture] = js.native
    
    val mrtTextureCount: Double = js.native
    
    def reset(): Unit = js.native
    
    def resetDepthCullingState(): Unit = js.native
    
    def resetStencilState(): Unit = js.native
    
    def setAlphaBlendEnabled(enabled: Boolean): Unit = js.native
    
    def setAlphaBlendFactors(factors: js.Array[Nullable[Double]], operations: js.Array[Nullable[Double]]): Unit = js.native
    
    def setAlphaToCoverage(enabled: Boolean): Unit = js.native
    
    def setBuffers(
      vertexBuffers: Nullable[StringDictionary[Nullable[VertexBuffer]]],
      indexBuffer: Nullable[DataBuffer],
      overrideVertexBuffers: Nullable[StringDictionary[Nullable[VertexBuffer]]]
    ): Unit = js.native
    
    def setClampDepth(clampDepth: Boolean): Unit = js.native
    
    def setColorFormat(): Unit = js.native
    def setColorFormat(format: GPUTextureFormat): Unit = js.native
    
    def setCullEnabled(enabled: Boolean): Unit = js.native
    
    def setCullFace(cullFace: Double): Unit = js.native
    
    def setDepthBias(depthBias: Double): Unit = js.native
    
    def setDepthBiasSlopeScale(depthBiasSlopeScale: Double): Unit = js.native
    
    def setDepthCompare(func: Nullable[Double]): Unit = js.native
    
    def setDepthCullingState(
      cullEnabled: Boolean,
      frontFace: Double,
      cullFace: Double,
      zOffset: Double,
      zOffsetUnits: Double,
      depthTestEnabled: Boolean,
      depthWriteEnabled: Boolean,
      depthCompare: Nullable[Double]
    ): Unit = js.native
    
    def setDepthStencilFormat(): Unit = js.native
    def setDepthStencilFormat(format: GPUTextureFormat): Unit = js.native
    
    def setDepthTestEnabled(enabled: Boolean): Unit = js.native
    
    def setDepthWriteEnabled(enabled: Boolean): Unit = js.native
    
    def setFrontFace(frontFace: Double): Unit = js.native
    
    def setMRT(textureArray: js.Array[InternalTexture]): Unit = js.native
    def setMRT(textureArray: js.Array[InternalTexture], textureCount: Double): Unit = js.native
    
    def setMRTAttachments(attachments: js.Array[Double]): Unit = js.native
    
    def setStencilCompare(func: Nullable[Double]): Unit = js.native
    
    def setStencilDepthFailOp(op: Nullable[Double]): Unit = js.native
    
    def setStencilEnabled(enabled: Boolean): Unit = js.native
    
    def setStencilFailOp(op: Nullable[Double]): Unit = js.native
    
    def setStencilPassOp(op: Nullable[Double]): Unit = js.native
    
    def setStencilReadMask(mask: Double): Unit = js.native
    
    def setStencilState(
      stencilEnabled: Boolean,
      compare: Nullable[Double],
      depthFailOp: Nullable[Double],
      passOp: Nullable[Double],
      failOp: Nullable[Double],
      readMask: Double,
      writeMask: Double
    ): Unit = js.native
    
    def setStencilWriteMask(mask: Double): Unit = js.native
    
    def setWriteMask(mask: Double): Unit = js.native
    
    val vertexBuffers: js.Array[VertexBuffer] = js.native
  }
  /* static members */
  object WebGPUCacheRenderPipeline {
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline.NumCacheHitWithHash")
    @js.native
    def NumCacheHitWithHash: Double = js.native
    inline def NumCacheHitWithHash_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumCacheHitWithHash")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline.NumCacheHitWithoutHash")
    @js.native
    def NumCacheHitWithoutHash: Double = js.native
    inline def NumCacheHitWithoutHash_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumCacheHitWithoutHash")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline.NumCacheMiss")
    @js.native
    def NumCacheMiss: Double = js.native
    inline def NumCacheMiss_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumCacheMiss")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline.NumPipelineCreationLastFrame")
    @js.native
    def NumPipelineCreationLastFrame: Double = js.native
    inline def NumPipelineCreationLastFrame_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NumPipelineCreationLastFrame")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline._GetAphaBlendFactor")
    @js.native
    def _GetAphaBlendFactor: Any = js.native
    inline def _GetAphaBlendFactor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetAphaBlendFactor")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline._GetAphaBlendOperation")
    @js.native
    def _GetAphaBlendOperation: Any = js.native
    inline def _GetAphaBlendOperation_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetAphaBlendOperation")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline._GetCompareFunction")
    @js.native
    def _GetCompareFunction: Any = js.native
    inline def _GetCompareFunction_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetCompareFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline._GetStencilOpFunction")
    @js.native
    def _GetStencilOpFunction: Any = js.native
    inline def _GetStencilOpFunction_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetStencilOpFunction")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline._GetTopology")
    @js.native
    def _GetTopology: Any = js.native
    inline def _GetTopology_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetTopology")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline._GetVertexInputDescriptorFormat")
    @js.native
    def _GetVertexInputDescriptorFormat: Any = js.native
    inline def _GetVertexInputDescriptorFormat_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetVertexInputDescriptorFormat")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Engines/WebGPU/webgpuCacheRenderPipeline", "WebGPUCacheRenderPipeline._NumPipelineCreationCurrentFrame")
    @js.native
    def _NumPipelineCreationCurrentFrame: Any = js.native
    inline def _NumPipelineCreationCurrentFrame_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NumPipelineCreationCurrentFrame")(x.asInstanceOf[js.Any])
  }
}
