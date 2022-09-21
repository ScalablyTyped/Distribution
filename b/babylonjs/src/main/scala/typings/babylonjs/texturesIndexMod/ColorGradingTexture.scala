package typings.babylonjs.texturesIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/Textures/index", "ColorGradingTexture")
@js.native
open class ColorGradingTexture protected ()
  extends typings.babylonjs.colorGradingTextureMod.ColorGradingTexture {
  /**
    * Instantiates a ColorGradingTexture from the following parameters.
    *
    * @param url The location of the color grading data (currently only supporting 3dl)
    * @param sceneOrEngine The scene or engine the texture will be used in
    * @param onLoad defines a callback triggered when the texture has been loaded
    */
  def this(url: String, sceneOrEngine: Scene) = this()
  def this(url: String, sceneOrEngine: ThinEngine) = this()
  def this(url: String, sceneOrEngine: Scene, onLoad: Nullable[js.Function0[Unit]]) = this()
  def this(url: String, sceneOrEngine: ThinEngine, onLoad: Nullable[js.Function0[Unit]]) = this()
}
/* static members */
object ColorGradingTexture {
  
  @JSImport("babylonjs/Materials/Textures/index", "ColorGradingTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a color grading texture serialized by Babylon.
    * @param parsedTexture The texture information being parsedTexture
    * @param scene The scene to load the texture in
    * @returns A color grading texture
    */
  inline def Parse(parsedTexture: Any, scene: Scene): Nullable[typings.babylonjs.colorGradingTextureMod.ColorGradingTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.colorGradingTextureMod.ColorGradingTexture]]
  
  /**
    * Empty line regex stored for GC.
    */
  @JSImport("babylonjs/Materials/Textures/index", "ColorGradingTexture._NoneEmptyLineRegex")
  @js.native
  def _NoneEmptyLineRegex: Any = js.native
  inline def _NoneEmptyLineRegex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NoneEmptyLineRegex")(x.asInstanceOf[js.Any])
}
