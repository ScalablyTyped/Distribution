package typings.babylonjs.BABYLON

import typings.std.ArrayBufferView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RawCubeTexture extends CubeTexture {
  
  /**
    * Updates the raw cube texture.
    * @param data defines the data to store
    * @param format defines the data format
    * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
    * @param invertY defines if data must be stored with Y axis inverted
    * @param compression defines the compression used (null by default)
    * @param level defines which level of the texture to update
    */
  def update(data: js.Array[ArrayBufferView], format: Double, `type`: Double, invertY: Boolean): Unit = js.native
  def update(
    data: js.Array[ArrayBufferView],
    format: Double,
    `type`: Double,
    invertY: Boolean,
    compression: Nullable[String]
  ): Unit = js.native
  
  /**
    * Updates a raw cube texture with RGBD encoded data.
    * @param data defines the array of data [mipmap][face] to use to create each face
    * @param sphericalPolynomial defines the spherical polynomial for irradiance
    * @param lodScale defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness
    * @param lodOffset defines the offset applied to environment texture. This manages first LOD level used for IBL according to the roughness
    * @returns a promsie that resolves when the operation is complete
    */
  def updateRGBDAsync(data: js.Array[js.Array[ArrayBufferView]]): js.Promise[Unit] = js.native
  def updateRGBDAsync(
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: js.UndefOr[Nullable[SphericalPolynomial]],
    lodScale: js.UndefOr[scala.Nothing],
    lodOffset: Double
  ): js.Promise[Unit] = js.native
  def updateRGBDAsync(
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: js.UndefOr[Nullable[SphericalPolynomial]],
    lodScale: Double
  ): js.Promise[Unit] = js.native
  def updateRGBDAsync(
    data: js.Array[js.Array[ArrayBufferView]],
    sphericalPolynomial: js.UndefOr[Nullable[SphericalPolynomial]],
    lodScale: Double,
    lodOffset: Double
  ): js.Promise[Unit] = js.native
  def updateRGBDAsync(data: js.Array[js.Array[ArrayBufferView]], sphericalPolynomial: Nullable[SphericalPolynomial]): js.Promise[Unit] = js.native
}
