package typings.babylonjs.effectMod

import typings.babylonjs.iEffectFallbacksMod.IEffectFallbacks
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEffectCreationOptions extends js.Object {
  
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
  implicit class IEffectCreationOptionsOps[Self <: IEffectCreationOptions] (val x: Self) extends AnyVal {
    
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
    def setDefines(value: js.Any): Self = this.set("defines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSamplersVarargs(value: String*): Self = this.set("samplers", js.Array(value :_*))
    
    @scala.inline
    def setSamplers(value: js.Array[String]): Self = this.set("samplers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformBuffersNamesVarargs(value: String*): Self = this.set("uniformBuffersNames", js.Array(value :_*))
    
    @scala.inline
    def setUniformBuffersNames(value: js.Array[String]): Self = this.set("uniformBuffersNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniformsNamesVarargs(value: String*): Self = this.set("uniformsNames", js.Array(value :_*))
    
    @scala.inline
    def setUniformsNames(value: js.Array[String]): Self = this.set("uniformsNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbacks(value: Nullable[IEffectFallbacks]): Self = this.set("fallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbacksNull: Self = this.set("fallbacks", null)
    
    @scala.inline
    def setIndexParameters(value: js.Any): Self = this.set("indexParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexParameters: Self = this.set("indexParameters", js.undefined)
    
    @scala.inline
    def setMaxSimultaneousLights(value: Double): Self = this.set("maxSimultaneousLights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSimultaneousLights: Self = this.set("maxSimultaneousLights", js.undefined)
    
    @scala.inline
    def setMultiTarget(value: Boolean): Self = this.set("multiTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiTarget: Self = this.set("multiTarget", js.undefined)
    
    @scala.inline
    def setOnCompiled(value: /* effect */ Effect => Unit): Self = this.set("onCompiled", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCompiledNull: Self = this.set("onCompiled", null)
    
    @scala.inline
    def setOnError(value: (/* effect */ Effect, /* errors */ String) => Unit): Self = this.set("onError", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnErrorNull: Self = this.set("onError", null)
    
    @scala.inline
    def setProcessFinalCode(value: (/* shaderType */ String, /* code */ String) => String): Self = this.set("processFinalCode", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProcessFinalCode: Self = this.set("processFinalCode", js.undefined)
    
    @scala.inline
    def setProcessFinalCodeNull: Self = this.set("processFinalCode", null)
    
    @scala.inline
    def setTransformFeedbackVaryingsVarargs(value: String*): Self = this.set("transformFeedbackVaryings", js.Array(value :_*))
    
    @scala.inline
    def setTransformFeedbackVaryings(value: Nullable[js.Array[String]]): Self = this.set("transformFeedbackVaryings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformFeedbackVaryings: Self = this.set("transformFeedbackVaryings", js.undefined)
    
    @scala.inline
    def setTransformFeedbackVaryingsNull: Self = this.set("transformFeedbackVaryings", null)
  }
}
