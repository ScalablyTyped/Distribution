package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomShaderNameResolveOptions extends StObject {
  
  /**
    * If provided, will be called two times with the vertex and fragment code so that this code can be updated before it is compiled by the GPU
    */
  var processFinalCode: js.UndefOr[Nullable[ShaderCustomProcessingFunction]] = js.undefined
}
object ICustomShaderNameResolveOptions {
  
  inline def apply(): ICustomShaderNameResolveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomShaderNameResolveOptions]
  }
  
  extension [Self <: ICustomShaderNameResolveOptions](x: Self) {
    
    inline def setProcessFinalCode(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction2(value))
    
    inline def setProcessFinalCodeNull: Self = StObject.set(x, "processFinalCode", null)
    
    inline def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
  }
}
