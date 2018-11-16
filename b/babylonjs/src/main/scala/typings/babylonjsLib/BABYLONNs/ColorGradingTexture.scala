package typings
package babylonjsLib.BABYLONNs

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
@JSGlobal("BABYLON.ColorGradingTexture")
@js.native
class ColorGradingTexture protected () extends BaseTexture {
  /**
           * Instantiates a ColorGradingTexture from the following parameters.
           *
           * @param url The location of the color gradind data (currently only supporting 3dl)
           * @param scene The scene the texture will be used in
           */
  def this(url: java.lang.String, scene: Scene) = this()
  var _engine: js.Any = js.native
  /**
           * The current texture matrix. (will always be identity in color grading texture)
           */
  var _textureMatrix: js.Any = js.native
  /**
           * Occurs when the file being loaded is a .3dl LUT file.
           */
  var load3dlTexture: js.Any = js.native
  /**
           * Starts the loading process of the texture.
           */
  var loadTexture: js.Any = js.native
  /**
           * The texture URL.
           */
  var url: java.lang.String = js.native
}

/**
     * This represents a color grading texture. This acts as a lookup table LUT, useful during post process
     * It can help converting any input color in a desired output one. This can then be used to create effects
     * from sepia, black and white to sixties or futuristic rendering...
     *
     * The only supported format is currently 3dl.
     * More information on LUT: https://en.wikipedia.org/wiki/3D_lookup_table
     */
@JSGlobal("BABYLON.ColorGradingTexture")
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

