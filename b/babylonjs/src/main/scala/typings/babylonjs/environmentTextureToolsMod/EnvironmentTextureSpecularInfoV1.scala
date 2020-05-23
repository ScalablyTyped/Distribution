package typings.babylonjs.environmentTextureToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentTextureSpecularInfoV1 extends js.Object {
  /**
    * Defines the scale applied to environment texture. This manages the range of LOD level used for IBL according to the roughness.
    */
  var lodGenerationScale: Double
  /**
    * This contains all the images data needed to reconstruct the cubemap.
    */
  var mipmaps: js.Array[BufferImageData]
  /**
    * Defines where the specular Payload is located. It is a runtime value only not stored in the file.
    */
  var specularDataPosition: js.UndefOr[Double] = js.undefined
}

object EnvironmentTextureSpecularInfoV1 {
  @scala.inline
  def apply(
    lodGenerationScale: Double,
    mipmaps: js.Array[BufferImageData],
    specularDataPosition: js.UndefOr[Double] = js.undefined
  ): EnvironmentTextureSpecularInfoV1 = {
    val __obj = js.Dynamic.literal(lodGenerationScale = lodGenerationScale.asInstanceOf[js.Any], mipmaps = mipmaps.asInstanceOf[js.Any])
    if (!js.isUndefined(specularDataPosition)) __obj.updateDynamic("specularDataPosition")(specularDataPosition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvironmentTextureSpecularInfoV1]
  }
}

