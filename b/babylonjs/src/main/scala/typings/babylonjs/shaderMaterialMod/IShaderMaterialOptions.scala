package typings.babylonjs.shaderMaterialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShaderMaterialOptions extends js.Object {
  
  /**
    * The list of attribute names used in the shader
    */
  var attributes: js.Array[String] = js.native
  
  /**
    * The list of defines used in the shader
    */
  var defines: js.Array[String] = js.native
  
  /**
    * Does the material work in alpha blend mode
    */
  var needAlphaBlending: Boolean = js.native
  
  /**
    * Does the material work in alpha test mode
    */
  var needAlphaTesting: Boolean = js.native
  
  /**
    * The list of sampler names used in the shader
    */
  var samplers: js.Array[String] = js.native
  
  /**
    * The list of UBO names used in the shader
    */
  var uniformBuffers: js.Array[String] = js.native
  
  /**
    * The list of unifrom names used in the shader
    */
  var uniforms: js.Array[String] = js.native
}
object IShaderMaterialOptions {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class IShaderMaterialOptionsOps[Self <: IShaderMaterialOptions] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: String*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinesVarargs(value: String*): Self = this.set("defines", js.Array(value :_*))
    
    @scala.inline
    def setDefines(value: js.Array[String]): Self = this.set("defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedAlphaBlending(value: Boolean): Self = this.set("needAlphaBlending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedAlphaTesting(value: Boolean): Self = this.set("needAlphaTesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplersVarargs(value: String*): Self = this.set("samplers", js.Array(value :_*))
    
    @scala.inline
    def setSamplers(value: js.Array[String]): Self = this.set("samplers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformBuffersVarargs(value: String*): Self = this.set("uniformBuffers", js.Array(value :_*))
    
    @scala.inline
    def setUniformBuffers(value: js.Array[String]): Self = this.set("uniformBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformsVarargs(value: String*): Self = this.set("uniforms", js.Array(value :_*))
    
    @scala.inline
    def setUniforms(value: js.Array[String]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
  }
}
