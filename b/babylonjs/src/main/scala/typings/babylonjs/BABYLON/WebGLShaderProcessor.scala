package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
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
  implicit class WebGLShaderProcessorMutableBuilder[Self <: WebGLShaderProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostProcessor(value: (String, js.Array[String], Boolean, ThinEngine) => String): Self = StObject.set(x, "postProcessor", js.Any.fromFunction4(value))
  }
}
