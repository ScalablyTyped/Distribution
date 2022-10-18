package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "RawCubeTexture")
@js.native
open class RawCubeTexture protected ()
  extends typings.babylonjs.indexMod.RawCubeTexture {
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
    scene: typings.babylonjs.sceneMod.Scene,
    data: Nullable[js.Array[js.typedarray.ArrayBufferView]],
    size: Double,
    format: js.UndefOr[Double],
    `type`: js.UndefOr[Double],
    generateMipMaps: js.UndefOr[Boolean],
    invertY: js.UndefOr[Boolean],
    samplingMode: js.UndefOr[Double],
    compression: js.UndefOr[Nullable[String]]
  ) = this()
}
