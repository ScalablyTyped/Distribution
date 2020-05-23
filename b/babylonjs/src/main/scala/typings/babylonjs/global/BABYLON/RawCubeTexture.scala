package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.RawCubeTexture")
@js.native
class RawCubeTexture protected ()
  extends typings.babylonjs.BABYLON.RawCubeTexture {
  /**
    * Creates a cube texture where the raw buffers are passed in.
    * @param scene defines the scene the texture is attached to
    * @param data defines the array of data to use to create each face
    * @param size defines the size of the textures
    * @param format defines the format of the data
    * @param type defines the type of the data (like Engine.TEXTURETYPE_UNSIGNED_INT)
    * @param generateMipMaps  defines if the engine should generate the mip levels
    * @param invertY defines if data must be stored with Y axis inverted
    * @param samplingMode defines the required sampling mode (like Texture.NEAREST_SAMPLINGMODE)
    * @param compression defines the compression used (null by default)
    */
  def this(
    scene: typings.babylonjs.BABYLON.Scene,
    data: Nullable[js.Array[ArrayBufferView]],
    size: Double,
    format: js.UndefOr[Double],
    `type`: js.UndefOr[Double],
    generateMipMaps: js.UndefOr[Boolean],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    compression: js.UndefOr[Nullable[String]]
  ) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}

/* static members */
@JSGlobal("BABYLON.RawCubeTexture")
@js.native
object RawCubeTexture extends js.Object {
  /** @hidden */
  def _UpdateRGBDAsync(
    internalTexture: typings.babylonjs.BABYLON.InternalTexture,
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: Nullable[typings.babylonjs.BABYLON.SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}

