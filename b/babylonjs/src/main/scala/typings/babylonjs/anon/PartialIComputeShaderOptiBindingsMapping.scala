package typings.babylonjs.anon

import typings.babylonjs.BABYLON.ComputeBindingMapping
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IComputeShaderOptions> */
trait PartialIComputeShaderOptiBindingsMapping extends StObject {
  
  var bindingsMapping: js.UndefOr[ComputeBindingMapping] = js.undefined
  
  var defines: js.UndefOr[js.Array[String]] = js.undefined
  
  var entryPoint: js.UndefOr[String] = js.undefined
  
  var processFinalCode: js.UndefOr[Nullable[js.Function1[/* code */ String, String]]] = js.undefined
}
object PartialIComputeShaderOptiBindingsMapping {
  
  inline def apply(): PartialIComputeShaderOptiBindingsMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIComputeShaderOptiBindingsMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialIComputeShaderOptiBindingsMapping] (val x: Self) extends AnyVal {
    
    inline def setBindingsMapping(value: ComputeBindingMapping): Self = StObject.set(x, "bindingsMapping", value.asInstanceOf[js.Any])
    
    inline def setBindingsMappingUndefined: Self = StObject.set(x, "bindingsMapping", js.undefined)
    
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
