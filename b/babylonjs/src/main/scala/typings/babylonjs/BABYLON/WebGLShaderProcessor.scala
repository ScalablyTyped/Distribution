package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGLShaderProcessor extends IShaderProcessor {
  
  @JSName("postProcessor")
  def postProcessor_MWebGLShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean, engine: ThinEngine): String = js.native
}
object WebGLShaderProcessor {
  
  @scala.inline
  def apply(postProcessor: (String, js.Array[String], Boolean, ThinEngine) => String): WebGLShaderProcessor = {
    val __obj = js.Dynamic.literal(postProcessor = js.Any.fromFunction4(postProcessor))
    __obj.asInstanceOf[WebGLShaderProcessor]
  }
  
  @scala.inline
  implicit class WebGLShaderProcessorOps[Self <: WebGLShaderProcessor] (val x: Self) extends AnyVal {
    
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
    def setPostProcessor(value: (String, js.Array[String], Boolean, ThinEngine) => String): Self = this.set("postProcessor", js.Any.fromFunction4(value))
  }
}
