package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Raw cube texture where the raw buffers are passed in
     */
@JSImport("babylonjs", "RawCubeTexture")
@js.native
class RawCubeTexture protected ()
  extends babylonjsLib.BABYLONNs.RawCubeTexture {
  /**
           * Creates a cube texture where the raw buffers are passed in.
           * @param scene defines the scene the texture is attached to
           * @param data defines the array of data to use to create each face
           * @param size defines the size of the textures
           * @param format defines the format of the data
           * @param type defines the type of the data (like BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT)
           * @param generateMipMaps  defines if the engine should generate the mip levels
           * @param invertY defines if data must be stored with Y axis inverted
           * @param samplingMode defines the required sampling mode (like BABYLON.Texture.NEAREST_SAMPLINGMODE)
           * @param compression defines the compression used (null by default)
           */
  def this(scene: babylonjsLib.BABYLONNs.Scene, data: babylonjsLib.BABYLONNs.Nullable[js.Array[stdLib.ArrayBufferView]], size: scala.Double, format: js.UndefOr[scala.Double], `type`: js.UndefOr[scala.Double], generateMipMaps: js.UndefOr[scala.Boolean], invertY: js.UndefOr[scala.Boolean], samplingMode: js.UndefOr[scala.Double], compression: js.UndefOr[babylonjsLib.BABYLONNs.Nullable[java.lang.String]]) = this()
}

/**
     * Raw cube texture where the raw buffers are passed in
     */
@JSImport("babylonjs", "RawCubeTexture")
@js.native
object RawCubeTexture extends js.Object {
  /** @hidden */
  def _UpdateRGBDAsync(
    internalTexture: babylonjsLib.BABYLONNs.InternalTexture,
    data: js.Array[js.Array[stdLib.ArrayBufferView]],
    sphericalPolynomial: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.SphericalPolynomial],
    lodScale: scala.Double,
    lodOffset: scala.Double
  ): js.Promise[scala.Unit] = js.native
}

