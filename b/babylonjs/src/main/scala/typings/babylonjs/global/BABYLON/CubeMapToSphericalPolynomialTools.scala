package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.CubeMapInfo
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.CubeMapToSphericalPolynomialTools")
@js.native
class CubeMapToSphericalPolynomialTools ()
  extends typings.babylonjs.BABYLON.CubeMapToSphericalPolynomialTools
/* static members */
object CubeMapToSphericalPolynomialTools {
  
  @JSGlobal("BABYLON.CubeMapToSphericalPolynomialTools")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Converts a texture to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param texture The texture to extract the information from.
    * @return The Spherical Polynomial data.
    */
  @JSGlobal("BABYLON.CubeMapToSphericalPolynomialTools.ConvertCubeMapTextureToSphericalPolynomial")
  @js.native
  def ConvertCubeMapTextureToSphericalPolynomial(texture: typings.babylonjs.BABYLON.BaseTexture): Nullable[typings.babylonjs.BABYLON.SphericalPolynomial] = js.native
  
  /**
    * Converts a cubemap to the according Spherical Polynomial data.
    * This extracts the first 3 orders only as they are the only one used in the lighting.
    *
    * @param cubeInfo The Cube map to extract the information from.
    * @return The Spherical Polynomial data.
    */
  @JSGlobal("BABYLON.CubeMapToSphericalPolynomialTools.ConvertCubeMapToSphericalPolynomial")
  @js.native
  def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): typings.babylonjs.BABYLON.SphericalPolynomial = js.native
  
  @JSGlobal("BABYLON.CubeMapToSphericalPolynomialTools.FileFaces")
  @js.native
  def FileFaces: js.Any = js.native
  @scala.inline
  def FileFaces_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileFaces")(x.asInstanceOf[js.Any])
}
