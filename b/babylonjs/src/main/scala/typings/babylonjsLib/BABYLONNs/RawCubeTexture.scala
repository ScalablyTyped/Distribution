package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Raw cube texture where the raw buffers are passed in
     */
@JSGlobal("BABYLON.RawCubeTexture")
@js.native
class RawCubeTexture protected () extends CubeTexture {
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
  def this(scene: Scene, data: Nullable[js.Array[stdLib.ArrayBufferView]], size: scala.Double, format: js.UndefOr[scala.Double], `type`: js.UndefOr[scala.Double], generateMipMaps: js.UndefOr[scala.Boolean], invertY: js.UndefOr[scala.Boolean], samplingMode: js.UndefOr[scala.Double], compression: js.UndefOr[Nullable[java.lang.String]]) = this()
  /**
           * Updates the raw cube texture.
           * @param data defines the data to store
           * @param format defines the data format
           * @param type defines the type fo the data (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
           * @param invertY defines if data must be stored with Y axis inverted
           * @param compression defines the compression used (null by default)
           * @param level defines which level of the texture to update
           */
  def update(
    data: js.Array[stdLib.ArrayBufferView],
    format: scala.Double,
    `type`: scala.Double,
    invertY: scala.Boolean
  ): scala.Unit = js.native
  /**
           * Updates the raw cube texture.
           * @param data defines the data to store
           * @param format defines the data format
           * @param type defines the type fo the data (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
           * @param invertY defines if data must be stored with Y axis inverted
           * @param compression defines the compression used (null by default)
           * @param level defines which level of the texture to update
           */
  def update(
    data: js.Array[stdLib.ArrayBufferView],
    format: scala.Double,
    `type`: scala.Double,
    invertY: scala.Boolean,
    compression: Nullable[java.lang.String]
  ): scala.Unit = js.native
  /**
           * Updates the raw cube texture.
           * @param data defines the data to store
           * @param format defines the data format
           * @param type defines the type fo the data (BABYLON.Engine.TEXTURETYPE_UNSIGNED_INT by default)
           * @param invertY defines if data must be stored with Y axis inverted
           * @param compression defines the compression used (null by default)
           * @param level defines which level of the texture to update
           */
  def update(
    data: js.Array[stdLib.ArrayBufferView],
    format: scala.Double,
    `type`: scala.Double,
    invertY: scala.Boolean,
    compression: Nullable[java.lang.String],
    level: scala.Double
  ): scala.Unit = js.native
  /**
           * Updates a raw cube texture with RGBD encoded data.
           * @param data defines the array of data [mipmap][face] to use to create each face
           * @param sphericalPolynomial defines the spherical polynomial for irradiance
           * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
           * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
           * @returns a promsie that resolves when the operation is complete
           */
  def updateRGBDAsync(data: js.Array[js.Array[stdLib.ArrayBufferView]]): stdLib.Promise[scala.Unit] = js.native
  /**
           * Updates a raw cube texture with RGBD encoded data.
           * @param data defines the array of data [mipmap][face] to use to create each face
           * @param sphericalPolynomial defines the spherical polynomial for irradiance
           * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
           * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
           * @returns a promsie that resolves when the operation is complete
           */
  def updateRGBDAsync(
    data: js.Array[js.Array[stdLib.ArrayBufferView]],
    sphericalPolynomial: Nullable[SphericalPolynomial]
  ): stdLib.Promise[scala.Unit] = js.native
  /**
           * Updates a raw cube texture with RGBD encoded data.
           * @param data defines the array of data [mipmap][face] to use to create each face
           * @param sphericalPolynomial defines the spherical polynomial for irradiance
           * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
           * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
           * @returns a promsie that resolves when the operation is complete
           */
  def updateRGBDAsync(
    data: js.Array[js.Array[stdLib.ArrayBufferView]],
    sphericalPolynomial: Nullable[SphericalPolynomial],
    lodScale: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
  /**
           * Updates a raw cube texture with RGBD encoded data.
           * @param data defines the array of data [mipmap][face] to use to create each face
           * @param sphericalPolynomial defines the spherical polynomial for irradiance
           * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
           * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
           * @returns a promsie that resolves when the operation is complete
           */
  def updateRGBDAsync(
    data: js.Array[js.Array[stdLib.ArrayBufferView]],
    sphericalPolynomial: Nullable[SphericalPolynomial],
    lodScale: scala.Double,
    lodOffset: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
}

/**
     * Raw cube texture where the raw buffers are passed in
     */
@JSGlobal("BABYLON.RawCubeTexture")
@js.native
object RawCubeTexture extends js.Object {
  /** @hidden */
  def _UpdateRGBDAsync(
    internalTexture: babylonjsLib.BABYLONNs.InternalTexture,
    data: js.Array[js.Array[stdLib.ArrayBufferView]],
    sphericalPolynomial: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.SphericalPolynomial],
    lodScale: scala.Double,
    lodOffset: scala.Double
  ): stdLib.Promise[scala.Unit] = js.native
}

