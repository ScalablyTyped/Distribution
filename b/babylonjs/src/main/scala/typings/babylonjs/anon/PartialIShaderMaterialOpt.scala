package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.BABYLON.IShaderMaterialOptions> */
trait PartialIShaderMaterialOpt extends StObject {
  
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var defines: js.UndefOr[js.Array[String]] = js.undefined
  
  var needAlphaBlending: js.UndefOr[Boolean] = js.undefined
  
  var needAlphaTesting: js.UndefOr[Boolean] = js.undefined
  
  var samplers: js.UndefOr[js.Array[String]] = js.undefined
  
  var uniformBuffers: js.UndefOr[js.Array[String]] = js.undefined
  
  var uniforms: js.UndefOr[js.Array[String]] = js.undefined
}
object PartialIShaderMaterialOpt {
  
  inline def apply(): PartialIShaderMaterialOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIShaderMaterialOpt]
  }
  
  extension [Self <: PartialIShaderMaterialOpt](x: Self) {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
    
    inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value :_*))
    
    inline def setNeedAlphaBlending(value: Boolean): Self = StObject.set(x, "needAlphaBlending", value.asInstanceOf[js.Any])
    
    inline def setNeedAlphaBlendingUndefined: Self = StObject.set(x, "needAlphaBlending", js.undefined)
    
    inline def setNeedAlphaTesting(value: Boolean): Self = StObject.set(x, "needAlphaTesting", value.asInstanceOf[js.Any])
    
    inline def setNeedAlphaTestingUndefined: Self = StObject.set(x, "needAlphaTesting", js.undefined)
    
    inline def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    inline def setSamplersUndefined: Self = StObject.set(x, "samplers", js.undefined)
    
    inline def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value :_*))
    
    inline def setUniformBuffers(value: js.Array[String]): Self = StObject.set(x, "uniformBuffers", value.asInstanceOf[js.Any])
    
    inline def setUniformBuffersUndefined: Self = StObject.set(x, "uniformBuffers", js.undefined)
    
    inline def setUniformBuffersVarargs(value: String*): Self = StObject.set(x, "uniformBuffers", js.Array(value :_*))
    
    inline def setUniforms(value: js.Array[String]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    
    inline def setUniformsVarargs(value: String*): Self = StObject.set(x, "uniforms", js.Array(value :_*))
  }
}
