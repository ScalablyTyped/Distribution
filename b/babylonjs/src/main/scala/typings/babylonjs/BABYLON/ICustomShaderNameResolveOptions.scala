package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomShaderNameResolveOptions extends StObject {
  
  /**
    * If provided, will be called two times with the vertex and fragment code so that this code can be updated before it is compiled by the GPU
    */
  var processFinalCode: js.UndefOr[Nullable[js.Function2[/* shaderType */ String, /* code */ String, String]]] = js.native
}
object ICustomShaderNameResolveOptions {
  
  @scala.inline
  def apply(): ICustomShaderNameResolveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICustomShaderNameResolveOptions]
  }
  
  @scala.inline
  implicit class ICustomShaderNameResolveOptionsMutableBuilder[Self <: ICustomShaderNameResolveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProcessFinalCode(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessFinalCodeNull: Self = StObject.set(x, "processFinalCode", null)
    
    @scala.inline
    def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
  }
}
