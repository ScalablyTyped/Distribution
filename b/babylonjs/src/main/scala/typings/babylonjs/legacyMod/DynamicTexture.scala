package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "DynamicTexture")
@js.native
class DynamicTexture protected ()
  extends typings.babylonjs.indexMod.DynamicTexture {
  def this(name: String, options: js.Any, scene: js.UndefOr[scala.Nothing], generateMipMaps: Boolean) = this()
  def this(name: String, options: js.Any, scene: Null, generateMipMaps: Boolean) = this()
  /**
    * Creates a DynamicTexture
    * @param name defines the name of the texture
    * @param options provides 3 alternatives for width and height of texture, a canvas, object with width and height properties, number for both width and height
    * @param scene defines the scene where you want the texture
    * @param generateMipMaps defines the use of MinMaps or not (default is false)
    * @param samplingMode defines the sampling mode to use (default is Texture.TRILINEAR_SAMPLINGMODE)
    * @param format defines the texture format to use (default is Engine.TEXTUREFORMAT_RGBA)
    */
  def this(name: String, options: js.Any, scene: typings.babylonjs.sceneMod.Scene, generateMipMaps: Boolean) = this()
  def this(
    name: String,
    options: js.Any,
    scene: js.UndefOr[scala.Nothing],
    generateMipMaps: Boolean,
    samplingMode: Double
  ) = this()
  def this(name: String, options: js.Any, scene: Null, generateMipMaps: Boolean, samplingMode: Double) = this()
  def this(
    name: String,
    options: js.Any,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    samplingMode: Double
  ) = this()
  def this(
    name: String,
    options: js.Any,
    scene: js.UndefOr[scala.Nothing],
    generateMipMaps: Boolean,
    samplingMode: Double,
    format: Double
  ) = this()
  def this(
    name: String,
    options: js.Any,
    scene: Null,
    generateMipMaps: Boolean,
    samplingMode: Double,
    format: Double
  ) = this()
  def this(
    name: String,
    options: js.Any,
    scene: typings.babylonjs.sceneMod.Scene,
    generateMipMaps: Boolean,
    samplingMode: Double,
    format: Double
  ) = this()
}

