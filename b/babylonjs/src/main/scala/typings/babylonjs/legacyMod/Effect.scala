package typings.babylonjs.legacyMod

import typings.babylonjs.effectMod.IEffectCreationOptions
import typings.babylonjs.iEffectFallbacksMod.IEffectFallbacks
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "Effect")
@js.native
open class Effect protected ()
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
    * @param key Effect Key identifying uniquely compiled shader variants
    * @param shaderLanguage the language the shader is written in (default: GLSL)
    */
  def this(
    baseName: Any,
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
    indexParameters: js.UndefOr[Any],
    key: js.UndefOr[String],
    shaderLanguage: js.UndefOr[typings.babylonjs.shaderLanguageMod.ShaderLanguage]
  ) = this()
}
/* static members */
object Effect {
  
  @JSImport("babylonjs/Legacy/legacy", "Effect")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Store of each included file for a shader (The can be looked up using effect.key)
    */
  @JSImport("babylonjs/Legacy/legacy", "Effect.IncludesShadersStore")
  @js.native
  def IncludesShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def IncludesShadersStore_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IncludesShadersStore")(x.asInstanceOf[js.Any])
  
  /**
    * Enable logging of the shader code when a compilation error occurs
    */
  @JSImport("babylonjs/Legacy/legacy", "Effect.LogShaderCodeOnCompilationError")
  @js.native
  def LogShaderCodeOnCompilationError: Boolean = js.native
  inline def LogShaderCodeOnCompilationError_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LogShaderCodeOnCompilationError")(x.asInstanceOf[js.Any])
  
  /**
    * This function will add a new shader to the shader store
    * @param name the name of the shader
    * @param pixelShader optional pixel shader content
    * @param vertexShader optional vertex shader content
    * @param shaderLanguage the language the shader is written in (default: GLSL)
    */
  inline def RegisterShader(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def RegisterShader(name: String, pixelShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def RegisterShader(name: String, pixelShader: String, vertexShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def RegisterShader(
    name: String,
    pixelShader: String,
    vertexShader: String,
    shaderLanguage: typings.babylonjs.shaderLanguageMod.ShaderLanguage
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any], shaderLanguage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def RegisterShader(
    name: String,
    pixelShader: String,
    vertexShader: Unit,
    shaderLanguage: typings.babylonjs.shaderLanguageMod.ShaderLanguage
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any], shaderLanguage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def RegisterShader(name: String, pixelShader: Unit, vertexShader: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def RegisterShader(
    name: String,
    pixelShader: Unit,
    vertexShader: String,
    shaderLanguage: typings.babylonjs.shaderLanguageMod.ShaderLanguage
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any], shaderLanguage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def RegisterShader(
    name: String,
    pixelShader: Unit,
    vertexShader: Unit,
    shaderLanguage: typings.babylonjs.shaderLanguageMod.ShaderLanguage
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("RegisterShader")(name.asInstanceOf[js.Any], pixelShader.asInstanceOf[js.Any], vertexShader.asInstanceOf[js.Any], shaderLanguage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Resets the cache of effects.
    */
  inline def ResetCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ResetCache")().asInstanceOf[Unit]
  
  /**
    * Store of each shader (The can be looked up using effect.key)
    */
  @JSImport("babylonjs/Legacy/legacy", "Effect.ShadersStore")
  @js.native
  def ShadersStore: org.scalablytyped.runtime.StringDictionary[String] = js.native
  inline def ShadersStore_=(x: org.scalablytyped.runtime.StringDictionary[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ShadersStore")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "Effect._BaseCache")
  @js.native
  def _BaseCache: Any = js.native
  inline def _BaseCache_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_BaseCache")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/Legacy/legacy", "Effect._UniqueIdSeed")
  @js.native
  def _UniqueIdSeed: Any = js.native
  inline def _UniqueIdSeed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_UniqueIdSeed")(x.asInstanceOf[js.Any])
}
