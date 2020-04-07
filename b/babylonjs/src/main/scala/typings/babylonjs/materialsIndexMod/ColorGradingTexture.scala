package typings.babylonjs.materialsIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Materials/index", "ColorGradingTexture")
@js.native
class ColorGradingTexture protected ()
  extends typings.babylonjs.texturesIndexMod.ColorGradingTexture {
  /**
    * Instantiates a ColorGradingTexture from the following parameters.
    *
    * @param url The location of the color gradind data (currently only supporting 3dl)
    * @param scene The scene the texture will be used in
    */
  def this(url: String, scene: Scene) = this()
}

/* static members */
@JSImport("babylonjs/Materials/index", "ColorGradingTexture")
@js.native
object ColorGradingTexture extends js.Object {
  /**
    * Empty line regex stored for GC.
    */
  var _noneEmptyLineRegex: js.Any = js.native
  /**
    * Parses a color grading texture serialized by Babylon.
    * @param parsedTexture The texture information being parsedTexture
    * @param scene The scene to load the texture in
    * @param rootUrl The root url of the data assets to load
    * @return A color gradind texture
    */
  def Parse(parsedTexture: js.Any, scene: Scene): Nullable[typings.babylonjs.colorGradingTextureMod.ColorGradingTexture] = js.native
}

