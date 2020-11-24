package typings.babylonjs.legacyMod

import typings.babylonjs.effectMod.IEffectCreationOptions
import typings.babylonjs.iEffectFallbacksMod.IEffectFallbacks
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Effect")
@js.native
class Effect protected ()
  extends typings.babylonjs.indexMod.Effect {
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
  def this(
    baseName: js.Any,
    attributesNamesOrOptions: js.Array[String] | IEffectCreationOptions,
    uniformsNamesOrEngine: js.Array[String] | typings.babylonjs.thinEngineMod.ThinEngine,
    samplers: js.UndefOr[Nullable[js.Array[String]]],
    engine: js.UndefOr[typings.babylonjs.thinEngineMod.ThinEngine],
    defines: js.UndefOr[Nullable[String]],
    fallbacks: js.UndefOr[Nullable[IEffectFallbacks]],
    onCompiled: js.UndefOr[Nullable[js.Function1[/* effect */ typings.babylonjs.effectMod.Effect, Unit]]],
    onError: js.UndefOr[
        Nullable[
          js.Function2[/* effect */ typings.babylonjs.effectMod.Effect, /* errors */ String, Unit]
        ]
      ],
    indexParameters: js.UndefOr[js.Any]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "Effect")
@js.native
object Effect extends js.Object {
  
  /**
    * Store of each included file for a shader (The can be looked up using effect.key)
    */
  var IncludesShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  
  /**
    * Enable logging of the shader code when a compilation error occurs
    */
  var LogShaderCodeOnCompilationError: Boolean = js.native
  
  /**
    * This function will add a new shader to the shader store
    * @param name the name of the shader
    * @param pixelShader optional pixel shader content
    * @param vertexShader optional vertex shader content
    */
  def RegisterShader(name: String): Unit = js.native
  def RegisterShader(name: String, pixelShader: js.UndefOr[scala.Nothing], vertexShader: String): Unit = js.native
  def RegisterShader(name: String, pixelShader: String): Unit = js.native
  def RegisterShader(name: String, pixelShader: String, vertexShader: String): Unit = js.native
  
  /**
    * Resets the cache of effects.
    */
  def ResetCache(): Unit = js.native
  
  /**
    * Gets or sets the relative url used to load shaders if using the engine in non-minified mode
    */
  var ShadersRepository: String = js.native
  
  /**
    * Store of each shader (The can be looked up using effect.key)
    */
  var ShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  
  var _baseCache: js.Any = js.native
  
  var _uniqueIdSeed: js.Any = js.native
}
