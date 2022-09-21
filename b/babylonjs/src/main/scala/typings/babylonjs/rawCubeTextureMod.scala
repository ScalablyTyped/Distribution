package typings.babylonjs

import typings.babylonjs.cubeTextureMod.CubeTexture
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawCubeTextureMod {
  
  @JSImport("babylonjs/Materials/Textures/rawCubeTexture", "RawCubeTexture")
  @js.native
  open class RawCubeTexture protected () extends CubeTexture {
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
      data: Nullable[js.Array[js.typedarray.ArrayBufferView]],
      size: Double,
      format: js.UndefOr[Double],
      `type`: js.UndefOr[Double],
      generateMipMaps: js.UndefOr[Boolean],
      invertY: js.UndefOr[Boolean],
      samplingMode: js.UndefOr[Double],
      compression: js.UndefOr[Nullable[String]]
    ) = this()
    
    /**
      * Updates the raw cube texture.
      * @param data defines the data to store
      * @param format defines the data format
      * @param type defines the type fo the data (Engine.TEXTURETYPE_UNSIGNED_INT by default)
      * @param invertY defines if data must be stored with Y axis inverted
      * @param compression defines the compression used (null by default)
      */
    def update(data: js.Array[js.typedarray.ArrayBufferView], format: Double, `type`: Double, invertY: Boolean): Unit = js.native
    def update(
      data: js.Array[js.typedarray.ArrayBufferView],
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
      * @returns a promise that resolves when the operation is complete
      */
    def updateRGBDAsync(data: js.Array[js.Array[js.typedarray.ArrayBufferView]]): js.Promise[Unit] = js.native
    def updateRGBDAsync(
      data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
      sphericalPolynomial: Unit,
      lodScale: Double
    ): js.Promise[Unit] = js.native
    def updateRGBDAsync(
      data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
      sphericalPolynomial: Unit,
      lodScale: Double,
      lodOffset: Double
    ): js.Promise[Unit] = js.native
    def updateRGBDAsync(
      data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
      sphericalPolynomial: Unit,
      lodScale: Unit,
      lodOffset: Double
    ): js.Promise[Unit] = js.native
    def updateRGBDAsync(
      data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
      sphericalPolynomial: Nullable[SphericalPolynomial]
    ): js.Promise[Unit] = js.native
    def updateRGBDAsync(
      data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
      sphericalPolynomial: Nullable[SphericalPolynomial],
      lodScale: Double
    ): js.Promise[Unit] = js.native
    def updateRGBDAsync(
      data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
      sphericalPolynomial: Nullable[SphericalPolynomial],
      lodScale: Double,
      lodOffset: Double
    ): js.Promise[Unit] = js.native
    def updateRGBDAsync(
      data: js.Array[js.Array[js.typedarray.ArrayBufferView]],
      sphericalPolynomial: Nullable[SphericalPolynomial],
      lodScale: Unit,
      lodOffset: Double
    ): js.Promise[Unit] = js.native
  }
}
