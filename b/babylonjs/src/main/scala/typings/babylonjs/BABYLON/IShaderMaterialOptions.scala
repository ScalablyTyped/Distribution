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
    * The list of external texture names used in the shader
    */
  var externalTextures: js.Array[String]
  
  /**
    * Does the material work in alpha blend mode
    */
  var needAlphaBlending: Boolean
  
  /**
    * Does the material work in alpha test mode
    */
  var needAlphaTesting: Boolean
  
  /**
    * The list of sampler object names used in the shader
    */
  var samplerObjects: js.Array[String]
  
  /**
    * The list of sampler (texture) names used in the shader
    */
  var samplers: js.Array[String]
  
  /**
    * The language the shader is written in (default: GLSL)
    */
  var shaderLanguage: js.UndefOr[ShaderLanguage] = js.undefined
  
  /**
    * The list of storage buffer names used in the shader
    */
  var storageBuffers: js.Array[String]
  
  /**
    * The list of UBO names used in the shader
    */
  var uniformBuffers: js.Array[String]
  
  /**
    * The list of uniform names used in the shader
    */
  var uniforms: js.Array[String]
  
  /**
    * Defines if clip planes have to be turned on: true to turn them on, false to turn them off and null to turn them on/off depending on the scene configuration (scene.clipPlaneX)
    */
  var useClipPlane: Nullable[Boolean]
}
object IShaderMaterialOptions {
  
  inline def apply(
    attributes: js.Array[String],
    defines: js.Array[String],
    externalTextures: js.Array[String],
    needAlphaBlending: Boolean,
    needAlphaTesting: Boolean,
    samplerObjects: js.Array[String],
    samplers: js.Array[String],
    storageBuffers: js.Array[String],
    uniformBuffers: js.Array[String],
    uniforms: js.Array[String]
  ): IShaderMaterialOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], externalTextures = externalTextures.asInstanceOf[js.Any], needAlphaBlending = needAlphaBlending.asInstanceOf[js.Any], needAlphaTesting = needAlphaTesting.asInstanceOf[js.Any], samplerObjects = samplerObjects.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], storageBuffers = storageBuffers.asInstanceOf[js.Any], uniformBuffers = uniformBuffers.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any], useClipPlane = null)
    __obj.asInstanceOf[IShaderMaterialOptions]
  }
  
  extension [Self <: IShaderMaterialOptions](x: Self) {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setDefines(value: js.Array[String]): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setDefinesVarargs(value: String*): Self = StObject.set(x, "defines", js.Array(value*))
    
    inline def setExternalTextures(value: js.Array[String]): Self = StObject.set(x, "externalTextures", value.asInstanceOf[js.Any])
    
    inline def setExternalTexturesVarargs(value: String*): Self = StObject.set(x, "externalTextures", js.Array(value*))
    
    inline def setNeedAlphaBlending(value: Boolean): Self = StObject.set(x, "needAlphaBlending", value.asInstanceOf[js.Any])
    
    inline def setNeedAlphaTesting(value: Boolean): Self = StObject.set(x, "needAlphaTesting", value.asInstanceOf[js.Any])
    
    inline def setSamplerObjects(value: js.Array[String]): Self = StObject.set(x, "samplerObjects", value.asInstanceOf[js.Any])
    
    inline def setSamplerObjectsVarargs(value: String*): Self = StObject.set(x, "samplerObjects", js.Array(value*))
    
    inline def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    inline def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value*))
    
    inline def setShaderLanguage(value: ShaderLanguage): Self = StObject.set(x, "shaderLanguage", value.asInstanceOf[js.Any])
    
    inline def setShaderLanguageUndefined: Self = StObject.set(x, "shaderLanguage", js.undefined)
    
    inline def setStorageBuffers(value: js.Array[String]): Self = StObject.set(x, "storageBuffers", value.asInstanceOf[js.Any])
    
    inline def setStorageBuffersVarargs(value: String*): Self = StObject.set(x, "storageBuffers", js.Array(value*))
    
    inline def setUniformBuffers(value: js.Array[String]): Self = StObject.set(x, "uniformBuffers", value.asInstanceOf[js.Any])
    
    inline def setUniformBuffersVarargs(value: String*): Self = StObject.set(x, "uniformBuffers", js.Array(value*))
    
    inline def setUniforms(value: js.Array[String]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsVarargs(value: String*): Self = StObject.set(x, "uniforms", js.Array(value*))
    
    inline def setUseClipPlane(value: Nullable[Boolean]): Self = StObject.set(x, "useClipPlane", value.asInstanceOf[js.Any])
    
    inline def setUseClipPlaneNull: Self = StObject.set(x, "useClipPlane", null)
  }
}
