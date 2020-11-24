package typings.babylonjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLProgram extends js.Object {
  
  var __SPECTOR_rebuildProgram: js.UndefOr[
    (js.Function4[
      /* vertexSourceCode */ String, 
      /* fragmentSourceCode */ String, 
      /* onCompiled */ js.Function1[/* program */ this.type, Unit], 
      /* onError */ js.Function1[/* message */ String, Unit], 
      Unit
    ]) | Null
  ] = js.native
}
object WebGLProgram {
  
  @scala.inline
  def apply(): WebGLProgram = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebGLProgram]
  }
  
  @scala.inline
  implicit class WebGLProgramOps[Self <: WebGLProgram] (val x: Self) extends AnyVal {
    
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
    def set__SPECTOR_rebuildProgram(
      value: (/* vertexSourceCode */ String, /* fragmentSourceCode */ String, /* onCompiled */ js.Function1[WebGLProgram, Unit], /* onError */ js.Function1[/* message */ String, Unit]) => Unit
    ): Self = this.set("__SPECTOR_rebuildProgram", js.Any.fromFunction4(value))
    
    @scala.inline
    def delete__SPECTOR_rebuildProgram: Self = this.set("__SPECTOR_rebuildProgram", js.undefined)
    
    @scala.inline
    def set__SPECTOR_rebuildProgramNull: Self = this.set("__SPECTOR_rebuildProgram", null)
  }
}
