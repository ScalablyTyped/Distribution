package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Effect containing vertex and fragment shader that can be executed on an object.
  */
@JSImport("babylonjs", "Effect")
@js.native
class Effect protected ()
  extends babylonjsLib.BABYLONNs.Effect {
  def this(baseName: js.Any, attributesNamesOrOptions: babylonjsLib.BABYLONNs.EffectCreationOptions, uniformsNamesOrEngine: babylonjsLib.BABYLONNs.Engine, samplers: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[js.Array[java.lang.String]]], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], defines: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[java.lang.String]], fallbacks: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.EffectFallbacks]], onCompiled: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[js.Function1[/* effect */ babylonjsLib.BABYLONNs.Effect, scala.Unit]]
    ], onError: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function2[
          /* effect */ babylonjsLib.BABYLONNs.Effect, 
          /* errors */ java.lang.String, 
          scala.Unit
        ]
      ]
    ], indexParameters: js.UndefOr[js.Any]) = this()
  def this(baseName: js.Any, attributesNamesOrOptions: babylonjsLib.BABYLONNs.EffectCreationOptions, uniformsNamesOrEngine: js.Array[java.lang.String], samplers: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[js.Array[java.lang.String]]], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], defines: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[java.lang.String]], fallbacks: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.EffectFallbacks]], onCompiled: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[js.Function1[/* effect */ babylonjsLib.BABYLONNs.Effect, scala.Unit]]
    ], onError: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function2[
          /* effect */ babylonjsLib.BABYLONNs.Effect, 
          /* errors */ java.lang.String, 
          scala.Unit
        ]
      ]
    ], indexParameters: js.UndefOr[js.Any]) = this()
  def this(baseName: js.Any, attributesNamesOrOptions: js.Array[java.lang.String], uniformsNamesOrEngine: babylonjsLib.BABYLONNs.Engine, samplers: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[js.Array[java.lang.String]]], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], defines: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[java.lang.String]], fallbacks: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.EffectFallbacks]], onCompiled: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[js.Function1[/* effect */ babylonjsLib.BABYLONNs.Effect, scala.Unit]]
    ], onError: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function2[
          /* effect */ babylonjsLib.BABYLONNs.Effect, 
          /* errors */ java.lang.String, 
          scala.Unit
        ]
      ]
    ], indexParameters: js.UndefOr[js.Any]) = this()
  /**
    * Instantiates an effect.
    * An effect can be used to create/manage/execute vertex and fragment shaders.
    * @param baseName Name of the effect.
    * @param attributesNamesOrOptions List of attribute names that will be passed to the shader or set of all options to create the effect.
    * @param uniformsNamesOrEngine List of uniform variable names that will be passed to the shader or the engine that will be used to render effect.
    * @param samplers List of sampler variables that will be passed to the shader.
    * @param engine Engine to be used to render the effect
    * @param defines Define statements to be added to the shader.
    * @param fallbacks Possible fallbacks for this effect to improve performance when needed.
    * @param onCompiled Callback that will be called when the shader is compiled.
    * @param onError Callback that will be called if an error occurs during shader compilation.
    * @param indexParameters Parameters to be used with Babylons include syntax to iterate over an array (eg. {lights: 10})
    */
  def this(baseName: js.Any, attributesNamesOrOptions: js.Array[java.lang.String], uniformsNamesOrEngine: js.Array[java.lang.String], samplers: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[js.Array[java.lang.String]]], engine: js.UndefOr[babylonjsLib.BABYLONNs.Engine], defines: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[java.lang.String]], fallbacks: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.EffectFallbacks]], onCompiled: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[js.Function1[/* effect */ babylonjsLib.BABYLONNs.Effect, scala.Unit]]
    ], onError: js.UndefOr[
      babylonjsLib.BABYLONNs.Nullable[
        js.Function2[
          /* effect */ babylonjsLib.BABYLONNs.Effect, 
          /* errors */ java.lang.String, 
          scala.Unit
        ]
      ]
    ], indexParameters: js.UndefOr[js.Any]) = this()
}

/**
  * Effect containing vertex and fragment shader that can be executed on an object.
  */
@JSImport("babylonjs", "Effect")
@js.native
object Effect extends js.Object {
  /**
    * Store of each included file for a shader (The can be looked up using effect.key)
    */
  var IncludesShadersStore: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  /**
    * Store of each shader (The can be looked up using effect.key)
    */
  var ShadersStore: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var _baseCache: js.Any = js.native
  var _uniqueIdSeed: js.Any = js.native
  /**
    * This function will add a new shader to the shader store
    * @param name the name of the shader
    * @param pixelShader optional pixel shader content
    * @param vertexShader optional vertex shader content
    */
  def RegisterShader(name: java.lang.String): scala.Unit = js.native
  def RegisterShader(name: java.lang.String, pixelShader: java.lang.String): scala.Unit = js.native
  def RegisterShader(name: java.lang.String, pixelShader: java.lang.String, vertexShader: java.lang.String): scala.Unit = js.native
  /**
    * Resets the cache of effects.
    */
  def ResetCache(): scala.Unit = js.native
}

