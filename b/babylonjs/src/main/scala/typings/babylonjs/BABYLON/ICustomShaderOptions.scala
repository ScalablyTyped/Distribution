package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomShaderOptions extends StObject {
  
  /**
    * The list of attribute names used in the shader
    */
  var attributes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of defines used in the shader
    */
  var defines: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The list of sampler names used in the shader
    */
  var samplers: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Gets or sets the custom shader name to use
    */
  var shaderName: String = js.native
  
  /**
    * The list of unifrom names used in the shader
    */
  var uniforms: js.UndefOr[js.Array[String]] = js.native
}
object ICustomShaderOptions {
  
  @scala.inline
  def apply(shaderName: String): ICustomShaderOptions = {
    val __obj = js.Dynamic.literal(shaderName = shaderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICustomShaderOptions]
  }
  
  @scala.inline
  implicit class ICustomShaderOptionsMutableBuilder[Self <: ICustomShaderOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
    
    @scala.inline
    def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value :_*))
    
    @scala.inline
    def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplersUndefined: Self = StObject.set(x, "samplers", js.undefined)
    
    @scala.inline
    def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value :_*))
    
    @scala.inline
    def setShaderName(value: String): Self = StObject.set(x, "shaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniforms(value: js.Array[String]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    
    @scala.inline
    def setUniformsVarargs(value: String*): Self = StObject.set(x, "uniforms", js.Array(value :_*))
  }
}
