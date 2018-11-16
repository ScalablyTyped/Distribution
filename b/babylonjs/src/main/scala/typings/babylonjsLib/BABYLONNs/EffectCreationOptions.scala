package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Options to be used when creating an effect.
     */
@JSGlobal("BABYLON.EffectCreationOptions")
@js.native
class EffectCreationOptions () extends js.Object {
  /**
           * Atrributes that will be used in the shader.
           */
  var attributes: js.Array[java.lang.String] = js.native
  /**
           * Define statements that will be set in the shader.
           */
  var defines: js.Any = js.native
  /**
           * Possible fallbacks for this effect to improve performance when needed.
           */
  var fallbacks: Nullable[EffectFallbacks] = js.native
  /**
           * Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
           */
  var indexParameters: js.Any = js.native
  /**
           * Max number of lights that can be used in the shader.
           */
  var maxSimultaneousLights: scala.Double = js.native
  /**
           * Callback that will be called when the shader is compiled.
           */
  var onCompiled: Nullable[js.Function1[/* effect */ Effect, scala.Unit]] = js.native
  /**
           * Callback that will be called if an error occurs during shader compilation.
           */
  var onError: Nullable[js.Function2[/* effect */ Effect, /* errors */ java.lang.String, scala.Unit]] = js.native
  /**
           * Sampler texture variable names that will be set in the shader.
           */
  var samplers: js.Array[java.lang.String] = js.native
  /**
           * See https://developer.mozilla.org/en-US/docs/Web/API/WebGL2RenderingContext/transformFeedbackVaryings
           */
  var transformFeedbackVaryings: Nullable[js.Array[java.lang.String]] = js.native
  /**
           * Uniform buffer varible names that will be set in the shader.
           */
  var uniformBuffersNames: js.Array[java.lang.String] = js.native
  /**
           * Uniform varible names that will be set in the shader.
           */
  var uniformsNames: js.Array[java.lang.String] = js.native
}

