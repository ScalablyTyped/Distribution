package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICustomShaderOptions extends js.Object {
  
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
  implicit class ICustomShaderOptionsOps[Self <: ICustomShaderOptions] (val x: Self) extends AnyVal {
    
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
    def setShaderName(value: String): Self = this.set("shaderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setDefinesVarargs(value: String*): Self = this.set("defines", js.Array(value :_*))
    
    @scala.inline
    def setDefines(value: js.Array[String]): Self = this.set("defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefines: Self = this.set("defines", js.undefined)
    
    @scala.inline
    def setSamplersVarargs(value: String*): Self = this.set("samplers", js.Array(value :_*))
    
    @scala.inline
    def setSamplers(value: js.Array[String]): Self = this.set("samplers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplers: Self = this.set("samplers", js.undefined)
    
    @scala.inline
    def setUniformsVarargs(value: String*): Self = this.set("uniforms", js.Array(value :_*))
    
    @scala.inline
    def setUniforms(value: js.Array[String]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniforms: Self = this.set("uniforms", js.undefined)
  }
}
