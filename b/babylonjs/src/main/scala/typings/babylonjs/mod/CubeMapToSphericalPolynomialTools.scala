package typings.babylonjs.mod

import typings.babylonjs.panoramaToCubemapMod.CubeMapInfo
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "CubeMapToSphericalPolynomialTools")
@js.native
class CubeMapToSphericalPolynomialTools ()
  extends typings.babylonjs.legacyMod.CubeMapToSphericalPolynomialTools
/* static members */
object CubeMapToSphericalPolynomialTools {
  
  @JSImport("babylonjs", "CubeMapToSphericalPolynomialTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a texture to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param texture The texture to extract the information from.
    * @return The Spherical Polynomial data.
    */
  @JSImport("babylonjs", "CubeMapToSphericalPolynomialTools.ConvertCubeMapTextureToSphericalPolynomial")
  @js.native
  def ConvertCubeMapTextureToSphericalPolynomial(texture: typings.babylonjs.baseTextureMod.BaseTexture): Nullable[typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial] = js.native
  
  /**
    * Converts a cubemap to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param cubeInfo The Cube map to extract the information from.
    * @return The Spherical Polynomial data.
    */
  @JSImport("babylonjs", "CubeMapToSphericalPolynomialTools.ConvertCubeMapToSphericalPolynomial")
  @js.native
  def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial = js.native
  
  @JSImport("babylonjs", "CubeMapToSphericalPolynomialTools.FileFaces")
  @js.native
  def FileFaces: js.Any = js.native
  @scala.inline
  def FileFaces_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileFaces")(x.asInstanceOf[js.Any])
}
