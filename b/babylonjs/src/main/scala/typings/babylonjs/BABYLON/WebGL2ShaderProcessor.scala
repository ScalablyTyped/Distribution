package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebGL2ShaderProcessor extends IShaderProcessor {
  
  @JSName("attributeProcessor")
  def attributeProcessor_MWebGL2ShaderProcessor(attribute: String): String = js.native
  
  @JSName("postProcessor")
  def postProcessor_MWebGL2ShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String = js.native
  
  @JSName("varyingProcessor")
  def varyingProcessor_MWebGL2ShaderProcessor(varying: String, isFragment: Boolean): String = js.native
}
object WebGL2ShaderProcessor {
  
  @scala.inline
  def apply(
    attributeProcessor: String => String,
    postProcessor: (String, js.Array[String], Boolean) => String,
    varyingProcessor: (String, Boolean) => String
  ): WebGL2ShaderProcessor = {
    val __obj = js.Dynamic.literal(attributeProcessor = js.Any.fromFunction1(attributeProcessor), postProcessor = js.Any.fromFunction3(postProcessor), varyingProcessor = js.Any.fromFunction2(varyingProcessor))
    __obj.asInstanceOf[WebGL2ShaderProcessor]
  }
  
  @scala.inline
  implicit class WebGL2ShaderProcessorOps[Self <: WebGL2ShaderProcessor] (val x: Self) extends AnyVal {
    
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
    def setAttributeProcessor(value: String => String): Self = this.set("attributeProcessor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPostProcessor(value: (String, js.Array[String], Boolean) => String): Self = this.set("postProcessor", js.Any.fromFunction3(value))
    
    @scala.inline
    def setVaryingProcessor(value: (String, Boolean) => String): Self = this.set("varyingProcessor", js.Any.fromFunction2(value))
  }
}
