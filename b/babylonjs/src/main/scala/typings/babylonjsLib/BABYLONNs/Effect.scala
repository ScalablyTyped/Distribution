package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Effect containing vertex and fragment shader that can be executed on an object.
     */
@JSGlobal("BABYLON.Effect")
@js.native
class Effect protected () extends js.Object {
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
  def this(baseName: js.Any, attributesNamesOrOptions: EffectCreationOptions, uniformsNamesOrEngine: Engine, samplers: js.UndefOr[Nullable[js.Array[java.lang.String]]], engine: js.UndefOr[Engine], defines: js.UndefOr[Nullable[java.lang.String]], fallbacks: js.UndefOr[Nullable[EffectFallbacks]], onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, scala.Unit]]], onError: js.UndefOr[
      Nullable[js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]]
    ], indexParameters: js.UndefOr[js.Any]) = this()
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
  def this(baseName: js.Any, attributesNamesOrOptions: EffectCreationOptions, uniformsNamesOrEngine: js.Array[java.lang.String], samplers: js.UndefOr[Nullable[js.Array[java.lang.String]]], engine: js.UndefOr[Engine], defines: js.UndefOr[Nullable[java.lang.String]], fallbacks: js.UndefOr[Nullable[EffectFallbacks]], onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, scala.Unit]]], onError: js.UndefOr[
      Nullable[js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]]
    ], indexParameters: js.UndefOr[js.Any]) = this()
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
  def this(baseName: js.Any, attributesNamesOrOptions: js.Array[java.lang.String], uniformsNamesOrEngine: Engine, samplers: js.UndefOr[Nullable[js.Array[java.lang.String]]], engine: js.UndefOr[Engine], defines: js.UndefOr[Nullable[java.lang.String]], fallbacks: js.UndefOr[Nullable[EffectFallbacks]], onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, scala.Unit]]], onError: js.UndefOr[
      Nullable[js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]]
    ], indexParameters: js.UndefOr[js.Any]) = this()
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
  def this(baseName: js.Any, attributesNamesOrOptions: js.Array[java.lang.String], uniformsNamesOrEngine: js.Array[java.lang.String], samplers: js.UndefOr[Nullable[js.Array[java.lang.String]]], engine: js.UndefOr[Engine], defines: js.UndefOr[Nullable[java.lang.String]], fallbacks: js.UndefOr[Nullable[EffectFallbacks]], onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ Effect, scala.Unit]]], onError: js.UndefOr[
      Nullable[js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]]
    ], indexParameters: js.UndefOr[js.Any]) = this()
  var _attributes: js.Any = js.native
  var _attributesNames: js.Any = js.native
  /** @hidden */
  var _bonesComputationForcedToCPU: scala.Boolean = js.native
  var _compilationError: js.Any = js.native
  var _engine: js.Any = js.native
  var _fallbacks: js.Any = js.native
  var _fragmentSourceCode: js.Any = js.native
  var _fragmentSourceCodeOverride: js.Any = js.native
  var _indexParameters: js.Any = js.native
  var _isReady: js.Any = js.native
  /**
           * Key for the effect.
           * @hidden
           */
  var _key: java.lang.String = js.native
  /** @hidden */
  var _onBindObservable: Nullable[Observable[Effect]] = js.native
  var _processIncludes: js.Any = js.native
  var _processPrecision: js.Any = js.native
  var _processShaderConversion: js.Any = js.native
  /**
           * Compiled shader to webGL program.
           * @hidden
           */
  var _program: babylonjsLib.WebGLProgram = js.native
  var _samplers: js.Any = js.native
  var _transformFeedbackVaryings: js.Any = js.native
  var _uniformBuffersNames: js.Any = js.native
  var _uniforms: js.Any = js.native
  var _uniformsNames: js.Any = js.native
  var _valueCache: js.Any = js.native
  var _vertexSourceCode: js.Any = js.native
  var _vertexSourceCodeOverride: js.Any = js.native
  /**
           * String container all the define statements that should be set on the shader.
           */
  var defines: java.lang.String = js.native
  /**
           * Checks if the effect is supported. (Must be called after compilation)
           */
  val isSupported: scala.Boolean = js.native
  /**
           * Unique key for this effect
           */
  val key: java.lang.String = js.native
  /**
           * Name of the effect.
           */
  var name: js.Any = js.native
  /**
           * Callback that will be called when effect is bound.
           */
  var onBind: Nullable[js.Function1[/* effect */ this.type, scala.Unit]] = js.native
  /**
           * Observable that will be called when effect is bound.
           */
  val onBindObservable: Observable[Effect] = js.native
  /**
           * Observable that will be called when the shader is compiled.
           */
  var onCompileObservable: Observable[Effect] = js.native
  /**
           * Callback that will be called when the shader is compiled.
           */
  var onCompiled: Nullable[js.Function1[/* effect */ this.type, scala.Unit]] = js.native
  /**
           * Callback that will be called if an error occurs during shader compilation.
           */
  var onError: Nullable[js.Function2[/* effect */ this.type, /* errors */ java.lang.String, scala.Unit]] = js.native
  /**
           * Observable that will be called if an error occurs during shader compilation.
           */
  var onErrorObservable: Observable[Effect] = js.native
  /**
           * Unique ID of the effect.
           */
  var uniqueId: scala.Double = js.native
  /**
           * Binds a texture to the engine to be used as output of the shader.
           * @param channel Name of the output variable.
           * @param texture Texture to bind.
           * @hidden
           */
  def _bindTexture(channel: java.lang.String, texture: InternalTexture): scala.Unit = js.native
  /** @hidden */
  def _cacheFloat2(uniformName: java.lang.String, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /** @hidden */
  def _cacheFloat3(uniformName: java.lang.String, x: scala.Double, y: scala.Double, z: scala.Double): scala.Boolean = js.native
  /** @hidden */
  def _cacheFloat4(uniformName: java.lang.String, x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): scala.Boolean = js.native
  /** @hidden */
  def _cacheMatrix(uniformName: java.lang.String, matrix: Matrix): scala.Boolean = js.native
  /** @hidden */
  def _dumpShadersSource(vertexCode: java.lang.String, fragmentCode: java.lang.String, defines: java.lang.String): scala.Unit = js.native
  /** @hidden */
  def _loadFragmentShader(fragment: js.Any, callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  /** @hidden */
  def _loadVertexShader(vertex: js.Any, callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
           * Prepares the effect
           * @hidden
           */
  def _prepareEffect(): scala.Unit = js.native
  /**
           * Recompiles the webGL program
           * @param vertexSourceCode The source code for the vertex shader.
           * @param fragmentSourceCode The source code for the fragment shader.
           * @param onCompiled Callback called when completed.
           * @param onError Callback called on error.
           * @hidden
           */
  def _rebuildProgram(
    vertexSourceCode: java.lang.String,
    fragmentSourceCode: java.lang.String,
    onCompiled: js.Function1[/* program */ babylonjsLib.WebGLProgram, scala.Unit],
    onError: js.Function1[/* message */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  /**
           * Binds block to a uniform.
           * @param blockName Name of the block to bind.
           * @param index Index to bind.
           */
  def bindUniformBlock(blockName: java.lang.String, index: scala.Double): scala.Unit = js.native
  /**
           * Binds a buffer to a uniform.
           * @param buffer Buffer to bind.
           * @param name Name of the uniform variable to bind to.
           */
  def bindUniformBuffer(buffer: babylonjsLib.WebGLBuffer, name: java.lang.String): scala.Unit = js.native
  /**
           * Adds a callback to the onCompiled observable and call the callback imediatly if already ready.
           * @param func The callback to be used.
           */
  def executeWhenCompiled(func: js.Function1[/* effect */ this.type, scala.Unit]): scala.Unit = js.native
  /**
           * Returns the attribute at the given index.
           * @param index The index of the attribute.
           * @returns The location of the attribute.
           */
  def getAttributeLocation(index: scala.Double): scala.Double = js.native
  /**
           * Returns the attribute based on the name of the variable.
           * @param name of the attribute to look up.
           * @returns the attribute location.
           */
  def getAttributeLocationByName(name: java.lang.String): scala.Double = js.native
  /**
           * The number of attributes.
           * @returns the numnber of attributes.
           */
  def getAttributesCount(): scala.Double = js.native
  /**
           * The set of names of attribute variables for the shader.
           * @returns An array of attribute names.
           */
  def getAttributesNames(): js.Array[java.lang.String] = js.native
  /**
           * The error from the last compilation.
           * @returns the error string.
           */
  def getCompilationError(): java.lang.String = js.native
  /**
           * The engine the effect was initialized with.
           * @returns the engine.
           */
  def getEngine(): Engine = js.native
  /**
           * The compiled webGL program for the effect
           * @returns the webGL program.
           */
  def getProgram(): babylonjsLib.WebGLProgram = js.native
  /**
           * Returns an array of sampler variable names
           * @returns The array of sampler variable neames.
           */
  def getSamplers(): js.Array[java.lang.String] = js.native
  /**
           * Gets the uniform locations of the the specified variable names
           * @param names THe names of the variables to lookup.
           * @returns Array of locations in the same order as variable names.
           */
  def getSpecificUniformLocations(names: js.Array[java.lang.String]): js.Array[Nullable[babylonjsLib.WebGLUniformLocation]] = js.native
  /**
           * Returns the attribute based on the name of the variable.
           * @param uniformName of the uniform to look up.
           * @returns the location of the uniform.
           */
  def getUniform(uniformName: java.lang.String): Nullable[babylonjsLib.WebGLUniformLocation] = js.native
  /**
           * Gets the index of a uniform variable.
           * @param uniformName of the uniform to look up.
           * @returns the index.
           */
  def getUniformIndex(uniformName: java.lang.String): scala.Double = js.native
  /**
           * If the effect has been compiled and prepared.
           * @returns if the effect is compiled and prepared.
           */
  def isReady(): scala.Boolean = js.native
  /**
           * Sets an array on a uniform variable.
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setArray(uniformName: java.lang.String, array: js.Array[scala.Double]): Effect = js.native
  /**
           * Sets an array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setArray2(uniformName: java.lang.String, array: js.Array[scala.Double]): Effect = js.native
  /**
           * Sets an array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setArray3(uniformName: java.lang.String, array: js.Array[scala.Double]): Effect = js.native
  /**
           * Sets an array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setArray4(uniformName: java.lang.String, array: js.Array[scala.Double]): Effect = js.native
  /**
           * Sets a boolean on a uniform variable.
           * @param uniformName Name of the variable.
           * @param bool value to be set.
           * @returns this effect.
           */
  def setBool(uniformName: java.lang.String, bool: scala.Boolean): Effect = js.native
  /**
           * Sets a Color3 on a uniform variable.
           * @param uniformName Name of the variable.
           * @param color3 Value to be set.
           * @returns this effect.
           */
  def setColor3(uniformName: java.lang.String, color3: Color3): Effect = js.native
  /**
           * Sets a Color4 on a uniform variable.
           * @param uniformName Name of the variable.
           * @param color3 Value to be set.
           * @param alpha Alpha value to be set.
           * @returns this effect.
           */
  def setColor4(uniformName: java.lang.String, color3: Color3, alpha: scala.Double): Effect = js.native
  /**
           * Sets a depth stencil texture from a render target on the engine to be used in the shader.
           * @param channel Name of the sampler variable.
           * @param texture Texture to set.
           */
  def setDepthStencilTexture(channel: java.lang.String, texture: Nullable[RenderTargetTexture]): scala.Unit = js.native
  /**
           * Sets a Color4 on a uniform variable
           * @param uniformName defines the name of the variable
           * @param color4 defines the value to be set
           * @returns this effect.
           */
  def setDirectColor4(uniformName: java.lang.String, color4: Color4): Effect = js.native
  /**
           * Sets a float on a uniform variable.
           * @param uniformName Name of the variable.
           * @param value value to be set.
           * @returns this effect.
           */
  def setFloat(uniformName: java.lang.String, value: scala.Double): Effect = js.native
  /**
           * Sets a float2 on a uniform variable.
           * @param uniformName Name of the variable.
           * @param x First float in float2.
           * @param y Second float in float2.
           * @returns this effect.
           */
  def setFloat2(uniformName: java.lang.String, x: scala.Double, y: scala.Double): Effect = js.native
  /**
           * Sets a float3 on a uniform variable.
           * @param uniformName Name of the variable.
           * @param x First float in float3.
           * @param y Second float in float3.
           * @param z Third float in float3.
           * @returns this effect.
           */
  def setFloat3(uniformName: java.lang.String, x: scala.Double, y: scala.Double, z: scala.Double): Effect = js.native
  /**
           * Sets a float4 on a uniform variable.
           * @param uniformName Name of the variable.
           * @param x First float in float4.
           * @param y Second float in float4.
           * @param z Third float in float4.
           * @param w Fourth float in float4.
           * @returns this effect.
           */
  def setFloat4(uniformName: java.lang.String, x: scala.Double, y: scala.Double, z: scala.Double, w: scala.Double): Effect = js.native
  /**
           * Sets an float array on a uniform variable.
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setFloatArray(uniformName: java.lang.String, array: stdLib.Float32Array): Effect = js.native
  /**
           * Sets an float array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setFloatArray2(uniformName: java.lang.String, array: stdLib.Float32Array): Effect = js.native
  /**
           * Sets an float array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setFloatArray3(uniformName: java.lang.String, array: stdLib.Float32Array): Effect = js.native
  /**
           * Sets an float array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setFloatArray4(uniformName: java.lang.String, array: stdLib.Float32Array): Effect = js.native
  /**
           * Sets an interger value on a uniform variable.
           * @param uniformName Name of the variable.
           * @param value Value to be set.
           * @returns this effect.
           */
  def setInt(uniformName: java.lang.String, value: scala.Double): Effect = js.native
  /**
           * Sets an int array on a uniform variable.
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setIntArray(uniformName: java.lang.String, array: stdLib.Int32Array): Effect = js.native
  /**
           * Sets an int array 2 on a uniform variable. (Array is specified as single array eg. [1,2,3,4] will result in [[1,2],[3,4]] in the shader)
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setIntArray2(uniformName: java.lang.String, array: stdLib.Int32Array): Effect = js.native
  /**
           * Sets an int array 3 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6] will result in [[1,2,3],[4,5,6]] in the shader)
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setIntArray3(uniformName: java.lang.String, array: stdLib.Int32Array): Effect = js.native
  /**
           * Sets an int array 4 on a uniform variable. (Array is specified as single array eg. [1,2,3,4,5,6,7,8] will result in [[1,2,3,4],[5,6,7,8]] in the shader)
           * @param uniformName Name of the variable.
           * @param array array to be set.
           * @returns this effect.
           */
  def setIntArray4(uniformName: java.lang.String, array: stdLib.Int32Array): Effect = js.native
  /**
           * Sets matrices on a uniform variable.
           * @param uniformName Name of the variable.
           * @param matrices matrices to be set.
           * @returns this effect.
           */
  def setMatrices(uniformName: java.lang.String, matrices: stdLib.Float32Array): Effect = js.native
  /**
           * Sets matrix on a uniform variable.
           * @param uniformName Name of the variable.
           * @param matrix matrix to be set.
           * @returns this effect.
           */
  def setMatrix(uniformName: java.lang.String, matrix: Matrix): Effect = js.native
  /**
           * Sets a 2x2 matrix on a uniform variable. (Speicified as [1,2,3,4] will result in [1,2][3,4] matrix)
           * @param uniformName Name of the variable.
           * @param matrix matrix to be set.
           * @returns this effect.
           */
  def setMatrix2x2(uniformName: java.lang.String, matrix: stdLib.Float32Array): Effect = js.native
  /**
           * Sets a 3x3 matrix on a uniform variable. (Speicified as [1,2,3,4,5,6,7,8,9] will result in [1,2,3][4,5,6][7,8,9] matrix)
           * @param uniformName Name of the variable.
           * @param matrix matrix to be set.
           * @returns this effect.
           */
  def setMatrix3x3(uniformName: java.lang.String, matrix: stdLib.Float32Array): Effect = js.native
  /**
           * Sets a texture on the engine to be used in the shader.
           * @param channel Name of the sampler variable.
           * @param texture Texture to set.
           */
  def setTexture(channel: java.lang.String, texture: Nullable[BaseTexture]): scala.Unit = js.native
  /**
           * Sets an array of textures on the engine to be used in the shader.
           * @param channel Name of the variable.
           * @param textures Textures to set.
           */
  def setTextureArray(channel: java.lang.String, textures: js.Array[BaseTexture]): scala.Unit = js.native
  /**
           * Sets a texture to be the input of the specified post process. (To use the output, pass in the next post process in the pipeline)
           * @param channel Name of the sampler variable.
           * @param postProcess Post process to get the input texture from.
           */
  def setTextureFromPostProcess(channel: java.lang.String, postProcess: Nullable[PostProcess]): scala.Unit = js.native
  /**
           * (Warning! setTextureFromPostProcessOutput may be desired instead)
           * Sets the input texture of the passed in post process to be input of this effect. (To use the output of the passed in post process use setTextureFromPostProcessOutput)
           * @param channel Name of the sampler variable.
           * @param postProcess Post process to get the output texture from.
           */
  def setTextureFromPostProcessOutput(channel: java.lang.String, postProcess: Nullable[PostProcess]): scala.Unit = js.native
  /**
           * Sets a Vector2 on a uniform variable.
           * @param uniformName Name of the variable.
           * @param vector2 vector2 to be set.
           * @returns this effect.
           */
  def setVector2(uniformName: java.lang.String, vector2: Vector2): Effect = js.native
  /**
           * Sets a Vector3 on a uniform variable.
           * @param uniformName Name of the variable.
           * @param vector3 Value to be set.
           * @returns this effect.
           */
  def setVector3(uniformName: java.lang.String, vector3: Vector3): Effect = js.native
  /**
           * Sets a Vector4 on a uniform variable.
           * @param uniformName Name of the variable.
           * @param vector4 Value to be set.
           * @returns this effect.
           */
  def setVector4(uniformName: java.lang.String, vector4: Vector4): Effect = js.native
}

/**
     * Effect containing vertex and fragment shader that can be executed on an object.
     */
@JSGlobal("BABYLON.Effect")
@js.native
object Effect extends js.Object {
  /**
           * Store of each included file for a shader (The can be looked up using effect.key)
           */
  var IncludesShadersStore: ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
           * Store of each shader (The can be looked up using effect.key)
           */
  var ShadersStore: ScalablyTyped.runtime.StringDictionary[java.lang.String] = js.native
  var _baseCache: js.Any = js.native
  var _uniqueIdSeed: js.Any = js.native
  /**
           * This function will add a new shader to the shader store
           * @param name the name of the shader
           * @param pixelShader optional pixel shader content
           * @param vertexShader optional vertex shader content
           */
  def RegisterShader(name: java.lang.String): scala.Unit = js.native
  /**
           * This function will add a new shader to the shader store
           * @param name the name of the shader
           * @param pixelShader optional pixel shader content
           * @param vertexShader optional vertex shader content
           */
  def RegisterShader(name: java.lang.String, pixelShader: java.lang.String): scala.Unit = js.native
  /**
           * This function will add a new shader to the shader store
           * @param name the name of the shader
           * @param pixelShader optional pixel shader content
           * @param vertexShader optional vertex shader content
           */
  def RegisterShader(name: java.lang.String, pixelShader: java.lang.String, vertexShader: java.lang.String): scala.Unit = js.native
  /**
           * Resets the cache of effects.
           */
  def ResetCache(): scala.Unit = js.native
}

