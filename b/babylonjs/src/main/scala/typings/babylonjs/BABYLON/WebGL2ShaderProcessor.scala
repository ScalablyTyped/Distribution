package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGL2ShaderProcessor
  extends StObject
     with IShaderProcessor {
  
  @JSName("attributeProcessor")
  def attributeProcessor_MWebGL2ShaderProcessor(attribute: String): String
  
  @JSName("postProcessor")
  def postProcessor_MWebGL2ShaderProcessor(code: String, defines: js.Array[String], isFragment: Boolean): String
  
  @JSName("varyingProcessor")
  def varyingProcessor_MWebGL2ShaderProcessor(varying: String, isFragment: Boolean): String
}
object WebGL2ShaderProcessor {
  
  inline def apply(
    attributeProcessor: String => String,
    postProcessor: (String, js.Array[String], Boolean) => String,
    shaderLanguage: ShaderLanguage,
    varyingProcessor: (String, Boolean) => String
  ): WebGL2ShaderProcessor = {
    val __obj = js.Dynamic.literal(attributeProcessor = js.Any.fromFunction1(attributeProcessor), postProcessor = js.Any.fromFunction3(postProcessor), shaderLanguage = shaderLanguage.asInstanceOf[js.Any], varyingProcessor = js.Any.fromFunction2(varyingProcessor))
    __obj.asInstanceOf[WebGL2ShaderProcessor]
  }
  
  extension [Self <: WebGL2ShaderProcessor](x: Self) {
    
    inline def setAttributeProcessor(value: String => String): Self = StObject.set(x, "attributeProcessor", js.Any.fromFunction1(value))
    
    inline def setPostProcessor(value: (String, js.Array[String], Boolean) => String): Self = StObject.set(x, "postProcessor", js.Any.fromFunction3(value))
    
    inline def setVaryingProcessor(value: (String, Boolean) => String): Self = StObject.set(x, "varyingProcessor", js.Any.fromFunction2(value))
  }
}
