package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper class dealing with the extraction of spherical polynomial dataArray
  * from a cube map.
  */
@JSImport("babylonjs", "CubeMapToSphericalPolynomialTools")
@js.native
class CubeMapToSphericalPolynomialTools ()
  extends babylonjsLib.BABYLONNs.CubeMapToSphericalPolynomialTools

/* static members */
@JSImport("babylonjs", "CubeMapToSphericalPolynomialTools")
@js.native
object CubeMapToSphericalPolynomialTools extends js.Object {
  var FileFaces: js.Any = js.native
  /**
    * Converts a texture to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param texture The texture to extract the information from.
    * @return The Spherical Polynomial data.
    */
  def ConvertCubeMapTextureToSphericalPolynomial(texture: babylonjsLib.BABYLONNs.BaseTexture): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.SphericalPolynomial] = js.native
  /**
    * Converts a cubemap to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param cubeInfo The Cube map to extract the information from.
    * @return The Spherical Polynomial data.
    */
  def ConvertCubeMapToSphericalPolynomial(cubeInfo: babylonjsLib.BABYLONNs.CubeMapInfo): babylonjsLib.BABYLONNs.SphericalPolynomial = js.native
}

