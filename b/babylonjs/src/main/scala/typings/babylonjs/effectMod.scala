package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.engineMod.Engine
import typings.babylonjs.iEffectFallbacksMod.IEffectFallbacks
import typings.babylonjs.internalTextureMod.InternalTexture
import typings.babylonjs.ipipelinecontextMod.IPipelineContext
import typings.babylonjs.mathLikeMod.IColor3Like
import typings.babylonjs.mathLikeMod.IColor4Like
import typings.babylonjs.mathLikeMod.IMatrixLike
import typings.babylonjs.mathLikeMod.IVector2Like
import typings.babylonjs.mathLikeMod.IVector3Like
import typings.babylonjs.mathLikeMod.IVector4Like
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.postProcessMod.PostProcess
import typings.babylonjs.renderTargetTextureMod.RenderTargetTexture
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.thinTextureMod.ThinTexture
import typings.babylonjs.typesMod.Nullable
import typings.std.Float32Array
import typings.std.Int32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effectMod {
  
  @JSImport("babylonjs/Materials/effect", "Effect")
  @js.native
  class Effect protected () extends IDisposable {
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
      */
    def this(
      baseName: js.Any,
      attributesNamesOrOptions: js.Array[String] | IEffectCreationOptions,
      uniformsNamesOrEngine: js.Array[String] | ThinEngine,
      samplers: js.UndefOr[Nullable[js.Array[String]]],
      engine: js.UndefOr[ThinEngine],
      defines: js.UndefOr[Nullable[String]],
      fallbacks: js.UndefOr[Nullable[IEffectFallbacks]],
      onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, Unit]]],
      onError: js.UndefOr[Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]],
      indexParameters: js.UndefOr[js.Any]
    ) = this()
    
    var _allFallbacksProcessed: js.Any = js.native
    
    var _attributeLocationByName: js.Any = js.native
    
    var _attributes: js.Any = js.native
    
    var _attributesNames: js.Any = js.native
    
    /**
      * Binds a texture to the engine to be used as output of the shader.
      * @param channel Name of the output variable.
      * @param texture Texture to bind.
      * @hidden
      */
    def _bindTexture(channel: String, texture: Nullable[InternalTexture]): Unit = js.native
    
    /** @hidden */
    var _bonesComputationForcedToCPU: Boolean = js.native
    
    /** @hidden */
    def _cacheFloat2(uniformName: String, x: Double, y: Double): Boolean = js.native
    
    /** @hidden */
    def _cacheFloat3(uniformName: String, x: Double, y: Double, z: Double): Boolean = js.native
    
    /** @hidden */
    def _cacheFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Boolean = js.native
    
    /** @hidden */
    def _cacheMatrix(uniformName: String, matrix: IMatrixLike): Boolean = js.native
    
    var _checkIsReady: js.Any = js.native
    
    var _compilationError: js.Any = js.native
    
    var _engine: js.Any = js.native
    
    var _fallbacks: js.Any = js.native
    
    var _fragmentSourceCode: js.Any = js.native
    
    var _fragmentSourceCodeOverride: js.Any = js.native
    
    var _getShaderCodeAndErrorLine: js.Any = js.native
    
    var _indexParameters: js.Any = js.native
    
    var _isReady: js.Any = js.native
    
    var _isReadyInternal: js.Any = js.native
    
    /**
      * Key for the effect.
      * @hidden
      */
    var _key: String = js.native
    
    var _loadShader: js.Any = js.native
    
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
    
    var _processCompilationErrors: js.Any = js.native
    
    var _rawFragmentSourceCode: js.Any = js.native
    
    var _rawVertexSourceCode: js.Any = js.native
    
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
    
    var _samplerList: js.Any = js.native
    
    var _samplers: js.Any = js.native
    
    var _transformFeedbackVaryings: js.Any = js.native
    
    var _uniformBuffersNames: js.Any = js.native
    
    var _uniformBuffersNamesList: js.Any = js.native
    
    var _uniforms: js.Any = js.native
    
    var _uniformsNames: js.Any = js.native
    
    var _useFinalCode: js.Any = js.native
    
    var _valueCache: js.Any = js.native
    
    var _vertexSourceCode: js.Any = js.native
    
    var _vertexSourceCodeOverride: js.Any = js.native
    
    /**
      * @hidden
      * Specifies if the effect was previously ready
      */
    var _wasPreviouslyReady: Boolean = js.native
    
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
      * Adds a callback to the onCompiled observable and call the callback imediatly if already ready.
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
      * @returns the numnber of attributes.
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
    def getIndexParameters(): js.Any = js.native
    
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
    var name: js.Any = js.native
    
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
    def setFloatArray(uniformName: String, array: Float32Array): Effect = js.native
    
    /**
      * Sets an float array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setFloatArray2(uniformName: String, array: Float32Array): Effect = js.native
    
    /**
      * Sets an float array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setFloatArray3(uniformName: String, array: Float32Array): Effect = js.native
    
    /**
      * Sets an float array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setFloatArray4(uniformName: String, array: Float32Array): Effect = js.native
    
    /**
      * Sets an interger value on a uniform variable.
      * @param uniformName Name of the variable.
      * @param value Value to be set.
      * @returns this effect.
      */
    def setInt(uniformName: String, value: Double): Effect = js.native
    
    /**
      * Sets an int array on a uniform variable.
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setIntArray(uniformName: String, array: Int32Array): Effect = js.native
    
    /**
      * Sets an int array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setIntArray2(uniformName: String, array: Int32Array): Effect = js.native
    
    /**
      * Sets an int array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setIntArray3(uniformName: String, array: Int32Array): Effect = js.native
    
    /**
      * Sets an int array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
      * @param uniformName Name of the variable.
      * @param array array to be set.
      * @returns this effect.
      */
    def setIntArray4(uniformName: String, array: Int32Array): Effect = js.native
    
    def setMatrices(uniformName: String, matrices: js.Array[Double]): Effect = js.native
    /**
      * Sets matrices on a uniform variable.
      * @param uniformName Name of the variable.
      * @param matrices matrices to be set.
      * @returns this effect.
      */
    def setMatrices(uniformName: String, matrices: Float32Array): Effect = js.native
    
    /**
      * Sets matrix on a uniform variable.
      * @param uniformName Name of the variable.
      * @param matrix matrix to be set.
      * @returns this effect.
      */
    def setMatrix(uniformName: String, matrix: IMatrixLike): Effect = js.native
    
    def setMatrix2x2(uniformName: String, matrix: js.Array[Double]): Effect = js.native
    /**
      * Sets a 2x2 matrix on a uniform variable. (Speicified as [1,2,3,4] will result in [1,2][3,4] matrix)
      * @param uniformName Name of the variable.
      * @param matrix matrix to be set.
      * @returns this effect.
      */
    def setMatrix2x2(uniformName: String, matrix: Float32Array): Effect = js.native
    
    def setMatrix3x3(uniformName: String, matrix: js.Array[Double]): Effect = js.native
    /**
      * Sets a 3x3 matrix on a uniform variable. (Speicified as [1,2,3,4,5,6,7,8,9] will result in [1,2,3][4,5,6][7,8,9] matrix)
      * @param uniformName Name of the variable.
      * @param matrix matrix to be set.
      * @returns this effect.
      */
    def setMatrix3x3(uniformName: String, matrix: Float32Array): Effect = js.native
    
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
    @scala.inline
    def IncludesShadersStore_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncludesShadersStore")(x.asInstanceOf[js.Any])
    
    /**
      * Enable logging of the shader code when a compilation error occurs
      */
    @JSImport("babylonjs/Materials/effect", "Effect.LogShaderCodeOnCompilationError")
    @js.native
    def LogShaderCodeOnCompilationError: Boolean = js.native
    @scala.inline
    def LogShaderCodeOnCompilationError_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogShaderCodeOnCompilationError")(x.asInstanceOf[js.Any])
    
    /**
      * This function will add a new shader to the shader store
      * @param name the name of the shader
      * @param pixelShader optional pixel shader content
      * @param vertexShader optional vertex shader content
      */
    @JSImport("babylonjs/Materials/effect", "Effect.RegisterShader")
    @js.native
    def RegisterShader(name: String): Unit = js.native
    @JSImport("babylonjs/Materials/effect", "Effect.RegisterShader")
    @js.native
    def RegisterShader(name: String, pixelShader: js.UndefOr[scala.Nothing], vertexShader: String): Unit = js.native
    @JSImport("babylonjs/Materials/effect", "Effect.RegisterShader")
    @js.native
    def RegisterShader(name: String, pixelShader: String): Unit = js.native
    @JSImport("babylonjs/Materials/effect", "Effect.RegisterShader")
    @js.native
    def RegisterShader(name: String, pixelShader: String, vertexShader: String): Unit = js.native
    
    /**
      * Resets the cache of effects.
      */
    @JSImport("babylonjs/Materials/effect", "Effect.ResetCache")
    @js.native
    def ResetCache(): Unit = js.native
    
    /**
      * Gets or sets the relative url used to load shaders if using the engine in non-minified mode
      */
    @JSImport("babylonjs/Materials/effect", "Effect.ShadersRepository")
    @js.native
    def ShadersRepository: String = js.native
    @scala.inline
    def ShadersRepository_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersRepository")(x.asInstanceOf[js.Any])
    
    /**
      * Store of each shader (The can be looked up using effect.key)
      */
    @JSImport("babylonjs/Materials/effect", "Effect.ShadersStore")
    @js.native
    def ShadersStore: StringDictionary[String] = js.native
    @scala.inline
    def ShadersStore_=(x: StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersStore")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/effect", "Effect._baseCache")
    @js.native
    def _baseCache: js.Any = js.native
    @scala.inline
    def _baseCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_baseCache")(x.asInstanceOf[js.Any])
    
    @JSImport("babylonjs/Materials/effect", "Effect._uniqueIdSeed")
    @js.native
    def _uniqueIdSeed: js.Any = js.native
    @scala.inline
    def _uniqueIdSeed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_uniqueIdSeed")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IEffectCreationOptions extends StObject {
    
    /**
      * Atrributes that will be used in the shader.
      */
    var attributes: js.Array[String] = js.native
    
    /**
      * Define statements that will be set in the shader.
      */
    var defines: js.Any = js.native
    
    /**
      * Possible fallbacks for this effect to improve performance when needed.
      */
    var fallbacks: Nullable[IEffectFallbacks] = js.native
    
    /**
      * Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
      */
    var indexParameters: js.UndefOr[js.Any] = js.native
    
    /**
      * Max number of lights that can be used in the shader.
      */
    var maxSimultaneousLights: js.UndefOr[Double] = js.native
    
    /**
      * Is this effect rendering to several color attachments ?
      */
    var multiTarget: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback that will be called when the shader is compiled.
      */
    var onCompiled: Nullable[js.Function1[/* effect */ Effect, Unit]] = js.native
    
    /**
      * Callback that will be called if an error occurs during shader compilation.
      */
    var onError: Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]] = js.native
    
    /**
      * If provided, will be called two times with the vertex and fragment code so that this code can be updated before it is compiled by the GPU
      */
    var processFinalCode: js.UndefOr[Nullable[js.Function2[/* shaderType */ String, /* code */ String, String]]] = js.native
    
    /**
      * Sampler texture variable names that will be set in the shader.
      */
    var samplers: js.Array[String] = js.native
    
    /**
      * See https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings
      */
    var transformFeedbackVaryings: js.UndefOr[Nullable[js.Array[String]]] = js.native
    
    /**
      * Uniform buffer variable names that will be set in the shader.
      */
    var uniformBuffersNames: js.Array[String] = js.native
    
    /**
      * Uniform varible names that will be set in the shader.
      */
    var uniformsNames: js.Array[String] = js.native
  }
  object IEffectCreationOptions {
    
    @scala.inline
    def apply(
      attributes: js.Array[String],
      defines: js.Any,
      samplers: js.Array[String],
      uniformBuffersNames: js.Array[String],
      uniformsNames: js.Array[String]
    ): IEffectCreationOptions = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], uniformBuffersNames = uniformBuffersNames.asInstanceOf[js.Any], uniformsNames = uniformsNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEffectCreationOptions]
    }
    
    @scala.inline
    implicit class IEffectCreationOptionsMutableBuilder[Self <: IEffectCreationOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
      
      @scala.inline
      def setDefines(value: js.Any): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbacks(value: Nullable[IEffectFallbacks]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbacksNull: Self = StObject.set(x, "fallbacks", null)
      
      @scala.inline
      def setIndexParameters(value: js.Any): Self = StObject.set(x, "indexParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexParametersUndefined: Self = StObject.set(x, "indexParameters", js.undefined)
      
      @scala.inline
      def setMaxSimultaneousLights(value: Double): Self = StObject.set(x, "maxSimultaneousLights", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSimultaneousLightsUndefined: Self = StObject.set(x, "maxSimultaneousLights", js.undefined)
      
      @scala.inline
      def setMultiTarget(value: Boolean): Self = StObject.set(x, "multiTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiTargetUndefined: Self = StObject.set(x, "multiTarget", js.undefined)
      
      @scala.inline
      def setOnCompiled(value: /* effect */ Effect => Unit): Self = StObject.set(x, "onCompiled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompiledNull: Self = StObject.set(x, "onCompiled", null)
      
      @scala.inline
      def setOnError(value: (/* effect */ Effect, /* errors */ String) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnErrorNull: Self = StObject.set(x, "onError", null)
      
      @scala.inline
      def setProcessFinalCode(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProcessFinalCodeNull: Self = StObject.set(x, "processFinalCode", null)
      
      @scala.inline
      def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
      
      @scala.inline
      def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value :_*))
      
      @scala.inline
      def setTransformFeedbackVaryings(value: Nullable[js.Array[String]]): Self = StObject.set(x, "transformFeedbackVaryings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformFeedbackVaryingsNull: Self = StObject.set(x, "transformFeedbackVaryings", null)
      
      @scala.inline
      def setTransformFeedbackVaryingsUndefined: Self = StObject.set(x, "transformFeedbackVaryings", js.undefined)
      
      @scala.inline
      def setTransformFeedbackVaryingsVarargs(value: String*): Self = StObject.set(x, "transformFeedbackVaryings", js.Array(value :_*))
      
      @scala.inline
      def setUniformBuffersNames(value: js.Array[String]): Self = StObject.set(x, "uniformBuffersNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformBuffersNamesVarargs(value: String*): Self = StObject.set(x, "uniformBuffersNames", js.Array(value :_*))
      
      @scala.inline
      def setUniformsNames(value: js.Array[String]): Self = StObject.set(x, "uniformsNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniformsNamesVarargs(value: String*): Self = StObject.set(x, "uniformsNames", js.Array(value :_*))
    }
  }
}
