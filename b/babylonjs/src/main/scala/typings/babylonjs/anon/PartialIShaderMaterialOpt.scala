package typings.babylonjs.anon

import typings.babylonjs.materialsShaderLanguageMod.ShaderLanguage
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<babylonjs.babylonjs/Materials/shaderMaterial.IShaderMaterialOptions> */
trait PartialIShaderMaterialOpt extends StObject {
  
  var attributes: js.UndefOr[js.Array[String]] = js.undefined
  
  var defines: js.UndefOr[js.Array[String]] = js.undefined
  
  var externalTextures: js.UndefOr[js.Array[String]] = js.undefined
  
  var needAlphaBlending: js.UndefOr[Boolean] = js.undefined
  
  var needAlphaTesting: js.UndefOr[Boolean] = js.undefined
  
  var samplerObjects: js.UndefOr[js.Array[String]] = js.undefined
  
  var samplers: js.UndefOr[js.Array[String]] = js.undefined
  
  var shaderLanguage: js.UndefOr[ShaderLanguage] = js.undefined
  
  var storageBuffers: js.UndefOr[js.Array[String]] = js.undefined
  
  var uniformBuffers: js.UndefOr[js.Array[String]] = js.undefined
  
  var uniforms: js.UndefOr[js.Array[String]] = js.undefined
  
  var useClipPlane: js.UndefOr[Nullable[Boolean]] = js.undefined
}
object PartialIShaderMaterialOpt {
  
  inline def apply(): PartialIShaderMaterialOpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialIShaderMaterialOpt]
  }
  
  extension [Self <: PartialIShaderMaterialOpt](x: Self) {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setDefinesUndefined: Self = StObject.set(x, "defines", js.undefined)
    
    inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value*))
    
    inline def setExternalTextures(value: js.Array[String]): Self = StObject.set(x, "externalTextures", value.asInstanceOf[js.Any])
    
    inline def setExternalTexturesUndefined: Self = StObject.set(x, "externalTextures", js.undefined)
    
    inline def setExternalTexturesVarargs(value: String*): Self = StObject.set(x, "externalTextures", js.Array(value*))
    
    inline def setNeedAlphaBlending(value: Boolean): Self = StObject.set(x, "needAlphaBlending", value.asInstanceOf[js.Any])
    
    inline def setNeedAlphaBlendingUndefined: Self = StObject.set(x, "needAlphaBlending", js.undefined)
    
    inline def setNeedAlphaTesting(value: Boolean): Self = StObject.set(x, "needAlphaTesting", value.asInstanceOf[js.Any])
    
    inline def setNeedAlphaTestingUndefined: Self = StObject.set(x, "needAlphaTesting", js.undefined)
    
    inline def setSamplerObjects(value: js.Array[String]): Self = StObject.set(x, "samplerObjects", value.asInstanceOf[js.Any])
    
    inline def setSamplerObjectsUndefined: Self = StObject.set(x, "samplerObjects", js.undefined)
    
    inline def setSamplerObjectsVarargs(value: String*): Self = StObject.set(x, "samplerObjects", js.Array(value*))
    
    inline def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    inline def setSamplersUndefined: Self = StObject.set(x, "samplers", js.undefined)
    
    inline def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value*))
    
    inline def setShaderLanguage(value: ShaderLanguage): Self = StObject.set(x, "shaderLanguage", value.asInstanceOf[js.Any])
    
    inline def setShaderLanguageUndefined: Self = StObject.set(x, "shaderLanguage", js.undefined)
    
    inline def setStorageBuffers(value: js.Array[String]): Self = StObject.set(x, "storageBuffers", value.asInstanceOf[js.Any])
    
    inline def setStorageBuffersUndefined: Self = StObject.set(x, "storageBuffers", js.undefined)
    
    inline def setStorageBuffersVarargs(value: String*): Self = StObject.set(x, "storageBuffers", js.Array(value*))
    
    inline def setUniformBuffers(value: js.Array[String]): Self = StObject.set(x, "uniformBuffers", value.asInstanceOf[js.Any])
    
    inline def setUniformBuffersUndefined: Self = StObject.set(x, "uniformBuffers", js.undefined)
    
    inline def setUniformBuffersVarargs(value: String*): Self = StObject.set(x, "uniformBuffers", js.Array(value*))
    
    inline def setUniforms(value: js.Array[String]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsUndefined: Self = StObject.set(x, "uniforms", js.undefined)
    
    inline def setUniformsVarargs(value: String*): Self = StObject.set(x, "uniforms", js.Array(value*))
    
    inline def setUseClipPlane(value: Nullable[Boolean]): Self = StObject.set(x, "useClipPlane", value.asInstanceOf[js.Any])
    
    inline def setUseClipPlaneNull: Self = StObject.set(x, "useClipPlane", null)
    
    inline def setUseClipPlaneUndefined: Self = StObject.set(x, "useClipPlane", js.undefined)
  }
}
