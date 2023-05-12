package typings.babylonjs

import typings.babylonjs.buffersDataBufferMod.DataBuffer
import typings.babylonjs.buffersStorageBufferMod.StorageBuffer
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.camerasVRWebVRCameraMod.WebVROptions
import typings.babylonjs.computeComputeEffectMod.ComputeEffect
import typings.babylonjs.computeComputeEffectMod.IComputeEffectCreationOptions
import typings.babylonjs.computeIcomputecontextMod.IComputeContext
import typings.babylonjs.computeIcomputepipelinecontextMod.IComputePipelineContext
import typings.babylonjs.enginesEngineMod.IDisplayChangedEventArgs
import typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingList
import typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingMapping
import typings.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionQuery
import typings.babylonjs.enginesExtensionsEngineDotwebVRMod.IVRPresentationAttributes
import typings.babylonjs.enginesIcanvasMod.ICanvas
import typings.babylonjs.enginesIpipelinecontextMod.IPipelineContext
import typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.instrumentationTimeTokenMod.TimeToken
import typings.babylonjs.materialsTexturesExternalTextureMod.ExternalTexture
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.materialsTexturesMultiRenderTargetMod.IMultiRenderTargetOptions
import typings.babylonjs.materialsTexturesRenderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.DepthTextureCreationOptions
import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.RenderTargetCreationOptions
import typings.babylonjs.materialsTexturesTextureCreationOptionsMod.TextureSize
import typings.babylonjs.materialsTexturesTextureSamplerMod.TextureSampler
import typings.babylonjs.materialsUniformBufferMod.UniformBuffer
import typings.babylonjs.mathsMathDotsizeMod.Size
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.miscPerfCounterMod.PerfCounter
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.IndicesArray
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.typesMod.int
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.ImageBitmap
import typings.std.ImageData
import typings.std.WebGLQuery
import typings.std.WebGLTransformFeedback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object enginesExtensionsIndexMod {
  
  @JSImport("babylonjs/Engines/Extensions/index", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Engines/Extensions/index", "ComputeBindingType")
  @js.native
  object ComputeBindingType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType & Double
      ] = js.native
    
    /* 5 */ val Sampler: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.Sampler & Double = js.native
    
    /* 3 */ val StorageBuffer: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.StorageBuffer & Double = js.native
    
    /* 1 */ val StorageTexture: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.StorageTexture & Double = js.native
    
    /* 0 */ val Texture: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.Texture & Double = js.native
    
    /* 4 */ val TextureWithoutSampler: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.TextureWithoutSampler & Double = js.native
    
    /* 2 */ val UniformBuffer: typings.babylonjs.enginesExtensionsEngineDotcomputeShaderMod.ComputeBindingType.UniformBuffer & Double = js.native
  }
  
  @JSImport("babylonjs/Engines/Extensions/index", "EngineView")
  @js.native
  open class EngineView ()
    extends typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView
  
  @JSImport("babylonjs/Engines/Extensions/index", "_OcclusionDataStorage")
  @js.native
  open class OcclusionDataStorage ()
    extends typings.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionDataStorage
  
  inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: js.typedarray.ArrayBuffer): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: js.typedarray.ArrayBuffer, sizeInBytes: Boolean): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(
    `type`: Double,
    sizeOrDstBuffer: js.typedarray.ArrayBuffer,
    sizeInBytes: Boolean,
    copyBuffer: js.typedarray.ArrayBuffer
  ): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(
    `type`: Double,
    sizeOrDstBuffer: js.typedarray.ArrayBuffer,
    sizeInBytes: Unit,
    copyBuffer: js.typedarray.ArrayBuffer
  ): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: Double): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: Double, sizeInBytes: Boolean): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(
    `type`: Double,
    sizeOrDstBuffer: Double,
    sizeInBytes: Boolean,
    copyBuffer: js.typedarray.ArrayBuffer
  ): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  inline def allocateAndCopyTypedBuffer(`type`: Double, sizeOrDstBuffer: Double, sizeInBytes: Unit, copyBuffer: js.typedarray.ArrayBuffer): js.typedarray.ArrayBufferView = (^.asInstanceOf[js.Dynamic].applyDynamic("allocateAndCopyTypedBuffer")(`type`.asInstanceOf[js.Any], sizeOrDstBuffer.asInstanceOf[js.Any], sizeInBytes.asInstanceOf[js.Any], copyBuffer.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.ArrayBufferView]
  
  @JSImport("babylonjs/Engines/Extensions/index", "_forceTransformFeedbackToBundle")
  @js.native
  def forceTransformFeedbackToBundle: Boolean = js.native
  
  inline def forceTransformFeedbackToBundle_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_forceTransformFeedbackToBundle")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object babylonjsCamerasCameraAugmentingMod {
    
    trait Camera extends StObject {
      
      /**
        * @internal
        * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
        */
      var _multiviewTexture: Nullable[RenderTargetTexture]
      
      /**
        * @internal
        * For WebXR cameras that are rendering to multiview texture arrays.
        */
      var _renderingMultiview: Boolean
      
      /**
        * @internal
        * ensures the multiview texture of the camera exists and has the specified width/height
        * @param width height to set on the multiview texture
        * @param height width to set on the multiview texture
        */
      def _resizeOrCreateMultiviewTexture(width: Double, height: Double): Unit
      
      /**
        * @internal
        * For cameras that cannot use multiview images to display directly. (e.g. webVR camera will render to multiview texture, then copy to each eye texture and go from there)
        */
      var _useMultiviewToSingleView: Boolean
    }
    object Camera {
      
      inline def apply(
        _renderingMultiview: Boolean,
        _resizeOrCreateMultiviewTexture: (Double, Double) => Unit,
        _useMultiviewToSingleView: Boolean
      ): Camera = {
        val __obj = js.Dynamic.literal(_renderingMultiview = _renderingMultiview.asInstanceOf[js.Any], _resizeOrCreateMultiviewTexture = js.Any.fromFunction2(_resizeOrCreateMultiviewTexture), _useMultiviewToSingleView = _useMultiviewToSingleView.asInstanceOf[js.Any], _multiviewTexture = null)
        __obj.asInstanceOf[Camera]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Camera] (val x: Self) extends AnyVal {
        
        inline def set_multiviewTexture(value: Nullable[RenderTargetTexture]): Self = StObject.set(x, "_multiviewTexture", value.asInstanceOf[js.Any])
        
        inline def set_multiviewTextureNull: Self = StObject.set(x, "_multiviewTexture", null)
        
        inline def set_renderingMultiview(value: Boolean): Self = StObject.set(x, "_renderingMultiview", value.asInstanceOf[js.Any])
        
        inline def set_resizeOrCreateMultiviewTexture(value: (Double, Double) => Unit): Self = StObject.set(x, "_resizeOrCreateMultiviewTexture", js.Any.fromFunction2(value))
        
        inline def set_useMultiviewToSingleView(value: Boolean): Self = StObject.set(x, "_useMultiviewToSingleView", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /** @internal */
      var _captureGPUFrameTime: Boolean = js.native
      
      /** @internal */
      def _createTimeQuery(): WebGLQuery = js.native
      
      /** @internal */
      var _currentNonTimestampToken: Nullable[TimeToken] = js.native
      
      /** @internal */
      def _deleteTimeQuery(query: WebGLQuery): Unit = js.native
      
      /** @internal */
      var _excludedCompressedTextures: js.Array[String] = js.native
      
      /** @internal */
      def _getGlAlgorithmType(algorithmType: Double): Double = js.native
      
      /** @internal */
      def _getTimeQueryAvailability(query: WebGLQuery): Any = js.native
      
      /** @internal */
      def _getTimeQueryResult(query: WebGLQuery): Any = js.native
      
      /** @internal */
      def _getVRDisplaysAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
      
      /** @internal */
      var _gpuFrameTime: PerfCounter = js.native
      
      /** @internal */
      var _gpuFrameTimeToken: Nullable[TimeToken] = js.native
      
      /** @internal */
      var _inputElement: Nullable[HTMLElement] = js.native
      
      /** @internal */
      var _oldHardwareScaleFactor: Double = js.native
      
      /** @internal */
      var _oldSize: Size = js.native
      
      /** @internal */
      var _onBeginFrameObserver: Nullable[
            Observer[
              typings.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine
            ]
          ] = js.native
      
      /** @internal */
      var _onEndFrameObserver: Nullable[
            Observer[
              typings.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine
            ]
          ] = js.native
      
      /**
        * Observable to handle when a change to inputElement occurs
        * @internal
        */
      var _onEngineViewChanged: js.UndefOr[js.Function0[Unit]] = js.native
      
      /** @internal */
      def _onVRDisplayPointerRestricted(): Unit = js.native
      
      /** @internal */
      def _onVRDisplayPointerUnrestricted(): Unit = js.native
      
      /** @internal */
      def _onVRFullScreenTriggered(): Unit = js.native
      
      /** @internal */
      var _onVrDisplayConnect: Nullable[js.Function1[/* display */ Any, Unit]] = js.native
      
      /** @internal */
      var _onVrDisplayDisconnect: Nullable[js.Function0[Unit]] = js.native
      
      /** @internal */
      var _onVrDisplayPresentChange: Nullable[js.Function0[Unit]] = js.native
      
      /**
        * @internal
        */
      def _renderViewStep(view: typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView): Boolean = js.native
      
      /** @internal */
      var _textureFormatInUse: String = js.native
      
      /** @internal */
      var _vrDisplay: Any = js.native
      
      /** @internal */
      var _vrExclusivePointerMode: Boolean = js.native
      
      /** @internal */
      var _vrSupported: Boolean = js.native
      
      /** @internal */
      var _webVRInitPromise: js.Promise[IDisplayChangedEventArgs] = js.native
      
      /**
        * Gets the current engine view
        * @see https://doc.babylonjs.com/features/featuresDeepDive/scene/multiCanvas
        */
      var activeView: Nullable[typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView] = js.native
      
      /**
        * Initiates an occlusion query
        * @param algorithmType defines the algorithm to use
        * @param query defines the query to use
        * @returns the current engine
        * @see https://doc.babylonjs.com/features/featuresDeepDive/occlusionQueries
        */
      def beginOcclusionQuery(algorithmType: Double, query: OcclusionQuery): Boolean = js.native
      
      /**
        * Begins a transform feedback operation
        * @param usePoints defines if points or triangles must be used
        */
      def beginTransformFeedback(usePoints: Boolean): Unit = js.native
      
      /**
        * Binds a multiview render target wrapper to be drawn to
        * @param multiviewTexture render target wrapper to bind
        */
      def bindMultiviewFramebuffer(multiviewTexture: RenderTargetWrapper): Unit = js.native
      
      /**
        * Bind a webGL transform feedback object to the webgl context
        * @param value defines the webGL transform feedback object to bind
        */
      def bindTransformFeedback(value: Nullable[WebGLTransformFeedback]): Unit = js.native
      
      /**
        * Bind a webGL buffer for a transform feedback operation
        * @param value defines the webGL buffer to bind
        */
      def bindTransformFeedbackBuffer(value: Nullable[DataBuffer]): Unit = js.native
      
      /**
        * Enable or disable the GPU frame time capture
        * @param value True to enable, false to disable
        */
      def captureGPUFrameTime(value: Boolean): Unit = js.native
      
      /**
        * Creates a new multiview render target
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @returns the created multiview render target wrapper
        */
      def createMultiviewRenderTargetTexture(width: Double, height: Double): RenderTargetWrapper = js.native
      
      /**
        * Create a new webGL query (you must be sure that queries are supported by checking getCaps() function)
        * @returns the new query
        */
      def createQuery(): OcclusionQuery = js.native
      
      /**
        * Creates a webGL transform feedback object
        * Please makes sure to check webGLVersion property to check if you are running webGL 2+
        * @returns the webGL transform feedback object
        */
      def createTransformFeedback(): WebGLTransformFeedback = js.native
      
      /**
        * Delete and release a webGL query
        * @param query defines the query to delete
        * @returns the current engine
        */
      def deleteQuery(query: OcclusionQuery): typings.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
      
      /**
        * Delete a webGL transform feedback object
        * @param value defines the webGL transform feedback object to delete
        */
      def deleteTransformFeedback(value: WebGLTransformFeedback): Unit = js.native
      
      /**
        * Call this function to switch to webVR mode
        * Will do nothing if webVR is not supported or if there is no webVR device
        * @param options the webvr options provided to the camera. mainly used for multiview
        * @see https://doc.babylonjs.com/features/featuresDeepDive/cameras/webVRCamera
        */
      def enableVR(options: WebVROptions): Unit = js.native
      
      /**
        * Ends an occlusion query
        * @see https://doc.babylonjs.com/features/featuresDeepDive/occlusionQueries
        * @param algorithmType defines the algorithm to use
        * @returns the current engine
        */
      def endOcclusionQuery(algorithmType: Double): typings.babylonjs.enginesExtensionsEngineDotqueryMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
      
      /**
        * Ends a time query
        * @param token defines the token used to measure the time span
        * @returns the time spent (in ns)
        */
      def endTimeQuery(token: TimeToken): int = js.native
      
      /**
        * Ends a transform feedback operation
        */
      def endTransformFeedback(): Unit = js.native
      
      /**
        * Get the performance counter associated with the frame time computation
        * @returns the perf counter
        */
      def getGPUFrameTimeCounter(): PerfCounter = js.native
      
      /**
        * Gets the value of a given query
        * @param query defines the query to check
        * @returns the value of the query
        */
      def getQueryResult(query: OcclusionQuery): Double = js.native
      
      /**
        * Gets the current webVR device
        * @returns the current webVR device (or null)
        */
      def getVRDevice(): Any = js.native
      
      /**
        * Initializes a webVR display and starts listening to display change events
        * The onVRDisplayChangedObservable will be notified upon these changes
        * @returns A promise containing a VRDisplay and if vr is supported
        */
      def initWebVRAsync(): js.Promise[IDisplayChangedEventArgs] = js.native
      
      /**
        * Gets or sets the  HTML element to use for attaching events
        */
      var inputElement: Nullable[HTMLElement] = js.native
      
      /**
        * Gets a boolean indicating that the engine is currently in VR exclusive mode for the pointers
        * @see https://docs.microsoft.com/en-us/microsoft-edge/webvr/essentials#mouse-input
        */
      var isInVRExclusivePointerMode: Boolean = js.native
      
      /**
        * Check if a given query has resolved and got its value
        * @param query defines the query to check
        * @returns true if the query got its value
        */
      def isQueryResultAvailable(query: OcclusionQuery): Boolean = js.native
      
      /**
        * Gets a boolean indicating if a webVR device was detected
        * @returns true if a webVR device was detected
        */
      def isVRDevicePresent(): Boolean = js.native
      
      /**
        * Will be triggered after the view rendered
        */
      val onAfterViewRenderObservable: Observable[typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView] = js.native
      
      /**
        * Will be triggered before the view renders
        */
      val onBeforeViewRenderObservable: Observable[typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView] = js.native
      
      /**
        * Observable signaled when VR display mode changes
        */
      var onVRDisplayChangedObservable: Observable[IDisplayChangedEventArgs] = js.native
      
      /**
        * Observable signaled when VR request present is complete
        */
      var onVRRequestPresentComplete: Observable[Boolean] = js.native
      
      /**
        * Observable signaled when VR request present starts
        */
      var onVRRequestPresentStart: Observable[
            typings.babylonjs.enginesExtensionsEngineDotwebVRMod.babylonjsEnginesEngineAugmentingMod.Engine
          ] = js.native
      
      /**
        * Register a new child canvas
        * @param canvas defines the canvas to register
        * @param camera defines an optional camera to use with this canvas (it will overwrite the scene.camera for this view)
        * @param clearBeforeCopy Indicates if the destination view canvas should be cleared before copying the parent canvas. Can help if the scene clear color has alpha < 1
        * @returns the associated view
        */
      def registerView(canvas: HTMLCanvasElement): typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView = js.native
      def registerView(canvas: HTMLCanvasElement, camera: Unit, clearBeforeCopy: Boolean): typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView = js.native
      def registerView(canvas: HTMLCanvasElement, camera: Camera): typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView = js.native
      def registerView(canvas: HTMLCanvasElement, camera: Camera, clearBeforeCopy: Boolean): typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView = js.native
      
      /**
        * Set the compressed texture extensions or file names to skip.
        *
        * @param skippedFiles defines the list of those texture files you want to skip
        * Example: [".dds", ".env", "myfile.png"]
        */
      def setCompressedTextureExclusions(skippedFiles: js.Array[String]): Unit = js.native
      
      /**
        * Set the compressed texture format to use, based on the formats you have, and the formats
        * supported by the hardware / browser.
        *
        * Khronos Texture Container (.ktx) files are used to support this.  This format has the
        * advantage of being specifically designed for OpenGL.  Header elements directly correspond
        * to API arguments needed to compressed textures.  This puts the burden on the container
        * generator to house the arcane code for determining these for current & future formats.
        *
        * for description see https://www.khronos.org/opengles/sdk/tools/KTX/
        * for file layout see https://www.khronos.org/opengles/sdk/tools/KTX/file_format_spec/
        *
        * Note: The result of this call is not taken into account when a texture is base64.
        *
        * @param formatsAvailable defines the list of those format families you have created
        * on your server.  Syntax: '-' + format family + '.ktx'.  (Case and order do not matter.)
        *
        * Current families are astc, dxt, pvrtc, etc2, & etc1.
        * @returns The extension selected.
        */
      def setTextureFormatToUse(formatsAvailable: js.Array[String]): Nullable[String] = js.native
      
      /**
        * Specify the varyings to use with transform feedback
        * @param program defines the associated webGL program
        * @param value defines the list of strings representing the varying names
        */
      def setTranformFeedbackVaryings(program: WebGLProgram, value: js.Array[String]): Unit = js.native
      
      /**
        * Starts a time query (used to measure time spent by the GPU on a specific frame)
        * Please note that only one query can be issued at a time
        * @returns a time token used to track the time span
        */
      def startTimeQuery(): Nullable[TimeToken] = js.native
      
      /**
        * Gets the texture format in use
        */
      val textureFormatInUse: Nullable[String] = js.native
      
      /**
        * Gets the list of texture formats supported
        */
      val texturesSupported: js.Array[String] = js.native
      
      /**
        * Remove a registered child canvas
        * @param canvas defines the canvas to remove
        * @returns the current engine
        */
      def unRegisterView(canvas: HTMLCanvasElement): typings.babylonjs.enginesExtensionsEngineDotviewsMod.babylonjsEnginesEngineAugmentingMod.Engine = js.native
      
      /** Gets or sets the list of views */
      var views: js.Array[typings.babylonjs.enginesExtensionsEngineDotviewsMod.EngineView] = js.native
      
      /**
        * Gets or sets the presentation attributes used to configure VR rendering
        */
      var vrPresentationAttributes: js.UndefOr[IVRPresentationAttributes] = js.native
    }
  }
  
  /* augmented module */
  object babylonjsEnginesThinEngineAugmentingMod {
    
    @js.native
    trait ThinEngine extends StObject {
      
      /** @internal */
      def _cascadeLoadFiles(
        scene: Nullable[Scene],
        onfinish: js.Function1[/* images */ js.Array[js.typedarray.ArrayBuffer], Unit],
        files: js.Array[String],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
      ): Unit = js.native
      
      /** @internal */
      def _cascadeLoadImgs(
        scene: Nullable[Scene],
        texture: InternalTexture,
        onfinish: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* images */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        files: js.Array[String],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
      ): Unit = js.native
      def _cascadeLoadImgs(
        scene: Nullable[Scene],
        texture: InternalTexture,
        onfinish: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* images */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        files: js.Array[String],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        mimeType: String
      ): Unit = js.native
      
      /**
        * Creates a depth stencil cube texture.
        * This is only available in WebGL 2.
        * @param size The size of face edge in the cube texture.
        * @param options The options defining the cube texture.
        * @param rtWrapper The render target wrapper for which the depth/stencil texture must be created
        * @returns The cube texture
        */
      def _createDepthStencilCubeTexture(size: Double, options: DepthTextureCreationOptions, rtWrapper: RenderTargetWrapper): InternalTexture = js.native
      
      /** @internal */
      def _createDepthStencilTexture(size: TextureSize, options: DepthTextureCreationOptions, rtWrapper: RenderTargetWrapper): InternalTexture = js.native
      
      /** @internal */
      def _createHardwareRenderTargetWrapper(isMulti: Boolean, isCube: Boolean, size: TextureSize): RenderTargetWrapper = js.native
      
      /** @internal */
      def _debugFlushPendingCommands(): Unit = js.native
      
      /** @internal */
      def _debugInsertMarker(text: String): Unit = js.native
      def _debugInsertMarker(text: String, targetObject: Double): Unit = js.native
      
      /** @internal */
      def _debugPopGroup(): Unit = js.native
      def _debugPopGroup(targetObject: Double): Unit = js.native
      
      /** @internal */
      def _debugPushGroup(groupName: String): Unit = js.native
      def _debugPushGroup(groupName: String, targetObject: Double): Unit = js.native
      
      /** @internal */
      def _deleteComputePipelineContext(pipelineContext: IComputePipelineContext): Unit = js.native
      
      /** @internal */
      def _executeWhenComputeStateIsCompiled(pipelineContext: IComputePipelineContext, action: js.Function0[Unit]): Unit = js.native
      
      /** @internal */
      def _partialLoadFile(
        url: String,
        index: Double,
        loadedFiles: js.Array[js.typedarray.ArrayBuffer],
        onfinish: js.Function1[/* files */ js.Array[js.typedarray.ArrayBuffer], Unit],
        onErrorCallBack: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
      ): Unit = js.native
      
      /** @internal */
      def _partialLoadImg(
        url: String,
        index: Double,
        loadedImages: js.Array[HTMLImageElement | ImageBitmap],
        scene: Nullable[Scene],
        texture: InternalTexture,
        onfinish: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* images */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        onErrorCallBack: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[Any], Unit]]
      ): Unit = js.native
      def _partialLoadImg(
        url: String,
        index: Double,
        loadedImages: js.Array[HTMLImageElement | ImageBitmap],
        scene: Nullable[Scene],
        texture: InternalTexture,
        onfinish: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* images */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        onErrorCallBack: Nullable[js.Function2[js.UndefOr[String], js.UndefOr[Any], Unit]],
        mimeType: String
      ): Unit = js.native
      
      /** @internal */
      def _prepareComputePipelineContext(
        pipelineContext: IComputePipelineContext,
        computeSourceCode: String,
        rawComputeSourceCode: String,
        defines: Nullable[String],
        entryPoint: String
      ): Unit = js.native
      
      /** @internal */
      def _readTexturePixels(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: js.UndefOr[Double],
        level: js.UndefOr[Double],
        buffer: js.UndefOr[Nullable[js.typedarray.ArrayBufferView]],
        flushRenderer: js.UndefOr[Boolean],
        noDataConversion: js.UndefOr[Boolean],
        x: js.UndefOr[Double],
        y: js.UndefOr[Double]
      ): js.Promise[js.typedarray.ArrayBufferView] = js.native
      
      /** @internal */
      def _readTexturePixelsSync(
        texture: InternalTexture,
        width: Double,
        height: Double,
        faceIndex: js.UndefOr[Double],
        level: js.UndefOr[Double],
        buffer: js.UndefOr[Nullable[js.typedarray.ArrayBufferView]],
        flushRenderer: js.UndefOr[Boolean],
        noDataConversion: js.UndefOr[Boolean],
        x: js.UndefOr[Double],
        y: js.UndefOr[Double]
      ): js.typedarray.ArrayBufferView = js.native
      
      /** @internal */
      def _rebuildComputeEffects(): Unit = js.native
      
      /** @internal */
      def _releaseComputeEffect(effect: ComputeEffect): Unit = js.native
      
      /**
        * @internal
        */
      def _setCubeMapTextureParams(texture: InternalTexture, loadMipmap: Boolean): Unit = js.native
      def _setCubeMapTextureParams(texture: InternalTexture, loadMipmap: Boolean, maxLevel: Double): Unit = js.native
      
      /**
        * Gets a boolean indicating if all created compute effects are ready
        * @returns true if all effects are ready
        */
      def areAllComputeEffectsReady(): Boolean = js.native
      
      /**
        * Select a subsets of attachments to draw to.
        * @param attachments gl attachments
        */
      def bindAttachments(attachments: js.Array[Double]): Unit = js.native
      
      /**
        * Bind a specific block at a given index in a specific shader program
        * @param pipelineContext defines the pipeline context to use
        * @param blockName defines the block name
        * @param index defines the index where to bind the block
        */
      def bindUniformBlock(pipelineContext: IPipelineContext, blockName: String, index: Double): Unit = js.native
      
      /**
        * Bind an uniform buffer to the current webGL context
        * @param buffer defines the buffer to bind
        */
      def bindUniformBuffer(buffer: Nullable[DataBuffer]): Unit = js.native
      
      /**
        * Bind a buffer to the current webGL context at a given location
        * @param buffer defines the buffer to bind
        * @param location defines the index where to bind the buffer
        * @param name Name of the uniform variable to bind
        */
      def bindUniformBufferBase(buffer: DataBuffer, location: Double, name: String): Unit = js.native
      
      /**
        * Creates a layout object to draw/clear on specific textures in a MRT
        * @param textureStatus textureStatus[i] indicates if the i-th is active
        * @returns A layout to be fed to the engine, calling `bindAttachments`.
        */
      def buildTextureLayout(textureStatus: js.Array[Boolean]): js.Array[Double] = js.native
      
      /**
        * Dispatches a compute shader
        * @param effect The compute effect
        * @param context The compute context
        * @param bindings The list of resources to bind to the shader
        * @param x The number of workgroups to execute on the X dimension
        * @param y The number of workgroups to execute on the Y dimension
        * @param z The number of workgroups to execute on the Z dimension
        * @param bindingsMapping list of bindings mapping (key is property name, value is binding location)
        */
      def computeDispatch(effect: ComputeEffect, context: IComputeContext, bindings: ComputeBindingList, x: Double): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Double
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Double,
        z: Double
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Double,
        z: Double,
        bindingsMapping: ComputeBindingMapping
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Double,
        z: Unit,
        bindingsMapping: ComputeBindingMapping
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Unit,
        z: Double
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Unit,
        z: Double,
        bindingsMapping: ComputeBindingMapping
      ): Unit = js.native
      def computeDispatch(
        effect: ComputeEffect,
        context: IComputeContext,
        bindings: ComputeBindingList,
        x: Double,
        y: Unit,
        z: Unit,
        bindingsMapping: ComputeBindingMapping
      ): Unit = js.native
      
      /**
        * Creates a new compute context
        * @returns the new context
        */
      def createComputeContext(): js.UndefOr[IComputeContext] = js.native
      
      /**
        * Creates a new compute effect
        * @param baseName Name of the effect
        * @param options Options used to create the effect
        * @returns The new compute effect
        */
      def createComputeEffect(baseName: Any, options: IComputeEffectCreationOptions): ComputeEffect = js.native
      
      /**
        * Creates a new compute pipeline context
        * @returns the new pipeline
        */
      def createComputePipelineContext(): IComputePipelineContext = js.native
      
      /**
        * Creates a cube texture
        * @param rootUrl defines the url where the files to load is located
        * @param scene defines the current scene
        * @param files defines the list of files to load (1 per face)
        * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
        * @param onLoad defines an optional callback raised when the texture is loaded
        * @param onError defines an optional callback raised if there is an issue to load the texture
        * @param format defines the format of the data
        * @param forcedExtension defines the extension to use to pick the right loader
        * @returns the cube texture as an InternalTexture
        */
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any
      ): InternalTexture = js.native
      /**
        * Creates a cube texture
        * @param rootUrl defines the url where the files to load is located
        * @param scene defines the current scene
        * @param files defines the list of files to load (1 per face)
        * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
        * @param onLoad defines an optional callback raised when the texture is loaded
        * @param onError defines an optional callback raised if there is an issue to load the texture
        * @param format defines the format of the data
        * @param forcedExtension defines the extension to use to pick the right loader
        * @param createPolynomials if a polynomial sphere should be created for the cube texture
        * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
        * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
        * @returns the cube texture as an InternalTexture
        */
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double
      ): InternalTexture = js.native
      /**
        * Creates a cube texture
        * @param rootUrl defines the url where the files to load is located
        * @param scene defines the current scene
        * @param files defines the list of files to load (1 per face)
        * @param noMipmap defines a boolean indicating that no mipmaps shall be generated (false by default)
        * @param onLoad defines an optional callback raised when the texture is loaded
        * @param onError defines an optional callback raised if there is an issue to load the texture
        * @param format defines the format of the data
        * @param forcedExtension defines the extension to use to pick the right loader
        * @param createPolynomials if a polynomial sphere should be created for the cube texture
        * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
        * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
        * @param fallback defines texture to use while falling back when (compressed) texture file not found.
        * @param loaderOptions options to be passed to the loader
        * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
        * @returns the cube texture as an InternalTexture
        */
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: Any,
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: Any,
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Unit,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: Any,
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      def createCubeTexture(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Unit,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        loaderOptions: Any,
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      
      /** @internal */
      def createCubeTextureBase(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Double,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        beforeLoadCubeDataCallback: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* data */ js.typedarray.ArrayBufferView | js.Array[js.typedarray.ArrayBufferView], 
                Unit
              ]
            ],
        imageHandler: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* imgs */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      def createCubeTextureBase(
        rootUrl: String,
        scene: Nullable[Scene],
        files: Nullable[js.Array[String]],
        noMipmap: Boolean,
        onLoad: Nullable[js.Function1[/* data */ js.UndefOr[Any], Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        format: Unit,
        forcedExtension: Any,
        createPolynomials: Boolean,
        lodScale: Double,
        lodOffset: Double,
        fallback: Nullable[InternalTexture],
        beforeLoadCubeDataCallback: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* data */ js.typedarray.ArrayBufferView | js.Array[js.typedarray.ArrayBufferView], 
                Unit
              ]
            ],
        imageHandler: Nullable[
              js.Function2[
                /* texture */ InternalTexture, 
                /* imgs */ js.Array[HTMLImageElement | ImageBitmap], 
                Unit
              ]
            ],
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      
      /**
        * Creates a depth stencil texture.
        * This is only available in WebGL 2 or with the depth texture extension available.
        * @param size The size of face edge in the texture.
        * @param options The options defining the texture.
        * @param rtWrapper The render target wrapper for which the depth/stencil texture must be created
        * @returns The texture
        */
      def createDepthStencilTexture(size: TextureSize, options: DepthTextureCreationOptions, rtWrapper: RenderTargetWrapper): InternalTexture = js.native
      
      /**
        * Creates a dynamic texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param generateMipMaps defines if the engine should generate the mip levels
        * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
        * @returns the dynamic texture inside an InternalTexture
        */
      def createDynamicTexture(width: Double, height: Double, generateMipMaps: Boolean, samplingMode: Double): InternalTexture = js.native
      
      /**
        * Create a dynamic uniform buffer
        * @see https://doc.babylonjs.com/setup/support/webGL2#uniform-buffer-objets
        * @param elements defines the content of the uniform buffer
        * @returns the webGL uniform buffer
        */
      def createDynamicUniformBuffer(elements: FloatArray): DataBuffer = js.native
      
      /**
        * Creates an external texture
        * @param video video element
        * @returns the external texture, or null if external textures are not supported by the engine
        */
      def createExternalTexture(video: HTMLVideoElement): Nullable[ExternalTexture] = js.native
      
      /**
        * Create a multi render target texture
        * @see https://doc.babylonjs.com/setup/support/webGL2#multiple-render-target
        * @param size defines the size of the texture
        * @param options defines the creation options
        * @param initializeBuffers if set to true, the engine will make an initializing call of drawBuffers
        * @returns a new render target wrapper ready to render textures
        */
      def createMultipleRenderTarget(size: TextureSize, options: IMultiRenderTargetOptions): RenderTargetWrapper = js.native
      def createMultipleRenderTarget(size: TextureSize, options: IMultiRenderTargetOptions, initializeBuffers: Boolean): RenderTargetWrapper = js.native
      
      /**
        * Creates a new raw cube texture
        * @param data defines the array of data to use to create each face
        * @param size defines the size of the textures
        * @param format defines the format of the data
        * @param type defines the type of the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
        * @param generateMipMaps  defines if the engine should generate the mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param compression defines the compression used (null by default)
        * @returns the cube texture as an InternalTexture
        */
      def createRawCubeTexture(
        data: Nullable[js.Array[js.typedarray.ArrayBufferView]],
        size: Double,
        format: Double,
        `type`: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String]
      ): InternalTexture = js.native
      
      /**
        * Creates a new raw cube texture from a specified url
        * @param url defines the url where the data is located
        * @param scene defines the current scene
        * @param size defines the size of the textures
        * @param format defines the format of the data
        * @param type defines the type fo the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
        * @param noMipmap defines if the engine should avoid generating the mip levels
        * @param callback defines a callback used to extract texture data from loaded data
        * @param mipmapGenerator defines to provide an optional tool to generate mip levels
        * @param onLoad defines a callback called when texture is loaded
        * @param onError defines a callback called if there is an error
        * @returns the cube texture as an InternalTexture
        */
      def createRawCubeTextureFromUrl(
        url: String,
        scene: Nullable[Scene],
        size: Double,
        format: Double,
        `type`: Double,
        noMipmap: Boolean,
        callback: js.Function1[
              /* ArrayBuffer */ js.typedarray.ArrayBuffer, 
              Nullable[js.Array[js.typedarray.ArrayBufferView]]
            ],
        mipmapGenerator: Nullable[
              js.Function1[
                /* faces */ js.Array[js.typedarray.ArrayBufferView], 
                js.Array[js.Array[js.typedarray.ArrayBufferView]]
              ]
            ],
        onLoad: Nullable[js.Function0[Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ]
      ): InternalTexture = js.native
      /**
        * Creates a new raw cube texture from a specified url
        * @param url defines the url where the data is located
        * @param scene defines the current scene
        * @param size defines the size of the textures
        * @param format defines the format of the data
        * @param type defines the type fo the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
        * @param noMipmap defines if the engine should avoid generating the mip levels
        * @param callback defines a callback used to extract texture data from loaded data
        * @param mipmapGenerator defines to provide an optional tool to generate mip levels
        * @param onLoad defines a callback called when texture is loaded
        * @param onError defines a callback called if there is an error
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param invertY defines if data must be stored with Y axis inverted
        * @returns the cube texture as an InternalTexture
        */
      def createRawCubeTextureFromUrl(
        url: String,
        scene: Nullable[Scene],
        size: Double,
        format: Double,
        `type`: Double,
        noMipmap: Boolean,
        callback: js.Function1[
              /* ArrayBuffer */ js.typedarray.ArrayBuffer, 
              Nullable[js.Array[js.typedarray.ArrayBufferView]]
            ],
        mipmapGenerator: Nullable[
              js.Function1[
                /* faces */ js.Array[js.typedarray.ArrayBufferView], 
                js.Array[js.Array[js.typedarray.ArrayBufferView]]
              ]
            ],
        onLoad: Nullable[js.Function0[Unit]],
        onError: Nullable[
              js.Function2[/* message */ js.UndefOr[String], /* exception */ js.UndefOr[Any], Unit]
            ],
        samplingMode: Double,
        invertY: Boolean
      ): InternalTexture = js.native
      
      /**
        * Creates a raw texture
        * @param data defines the data to store in the texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param format defines the format of the data
        * @param generateMipMaps defines if the engine should generate the mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (Texture.NEAREST_SAMPLINGMODE by default)
        * @param compression defines the compression used (null by default)
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
        * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
        * @returns the raw texture inside an InternalTexture
        */
      def createRawTexture(
        data: Nullable[js.typedarray.ArrayBufferView],
        width: Double,
        height: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        `type`: Double
      ): InternalTexture = js.native
      def createRawTexture(
        data: Nullable[js.typedarray.ArrayBufferView],
        width: Double,
        height: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        `type`: Double,
        creationFlags: Double
      ): InternalTexture = js.native
      def createRawTexture(
        data: Nullable[js.typedarray.ArrayBufferView],
        width: Double,
        height: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        `type`: Double,
        creationFlags: Double,
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      def createRawTexture(
        data: Nullable[js.typedarray.ArrayBufferView],
        width: Double,
        height: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        `type`: Double,
        creationFlags: Unit,
        useSRGBBuffer: Boolean
      ): InternalTexture = js.native
      
      /**
        * Creates a new raw 2D array texture
        * @param data defines the data used to create the texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param depth defines the number of layers of the texture
        * @param format defines the format of the texture
        * @param generateMipMaps defines if the engine must generate mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param compression defines the compressed used (can be null)
        * @param textureType defines the compressed used (can be null)
        * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
        * @returns a new raw 2D array texture (stored in an InternalTexture)
        */
      def createRawTexture2DArray(
        data: Nullable[js.typedarray.ArrayBufferView],
        width: Double,
        height: Double,
        depth: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        textureType: Double
      ): InternalTexture = js.native
      def createRawTexture2DArray(
        data: Nullable[js.typedarray.ArrayBufferView],
        width: Double,
        height: Double,
        depth: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        textureType: Double,
        creationFlags: Double
      ): InternalTexture = js.native
      
      /**
        * Creates a new raw 3D texture
        * @param data defines the data used to create the texture
        * @param width defines the width of the texture
        * @param height defines the height of the texture
        * @param depth defines the depth of the texture
        * @param format defines the format of the texture
        * @param generateMipMaps defines if the engine must generate mip levels
        * @param invertY defines if data must be stored with Y axis inverted
        * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
        * @param compression defines the compressed used (can be null)
        * @param textureType defines the compressed used (can be null)
        * @param creationFlags specific flags to use when creating the texture (Constants.TEXTURE_CREATIONFLAG_STORAGE for storage textures, for eg)
        * @returns a new raw 3D texture (stored in an InternalTexture)
        */
      def createRawTexture3D(
        data: Nullable[js.typedarray.ArrayBufferView],
        width: Double,
        height: Double,
        depth: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        textureType: Double
      ): InternalTexture = js.native
      def createRawTexture3D(
        data: Nullable[js.typedarray.ArrayBufferView],
        width: Double,
        height: Double,
        depth: Double,
        format: Double,
        generateMipMaps: Boolean,
        invertY: Boolean,
        samplingMode: Double,
        compression: Nullable[String],
        textureType: Double,
        creationFlags: Double
      ): InternalTexture = js.native
      
      /**
        * Creates a new render target cube wrapper
        * @param size defines the size of the texture
        * @param options defines the options used to create the texture
        * @returns a new render target cube wrapper
        */
      def createRenderTargetCubeTexture(size: Double): RenderTargetWrapper = js.native
      def createRenderTargetCubeTexture(size: Double, options: RenderTargetCreationOptions): RenderTargetWrapper = js.native
      
      /**
        * Creates a new render target texture
        * @param size defines the size of the texture
        * @param options defines the options used to create the texture
        * @returns a new render target wrapper ready to render texture
        */
      def createRenderTargetTexture(size: TextureSize, options: Boolean): RenderTargetWrapper = js.native
      def createRenderTargetTexture(size: TextureSize, options: RenderTargetCreationOptions): RenderTargetWrapper = js.native
      
      def createStorageBuffer(data: Double, creationFlags: Double): DataBuffer = js.native
      /**
        * Creates a storage buffer
        * @param data the data for the storage buffer or the size of the buffer
        * @param creationFlags flags to use when creating the buffer (see Constants.BUFFER_CREATIONFLAG_XXX). The BUFFER_CREATIONFLAG_STORAGE flag will be automatically added
        * @returns the new buffer
        */
      def createStorageBuffer(data: DataArray, creationFlags: Double): DataBuffer = js.native
      
      /**
        * Create an uniform buffer
        * @see https://doc.babylonjs.com/setup/support/webGL2#uniform-buffer-objets
        * @param elements defines the content of the uniform buffer
        * @returns the webGL uniform buffer
        */
      def createUniformBuffer(elements: FloatArray): DataBuffer = js.native
      
      /**
        * Gets the current alpha equation.
        * @returns the current alpha equation
        */
      def getAlphaEquation(): Double = js.native
      
      /**
        * Gets the current alpha mode
        * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/advanced/transparent_rendering
        * @returns the current alpha mode
        */
      def getAlphaMode(): Double = js.native
      
      /**
        * Read data from a storage buffer
        * @param storageBuffer The storage buffer to read from
        * @param offset The offset in the storage buffer to start reading from (default: 0)
        * @param size  The number of bytes to read from the storage buffer (default: capacity of the buffer)
        * @param buffer The buffer to write the data we have read from the storage buffer to (optional)
        * @returns If not undefined, returns the (promise) buffer (as provided by the 4th parameter) filled with the data, else it returns a (promise) Uint8Array with the data read from the storage buffer
        */
      def readFromStorageBuffer(storageBuffer: DataBuffer): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double, size: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double, size: Double, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Double, size: Unit, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Unit, size: Double): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Unit, size: Double, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
      def readFromStorageBuffer(storageBuffer: DataBuffer, offset: Unit, size: Unit, buffer: js.typedarray.ArrayBufferView): js.Promise[js.typedarray.ArrayBufferView] = js.native
      
      /**
        * Forces the engine to release all cached compute effects. This means that next effect compilation will have to be done completely even if a similar effect was already compiled
        */
      def releaseComputeEffects(): Unit = js.native
      
      /**
        * Restores the webgl state to only draw on the main color attachment
        * when the frame buffer associated is the canvas frame buffer
        */
      def restoreSingleAttachment(): Unit = js.native
      
      /**
        * Restores the webgl state to only draw on the main color attachment
        * when the frame buffer associated is not the canvas frame buffer
        */
      def restoreSingleAttachmentForRenderTarget(): Unit = js.native
      
      /**
        * Sets alpha constants used by some alpha blending modes
        * @param r defines the red component
        * @param g defines the green component
        * @param b defines the blue component
        * @param a defines the alpha component
        */
      def setAlphaConstants(r: Double, g: Double, b: Double, a: Double): Unit = js.native
      
      /**
        * Sets the current alpha equation
        * @param equation defines the equation to use (one of the Engine.ALPHA_EQUATION_XXX)
        */
      def setAlphaEquation(equation: Double): Unit = js.native
      
      /**
        * Sets the current alpha mode
        * @param mode defines the mode to use (one of the Engine.ALPHA_XXX)
        * @param noDepthWriteChange defines if depth writing state should remains unchanged (false by default)
        * @see https://doc.babylonjs.com/features/featuresDeepDive/materials/advanced/transparent_rendering
        */
      def setAlphaMode(mode: Double): Unit = js.native
      def setAlphaMode(mode: Double, noDepthWriteChange: Boolean): Unit = js.native
      
      /**
        * Sets an internal texture to the according uniform.
        * @param name The name of the uniform in the effect
        * @param texture The texture to apply
        */
      def setExternalTexture(name: String, texture: Nullable[ExternalTexture]): Unit = js.native
      
      /**
        * Sets a storage buffer in the shader
        * @param name Defines the name of the storage buffer as defined in the shader
        * @param buffer Defines the value to give to the uniform
        */
      def setStorageBuffer(name: String, buffer: Nullable[StorageBuffer]): Unit = js.native
      
      /**
        * Sets a texture sampler to the according uniform.
        * @param name The name of the uniform in the effect
        * @param sampler The sampler to apply
        */
      def setTextureSampler(name: String, sampler: Nullable[TextureSampler]): Unit = js.native
      
      /**
        * Unbind a list of render target textures from the webGL context
        * This is used only when drawBuffer extension or webGL2 are active
        * @param rtWrapper defines the render target wrapper to unbind
        * @param disableGenerateMipMaps defines a boolean indicating that mipmaps must not be generated
        * @param onBeforeUnbind defines a function which will be called before the effective unbind
        */
      def unBindMultiColorAttachmentFramebuffer(rtWrapper: RenderTargetWrapper, disableGenerateMipMaps: Boolean): Unit = js.native
      def unBindMultiColorAttachmentFramebuffer(
        rtWrapper: RenderTargetWrapper,
        disableGenerateMipMaps: Boolean,
        onBeforeUnbind: js.Function0[Unit]
      ): Unit = js.native
      
      /**
        * Update a dynamic index buffer
        * @param indexBuffer defines the target index buffer
        * @param indices defines the data to update
        * @param offset defines the offset in the target index buffer where update should start
        */
      def updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray): Unit = js.native
      def updateDynamicIndexBuffer(indexBuffer: DataBuffer, indices: IndicesArray, offset: Double): Unit = js.native
      
      /**
        * Update the content of a dynamic texture
        * @param texture defines the texture to update
        * @param source defines the source containing the data
        * @param invertY defines if data must be stored with Y axis inverted
        * @param premulAlpha defines if alpha is stored as premultiplied
        * @param format defines the format of the data
        * @param forceBindTexture if the texture should be forced to be bound eg. after a graphics context loss (Default: false)
        * @param allowGPUOptimization true to allow some specific GPU optimizations (subject to engine feature "allowGPUOptimizationsForGUI" being true)
        */
      def updateDynamicTexture(
        texture: Nullable[InternalTexture],
        source: ImageBitmap | ImageData | HTMLImageElement | HTMLCanvasElement | HTMLVideoElement | OffscreenCanvas | ICanvas,
        invertY: js.UndefOr[Boolean],
        premulAlpha: js.UndefOr[Boolean],
        format: js.UndefOr[Double],
        forceBindTexture: js.UndefOr[Boolean],
        allowGPUOptimization: js.UndefOr[Boolean]
      ): Unit = js.native
      
      /**
        * Updates a dynamic vertex buffer.
        * @param vertexBuffer the vertex buffer to update
        * @param data the data used to update the vertex buffer
        * @param byteOffset the byte offset of the data
        * @param byteLength the byte length of the data
        */
      def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray): Unit = js.native
      def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Double): Unit = js.native
      def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Double, byteLength: Double): Unit = js.native
      def updateDynamicVertexBuffer(vertexBuffer: DataBuffer, data: DataArray, byteOffset: Unit, byteLength: Double): Unit = js.native
      
      /**
        * Update the sample count for a given multiple render target texture
        * @see https://doc.babylonjs.com/setup/support/webGL2#multisample-render-targets
        * @param rtWrapper defines the render target wrapper to update
        * @param samples defines the sample count to set
        * @param initializeBuffers if set to true, the engine will make an initializing call of drawBuffers
        * @returns the effective sample count (could be 0 if multisample render targets are not supported)
        */
      def updateMultipleRenderTargetTextureSampleCount(rtWrapper: Nullable[RenderTargetWrapper], samples: Double): Double = js.native
      def updateMultipleRenderTargetTextureSampleCount(rtWrapper: Nullable[RenderTargetWrapper], samples: Double, initializeBuffers: Boolean): Double = js.native
      
      /**
        * Update a raw cube texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawCubeTexture(
        texture: InternalTexture,
        data: js.Array[js.typedarray.ArrayBufferView],
        format: Double,
        `type`: Double,
        invertY: Boolean
      ): Unit = js.native
      /**
        * Update a raw cube texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the compression used (null by default)
        */
      def updateRawCubeTexture(
        texture: InternalTexture,
        data: js.Array[js.typedarray.ArrayBufferView],
        format: Double,
        `type`: Double,
        invertY: Boolean,
        compression: Nullable[String]
      ): Unit = js.native
      /**
        * Update a raw cube texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the compression used (null by default)
        * @param level defines which level of the texture to update
        */
      def updateRawCubeTexture(
        texture: InternalTexture,
        data: js.Array[js.typedarray.ArrayBufferView],
        format: Double,
        `type`: Double,
        invertY: Boolean,
        compression: Nullable[String],
        level: Double
      ): Unit = js.native
      
      /**
        * Update a raw texture
        * @param texture defines the texture to update
        * @param data defines the data to store in the texture
        * @param format defines the format of the data
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawTexture(
        texture: Nullable[InternalTexture],
        data: Nullable[js.typedarray.ArrayBufferView],
        format: Double,
        invertY: Boolean
      ): Unit = js.native
      /**
        * Update a raw texture
        * @param texture defines the texture to update
        * @param data defines the data to store in the texture
        * @param format defines the format of the data
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the compression used (null by default)
        * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
        * @param useSRGBBuffer defines if the texture must be loaded in a sRGB GPU buffer (if supported by the GPU).
        */
      def updateRawTexture(
        texture: Nullable[InternalTexture],
        data: Nullable[js.typedarray.ArrayBufferView],
        format: Double,
        invertY: Boolean,
        compression: Nullable[String],
        `type`: Double,
        useSRGBBuffer: Boolean
      ): Unit = js.native
      
      /**
        * Update a raw 2D array texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawTexture2DArray(
        texture: InternalTexture,
        data: Nullable[js.typedarray.ArrayBufferView],
        format: Double,
        invertY: Boolean
      ): Unit = js.native
      /**
        * Update a raw 2D array texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the used compression (can be null)
        * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
        */
      def updateRawTexture2DArray(
        texture: InternalTexture,
        data: Nullable[js.typedarray.ArrayBufferView],
        format: Double,
        invertY: Boolean,
        compression: Nullable[String],
        textureType: Double
      ): Unit = js.native
      
      /**
        * Update a raw 3D texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateRawTexture3D(
        texture: InternalTexture,
        data: Nullable[js.typedarray.ArrayBufferView],
        format: Double,
        invertY: Boolean
      ): Unit = js.native
      /**
        * Update a raw 3D texture
        * @param texture defines the texture to update
        * @param data defines the data to store
        * @param format defines the data format
        * @param invertY defines if data must be stored with Y axis inverted
        * @param compression defines the used compression (can be null)
        * @param textureType defines the texture Type (Engine.TEXTURETYPE_UNSIGNED_INT, Engine.TEXTURETYPE_FLOAT...)
        */
      def updateRawTexture3D(
        texture: InternalTexture,
        data: Nullable[js.typedarray.ArrayBufferView],
        format: Double,
        invertY: Boolean,
        compression: Nullable[String],
        textureType: Double
      ): Unit = js.native
      
      /**
        * Updates the sample count of a render target texture
        * @see https://doc.babylonjs.com/setup/support/webGL2#multisample-render-targets
        * @param rtWrapper defines the render target wrapper to update
        * @param samples defines the sample count to set
        * @returns the effective sample count (could be 0 if multisample render targets are not supported)
        */
      def updateRenderTargetTextureSampleCount(rtWrapper: Nullable[RenderTargetWrapper], samples: Double): Double = js.native
      
      /**
        * Updates a storage buffer
        * @param buffer the storage buffer to update
        * @param data the data used to update the storage buffer
        * @param byteOffset the byte offset of the data
        * @param byteLength the byte length of the data
        */
      def updateStorageBuffer(buffer: DataBuffer, data: DataArray): Unit = js.native
      def updateStorageBuffer(buffer: DataBuffer, data: DataArray, byteOffset: Double): Unit = js.native
      def updateStorageBuffer(buffer: DataBuffer, data: DataArray, byteOffset: Double, byteLength: Double): Unit = js.native
      def updateStorageBuffer(buffer: DataBuffer, data: DataArray, byteOffset: Unit, byteLength: Double): Unit = js.native
      
      /**
        * Update an existing uniform buffer
        * @see https://doc.babylonjs.com/setup/support/webGL2#uniform-buffer-objets
        * @param uniformBuffer defines the target uniform buffer
        * @param elements defines the content to update
        * @param offset defines the offset in the uniform buffer where update should start
        * @param count defines the size of the data to update
        */
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray): Unit = js.native
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double): Unit = js.native
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Double, count: Double): Unit = js.native
      def updateUniformBuffer(uniformBuffer: DataBuffer, elements: FloatArray, offset: Unit, count: Double): Unit = js.native
      
      /**
        * Update a video texture
        * @param texture defines the texture to update
        * @param video defines the video element to use
        * @param invertY defines if data must be stored with Y axis inverted
        */
      def updateVideoTexture(texture: Nullable[InternalTexture], video: HTMLVideoElement, invertY: Boolean): Unit = js.native
      def updateVideoTexture(texture: Nullable[InternalTexture], video: Nullable[ExternalTexture], invertY: Boolean): Unit = js.native
    }
  }
  
  /* augmented module */
  object babylonjsMeshesAbstractMeshAugmentingMod {
    
    trait AbstractMesh extends StObject {
      
      /**
        * Backing filed
        * @internal
        */
      var __occlusionDataStorage: typings.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionDataStorage
      
      /**
        * Access property
        * @internal
        */
      var _occlusionDataStorage: typings.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionDataStorage
      
      /**
        * Flag to force rendering the mesh even if occluded
        * @see https://doc.babylonjs.com/features/featuresDeepDive/occlusionQueries
        */
      var forceRenderingWhenOccluded: Boolean
      
      /**
        * Gets or sets whether the mesh is occluded or not, it is used also to set the initial state of the mesh to be occluded or not
        * @see https://doc.babylonjs.com/features/featuresDeepDive/occlusionQueries
        */
      var isOccluded: Boolean
      
      /**
        * Flag to check the progress status of the query
        * @see https://doc.babylonjs.com/features/featuresDeepDive/occlusionQueries
        */
      var isOcclusionQueryInProgress: Boolean
      
      /**
        * This property determines the type of occlusion query algorithm to run in WebGl, you can use:
        * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_ACCURATE which is mapped to GL_ANY_SAMPLES_PASSED.
        * * AbstractMesh.OCCLUSION_ALGORITHM_TYPE_CONSERVATIVE (Default Value) which is mapped to GL_ANY_SAMPLES_PASSED_CONSERVATIVE which is a false positive algorithm that is faster than GL_ANY_SAMPLES_PASSED but less accurate.
        * @see https://doc.babylonjs.com/features/featuresDeepDive/occlusionQueries
        */
      var occlusionQueryAlgorithmType: Double
      
      /**
        * This number indicates the number of allowed retries before stop the occlusion query, this is useful if the occlusion query is taking long time before to the query result is retrieved, the query result indicates if the object is visible within the scene or not and based on that Babylon.Js engine decides to show or hide the object.
        * The default value is -1 which means don't break the query and wait till the result
        * @see https://doc.babylonjs.com/features/featuresDeepDive/occlusionQueries
        */
      var occlusionRetryCount: Double
      
      /**
        * This property is responsible for starting the occlusion query within the Mesh or not, this property is also used to determine what should happen when the occlusionRetryCount is reached. It has supports 3 values:
        * * OCCLUSION_TYPE_NONE (Default Value): this option means no occlusion query within the Mesh.
        * * OCCLUSION_TYPE_OPTIMISTIC: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken show the mesh.
        * * OCCLUSION_TYPE_STRICT: this option is means use occlusion query and if occlusionRetryCount is reached and the query is broken restore the last state of the mesh occlusion if the mesh was visible then show the mesh if was hidden then hide don't show.
        * @see https://doc.babylonjs.com/features/featuresDeepDive/occlusionQueries
        */
      var occlusionType: Double
    }
    object AbstractMesh {
      
      inline def apply(
        __occlusionDataStorage: typings.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionDataStorage,
        _occlusionDataStorage: typings.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionDataStorage,
        forceRenderingWhenOccluded: Boolean,
        isOccluded: Boolean,
        isOcclusionQueryInProgress: Boolean,
        occlusionQueryAlgorithmType: Double,
        occlusionRetryCount: Double,
        occlusionType: Double
      ): AbstractMesh = {
        val __obj = js.Dynamic.literal(__occlusionDataStorage = __occlusionDataStorage.asInstanceOf[js.Any], _occlusionDataStorage = _occlusionDataStorage.asInstanceOf[js.Any], forceRenderingWhenOccluded = forceRenderingWhenOccluded.asInstanceOf[js.Any], isOccluded = isOccluded.asInstanceOf[js.Any], isOcclusionQueryInProgress = isOcclusionQueryInProgress.asInstanceOf[js.Any], occlusionQueryAlgorithmType = occlusionQueryAlgorithmType.asInstanceOf[js.Any], occlusionRetryCount = occlusionRetryCount.asInstanceOf[js.Any], occlusionType = occlusionType.asInstanceOf[js.Any])
        __obj.asInstanceOf[AbstractMesh]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: AbstractMesh] (val x: Self) extends AnyVal {
        
        inline def setForceRenderingWhenOccluded(value: Boolean): Self = StObject.set(x, "forceRenderingWhenOccluded", value.asInstanceOf[js.Any])
        
        inline def setIsOccluded(value: Boolean): Self = StObject.set(x, "isOccluded", value.asInstanceOf[js.Any])
        
        inline def setIsOcclusionQueryInProgress(value: Boolean): Self = StObject.set(x, "isOcclusionQueryInProgress", value.asInstanceOf[js.Any])
        
        inline def setOcclusionQueryAlgorithmType(value: Double): Self = StObject.set(x, "occlusionQueryAlgorithmType", value.asInstanceOf[js.Any])
        
        inline def setOcclusionRetryCount(value: Double): Self = StObject.set(x, "occlusionRetryCount", value.asInstanceOf[js.Any])
        
        inline def setOcclusionType(value: Double): Self = StObject.set(x, "occlusionType", value.asInstanceOf[js.Any])
        
        inline def set__occlusionDataStorage(value: typings.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionDataStorage): Self = StObject.set(x, "__occlusionDataStorage", value.asInstanceOf[js.Any])
        
        inline def set_occlusionDataStorage(value: typings.babylonjs.enginesExtensionsEngineDotqueryMod.OcclusionDataStorage): Self = StObject.set(x, "_occlusionDataStorage", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    @js.native
    trait Scene extends StObject {
      
      /** @internal */
      def _createMultiviewUbo(): Unit = js.native
      
      /** @internal */
      var _multiviewSceneUbo: Nullable[UniformBuffer] = js.native
      
      /** @internal */
      def _renderMultiviewToSingleView(camera: Camera): Unit = js.native
      
      /** @internal */
      var _transformMatrixR: Matrix = js.native
      
      /** @internal */
      def _updateMultiviewUbo(): Unit = js.native
      def _updateMultiviewUbo(viewR: Unit, projectionR: Matrix): Unit = js.native
      def _updateMultiviewUbo(viewR: Matrix): Unit = js.native
      def _updateMultiviewUbo(viewR: Matrix, projectionR: Matrix): Unit = js.native
    }
  }
}
