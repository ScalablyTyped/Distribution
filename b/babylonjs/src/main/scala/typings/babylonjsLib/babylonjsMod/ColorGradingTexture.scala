package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This represents a color grading texture. This acts as a lookup table LUT, useful during post process
  * It can help converting any input color in a desired output one. This can then be used to create effects
  * from sepia, black and white to sixties or futuristic rendering...
  *
  * The only supported format is currently 3dl.
  * More information on LUT: https://en.wikipedia.org/wiki/3D_lookup_table
  */
@JSImport("babylonjs", "ColorGradingTexture")
@js.native
class ColorGradingTexture protected ()
  extends babylonjsLib.BABYLONNs.ColorGradingTexture {
  /**
    * Instantiates a ColorGradingTexture from the following parameters.
    *
    * @param url The location of the color gradind data (currently only supporting 3dl)
    * @param scene The scene the texture will be used in
    */
  def this(url: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene) = this()
}

/* static members */
@JSImport("babylonjs", "ColorGradingTexture")
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
  def Parse(parsedTexture: js.Any, scene: babylonjsLib.BABYLONNs.Scene, rootUrl: java.lang.String): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.ColorGradingTexture] = js.native
}

