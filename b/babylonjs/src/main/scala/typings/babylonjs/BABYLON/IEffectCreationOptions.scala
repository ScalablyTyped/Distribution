package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEffectCreationOptions extends StObject {
  
  /**
    * Atrributes that will be used in the shader.
    */
  var attributes: js.Array[String] = js.native
  
  /**
    * Define statements that will be set in the shader.
    */
  var defines: js.Any = js.native
  
  /**
    * Possible fallbacks for this effect to improve performance when needed.
    */
  var fallbacks: Nullable[IEffectFallbacks] = js.native
  
  /**
    * Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
    */
  var indexParameters: js.UndefOr[js.Any] = js.native
  
  /**
    * Max number of lights that can be used in the shader.
    */
  var maxSimultaneousLights: js.UndefOr[Double] = js.native
  
  /**
    * Is this effect rendering to several color attachments ?
    */
  var multiTarget: js.UndefOr[Boolean] = js.native
  
  /**
    * Callback that will be called when the shader is compiled.
    */
  var onCompiled: Nullable[js.Function1[/* effect */ Effect, Unit]] = js.native
  
  /**
    * Callback that will be called if an error occurs during shader compilation.
    */
  var onError: Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]] = js.native
  
  /**
    * If provided, will be called two times with the vertex and fragment code so that this code can be updated before it is compiled by the GPU
    */
  var processFinalCode: js.UndefOr[Nullable[js.Function2[/* shaderType */ String, /* code */ String, String]]] = js.native
  
  /**
    * Sampler texture variable names that will be set in the shader.
    */
  var samplers: js.Array[String] = js.native
  
  /**
    * See https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings
    */
  var transformFeedbackVaryings: js.UndefOr[Nullable[js.Array[String]]] = js.native
  
  /**
    * Uniform buffer variable names that will be set in the shader.
    */
  var uniformBuffersNames: js.Array[String] = js.native
  
  /**
    * Uniform varible names that will be set in the shader.
    */
  var uniformsNames: js.Array[String] = js.native
}
object IEffectCreationOptions {
  
  @scala.inline
  def apply(
    attributes: js.Array[String],
    defines: js.Any,
    samplers: js.Array[String],
    uniformBuffersNames: js.Array[String],
    uniformsNames: js.Array[String]
  ): IEffectCreationOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], uniformBuffersNames = uniformBuffersNames.asInstanceOf[js.Any], uniformsNames = uniformsNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEffectCreationOptions]
  }
  
  @scala.inline
  implicit class IEffectCreationOptionsMutableBuilder[Self <: IEffectCreationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Array[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setDefines(value: js.Any): Self = StObject.set(x, "defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbacks(value: Nullable[IEffectFallbacks]): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbacksNull: Self = StObject.set(x, "fallbacks", null)
    
    @scala.inline
    def setIndexParameters(value: js.Any): Self = StObject.set(x, "indexParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexParametersUndefined: Self = StObject.set(x, "indexParameters", js.undefined)
    
    @scala.inline
    def setMaxSimultaneousLights(value: Double): Self = StObject.set(x, "maxSimultaneousLights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSimultaneousLightsUndefined: Self = StObject.set(x, "maxSimultaneousLights", js.undefined)
    
    @scala.inline
    def setMultiTarget(value: Boolean): Self = StObject.set(x, "multiTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiTargetUndefined: Self = StObject.set(x, "multiTarget", js.undefined)
    
    @scala.inline
    def setOnCompiled(value: /* effect */ Effect => Unit): Self = StObject.set(x, "onCompiled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompiledNull: Self = StObject.set(x, "onCompiled", null)
    
    @scala.inline
    def setOnError(value: (/* effect */ Effect, /* errors */ String) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnErrorNull: Self = StObject.set(x, "onError", null)
    
    @scala.inline
    def setProcessFinalCode(value: (/* shaderType */ String, /* code */ String) => String): Self = StObject.set(x, "processFinalCode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setProcessFinalCodeNull: Self = StObject.set(x, "processFinalCode", null)
    
    @scala.inline
    def setProcessFinalCodeUndefined: Self = StObject.set(x, "processFinalCode", js.undefined)
    
    @scala.inline
    def setSamplers(value: js.Array[String]): Self = StObject.set(x, "samplers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplersVarargs(value: String*): Self = StObject.set(x, "samplers", js.Array(value :_*))
    
    @scala.inline
    def setTransformFeedbackVaryings(value: Nullable[js.Array[String]]): Self = StObject.set(x, "transformFeedbackVaryings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformFeedbackVaryingsNull: Self = StObject.set(x, "transformFeedbackVaryings", null)
    
    @scala.inline
    def setTransformFeedbackVaryingsUndefined: Self = StObject.set(x, "transformFeedbackVaryings", js.undefined)
    
    @scala.inline
    def setTransformFeedbackVaryingsVarargs(value: String*): Self = StObject.set(x, "transformFeedbackVaryings", js.Array(value :_*))
    
    @scala.inline
    def setUniformBuffersNames(value: js.Array[String]): Self = StObject.set(x, "uniformBuffersNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformBuffersNamesVarargs(value: String*): Self = StObject.set(x, "uniformBuffersNames", js.Array(value :_*))
    
    @scala.inline
    def setUniformsNames(value: js.Array[String]): Self = StObject.set(x, "uniformsNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformsNamesVarargs(value: String*): Self = StObject.set(x, "uniformsNames", js.Array(value :_*))
  }
}
