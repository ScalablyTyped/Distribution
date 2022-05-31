package typings.babylonjs.mod

import typings.babylonjs.effectMod.IEffectCreationOptions
import typings.babylonjs.iEffectFallbacksMod.IEffectFallbacks
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "Effect")
@js.native
class Effect protected ()
  extends typings.babylonjs.legacyMod.Effect {
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
object Effect {
  
  @JSImport("babylonjs", "Effect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Store of each included file for a shader (The can be looked up using effect.key)
    */
  @JSImport("babylonjs", "Effect.IncludesShadersStore")
  @js.native
  def IncludesShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def IncludesShadersStore_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncludesShadersStore")(x.asInstanceOf[js.Any])
  
  /**
    * Enable logging of the shader code when a compilation error occurs
    */
  @JSImport("babylonjs", "Effect.LogShaderCodeOnCompilationError")
  @js.native
  def LogShaderCodeOnCompilationError: Boolean = js.native
  inline def LogShaderCodeOnCompilationError_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogShaderCodeOnCompilationError")(x.asInstanceOf[js.Any])
  
  /**
    * This function will add a new shader to the shader store
    * @param name the name of the shader
    * @param pixelShader optional pixel shader content
    * @param vertexShader optional vertex shader content
    */
  inline def RegisterShader(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def RegisterShader(name: String, pixelShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def RegisterShader(name: String, pixelShader: String, vertexShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def RegisterShader(name: String, pixelShader: Unit, vertexShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Resets the cache of effects.
    */
  inline def ResetCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ResetCache")().asInstanceOf[Unit]
  
  /**
    * Gets or sets the relative url used to load shaders if using the engine in non-minified mode
    */
  @JSImport("babylonjs", "Effect.ShadersRepository")
  @js.native
  def ShadersRepository: String = js.native
  inline def ShadersRepository_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersRepository")(x.asInstanceOf[js.Any])
  
  /**
    * Store of each shader (The can be looked up using effect.key)
    */
  @JSImport("babylonjs", "Effect.ShadersStore")
  @js.native
  def ShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def ShadersStore_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersStore")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Effect._baseCache")
  @js.native
  def _baseCache: js.Any = js.native
  inline def _baseCache_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_baseCache")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs", "Effect._uniqueIdSeed")
  @js.native
  def _uniqueIdSeed: js.Any = js.native
  inline def _uniqueIdSeed_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_uniqueIdSeed")(x.asInstanceOf[js.Any])
}
