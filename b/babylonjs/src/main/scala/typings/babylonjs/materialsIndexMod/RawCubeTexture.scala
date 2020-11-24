package typings.babylonjs.materialsIndexMod

import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Materials/index", "RawCubeTexture")
@js.native
class RawCubeTexture protected ()
  extends typings.babylonjs.texturesIndexMod.RawCubeTexture {
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
    scene: Scene,
    data: Nullable[js.Array[ArrayBufferView]],
    size: Double,
    format: js.UndefOr[Double],
    `type`: js.UndefOr[Double],
    generateMipMaps: js.UndefOr[Boolean],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    compression: js.UndefOr[Nullable[String]]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Materials/index", "RawCubeTexture")
@js.native
object RawCubeTexture extends js.Object {
  
  /** @hidden */
  def _UpdateRGBDAsync(
    internalTexture: typings.babylonjs.internalTextureMod.InternalTexture,
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: Nullable[SphericalPolynomial],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
}
