package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShaderMaterialOptions extends StObject {
  
  /**
    * The list of attribute names used in the shader
    */
  var attributes: js.Array[String]
  
  /**
    * The list of defines used in the shader
    */
  var defines: js.Array[String]
  
  /**
    * Does the material work in alpha blend mode
    */
  var needAlphaBlending: Boolean
  
  /**
    * Does the material work in alpha test mode
    */
  var needAlphaTesting: Boolean
  
  /**
    * The list of sampler names used in the shader
    */
  var samplers: js.Array[String]
  
  /**
    * The list of UBO names used in the shader
    */
  var uniformBuffers: js.Array[String]
  
  /**
    * The list of unifrom names used in the shader
    */
  var uniforms: js.Array[String]
}
object IShaderMaterialOptions {
  
  inline def apply(
    attributes: js.Array[String],
    defines: js.Array[String],
    needAlphaBlending: Boolean,
    needAlphaTesting: Boolean,
    samplers: js.Array[String],
    uniformBuffers: js.Array[String],
    uniforms: js.Array[String]
  ): IShaderMaterialOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], needAlphaBlending = needAlphaBlending.asInstanceOf[js.Any], needAlphaTesting = needAlphaTesting.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], uniformBuffers = uniformBuffers.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShaderMaterialOptions]
  }
  
  extension [Self <: IShaderMaterialOptions](x: Self) {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value :_*))
    
    inline def setNeedAlphaBlending(value: Boolean): Self = StObject.set(x, "needAlphaBlending", value.asInstanceOf[js.Any])
    
    inline def setNeedAlphaTesting(value: Boolean): Self = StObject.set(x, "needAlphaTesting", value.asInstanceOf[js.Any])
    
    inline def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    inline def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value :_*))
    
    inline def setUniformBuffers(value: js.Array[String]): Self = StObject.set(x, "uniformBuffers", value.asInstanceOf[js.Any])
    
    inline def setUniformBuffersVarargs(value: String*): Self = StObject.set(x, "uniformBuffers", js.Array(value :_*))
    
    inline def setUniforms(value: js.Array[String]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsVarargs(value: String*): Self = StObject.set(x, "uniforms", js.Array(value :_*))
  }
}
