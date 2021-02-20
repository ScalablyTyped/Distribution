package typings.babylonjs

import typings.babylonjs.baseTextureMod.BaseTexture
import typings.babylonjs.panoramaToCubemapMod.CubeMapInfo
import typings.babylonjs.sphericalPolynomialMod.SphericalPolynomial
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubemapToSphericalPolynomialMod {
  
  @JSImport("babylonjs/Misc/HighDynamicRange/cubemapToSphericalPolynomial", "CubeMapToSphericalPolynomialTools")
  @js.native
  class CubeMapToSphericalPolynomialTools () extends StObject
  /* static members */
  object CubeMapToSphericalPolynomialTools {
    
    @JSImport("babylonjs/Misc/HighDynamicRange/cubemapToSphericalPolynomial", "CubeMapToSphericalPolynomialTools")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Converts a texture to the according Spherical Polynomial data.
      * This extracts the first 3 orders only as they are the only one used in the lighting.
      *
      * @param texture The texture to extract the information from.
      * @return The Spherical Polynomial data.
      */
    @JSImport("babylonjs/Misc/HighDynamicRange/cubemapToSphericalPolynomial", "CubeMapToSphericalPolynomialTools.ConvertCubeMapTextureToSphericalPolynomial")
    @js.native
    def ConvertCubeMapTextureToSphericalPolynomial(texture: BaseTexture): Nullable[SphericalPolynomial] = js.native
    
    /**
      * Converts a cubemap to the according Spherical Polynomial data.
      * This extracts the first 3 orders only as they are the only one used in the lighting.
      *
      * @param cubeInfo The Cube map to extract the information from.
      * @return The Spherical Polynomial data.
      */
    @JSImport("babylonjs/Misc/HighDynamicRange/cubemapToSphericalPolynomial", "CubeMapToSphericalPolynomialTools.ConvertCubeMapToSphericalPolynomial")
    @js.native
    def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): SphericalPolynomial = js.native
    
    @JSImport("babylonjs/Misc/HighDynamicRange/cubemapToSphericalPolynomial", "CubeMapToSphericalPolynomialTools.FileFaces")
    @js.native
    def FileFaces: js.Any = js.native
    @scala.inline
    def FileFaces_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FileFaces")(x.asInstanceOf[js.Any])
  }
}
