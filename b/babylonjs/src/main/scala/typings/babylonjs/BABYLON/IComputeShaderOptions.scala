package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComputeShaderOptions extends StObject {
  
  /**
    * list of bindings mapping (key is property name, value is binding location)
    * Must be provided because browsers don't support reflection for wgsl shaders yet (so there's no way to query the binding/group from a variable name)
    * TODO: remove this when browsers support reflection for wgsl shaders
    */
  var bindingsMapping: ComputeBindingMapping
  
  /**
    * The list of defines used in the shader
    */
  var defines: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The name of the entry point in the shader source (default: "main")
    */
  var entryPoint: js.UndefOr[String] = js.undefined
  
  /**
    * If provided, will be called with the shader code so that this code can be updated before it is compiled by the GPU
    */
  var processFinalCode: js.UndefOr[Nullable[js.Function1[/* code */ String, String]]] = js.undefined
}
object IComputeShaderOptions {
  
  inline def apply(bindingsMapping: ComputeBindingMapping): IComputeShaderOptions = {
    val __obj = js.Dynamic.literal(bindingsMapping = bindingsMapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComputeShaderOptions]
  }
  
  extension [Self <: IComputeShaderOptions](x: Self) {
    
    inline def setBindingsMapping(value: ComputeBindingMapping): Self = StObject.set(x, "bindingsMapping", value.asInstanceOf[js.Any])
    
    inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
    
    inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value*))
    
    inline def setEntryPoint(value: String): Self = StObject.set(x, "entryPoint", value.asInstanceOf[js.Any])
    
    inline def setEntryPointUndefined: Self = StObject.set(x, "entryPoint", js.undefined)
    
    inline def setProcessFinalCode(value: /* code */ String => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction1(value))
    
    inline def setProcessFinalCodeNull: Self = StObject.set(x, "processFinalCode", null)
    
    inline def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
  }
}
