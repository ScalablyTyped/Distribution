package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEffectCreationOptions extends StObject {
  
  /**
    * Attributes that will be used in the shader.
    */
  var attributes: js.Array[String]
  
  /**
    * Define statements that will be set in the shader.
    */
  var defines: Any
  
  /**
    * Possible fallbacks for this effect to improve performance when needed.
    */
  var fallbacks: Nullable[IEffectFallbacks]
  
  /**
    * Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
    */
  var indexParameters: js.UndefOr[Any] = js.undefined
  
  /**
    * Max number of lights that can be used in the shader.
    */
  var maxSimultaneousLights: js.UndefOr[Double] = js.undefined
  
  /**
    * Is this effect rendering to several color attachments ?
    */
  var multiTarget: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback that will be called when the shader is compiled.
    */
  var onCompiled: Nullable[js.Function1[/* effect */ Effect, Unit]]
  
  /**
    * Callback that will be called if an error occurs during shader compilation.
    */
  var onError: Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]
  
  /**
    * If provided, will be called two times with the vertex and fragment code so that this code can be updated after the #include have been processed
    */
  var processCodeAfterIncludes: js.UndefOr[Nullable[ShaderCustomProcessingFunction]] = js.undefined
  
  /**
    * If provided, will be called two times with the vertex and fragment code so that this code can be updated before it is compiled by the GPU
    */
  var processFinalCode: js.UndefOr[Nullable[ShaderCustomProcessingFunction]] = js.undefined
  
  /**
    * Sampler texture variable names that will be set in the shader.
    */
  var samplers: js.Array[String]
  
  /**
    * The language the shader is written in (default: GLSL)
    */
  var shaderLanguage: js.UndefOr[ShaderLanguage] = js.undefined
  
  /**
    * See https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings
    */
  var transformFeedbackVaryings: js.UndefOr[Nullable[js.Array[String]]] = js.undefined
  
  /**
    * Uniform buffer variable names that will be set in the shader.
    */
  var uniformBuffersNames: js.Array[String]
  
  /**
    * Uniform variable names that will be set in the shader.
    */
  var uniformsNames: js.Array[String]
}
object IEffectCreationOptions {
  
  inline def apply(
    attributes: js.Array[String],
    defines: Any,
    samplers: js.Array[String],
    uniformBuffersNames: js.Array[String],
    uniformsNames: js.Array[String]
  ): IEffectCreationOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], uniformBuffersNames = uniformBuffersNames.asInstanceOf[js.Any], uniformsNames = uniformsNames.asInstanceOf[js.Any], fallbacks = null, onCompiled = null, onError = null)
    __obj.asInstanceOf[IEffectCreationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEffectCreationOptions] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setDefines(value: Any): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    inline def setFallbacks(value: Nullable[IEffectFallbacks]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
    
    inline def setFallbacksNull: Self = StObject.set(x, "fallbacks", null)
    
    inline def setIndexParameters(value: Any): Self = StObject.set(x, "indexParameters", value.asInstanceOf[js.Any])
    
    inline def setIndexParametersUndefined: Self = StObject.set(x, "indexParameters", js.undefined)
    
    inline def setMaxSimultaneousLights(value: Double): Self = StObject.set(x, "maxSimultaneousLights", value.asInstanceOf[js.Any])
    
    inline def setMaxSimultaneousLightsUndefined: Self = StObject.set(x, "maxSimultaneousLights", js.undefined)
    
    inline def setMultiTarget(value: Boolean): Self = StObject.set(x, "multiTarget", value.asInstanceOf[js.Any])
    
    inline def setMultiTargetUndefined: Self = StObject.set(x, "multiTarget", js.undefined)
    
    inline def setOnCompiled(value: /* effect */ Effect => Unit): Self = StObject.set(x, "onCompiled", js.Any.fromFunction1(value))
    
    inline def setOnCompiledNull: Self = StObject.set(x, "onCompiled", null)
    
    inline def setOnError(value: (/* effect */ Effect, /* errors */ String) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
    
    inline def setOnErrorNull: Self = StObject.set(x, "onError", null)
    
    inline def setProcessCodeAfterIncludes(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processCodeAfterIncludes", js.Any.fromFunction2(value))
    
    inline def setProcessCodeAfterIncludesNull: Self = StObject.set(x, "processCodeAfterIncludes", null)
    
    inline def setProcessCodeAfterIncludesUndefined: Self = StObject.set(x, "processCodeAfterIncludes", js.undefined)
    
    inline def setProcessFinalCode(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction2(value))
    
    inline def setProcessFinalCodeNull: Self = StObject.set(x, "processFinalCode", null)
    
    inline def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
    
    inline def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    inline def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value*))
    
    inline def setShaderLanguage(value: ShaderLanguage): Self = StObject.set(x, "shaderLanguage", value.asInstanceOf[js.Any])
    
    inline def setShaderLanguageUndefined: Self = StObject.set(x, "shaderLanguage", js.undefined)
    
    inline def setTransformFeedbackVaryings(value: Nullable[js.Array[String]]): Self = StObject.set(x, "transformFeedbackVaryings", value.asInstanceOf[js.Any])
    
    inline def setTransformFeedbackVaryingsNull: Self = StObject.set(x, "transformFeedbackVaryings", null)
    
    inline def setTransformFeedbackVaryingsUndefined: Self = StObject.set(x, "transformFeedbackVaryings", js.undefined)
    
    inline def setTransformFeedbackVaryingsVarargs(value: String*): Self = StObject.set(x, "transformFeedbackVaryings", js.Array(value*))
    
    inline def setUniformBuffersNames(value: js.Array[String]): Self = StObject.set(x, "uniformBuffersNames", value.asInstanceOf[js.Any])
    
    inline def setUniformBuffersNamesVarargs(value: String*): Self = StObject.set(x, "uniformBuffersNames", js.Array(value*))
    
    inline def setUniformsNames(value: js.Array[String]): Self = StObject.set(x, "uniformsNames", value.asInstanceOf[js.Any])
    
    inline def setUniformsNamesVarargs(value: String*): Self = StObject.set(x, "uniformsNames", js.Array(value*))
  }
}
