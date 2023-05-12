package typings.babylonjs

import typings.babylonjs.abstractSceneMod.AbstractScene
import typings.babylonjs.animationsAnimationMod.Animation
import typings.babylonjs.camerasCameraMod.Camera
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.enginesRenderTargetWrapperMod.RenderTargetWrapper
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsNodeNodeMaterialMod.NodeMaterial
import typings.babylonjs.materialsShaderLanguageMod.ShaderLanguage
import typings.babylonjs.materialsTexturesInternalTextureMod.InternalTexture
import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.miscIInspectableMod.IInspectable
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscSmartArrayMod.SmartArray
import typings.babylonjs.renderingPrePassEffectConfigurationMod.PrePassEffectConfiguration
import typings.babylonjs.renderingPrePassRendererMod.PrePassRenderer
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postProcessesPostProcessMod {
  
  @JSImport("babylonjs/PostProcesses/postProcess", "PostProcess")
  @js.native
  open class PostProcess protected () extends StObject {
    /**
      * Creates a new instance PostProcess
      * @param name The name of the PostProcess.
      * @param fragmentUrl The url of the fragment shader to be used.
      * @param parameters Array of the names of uniform non-sampler2D variables that will be passed to the shader.
      * @param samplers Array of the names of uniform sampler2D variables that will be passed to the shader.
      * @param options The required width/height ratio to downsize to before computing the render pass. (Use 1.0 for full size)
      * @param camera The camera to apply the render pass to.
      * @param samplingMode The sampling mode to be used when computing the pass. (default: 0)
      * @param engine The engine which the post process will be applied. (default: current engine)
      * @param reusable If the post process can be reused on the same frame. (default: false)
      * @param defines String of defines that will be set when running the fragment shader. (default: null)
      * @param textureType Type of textures used when performing the post process. (default: 0)
      * @param vertexUrl The url of the vertex shader to be used. (default: "postprocess")
      * @param indexParameters The index parameters to be used for babylons include syntax "#include<kernelBlurVaryingDeclaration>[0..varyingCount]". (default: undefined) See usage in babylon.blurPostProcess.ts and kernelBlur.vertex.fx
      * @param blockCompilation If the shader should not be compiled immediatly. (default: false)
      * @param textureFormat Format of textures used when performing the post process. (default: TEXTUREFORMAT_RGBA)
      */
    def this(
      name: String,
      fragmentUrl: String,
      parameters: Nullable[js.Array[String]],
      samplers: Nullable[js.Array[String]],
      options: Double | PostProcessOptions,
      camera: Nullable[Camera],
      samplingMode: js.UndefOr[Double],
      engine: js.UndefOr[Engine],
      reusable: js.UndefOr[Boolean],
      defines: js.UndefOr[Nullable[String]],
      textureType: js.UndefOr[Double],
      vertexUrl: js.UndefOr[String],
      indexParameters: js.UndefOr[Any],
      blockCompilation: js.UndefOr[Boolean],
      textureFormat: js.UndefOr[Double],
      shaderLanguage: js.UndefOr[ShaderLanguage]
    ) = this()
    
    /* private */ var _camera: Any = js.native
    
    /* private */ var _createRenderTargetTexture: Any = js.native
    
    /**
      * The index in _textures that corresponds to the output texture.
      * @internal
      */
    var _currentRenderTextureInd: Double = js.native
    
    /* private */ var _disposeTextureCache: Any = js.native
    
    /* private */ var _disposeTextures: Any = js.native
    
    /* private */ var _drawWrapper: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _flushTextureCache: Any = js.native
    
    /** @internal */
    var _forcedOutputTexture: Nullable[RenderTargetWrapper] = js.native
    
    /* private */ var _fragmentUrl: Any = js.native
    
    /* protected */ var _indexParameters: Any = js.native
    
    /* private */ var _onActivateObserver: Any = js.native
    
    /* private */ var _onAfterRenderObserver: Any = js.native
    
    /* private */ var _onApplyObserver: Any = js.native
    
    /* private */ var _onBeforeRenderObserver: Any = js.native
    
    /* private */ var _onSizeChangedObserver: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /**
      * Internal, reference to the location where this postprocess was output to. (Typically the texture on the next postprocess in the chain)
      * @internal
      */
    var _outputTexture: Nullable[RenderTargetWrapper] = js.native
    
    /* private */ var _parameters: Any = js.native
    
    /** @internal */
    var _parentContainer: Nullable[AbstractScene] = js.native
    
    /* protected */ var _postProcessDefines: Nullable[String] = js.native
    
    /**
      * Prepass configuration in case this post process needs a texture from prepass
      * @internal
      */
    var _prePassEffectConfiguration: PrePassEffectConfiguration = js.native
    
    /* private */ var _renderId: Any = js.native
    
    /* private */ var _resize: Any = js.native
    
    /* private */ var _reusable: Any = js.native
    
    /* private */ var _samplers: Any = js.native
    
    /* private */ var _samples: Any = js.native
    
    /* private */ var _scaleRatio: Any = js.native
    
    /* protected */ var _scene: Scene = js.native
    
    /* private */ var _shaderLanguage: Any = js.native
    
    /* private */ var _shareOutputWithPostProcess: Any = js.native
    
    /* private */ var _texelSize: Any = js.native
    
    /**
      * Smart array of input and output textures for the post process.
      * @internal
      */
    /* private */ var _textureCache: Any = js.native
    
    /* private */ var _textureFormat: Any = js.native
    
    /* private */ var _textureType: Any = js.native
    
    /**
      * Smart array of input and output textures for the post process.
      * @internal
      */
    var _textures: SmartArray[RenderTargetWrapper] = js.native
    
    /* private */ var _vertexUrl: Any = js.native
    
    /**
      * Activates the post process by intializing the textures to be used when executed. Notifies onActivateObservable.
      * When this post process is used in a pipeline, this is call will bind the input texture of this post process to the output of the previous.
      * @param camera The camera that will be used in the post process. This camera will be used when calling onActivateObservable.
      * @param sourceTexture The source texture to be inspected to get the width and height if not specified in the post process constructor. (default: null)
      * @param forceDepthStencil If true, a depth and stencil buffer will be generated. (default: false)
      * @returns The render target wrapper that was bound to be written to.
      */
    def activate(camera: Nullable[Camera]): RenderTargetWrapper = js.native
    def activate(camera: Nullable[Camera], sourceTexture: Unit, forceDepthStencil: Boolean): RenderTargetWrapper = js.native
    def activate(camera: Nullable[Camera], sourceTexture: Nullable[InternalTexture]): RenderTargetWrapper = js.native
    def activate(camera: Nullable[Camera], sourceTexture: Nullable[InternalTexture], forceDepthStencil: Boolean): RenderTargetWrapper = js.native
    
    /**
      * Modify the scale of the post process to be the same as the viewport (default: false)
      */
    var adaptScaleToCurrentViewport: Boolean = js.native
    
    /**
      * Sets the setAlphaBlendConstants of the babylon engine
      */
    var alphaConstants: Color4 = js.native
    
    /**
      * Type of alpha mode to use when performing the post process (default: Engine.ALPHA_DISABLE)
      */
    var alphaMode: Double = js.native
    
    /**
      * Force textures to be a power of two (default: false)
      */
    var alwaysForcePOT: Boolean = js.native
    
    /**
      * Animations to be used for the post processing
      */
    var animations: js.Array[Animation] = js.native
    
    /**
      * Binds all textures and uniforms to the shader, this will be run on every pass.
      * @returns the effect corresponding to this post process. Null if not compiled or not ready.
      */
    @JSName("apply")
    def apply(): Nullable[Effect] = js.native
    
    /**
      * The aspect ratio of the output texture.
      */
    def aspectRatio: Double = js.native
    
    /**
      * If the buffer needs to be cleared before applying the post process. (default: true)
      * Should be set to false if shader will overwrite all previous pixels.
      */
    var autoClear: Boolean = js.native
    
    /**
      * Clear color to use when screen clearing
      */
    var clearColor: Color4 = js.native
    
    /**
      * Disposes the post process.
      * @param camera The camera to dispose the post process on.
      */
    def dispose(): Unit = js.native
    def dispose(camera: Camera): Unit = js.native
    
    /**
      * Enable Pixel Perfect mode where texture is not scaled to be power of 2.
      * Can only be used on a single postprocess or on the last one of a chain. (default: false)
      */
    var enablePixelPerfectMode: Boolean = js.native
    
    /**
      * if externalTextureSamplerBinding is true, the "apply" method won't bind the textureSampler texture, it is expected to be done by the "outside" (by the onApplyObservable observer most probably).
      * counter-productive in some cases because if the texture bound by "apply" is different from the currently texture bound, (the one set by the onApplyObservable observer, for eg) some
      * internal structures (materialContext) will be dirtified, which may impact performances
      */
    var externalTextureSamplerBinding: Boolean = js.native
    
    /**
      * If clearing the buffer should be forced in autoClear mode, even when alpha mode is enabled (default: false).
      * By default, the buffer will only be cleared if alpha mode is disabled (and autoClear is true).
      */
    var forceAutoClearInAlphaMode: Boolean = js.native
    
    /**
      * Force the postprocess to be applied without taking in account viewport
      */
    var forceFullscreenViewport: Boolean = js.native
    
    /**
      * Gets the camera which post process is applied to.
      * @returns The camera the post process is applied to.
      */
    def getCamera(): Camera = js.native
    
    /**
      * Gets a string identifying the name of the class
      * @returns "PostProcess" string
      */
    def getClassName(): String = js.native
    
    /**
      * The effect that is created when initializing the post process.
      * @returns The created effect corresponding the the postprocess.
      */
    def getEffect(): Effect = js.native
    
    /**
      * Returns the fragment url or shader name used in the post process.
      * @returns the fragment url or name in the shader store.
      */
    def getEffectName(): String = js.native
    
    /**
      * Gets the engine which this post process belongs to.
      * @returns The engine the post process was enabled with.
      */
    def getEngine(): Engine = js.native
    
    /**
      * Height of the texture to apply the post process on
      */
    var height: Double = js.native
    
    /**
      * The input texture for this post process and the output texture of the previous post process. When added to a pipeline the previous post process will
      * render it's output into this texture and this texture will be used as textureSampler in the fragment shader of this post process.
      */
    def inputTexture: RenderTargetWrapper = js.native
    def inputTexture_=(value: RenderTargetWrapper): Unit = js.native
    
    /**
      * List of inspectable custom properties (used by the Inspector)
      * @see https://doc.babylonjs.com/toolsAndResources/inspector#extensibility
      */
    var inspectableCustomProperties: js.Array[IInspectable] = js.native
    
    /**
      * Get a value indicating if the post-process is ready to be used
      * @returns true if the post-process is ready (shader is compiled)
      */
    def isReady(): Boolean = js.native
    
    /**
      * The post process is reusable if it can be used multiple times within one frame.
      * @returns If the post process is reusable
      */
    def isReusable(): Boolean = js.native
    
    /**
      * If the post process is supported.
      */
    def isSupported: Boolean = js.native
    
    /** invalidate frameBuffer to hint the postprocess to create a depth buffer */
    def markTextureDirty(): Unit = js.native
    
    /** Name of the PostProcess. */
    var name: String = js.native
    
    /**
      * Gets the node material used to create this postprocess (null if the postprocess was manually created)
      */
    var nodeMaterialSource: Nullable[NodeMaterial] = js.native
    
    /**
      * An event triggered when the postprocess is activated.
      */
    var onActivateObservable: Observable[Camera] = js.native
    
    /**
      * A function that is added to the onActivateObservable
      */
    def onActivate_=(callback: Nullable[js.Function1[/* camera */ Camera, Unit]]): Unit = js.native
    
    /**
      * An event triggered after rendering the postprocess
      */
    var onAfterRenderObservable: Observable[Effect] = js.native
    
    /**
      * A function that is added to the onAfterRenderObservable
      */
    def onAfterRender_=(callback: js.Function1[/* efect */ Effect, Unit]): Unit = js.native
    
    /**
      * An event triggered when the postprocess applies its effect.
      */
    var onApplyObservable: Observable[Effect] = js.native
    
    /**
      * A function that is added to the onApplyObservable
      */
    def onApply_=(callback: js.Function1[/* effect */ Effect, Unit]): Unit = js.native
    
    /**
      * An event triggered before rendering the postprocess
      */
    var onBeforeRenderObservable: Observable[Effect] = js.native
    
    /**
      * A function that is added to the onBeforeRenderObservable
      */
    def onBeforeRender_=(callback: js.Function1[/* effect */ Effect, Unit]): Unit = js.native
    
    /**
      * An event triggered when the postprocess changes its size.
      */
    var onSizeChangedObservable: Observable[PostProcess] = js.native
    
    /**
      * A function that is added to the onSizeChangedObservable
      */
    def onSizeChanged_=(callback: js.Function1[/* postProcess */ this.type, Unit]): Unit = js.native
    
    /**
      * Sampling mode used by the shader
      * See https://doc.babylonjs.com/classes/3.1/texture
      */
    var renderTargetSamplingMode: Double = js.native
    
    /**
      * Since inputTexture should always be defined, if we previously manually set `inputTexture`,
      * the only way to unset it is to use this function to restore its internal state
      */
    def restoreDefaultInputTexture(): Unit = js.native
    
    /**
      * Number of sample textures (default: 1)
      */
    def samples: Double = js.native
    def samples_=(n: Double): Unit = js.native
    
    /**
      * Scale mode for the post process (default: Engine.SCALEMODE_FLOOR)
      *
      * | Value | Type                                | Description |
      * | ----- | ----------------------------------- | ----------- |
      * | 1     | SCALEMODE_FLOOR                     | [engine.scalemode_floor](https://doc.babylonjs.com/api/classes/babylon.engine#scalemode_floor) |
      * | 2     | SCALEMODE_NEAREST                   | [engine.scalemode_nearest](https://doc.babylonjs.com/api/classes/babylon.engine#scalemode_nearest) |
      * | 3     | SCALEMODE_CEILING                   | [engine.scalemode_ceiling](https://doc.babylonjs.com/api/classes/babylon.engine#scalemode_ceiling) |
      *
      */
    var scaleMode: Double = js.native
    
    /**
      * Serializes the post process to a JSON object
      * @returns the JSON object
      */
    def serialize(): Any = js.native
    
    /**
      * Sets the required values to the prepass renderer.
      * @param prePassRenderer defines the prepass renderer to setup.
      * @returns true if the pre pass is needed.
      */
    def setPrePassRenderer(prePassRenderer: PrePassRenderer): Boolean = js.native
    
    /**
      * To avoid multiple redundant textures for multiple post process, the output the output texture for this post process can be shared with another.
      * @param postProcess The post process to share the output with.
      * @returns This post process.
      */
    def shareOutputWith(postProcess: PostProcess): PostProcess = js.native
    
    /**
      * Gets the texel size of the postprocess.
      * See https://en.wikipedia.org/wiki/Texel_(graphics)
      */
    def texelSize: Vector2 = js.native
    
    /**
      * Gets or sets the unique id of the post process
      */
    var uniqueId: Double = js.native
    
    /**
      * Updates the effect with the current post process compile time values and recompiles the shader.
      * @param defines Define statements that should be added at the beginning of the shader. (default: null)
      * @param uniforms Set of uniform variables that will be passed to the shader. (default: null)
      * @param samplers Set of Texture2D variables that will be passed to the shader. (default: null)
      * @param indexParameters The index parameters to be used for babylons include syntax "#include<kernelBlurVaryingDeclaration>[0..varyingCount]". (default: undefined) See usage in babylon.blurPostProcess.ts and kernelBlur.vertex.fx
      * @param onCompiled Called when the shader has been compiled.
      * @param onError Called if there is an error when compiling a shader.
      * @param vertexUrl The url of the vertex shader to be used (default: the one given at construction time)
      * @param fragmentUrl The url of the fragment shader to be used (default: the one given at construction time)
      */
    def updateEffect(
      defines: js.UndefOr[Nullable[String]],
      uniforms: js.UndefOr[Nullable[js.Array[String]]],
      samplers: js.UndefOr[Nullable[js.Array[String]]],
      indexParameters: js.UndefOr[Any],
      onCompiled: js.UndefOr[js.Function1[/* effect */ Effect, Unit]],
      onError: js.UndefOr[js.Function2[/* effect */ Effect, /* errors */ String, Unit]],
      vertexUrl: js.UndefOr[String],
      fragmentUrl: js.UndefOr[String]
    ): Unit = js.native
    
    /**
      * Reverses the effect of calling shareOutputWith and returns the post process back to its original state.
      * This should be called if the post process that shares output with this post process is disabled/disposed.
      */
    def useOwnOutput(): Unit = js.native
    
    /**
      * Width of the texture to apply the post process on
      */
    var width: Double = js.native
  }
  /* static members */
  object PostProcess {
    
    @JSImport("babylonjs/PostProcesses/postProcess", "PostProcess")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a material from parsed material data
      * @param parsedPostProcess defines parsed post process data
      * @param scene defines the hosting scene
      * @param rootUrl defines the root URL to use to load textures
      * @returns a new post process
      */
    inline def Parse(parsedPostProcess: Any, scene: Scene, rootUrl: String): Nullable[PostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedPostProcess.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[PostProcess]]
    
    /**
      * Registers a shader code processing with a post process name.
      * @param postProcessName name of the post process. Use null for the fallback shader code processing. This is the shader code processing that will be used in case no specific shader code processing has been associated to a post process name
      * @param customShaderCodeProcessing shader code processing to associate to the post process name
      * @returns
      */
    inline def RegisterShaderCodeProcessing(postProcessName: Nullable[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShaderCodeProcessing")(postProcessName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def RegisterShaderCodeProcessing(
      postProcessName: Nullable[String],
      customShaderCodeProcessing: PostProcessCustomShaderCodeProcessing
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShaderCodeProcessing")(postProcessName.asInstanceOf[js.Any], customShaderCodeProcessing.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/PostProcesses/postProcess", "PostProcess._CustomShaderCodeProcessing")
    @js.native
    def _CustomShaderCodeProcessing: Any = js.native
    inline def _CustomShaderCodeProcessing_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CustomShaderCodeProcessing")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/PostProcesses/postProcess", "PostProcess._GetShaderCodeProcessing")
    @js.native
    def _GetShaderCodeProcessing: Any = js.native
    inline def _GetShaderCodeProcessing_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_GetShaderCodeProcessing")(x.asInstanceOf[js.Any])
    
    /**
      * @internal
      */
    inline def _Parse(parsedPostProcess: Any, targetCamera: Camera, scene: Scene, rootUrl: String): Nullable[PostProcess] = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedPostProcess.asInstanceOf[js.Any], targetCamera.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Nullable[PostProcess]]
  }
  
  trait PostProcessCustomShaderCodeProcessing extends StObject {
    
    /**
      * If provided, will be called when binding inputs to the shader code to allow the user to add custom bindings
      */
    var bindCustomBindings: js.UndefOr[js.Function2[/* postProcessName */ String, /* effect */ Effect, Unit]] = js.undefined
    
    /**
      * If provided, will be called before creating the effect to collect additional custom bindings (defines, uniforms, samplers)
      */
    var defineCustomBindings: js.UndefOr[
        js.Function4[
          /* postProcessName */ String, 
          /* defines */ Nullable[String], 
          /* uniforms */ js.Array[String], 
          /* samplers */ js.Array[String], 
          Nullable[String]
        ]
      ] = js.undefined
    
    /**
      * If provided, will be called two times with the vertex and fragment code so that this code can be updated after the #include have been processed
      */
    var processCodeAfterIncludes: js.UndefOr[
        js.Function3[/* postProcessName */ String, /* shaderType */ String, /* code */ String, String]
      ] = js.undefined
    
    /**
      * If provided, will be called two times with the vertex and fragment code so that this code can be updated before it is compiled by the GPU
      */
    var processFinalCode: js.UndefOr[
        js.Function3[/* postProcessName */ String, /* shaderType */ String, /* code */ String, String]
      ] = js.undefined
  }
  object PostProcessCustomShaderCodeProcessing {
    
    inline def apply(): PostProcessCustomShaderCodeProcessing = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PostProcessCustomShaderCodeProcessing]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostProcessCustomShaderCodeProcessing] (val x: Self) extends AnyVal {
      
      inline def setBindCustomBindings(value: (/* postProcessName */ String, /* effect */ Effect) => Unit): Self = StObject.set(x, "bindCustomBindings", js.Any.fromFunction2(value))
      
      inline def setBindCustomBindingsUndefined: Self = StObject.set(x, "bindCustomBindings", js.undefined)
      
      inline def setDefineCustomBindings(
        value: (/* postProcessName */ String, /* defines */ Nullable[String], /* uniforms */ js.Array[String], /* samplers */ js.Array[String]) => Nullable[String]
      ): Self = StObject.set(x, "defineCustomBindings", js.Any.fromFunction4(value))
      
      inline def setDefineCustomBindingsUndefined: Self = StObject.set(x, "defineCustomBindings", js.undefined)
      
      inline def setProcessCodeAfterIncludes(value: (/* postProcessName */ String, /* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processCodeAfterIncludes", js.Any.fromFunction3(value))
      
      inline def setProcessCodeAfterIncludesUndefined: Self = StObject.set(x, "processCodeAfterIncludes", js.undefined)
      
      inline def setProcessFinalCode(value: (/* postProcessName */ String, /* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction3(value))
      
      inline def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
    }
  }
  
  trait PostProcessOptions extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object PostProcessOptions {
    
    inline def apply(height: Double, width: Double): PostProcessOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PostProcessOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PostProcessOptions] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
