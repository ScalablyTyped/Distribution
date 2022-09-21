package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.externalTextureMod.ExternalTexture
import typings.babylonjs.iEffectFallbacksMod.IEffectFallbacks
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.ipipelinecontextMod.IPipelineContext
import typings.babylonjs.mathLikeMod.IColor3Like
import typings.babylonjs.mathLikeMod.IColor4Like
import typings.babylonjs.mathLikeMod.IMatrixLike
import typings.babylonjs.mathLikeMod.IQuaternionLike
import typings.babylonjs.mathLikeMod.IVector2Like
import typings.babylonjs.mathLikeMod.IVector3Like
import typings.babylonjs.mathLikeMod.IVector4Like
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.shaderLanguageMod.ShaderLanguage
import typings.babylonjs.shaderProcessingOptionsMod.ShaderCustomProcessingFunction
import typings.babylonjs.storageBufferMod.StorageBuffer
import typings.babylonjs.textureSamplerMod.TextureSampler
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.thinTextureMod.ThinTexture
import typings.babylonjs.typesMod.FloatArray
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectMod {
  
  @JSImport("babylonjs/Materials/effect", "Effect")
  @js.native
  open class Effect protected ()
    extends StObject
       with IDisposable {
    /**
      * Instantiates an effect.
      * An effect can be used to create/manage/execute vertex and fragment shaders.
      * @param baseName Name of the effect.
      * @param attributesNamesOrOptions List of attribute names that will be passed to the shader or set of all options to create the effect.
      * @param uniformsNamesOrEngine List of uniform variable names that will be passed to the shader or the engine that will be used to render effect.
      * @param samplers List of sampler variables that will be passed to the shader.
      * @param engine Engine to be used to render the effect
      * @param defines Define statements to be added to the shader.
      * @param fallbacks Possible fallbacks for this effect to improve performance when needed.
      * @param onCompiled Callback that will be called when the shader is compiled.
      * @param onError Callback that will be called if an error occurs during shader compilation.
      * @param indexParameters Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
      * @param key Effect Key identifying uniquely compiled shader variants
      * @param shaderLanguage the language the shader is written in (default: GLSL)
      */
    def this(
      baseName: Any,
      attributesNamesOrOptions: js.Array[String] | IEffectCreationOptions,
      uniformsNamesOrEngine: js.Array[String] | ThinEngine,
      samplers: js.UndefOr[Nullable[js.Array[String]]],
      engine: js.UndefOr[ThinEngine],
      defines: js.UndefOr[Nullable[String]],
      fallbacks: js.UndefOr[Nullable[IEffectFallbacks]],
      onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]],
      indexParameters: js.UndefOr[Any],
      key: js.UndefOr[String],
      shaderLanguage: js.UndefOr[ShaderLanguage]
    ) = this()
    
    /* private */ var _allFallbacksProcessed: Any = js.native
    
    /* private */ var _attributeLocationByName: Any = js.native
    
    /* private */ var _attributes: Any = js.native
    
    /* private */ var _attributesNames: Any = js.native
    
    /**
      * Binds a texture to the engine to be used as output of the shader.
      * @param channel Name of the output variable.
      * @param texture Texture to bind.
      * @hidden
      */
    def _bindTexture(channel: String, texture: Nullable[InternalTexture]): Unit = js.native
    
    /** @hidden */
    var _bonesComputationForcedToCPU: Boolean = js.native
    
    /* private */ var _checkIsReady: Any = js.native
    
    /* private */ var _compilationError: Any = js.native
    
    /** @hidden */
    var _engine: Engine = js.native
    
    /* private */ var _fallbacks: Any = js.native
    
    /** @hidden */
    var _fragmentSourceCode: String = js.native
    
    /* private */ var _fragmentSourceCodeOverride: Any = js.native
    
    /* private */ var _getShaderCodeAndErrorLine: Any = js.native
    
    /* private */ var _indexParameters: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /* private */ var _isReady: Any = js.native
    
    /* private */ var _isReadyInternal: Any = js.native
    
    /**
      * Key for the effect.
      * @hidden
      */
    var _key: String = js.native
    
    /* private */ var _loadShader: Any = js.native
    
    /** @hidden */
    var _multiTarget: Boolean = js.native
    
    /** @hidden */
    var _onBindObservable: Nullable[Observable[Effect]] = js.native
    
    /**
      * Compiled shader to webGL program.
      * @hidden
      */
    var _pipelineContext: Nullable[IPipelineContext] = js.native
    
    /**
      * Prepares the effect
      * @hidden
      */
    def _prepareEffect(): Unit = js.native
    
    /* private */ var _processCompilationErrors: Any = js.native
    
    /* private */ var _processingContext: Any = js.native
    
    /** @hidden */
    /* private */ var _rawFragmentSourceCode: Any = js.native
    
    /** @hidden */
    /* private */ var _rawVertexSourceCode: Any = js.native
    
    /**
      * Recompiles the webGL program
      * @param vertexSourceCode The source code for the vertex shader.
      * @param fragmentSourceCode The source code for the fragment shader.
      * @param onCompiled Callback called when completed.
      * @param onError Callback called on error.
      * @hidden
      */
    def _rebuildProgram(
      vertexSourceCode: String,
      fragmentSourceCode: String,
      onCompiled: js.Function1[/* pipelineContext */ IPipelineContext, Unit],
      onError: js.Function1[/* message */ String, Unit]
    ): Unit = js.native
    
    /** @hidden */
    var _samplerList: js.Array[String] = js.native
    
    /* private */ var _samplers: Any = js.native
    
    /* private */ var _shaderLanguage: Any = js.native
    
    /* private */ var _transformFeedbackVaryings: Any = js.native
    
    /** @hidden */
    var _uniformBuffersNames: StringDictionary[Double] = js.native
    
    /* private */ var _uniformBuffersNamesList: Any = js.native
    
    /* private */ var _uniforms: Any = js.native
    
    /* private */ var _uniformsNames: Any = js.native
    
    /* private */ var _useFinalCode: Any = js.native
    
    /** @hidden */
    var _vertexSourceCode: String = js.native
    
    /* private */ var _vertexSourceCodeOverride: Any = js.native
    
    /**
      * @hidden
      * Specifies if the effect was previously ready
      */
    var _wasPreviouslyReady: Boolean = js.native
    
    /**
      * @hidden
      * Specifies if the effect was previously using instances
      */
    var _wasPreviouslyUsingInstances: Nullable[Boolean] = js.native
    
    /**
      * Gets a boolean indicating that all fallbacks were used during compilation
      * @returns true if all fallbacks were used
      */
    def allFallbacksProcessed(): Boolean = js.native
    
    /**
      * Binds block to a uniform.
      * @param blockName Name of the block to bind.
      * @param index Index to bind.
      */
    def bindUniformBlock(blockName: String, index: Double): Unit = js.native
    
    /**
      * Binds a buffer to a uniform.
      * @param buffer Buffer to bind.
      * @param name Name of the uniform variable to bind to.
      */
    def bindUniformBuffer(buffer: DataBuffer, name: String): Unit = js.native
    
    /**
      * String container all the define statements that should be set on the shader.
      */
    var defines: String = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Adds a callback to the onCompiled observable and call the callback immediately if already ready.
      * @param func The callback to be used.
      */
    def executeWhenCompiled(func: js.Function1[/* effect */ this.type, Unit]): Unit = js.native
    
    /**
      * Gets the fragment shader source code of this effect
      */
    def fragmentSourceCode: String = js.native
    
    /**
      * Returns the attribute at the given index.
      * @param index The index of the attribute.
      * @returns The location of the attribute.
      */
    def getAttributeLocation(index: Double): Double = js.native
    
    /**
      * Returns the attribute based on the name of the variable.
      * @param name of the attribute to look up.
      * @returns the attribute location.
      */
    def getAttributeLocationByName(name: String): Double = js.native
    
    /**
      * The number of attributes.
      * @returns the number of attributes.
      */
    def getAttributesCount(): Double = js.native
    
    /**
      * The set of names of attribute variables for the shader.
      * @returns An array of attribute names.
      */
    def getAttributesNames(): js.Array[String] = js.native
    
    /**
      * The error from the last compilation.
      * @returns the error string.
      */
    def getCompilationError(): String = js.native
    
    /**
      * The engine the effect was initialized with.
      * @returns the engine.
      */
    def getEngine(): Engine = js.native
    
    /**
      * Returns the index parameters used to create the effect
      * @returns The index parameters object
      */
    def getIndexParameters(): Any = js.native
    
    /**
      * The pipeline context for this effect
      * @returns the associated pipeline context
      */
    def getPipelineContext(): Nullable[IPipelineContext] = js.native
    
    /**
      * Returns an array of sampler variable names
      * @returns The array of sampler variable names.
      */
    def getSamplers(): js.Array[String] = js.native
    
    /**
      * Returns the attribute based on the name of the variable.
      * @param uniformName of the uniform to look up.
      * @returns the location of the uniform.
      */
    def getUniform(uniformName: String): Nullable[WebGLUniformLocation] = js.native
    
    /**
      * Returns an array of uniform buffer variable names
      * @returns The array of uniform buffer variable names.
      */
    def getUniformBuffersNames(): js.Array[String] = js.native
    
    /**
      * Gets the index of a uniform variable.
      * @param uniformName of the uniform to look up.
      * @returns the index.
      */
    def getUniformIndex(uniformName: String): Double = js.native
    
    /**
      * Returns an array of uniform variable names
      * @returns The array of uniform variable names.
      */
    def getUniformNames(): js.Array[String] = js.native
    
    /**
      * If the effect has been compiled and prepared.
      * @returns if the effect is compiled and prepared.
      */
    def isReady(): Boolean = js.native
    
    /**
      * Checks if the effect is supported. (Must be called after compilation)
      */
    def isSupported: Boolean = js.native
    
    /**
      * Unique key for this effect
      */
    def key: String = js.native
    
    /**
      * Name of the effect.
      */
    var name: Any = js.native
    
    /**
      * Callback that will be called when effect is bound.
      */
    var onBind: Nullable[js.Function1[/* effect */ this.type, Unit]] = js.native
    
    /**
      * Observable that will be called when effect is bound.
      */
    def onBindObservable: Observable[Effect] = js.native
    
    /**
      * Observable that will be called when the shader is compiled.
      * It is recommended to use executeWhenCompile() or to make sure that scene.isReady() is called to get this observable raised.
      */
    var onCompileObservable: Observable[Effect] = js.native
    
    /**
      * Callback that will be called when the shader is compiled.
      */
    var onCompiled: Nullable[js.Function1[/* effect */ this.type, Unit]] = js.native
    
    /**
      * Callback that will be called if an error occurs during shader compilation.
      */
    var onError: Nullable[js.Function2[/* effect */ this.type, /* errors */ String, Unit]] = js.native
    
    /**
      * Observable that will be called if an error occurs during shader compilation.
      */
    var onErrorObservable: Observable[Effect] = js.native
    
    /**
      * Gets the fragment shader source code before it has been processed by the preprocessor
      */
    def rawFragmentSourceCode: String = js.native
    
    /**
      * Gets the vertex shader source code before it has been processed by the preprocessor
      */
    def rawVertexSourceCode: String = js.native
    
    /**
      * Sets an array on a uniform variable.
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setArray(uniformName: String, array: js.Array[Double]): Effect = js.native
    
    /**
      * Sets an array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setArray2(uniformName: String, array: js.Array[Double]): Effect = js.native
    
    /**
      * Sets an array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setArray3(uniformName: String, array: js.Array[Double]): Effect = js.native
    
    /**
      * Sets an array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setArray4(uniformName: String, array: js.Array[Double]): Effect = js.native
    
    /**
      * Sets a boolean on a uniform variable.
      * @param uniformName Name of the variable.
      * @param bool value to be set.
      * @returns this effect.
      */
    def setBool(uniformName: String, bool: Boolean): Effect = js.native
    
    /**
      * Sets a Color3 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param color3 Value to be set.
      * @returns this effect.
      */
    def setColor3(uniformName: String, color3: IColor3Like): Effect = js.native
    
    /**
      * Sets a Color4 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param color3 Value to be set.
      * @param alpha Alpha value to be set.
      * @returns this effect.
      */
    def setColor4(uniformName: String, color3: IColor3Like, alpha: Double): Effect = js.native
    
    /**
      * Sets a depth stencil texture from a render target on the engine to be used in the shader.
      * @param channel Name of the sampler variable.
      * @param texture Texture to set.
      */
    def setDepthStencilTexture(channel: String, texture: Nullable[RenderTargetTexture]): Unit = js.native
    
    /**
      * Sets a Color4 on a uniform variable
      * @param uniformName defines the name of the variable
      * @param color4 defines the value to be set
      * @returns this effect.
      */
    def setDirectColor4(uniformName: String, color4: IColor4Like): Effect = js.native
    
    /**
      * Sets an external texture on the engine to be used in the shader.
      * @param name Name of the external texture variable.
      * @param texture Texture to set.
      */
    def setExternalTexture(name: String, texture: Nullable[ExternalTexture]): Unit = js.native
    
    /**
      * Sets a float on a uniform variable.
      * @param uniformName Name of the variable.
      * @param value value to be set.
      * @returns this effect.
      */
    def setFloat(uniformName: String, value: Double): Effect = js.native
    
    /**
      * Sets a float2 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First float in float2.
      * @param y Second float in float2.
      * @returns this effect.
      */
    def setFloat2(uniformName: String, x: Double, y: Double): Effect = js.native
    
    /**
      * Sets a float3 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First float in float3.
      * @param y Second float in float3.
      * @param z Third float in float3.
      * @returns this effect.
      */
    def setFloat3(uniformName: String, x: Double, y: Double, z: Double): Effect = js.native
    
    /**
      * Sets a float4 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First float in float4.
      * @param y Second float in float4.
      * @param z Third float in float4.
      * @param w Fourth float in float4.
      * @returns this effect.
      */
    def setFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Effect = js.native
    
    /**
      * Sets an float array on a uniform variable.
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setFloatArray(uniformName: String, array: FloatArray): Effect = js.native
    
    /**
      * Sets an float array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setFloatArray2(uniformName: String, array: FloatArray): Effect = js.native
    
    /**
      * Sets an float array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setFloatArray3(uniformName: String, array: FloatArray): Effect = js.native
    
    /**
      * Sets an float array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setFloatArray4(uniformName: String, array: FloatArray): Effect = js.native
    
    /**
      * Sets an integer value on a uniform variable.
      * @param uniformName Name of the variable.
      * @param value Value to be set.
      * @returns this effect.
      */
    def setInt(uniformName: String, value: Double): Effect = js.native
    
    /**
      * Sets an int2 value on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First int in int2.
      * @param y Second int in int2.
      * @returns this effect.
      */
    def setInt2(uniformName: String, x: Double, y: Double): Effect = js.native
    
    /**
      * Sets an int3 value on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First int in int3.
      * @param y Second int in int3.
      * @param z Third int in int3.
      * @returns this effect.
      */
    def setInt3(uniformName: String, x: Double, y: Double, z: Double): Effect = js.native
    
    /**
      * Sets an int4 value on a uniform variable.
      * @param uniformName Name of the variable.
      * @param x First int in int4.
      * @param y Second int in int4.
      * @param z Third int in int4.
      * @param w Fourth int in int4.
      * @returns this effect.
      */
    def setInt4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Effect = js.native
    
    /**
      * Sets an int array on a uniform variable.
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setIntArray(uniformName: String, array: js.typedarray.Int32Array): Effect = js.native
    
    /**
      * Sets an int array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setIntArray2(uniformName: String, array: js.typedarray.Int32Array): Effect = js.native
    
    /**
      * Sets an int array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setIntArray3(uniformName: String, array: js.typedarray.Int32Array): Effect = js.native
    
    /**
      * Sets an int array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setIntArray4(uniformName: String, array: js.typedarray.Int32Array): Effect = js.native
    
    def setMatrices(uniformName: String, matrices: js.Array[Double]): Effect = js.native
    /**
      * Sets matrices on a uniform variable.
      * @param uniformName Name of the variable.
      * @param matrices matrices to be set.
      * @returns this effect.
      */
    def setMatrices(uniformName: String, matrices: js.typedarray.Float32Array): Effect = js.native
    
    /**
      * Sets matrix on a uniform variable.
      * @param uniformName Name of the variable.
      * @param matrix matrix to be set.
      * @returns this effect.
      */
    def setMatrix(uniformName: String, matrix: IMatrixLike): Effect = js.native
    
    def setMatrix2x2(uniformName: String, matrix: js.Array[Double]): Effect = js.native
    /**
      * Sets a 2x2 matrix on a uniform variable. (Specified as [1,2,3,4] will result in [1,2][3,4] matrix)
      * @param uniformName Name of the variable.
      * @param matrix matrix to be set.
      * @returns this effect.
      */
    def setMatrix2x2(uniformName: String, matrix: js.typedarray.Float32Array): Effect = js.native
    
    def setMatrix3x3(uniformName: String, matrix: js.Array[Double]): Effect = js.native
    /**
      * Sets a 3x3 matrix on a uniform variable. (Specified as [1,2,3,4,5,6,7,8,9] will result in [1,2,3][4,5,6][7,8,9] matrix)
      * @param uniformName Name of the variable.
      * @param matrix matrix to be set.
      * @returns this effect.
      */
    def setMatrix3x3(uniformName: String, matrix: js.typedarray.Float32Array): Effect = js.native
    
    /**
      * Sets a Quaternion on a uniform variable.
      * @param uniformName Name of the variable.
      * @param quaternion Value to be set.
      * @returns this effect.
      */
    def setQuaternion(uniformName: String, quaternion: IQuaternionLike): Effect = js.native
    
    /**
      * Sets a storage buffer on the engine to be used in the shader.
      * @param name Name of the storage buffer variable.
      * @param buffer Storage buffer to set.
      */
    def setStorageBuffer(name: String, buffer: Nullable[StorageBuffer]): Unit = js.native
    
    /**
      * Sets a texture on the engine to be used in the shader.
      * @param channel Name of the sampler variable.
      * @param texture Texture to set.
      */
    def setTexture(channel: String, texture: Nullable[ThinTexture]): Unit = js.native
    
    /**
      * Sets an array of textures on the engine to be used in the shader.
      * @param channel Name of the variable.
      * @param textures Textures to set.
      */
    def setTextureArray(channel: String, textures: js.Array[ThinTexture]): Unit = js.native
    
    /**
      * Sets a texture to be the input of the specified post process. (To use the output, pass in the next post process in the pipeline)
      * @param channel Name of the sampler variable.
      * @param postProcess Post process to get the input texture from.
      */
    def setTextureFromPostProcess(channel: String, postProcess: Nullable[PostProcess]): Unit = js.native
    
    /**
      * (Warning! setTextureFromPostProcessOutput may be desired instead)
      * Sets the input texture of the passed in post process to be input of this effect. (To use the output of the passed in post process use setTextureFromPostProcessOutput)
      * @param channel Name of the sampler variable.
      * @param postProcess Post process to get the output texture from.
      */
    def setTextureFromPostProcessOutput(channel: String, postProcess: Nullable[PostProcess]): Unit = js.native
    
    /**
      * Sets a sampler on the engine to be used in the shader.
      * @param name Name of the sampler variable.
      * @param sampler Sampler to set.
      */
    def setTextureSampler(name: String, sampler: Nullable[TextureSampler]): Unit = js.native
    
    /**
      * Sets a Vector2 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param vector2 vector2 to be set.
      * @returns this effect.
      */
    def setVector2(uniformName: String, vector2: IVector2Like): Effect = js.native
    
    /**
      * Sets a Vector3 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param vector3 Value to be set.
      * @returns this effect.
      */
    def setVector3(uniformName: String, vector3: IVector3Like): Effect = js.native
    
    /**
      * Sets a Vector4 on a uniform variable.
      * @param uniformName Name of the variable.
      * @param vector4 Value to be set.
      * @returns this effect.
      */
    def setVector4(uniformName: String, vector4: IVector4Like): Effect = js.native
    
    /**
      * Unique ID of the effect.
      */
    var uniqueId: Double = js.native
    
    /**
      * Gets the vertex shader source code of this effect
      */
    def vertexSourceCode: String = js.native
  }
  /* static members */
  object Effect {
    
    @JSImport("babylonjs/Materials/effect", "Effect")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Store of each included file for a shader (The can be looked up using effect.key)
      */
    @JSImport("babylonjs/Materials/effect", "Effect.IncludesShadersStore")
    @js.native
    def IncludesShadersStore: StringDictionary[String] = js.native
    inline def IncludesShadersStore_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncludesShadersStore")(x.asInstanceOf[js.Any])
    
    /**
      * Enable logging of the shader code when a compilation error occurs
      */
    @JSImport("babylonjs/Materials/effect", "Effect.LogShaderCodeOnCompilationError")
    @js.native
    def LogShaderCodeOnCompilationError: Boolean = js.native
    inline def LogShaderCodeOnCompilationError_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogShaderCodeOnCompilationError")(x.asInstanceOf[js.Any])
    
    /**
      * This function will add a new shader to the shader store
      * @param name the name of the shader
      * @param pixelShader optional pixel shader content
      * @param vertexShader optional vertex shader content
      * @param shaderLanguage the language the shader is written in (default: GLSL)
      */
    inline def RegisterShader(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def RegisterShader(name: String, pixelShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def RegisterShader(name: String, pixelShader: String, vertexShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def RegisterShader(name: String, pixelShader: String, vertexShader: String, shaderLanguage: ShaderLanguage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any], shaderLanguage.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def RegisterShader(name: String, pixelShader: String, vertexShader: Unit, shaderLanguage: ShaderLanguage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any], shaderLanguage.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def RegisterShader(name: String, pixelShader: Unit, vertexShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def RegisterShader(name: String, pixelShader: Unit, vertexShader: String, shaderLanguage: ShaderLanguage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any], shaderLanguage.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def RegisterShader(name: String, pixelShader: Unit, vertexShader: Unit, shaderLanguage: ShaderLanguage): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any], shaderLanguage.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Resets the cache of effects.
      */
    inline def ResetCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ResetCache")().asInstanceOf[Unit]
    
    /**
      * Store of each shader (The can be looked up using effect.key)
      */
    @JSImport("babylonjs/Materials/effect", "Effect.ShadersStore")
    @js.native
    def ShadersStore: StringDictionary[String] = js.native
    inline def ShadersStore_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersStore")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/effect", "Effect._BaseCache")
    @js.native
    def _BaseCache: Any = js.native
    inline def _BaseCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BaseCache")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/effect", "Effect._UniqueIdSeed")
    @js.native
    def _UniqueIdSeed: Any = js.native
    inline def _UniqueIdSeed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UniqueIdSeed")(x.asInstanceOf[js.Any])
  }
  
  trait IEffectCreationOptions extends StObject {
    
    /**
      * Attributes that will be used in the shader.
      */
    var attributes: js.Array[String]
    
    /**
      * Define statements that will be set in the shader.
      */
    var defines: Any
    
    /**
      * Possible fallbacks for this effect to improve performance when needed.
      */
    var fallbacks: Nullable[IEffectFallbacks]
    
    /**
      * Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
      */
    var indexParameters: js.UndefOr[Any] = js.undefined
    
    /**
      * Max number of lights that can be used in the shader.
      */
    var maxSimultaneousLights: js.UndefOr[Double] = js.undefined
    
    /**
      * Is this effect rendering to several color attachments ?
      */
    var multiTarget: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Callback that will be called when the shader is compiled.
      */
    var onCompiled: Nullable[js.Function1[/* effect */ Effect, Unit]]
    
    /**
      * Callback that will be called if an error occurs during shader compilation.
      */
    var onError: Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]
    
    /**
      * If provided, will be called two times with the vertex and fragment code so that this code can be updated after the #include have been processed
      */
    var processCodeAfterIncludes: js.UndefOr[Nullable[ShaderCustomProcessingFunction]] = js.undefined
    
    /**
      * If provided, will be called two times with the vertex and fragment code so that this code can be updated before it is compiled by the GPU
      */
    var processFinalCode: js.UndefOr[Nullable[ShaderCustomProcessingFunction]] = js.undefined
    
    /**
      * Sampler texture variable names that will be set in the shader.
      */
    var samplers: js.Array[String]
    
    /**
      * The language the shader is written in (default: GLSL)
      */
    var shaderLanguage: js.UndefOr[ShaderLanguage] = js.undefined
    
    /**
      * See https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings
      */
    var transformFeedbackVaryings: js.UndefOr[Nullable[js.Array[String]]] = js.undefined
    
    /**
      * Uniform buffer variable names that will be set in the shader.
      */
    var uniformBuffersNames: js.Array[String]
    
    /**
      * Uniform variable names that will be set in the shader.
      */
    var uniformsNames: js.Array[String]
  }
  object IEffectCreationOptions {
    
    inline def apply(
      attributes: js.Array[String],
      defines: Any,
      samplers: js.Array[String],
      uniformBuffersNames: js.Array[String],
      uniformsNames: js.Array[String]
    ): IEffectCreationOptions = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], uniformBuffersNames = uniformBuffersNames.asInstanceOf[js.Any], uniformsNames = uniformsNames.asInstanceOf[js.Any], fallbacks = null, onCompiled = null, onError = null)
      __obj.asInstanceOf[IEffectCreationOptions]
    }
    
    extension [Self <: IEffectCreationOptions](x: Self) {
      
      inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
      
      inline def setDefines(value: Any): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setFallbacks(value: Nullable[IEffectFallbacks]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      inline def setFallbacksNull: Self = StObject.set(x, "fallbacks", null)
      
      inline def setIndexParameters(value: Any): Self = StObject.set(x, "indexParameters", value.asInstanceOf[js.Any])
      
      inline def setIndexParametersUndefined: Self = StObject.set(x, "indexParameters", js.undefined)
      
      inline def setMaxSimultaneousLights(value: Double): Self = StObject.set(x, "maxSimultaneousLights", value.asInstanceOf[js.Any])
      
      inline def setMaxSimultaneousLightsUndefined: Self = StObject.set(x, "maxSimultaneousLights", js.undefined)
      
      inline def setMultiTarget(value: Boolean): Self = StObject.set(x, "multiTarget", value.asInstanceOf[js.Any])
      
      inline def setMultiTargetUndefined: Self = StObject.set(x, "multiTarget", js.undefined)
      
      inline def setOnCompiled(value: /* effect */ Effect => Unit): Self = StObject.set(x, "onCompiled", js.Any.fromFunction1(value))
      
      inline def setOnCompiledNull: Self = StObject.set(x, "onCompiled", null)
      
      inline def setOnError(value: (/* effect */ Effect, /* errors */ String) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorNull: Self = StObject.set(x, "onError", null)
      
      inline def setProcessCodeAfterIncludes(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processCodeAfterIncludes", js.Any.fromFunction2(value))
      
      inline def setProcessCodeAfterIncludesNull: Self = StObject.set(x, "processCodeAfterIncludes", null)
      
      inline def setProcessCodeAfterIncludesUndefined: Self = StObject.set(x, "processCodeAfterIncludes", js.undefined)
      
      inline def setProcessFinalCode(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction2(value))
      
      inline def setProcessFinalCodeNull: Self = StObject.set(x, "processFinalCode", null)
      
      inline def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
      
      inline def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
      
      inline def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value*))
      
      inline def setShaderLanguage(value: ShaderLanguage): Self = StObject.set(x, "shaderLanguage", value.asInstanceOf[js.Any])
      
      inline def setShaderLanguageUndefined: Self = StObject.set(x, "shaderLanguage", js.undefined)
      
      inline def setTransformFeedbackVaryings(value: Nullable[js.Array[String]]): Self = StObject.set(x, "transformFeedbackVaryings", value.asInstanceOf[js.Any])
      
      inline def setTransformFeedbackVaryingsNull: Self = StObject.set(x, "transformFeedbackVaryings", null)
      
      inline def setTransformFeedbackVaryingsUndefined: Self = StObject.set(x, "transformFeedbackVaryings", js.undefined)
      
      inline def setTransformFeedbackVaryingsVarargs(value: String*): Self = StObject.set(x, "transformFeedbackVaryings", js.Array(value*))
      
      inline def setUniformBuffersNames(value: js.Array[String]): Self = StObject.set(x, "uniformBuffersNames", value.asInstanceOf[js.Any])
      
      inline def setUniformBuffersNamesVarargs(value: String*): Self = StObject.set(x, "uniformBuffersNames", js.Array(value*))
      
      inline def setUniformsNames(value: js.Array[String]): Self = StObject.set(x, "uniformsNames", value.asInstanceOf[js.Any])
      
      inline def setUniformsNamesVarargs(value: String*): Self = StObject.set(x, "uniformsNames", js.Array(value*))
    }
  }
}
