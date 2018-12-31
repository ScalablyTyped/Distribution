package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class extending Texture allowing drawing on a texture
  * @see http://doc.babylonjs.com/how_to/dynamictexture
  */
@JSImport("babylonjs", "DynamicTexture")
@js.native
class DynamicTexture protected ()
  extends babylonjsLib.BABYLONNs.DynamicTexture {
  /**
    * Creates a DynamicTexture
    * @param name defines the name of the texture
    * @param options provides 3 alternatives for width and height of texture, a canvas, object with width and height properties, number for both width and height
    * @param scene defines the scene where you want the texture
    * @param generateMipMaps defines the use of MinMaps or not (default is false)
    * @param samplingMode defines the sampling mode to use (default is BABYLON.Texture.TRILINEAR_SAMPLINGMODE)
    * @param format defines the texture format to use (default is BABYLON.Engine.TEXTUREFORMAT_RGBA)
    */
  def this(name: java.lang.String, options: js.Any, scene: babylonjsLib.BABYLONNs.Scene, generateMipMaps: scala.Boolean) = this()
  def this(name: java.lang.String, options: js.Any, scene: js.UndefOr[scala.Nothing], generateMipMaps: scala.Boolean) = this()
  def this(name: java.lang.String, options: js.Any, scene: scala.Null, generateMipMaps: scala.Boolean) = this()
  def this(name: java.lang.String, options: js.Any, scene: babylonjsLib.BABYLONNs.Scene, generateMipMaps: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: js.Any, scene: js.UndefOr[scala.Nothing], generateMipMaps: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: js.Any, scene: scala.Null, generateMipMaps: scala.Boolean, samplingMode: scala.Double) = this()
  def this(name: java.lang.String, options: js.Any, scene: babylonjsLib.BABYLONNs.Scene, generateMipMaps: scala.Boolean, samplingMode: scala.Double, format: scala.Double) = this()
  def this(name: java.lang.String, options: js.Any, scene: js.UndefOr[scala.Nothing], generateMipMaps: scala.Boolean, samplingMode: scala.Double, format: scala.Double) = this()
  def this(name: java.lang.String, options: js.Any, scene: scala.Null, generateMipMaps: scala.Boolean, samplingMode: scala.Double, format: scala.Double) = this()
}

