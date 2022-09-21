package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaterialPluginPrepareEffect extends StObject {
  
  var attributes: js.Array[String]
  
  var customCode: js.UndefOr[ShaderCustomProcessingFunction] = js.undefined
  
  var defines: MaterialDefines
  
  var fallbackRank: Double
  
  var fallbacks: EffectFallbacks
  
  var mesh: AbstractMesh
  
  var samplers: js.Array[String]
  
  var uniformBuffersNames: js.Array[String]
  
  var uniforms: js.Array[String]
}
object MaterialPluginPrepareEffect {
  
  inline def apply(
    attributes: js.Array[String],
    defines: MaterialDefines,
    fallbackRank: Double,
    fallbacks: EffectFallbacks,
    mesh: AbstractMesh,
    samplers: js.Array[String],
    uniformBuffersNames: js.Array[String],
    uniforms: js.Array[String]
  ): MaterialPluginPrepareEffect = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], fallbackRank = fallbackRank.asInstanceOf[js.Any], fallbacks = fallbacks.asInstanceOf[js.Any], mesh = mesh.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], uniformBuffersNames = uniformBuffersNames.asInstanceOf[js.Any], uniforms = uniforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterialPluginPrepareEffect]
  }
  
  extension [Self <: MaterialPluginPrepareEffect](x: Self) {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCustomCode(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "customCode", js.Any.fromFunction2(value))
    
    inline def setCustomCodeUndefined: Self = StObject.set(x, "customCode", js.undefined)
    
    inline def setDefines(value: MaterialDefines): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setFallbackRank(value: Double): Self = StObject.set(x, "fallbackRank", value.asInstanceOf[js.Any])
    
    inline def setFallbacks(value: EffectFallbacks): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: AbstractMesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    inline def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value*))
    
    inline def setUniformBuffersNames(value: js.Array[String]): Self = StObject.set(x, "uniformBuffersNames", value.asInstanceOf[js.Any])
    
    inline def setUniformBuffersNamesVarargs(value: String*): Self = StObject.set(x, "uniformBuffersNames", js.Array(value*))
    
    inline def setUniforms(value: js.Array[String]): Self = StObject.set(x, "uniforms", value.asInstanceOf[js.Any])
    
    inline def setUniformsVarargs(value: String*): Self = StObject.set(x, "uniforms", js.Array(value*))
  }
}
