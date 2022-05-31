package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ColorGradingTexture")
@js.native
class ColorGradingTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ColorGradingTexture {
  /**
    * Instantiates a ColorGradingTexture from the following parameters.
    *
    * @param url The location of the color gradind data (currently only supporting 3dl)
    * @param sceneOrEngine The scene or engine the texture will be used in
    * @param onLoad defines a callback triggered when the texture has been loaded
    */
  def this(url: String, sceneOrEngine: typings.babylonjs.BABYLON.Scene) = this()
  def this(url: String, sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine) = this()
  def this(url: String, sceneOrEngine: typings.babylonjs.BABYLON.Scene, onLoad: Nullable[js.Function0[Unit]]) = this()
  def this(
    url: String,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    onLoad: Nullable[js.Function0[Unit]]
  ) = this()
  
  /**
    * Array of animations
    */
  /* CompleteClass */
  var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}
/* static members */
object ColorGradingTexture {
  
  @JSGlobal("BABYLON.ColorGradingTexture")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Parses a color grading texture serialized by Babylon.
    * @param parsedTexture The texture information being parsedTexture
    * @param scene The scene to load the texture in
    * @param rootUrl The root url of the data assets to load
    * @return A color gradind texture
    */
  inline def Parse(parsedTexture: js.Any, scene: typings.babylonjs.BABYLON.Scene): Nullable[typings.babylonjs.BABYLON.ColorGradingTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.ColorGradingTexture]]
  
  /**
    * Empty line regex stored for GC.
    */
  @JSGlobal("BABYLON.ColorGradingTexture._noneEmptyLineRegex")
  @js.native
  def _noneEmptyLineRegex: js.Any = js.native
  inline def _noneEmptyLineRegex_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_noneEmptyLineRegex")(x.asInstanceOf[js.Any])
}
