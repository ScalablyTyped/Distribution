package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICustomShaderOptions extends StObject {
  
  /**
    * The list of attribute names used in the shader
    */
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of defines used in the shader
    */
  var defines: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The list of sampler names used in the shader
    */
  var samplers: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Gets or sets the custom shader name to use
    */
  var shaderName: String
  
  /**
    * The list of unifrom names used in the shader
    */
  var uniforms: js.UndefOr[js.Array[String]] = js.undefined
}
object ICustomShaderOptions {
  
  inline def apply(shaderName: String): ICustomShaderOptions = {
    val __obj = js.Dynamic.literal(shaderName = shaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomShaderOptions]
  }
  
  extension [Self <: ICustomShaderOptions](x: Self) {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
    
    inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value :_*))
    
    inline def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    inline def setSamplersUndefined: Self = StObject.set(x, "samplers", js.undefined)
    
    inline def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value :_*))
    
    inline def setShaderName(value: String): Self = StObject.set(x, "shaderName", value.asInstanceOf[js.Any])
    
    inline def setUniforms(value: js.Array[String]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    
    inline def setUniformsVarargs(value: String*): Self = StObject.set(x, "uniforms", js.Array(value :_*))
  }
}
