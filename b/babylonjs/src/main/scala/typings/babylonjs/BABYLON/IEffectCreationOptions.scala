package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEffectCreationOptions extends js.Object {
  /**
    * Atrributes that will be used in the shader.
    */
  var attributes: js.Array[String]
  /**
    * Define statements that will be set in the shader.
    */
  var defines: js.Any
  /**
    * Possible fallbacks for this effect to improve performance when needed.
    */
  var fallbacks: Nullable[IEffectFallbacks]
  /**
    * Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
    */
  var indexParameters: js.UndefOr[js.Any] = js.undefined
  /**
    * Max number of lights that can be used in the shader.
    */
  var maxSimultaneousLights: js.UndefOr[Double] = js.undefined
  /**
    * Callback that will be called when the shader is compiled.
    */
  var onCompiled: Nullable[js.Function1[/* effect */ Effect, Unit]]
  /**
    * Callback that will be called if an error occurs during shader compilation.
    */
  var onError: Nullable[js.Function2[/* effect */ Effect, /* errors */ String, Unit]]
  /**
    * Sampler texture variable names that will be set in the shader.
    */
  var samplers: js.Array[String]
  /**
    * See https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings
    */
  var transformFeedbackVaryings: js.UndefOr[Nullable[js.Array[String]]] = js.undefined
  /**
    * Uniform buffer variable names that will be set in the shader.
    */
  var uniformBuffersNames: js.Array[String]
  /**
    * Uniform varible names that will be set in the shader.
    */
  var uniformsNames: js.Array[String]
}

object IEffectCreationOptions {
  @scala.inline
  def apply(
    attributes: js.Array[String],
    defines: js.Any,
    samplers: js.Array[String],
    uniformBuffersNames: js.Array[String],
    uniformsNames: js.Array[String],
    fallbacks: Nullable[IEffectFallbacks] = null,
    indexParameters: js.Any = null,
    maxSimultaneousLights: js.UndefOr[Double] = js.undefined,
    onCompiled: /* effect */ Effect => Unit = null,
    onError: (/* effect */ Effect, /* errors */ String) => Unit = null,
    transformFeedbackVaryings: js.UndefOr[Null | Nullable[js.Array[String]]] = js.undefined
  ): IEffectCreationOptions = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], defines = defines.asInstanceOf[js.Any], samplers = samplers.asInstanceOf[js.Any], uniformBuffersNames = uniformBuffersNames.asInstanceOf[js.Any], uniformsNames = uniformsNames.asInstanceOf[js.Any], fallbacks = fallbacks.asInstanceOf[js.Any], onCompiled = js.Any.fromFunction1(onCompiled), onError = js.Any.fromFunction2(onError))
    if (indexParameters != null) __obj.updateDynamic("indexParameters")(indexParameters.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSimultaneousLights)) __obj.updateDynamic("maxSimultaneousLights")(maxSimultaneousLights.get.asInstanceOf[js.Any])
    if (!js.isUndefined(transformFeedbackVaryings)) __obj.updateDynamic("transformFeedbackVaryings")(transformFeedbackVaryings.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEffectCreationOptions]
  }
}

