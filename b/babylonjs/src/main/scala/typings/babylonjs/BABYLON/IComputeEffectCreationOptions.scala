package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
