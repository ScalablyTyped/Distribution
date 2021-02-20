package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IShaderMaterialOptions> */
@js.native
trait PartialIShaderMaterialOpt extends StObject {
  
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
  implicit class PartialIShaderMaterialOptMutableBuilder[Self <: PartialIShaderMaterialOpt] (val x: Self) extends AnyVal {
    
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
    def setNeedAlphaBlending(value: Boolean): Self = StObject.set(x, "needAlphaBlending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedAlphaBlendingUndefined: Self = StObject.set(x, "needAlphaBlending", js.undefined)
    
    @scala.inline
    def setNeedAlphaTesting(value: Boolean): Self = StObject.set(x, "needAlphaTesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedAlphaTestingUndefined: Self = StObject.set(x, "needAlphaTesting", js.undefined)
    
    @scala.inline
    def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplersUndefined: Self = StObject.set(x, "samplers", js.undefined)
    
    @scala.inline
    def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value :_*))
    
    @scala.inline
    def setUniformBuffers(value: js.Array[String]): Self = StObject.set(x, "uniformBuffers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformBuffersUndefined: Self = StObject.set(x, "uniformBuffers", js.undefined)
    
    @scala.inline
    def setUniformBuffersVarargs(value: String*): Self = StObject.set(x, "uniformBuffers", js.Array(value :_*))
    
    @scala.inline
    def setUniforms(value: js.Array[String]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    
    @scala.inline
    def setUniformsVarargs(value: String*): Self = StObject.set(x, "uniforms", js.Array(value :_*))
  }
}
