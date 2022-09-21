package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputeEffect extends StObject {
  
  /* private */ var _checkIsReady: Any = js.native
  
  /* private */ var _compilationError: Any = js.native
  
  /** @hidden */
  var _computeSourceCode: String = js.native
  
  /* private */ var _computeSourceCodeOverride: Any = js.native
  
  /* private */ var _engine: Any = js.native
  
  /* private */ var _entryPoint: Any = js.native
  
  /* private */ var _getShaderCodeAndErrorLine: Any = js.native
  
  /* private */ var _includeShaderStore: Any = js.native
  
  /* private */ var _isReady: Any = js.native
  
  /* private */ var _isReadyInternal: Any = js.native
  
  /** @hidden */
  var _key: String = js.native
  
  /* private */ var _loadShader: Any = js.native
  
  /** @hidden */
  var _pipelineContext: Nullable[IComputePipelineContext] = js.native
  
  /**
    * Prepares the effect
    * @hidden
    */
  def _prepareEffect(): Unit = js.native
  
  /* private */ var _processCompilationErrors: Any = js.native
  
  /* private */ var _rawComputeSourceCode: Any = js.native
  
  /* private */ var _shaderLanguage: Any = js.native
  
  /* private */ var _shaderRepository: Any = js.native
  
  /* private */ var _shaderStore: Any = js.native
  
  /* private */ var _useFinalCode: Any = js.native
  
  /**
    * @hidden
    * Specifies if the effect was previously ready
    */
  var _wasPreviouslyReady: Boolean = js.native
  
  /**
    * Gets the compute shader source code of this effect
    */
  def computeSourceCode: String = js.native
  
  /**
    * String container all the define statements that should be set on the shader.
    */
  var defines: String = js.native
  
  /**
    * Release all associated resources.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Adds a callback to the onCompiled observable and call the callback immediately if already ready.
    * @param func The callback to be used.
    */
  def executeWhenCompiled(func: js.Function1[/* effect */ this.type, Unit]): Unit = js.native
  
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
    * The pipeline context for this effect
    * @returns the associated pipeline context
    */
  def getPipelineContext(): Nullable[IComputePipelineContext] = js.native
  
  /**
    * If the effect has been compiled and prepared.
    * @returns if the effect is compiled and prepared.
    */
  def isReady(): Boolean = js.native
  
  /**
    * Unique key for this effect
    */
  def key: String = js.native
  
  /**
    * Name of the effect.
    */
  var name: Any = js.native
  
  /**
    * Observable that will be called when effect is bound.
    */
  var onBindObservable: Observable[ComputeEffect] = js.native
  
  /**
    * Observable that will be called when the shader is compiled.
    * It is recommended to use executeWhenCompile() or to make sure that scene.isReady() is called to get this observable raised.
    */
  var onCompileObservable: Observable[ComputeEffect] = js.native
  
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
  var onErrorObservable: Observable[ComputeEffect] = js.native
  
  /**
    * Gets the compute shader source code before it has been processed by the preprocessor
    */
  def rawComputeSourceCode: String = js.native
  
  /**
    * Unique ID of the effect.
    */
  var uniqueId: Double = js.native
}
