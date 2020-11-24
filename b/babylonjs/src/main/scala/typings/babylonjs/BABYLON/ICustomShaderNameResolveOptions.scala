package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomShaderNameResolveOptions extends js.Object {
  
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
  implicit class ICustomShaderNameResolveOptionsOps[Self <: ICustomShaderNameResolveOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setProcessFinalCode(value: (/* shaderType */ String, /* code */ String) => String): Self = this.set("processFinalCode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProcessFinalCode: Self = this.set("processFinalCode", js.undefined)
    
    @scala.inline
    def setProcessFinalCodeNull: Self = this.set("processFinalCode", null)
  }
}
