package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "ImageBasedLighting")
@js.native
open class ImageBasedLighting () extends StObject {
  
  /**
    * Cesium adds lighting from the earth, sky, atmosphere, and star skybox.
    * This cartesian is used to scale the final diffuse and specular lighting
    * contribution from those sources to the final color. A value of 0.0 will
    * disable those light sources.
    */
  var imageBasedLightingFactor: Cartesian2 = js.native
  
  /**
    * The sun's luminance at the zenith in kilo candela per meter squared
    * to use for this model's procedural environment map. This is used when
    * {@link ImageBasedLighting#specularEnvironmentMaps} and {@link ImageBasedLighting#sphericalHarmonicCoefficients}
    * are not defined.
    */
  var luminanceAtZenith: Double = js.native
  
  /**
    * A URL to a KTX2 file that contains a cube map of the specular lighting and the convoluted specular mipmaps.
    */
  var specularEnvironmentMaps: String = js.native
  
  /**
    * The third order spherical harmonic coefficients used for the diffuse color of image-based lighting. When <code>undefined</code>, a diffuse irradiance
    * computed from the atmosphere color is used.
    * <p>
    * There are nine <code>Cartesian3</code> coefficients.
    * The order of the coefficients is: L<sub>0,0</sub>, L<sub>1,-1</sub>, L<sub>1,0</sub>, L<sub>1,1</sub>, L<sub>2,-2</sub>, L<sub>2,-1</sub>, L<sub>2,0</sub>, L<sub>2,1</sub>, L<sub>2,2</sub>
    * </p>
    *
    * These values can be obtained by preprocessing the environment map using the <code>cmgen</code> tool of
    * {@link https://github.com/google/filament/releases|Google's Filament project}. This will also generate a KTX file that can be
    * supplied to {@link Model#specularEnvironmentMaps}.
    */
  var sphericalHarmonicCoefficients: js.Array[Cartesian3] = js.native
}
