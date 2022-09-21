package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ColorGradingTexture")
@js.native
open class ColorGradingTexture protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ColorGradingTexture {
  /**
    * Instantiates a ColorGradingTexture from the following parameters.
    *
    * @param url The location of the color grading data (currently only supporting 3dl)
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
    * @returns A color grading texture
    */
  inline def Parse(parsedTexture: Any, scene: typings.babylonjs.BABYLON.Scene): Nullable[typings.babylonjs.BABYLON.ColorGradingTexture] = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedTexture.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Nullable[typings.babylonjs.BABYLON.ColorGradingTexture]]
  
  /**
    * Empty line regex stored for GC.
    */
  @JSGlobal("BABYLON.ColorGradingTexture._NoneEmptyLineRegex")
  @js.native
  def _NoneEmptyLineRegex: Any = js.native
  inline def _NoneEmptyLineRegex_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_NoneEmptyLineRegex")(x.asInstanceOf[js.Any])
}
