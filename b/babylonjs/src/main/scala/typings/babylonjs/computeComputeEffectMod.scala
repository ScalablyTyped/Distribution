package typings.babylonjs

import typings.babylonjs.computeIcomputepipelinecontextMod.IComputePipelineContext
import typings.babylonjs.enginesEngineMod.Engine
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object computeComputeEffectMod {
  
  @JSImport("babylonjs/Compute/computeEffect", "ComputeEffect")
  @js.native
  open class ComputeEffect protected () extends StObject {
    /**
      * Creates a compute effect that can be used to execute a compute shader
      * @param baseName Name of the effect
      * @param options Set of all options to create the effect
      * @param engine The engine the effect is created for
      * @param key Effect Key identifying uniquely compiled shader variants
      */
    def this(baseName: Any, options: IComputeEffectCreationOptions, engine: Engine) = this()
    def this(baseName: Any, options: IComputeEffectCreationOptions, engine: Engine, key: String) = this()
    
    /* private */ var _checkIsReady: Any = js.native
    
    /* private */ var _compilationError: Any = js.native
    
    /** @internal */
    var _computeSourceCode: String = js.native
    
    /* private */ var _computeSourceCodeOverride: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _entryPoint: Any = js.native
    
    /* private */ var _getShaderCodeAndErrorLine: Any = js.native
    
    /* private */ var _includeShaderStore: Any = js.native
    
    /* private */ var _isReady: Any = js.native
    
    /* private */ var _isReadyInternal: Any = js.native
    
    /** @internal */
    var _key: String = js.native
    
    /* private */ var _loadShader: Any = js.native
    
    /** @internal */
    var _pipelineContext: Nullable[IComputePipelineContext] = js.native
    
    /**
      * Prepares the effect
      * @internal
      */
    def _prepareEffect(): Unit = js.native
    
    /* private */ var _processCompilationErrors: Any = js.native
    
    /* private */ var _rawComputeSourceCode: Any = js.native
    
    /* private */ var _shaderLanguage: Any = js.native
    
    /* private */ var _shaderRepository: Any = js.native
    
    /* private */ var _shaderStore: Any = js.native
    
    /* private */ var _useFinalCode: Any = js.native
    
    /**
      * @internal
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
  /* static members */
  object ComputeEffect {
    
    @JSImport("babylonjs/Compute/computeEffect", "ComputeEffect")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Enable logging of the shader code when a compilation error occurs
      */
    @JSImport("babylonjs/Compute/computeEffect", "ComputeEffect.LogShaderCodeOnCompilationError")
    @js.native
    def LogShaderCodeOnCompilationError: Boolean = js.native
    inline def LogShaderCodeOnCompilationError_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogShaderCodeOnCompilationError")(x.asInstanceOf[js.Any])
    
    /**
      * This function will add a new compute shader to the shader store
      * @param name the name of the shader
      * @param computeShader compute shader content
      */
    inline def RegisterShader(name: String, computeShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], computeShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("babylonjs/Compute/computeEffect", "ComputeEffect._UniqueIdSeed")
    @js.native
    def _UniqueIdSeed: Any = js.native
    inline def _UniqueIdSeed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UniqueIdSeed")(x.asInstanceOf[js.Any])
  }
  
  trait IComputeEffectCreationOptions extends StObject {
    
    /**
      * Define statements that will be set in the shader.
      */
    var defines: Any
    
    /**
      * The name of the entry point in the shader source (default: "main")
      */
    var entryPoint: js.UndefOr[String] = js.undefined
    
    /**
      * Callback that will be called when the shader is compiled.
      */
    var onCompiled: Nullable[js.Function1[/* effect */ ComputeEffect, Unit]]
    
    /**
      * Callback that will be called if an error occurs during shader compilation.
      */
    var onError: Nullable[js.Function2[/* effect */ ComputeEffect, /* errors */ String, Unit]]
    
    /**
      * If provided, will be called with the shader code so that this code can be updated before it is compiled by the GPU
      */
    var processFinalCode: js.UndefOr[Nullable[js.Function1[/* code */ String, String]]] = js.undefined
  }
  object IComputeEffectCreationOptions {
    
    inline def apply(defines: Any): IComputeEffectCreationOptions = {
      val __obj = js.Dynamic.literal(defines = defines.asInstanceOf[js.Any], onCompiled = null, onError = null)
      __obj.asInstanceOf[IComputeEffectCreationOptions]
    }
    
    extension [Self <: IComputeEffectCreationOptions](x: Self) {
      
      inline def setDefines(value: Any): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
      
      inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
      
      inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
      
      inline def setOnCompiled(value: /* effect */ ComputeEffect => Unit): Self = StObject.set(x, "onCompiled", js.Any.fromFunction1(value))
      
      inline def setOnCompiledNull: Self = StObject.set(x, "onCompiled", null)
      
      inline def setOnError(value: (/* effect */ ComputeEffect, /* errors */ String) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      inline def setOnErrorNull: Self = StObject.set(x, "onError", null)
      
      inline def setProcessFinalCode(value: /* code */ String => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction1(value))
      
      inline def setProcessFinalCodeNull: Self = StObject.set(x, "processFinalCode", null)
      
      inline def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
    }
  }
}
