package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IShaderMaterialOptions> */
@js.native
trait PartialIShaderMaterialOpt extends js.Object {
  
  var attributes: js.UndefOr[js.Array[String]] = js.native
  
  var defines: js.UndefOr[js.Array[String]] = js.native
  
  var needAlphaBlending: js.UndefOr[Boolean] = js.native
  
  var needAlphaTesting: js.UndefOr[Boolean] = js.native
  
  var samplers: js.UndefOr[js.Array[String]] = js.native
  
  var uniformBuffers: js.UndefOr[js.Array[String]] = js.native
  
  var uniforms: js.UndefOr[js.Array[String]] = js.native
}
object PartialIShaderMaterialOpt {
  
  @scala.inline
  def apply(): PartialIShaderMaterialOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIShaderMaterialOpt]
  }
  
  @scala.inline
  implicit class PartialIShaderMaterialOptOps[Self <: PartialIShaderMaterialOpt] (val x: Self) extends AnyVal {
    
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
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setDefinesVarargs(value: String*): Self = this.set("defines", js.Array(value :_*))
    
    @scala.inline
    def setDefines(value: js.Array[String]): Self = this.set("defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefines: Self = this.set("defines", js.undefined)
    
    @scala.inline
    def setNeedAlphaBlending(value: Boolean): Self = this.set("needAlphaBlending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedAlphaBlending: Self = this.set("needAlphaBlending", js.undefined)
    
    @scala.inline
    def setNeedAlphaTesting(value: Boolean): Self = this.set("needAlphaTesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedAlphaTesting: Self = this.set("needAlphaTesting", js.undefined)
    
    @scala.inline
    def setSamplersVarargs(value: String*): Self = this.set("samplers", js.Array(value :_*))
    
    @scala.inline
    def setSamplers(value: js.Array[String]): Self = this.set("samplers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSamplers: Self = this.set("samplers", js.undefined)
    
    @scala.inline
    def setUniformBuffersVarargs(value: String*): Self = this.set("uniformBuffers", js.Array(value :_*))
    
    @scala.inline
    def setUniformBuffers(value: js.Array[String]): Self = this.set("uniformBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniformBuffers: Self = this.set("uniformBuffers", js.undefined)
    
    @scala.inline
    def setUniformsVarargs(value: String*): Self = this.set("uniforms", js.Array(value :_*))
    
    @scala.inline
    def setUniforms(value: js.Array[String]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniforms: Self = this.set("uniforms", js.undefined)
  }
}
