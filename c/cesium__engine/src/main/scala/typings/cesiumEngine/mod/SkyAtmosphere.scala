package typings.cesiumEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@cesium/engine", "SkyAtmosphere")
@js.native
open class SkyAtmosphere () extends StObject {
  def this(ellipsoid: Ellipsoid) = this()
  
  /**
    * The intensity of the light that is used for computing the sky atmosphere color.
    */
  var atmosphereLightIntensity: Double = js.native
  
  /**
    * The anisotropy of the medium to consider for Mie scattering.
    * <p>
    * Valid values are between -1.0 and 1.0.
    * </p>
    */
  var atmosphereMieAnisotropy: Double = js.native
  
  /**
    * The Mie scattering coefficient used in the atmospheric scattering equations for the sky atmosphere.
    */
  var atmosphereMieCoefficient: Cartesian3 = js.native
  
  /**
    * The Mie scale height used in the atmospheric scattering equations for the sky atmosphere, in meters.
    */
  var atmosphereMieScaleHeight: Double = js.native
  
  /**
    * The Rayleigh scattering coefficient used in the atmospheric scattering equations for the sky atmosphere.
    */
  var atmosphereRayleighCoefficient: Cartesian3 = js.native
  
  /**
    * The Rayleigh scale height used in the atmospheric scattering equations for the sky atmosphere, in meters.
    */
  var atmosphereRayleighScaleHeight: Double = js.native
  
  /**
    * The brightness shift to apply to the atmosphere. Defaults to 0.0 (no shift).
    * A brightness shift of -1.0 is complete darkness, which will let space show through.
    */
  var brightnessShift: Double = js.native
  
  /**
    * Destroys the WebGL resources held by this object.  Destroying an object allows for deterministic
    * release of WebGL resources, instead of relying on the garbage collector to destroy this object.
    * <br /><br />
    * Once an object is destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.  Therefore,
    * assign the return value (<code>undefined</code>) to the object as done in the example.
    * @example
    * skyAtmosphere = skyAtmosphere && skyAtmosphere.destroy();
    */
  def destroy(): Unit = js.native
  
  /**
    * Gets the ellipsoid the atmosphere is drawn around.
    */
  val ellipsoid: Ellipsoid = js.native
  
  /**
    * The hue shift to apply to the atmosphere. Defaults to 0.0 (no shift).
    * A hue shift of 1.0 indicates a complete rotation of the hues available.
    */
  var hueShift: Double = js.native
  
  /**
    * Returns true if this object was destroyed; otherwise, false.
    * <br /><br />
    * If this object was destroyed, it should not be used; calling any function other than
    * <code>isDestroyed</code> will result in a {@link DeveloperError} exception.
    * @returns <code>true</code> if this object was destroyed; otherwise, <code>false</code>.
    */
  def isDestroyed(): Boolean = js.native
  
  /**
    * Compute atmosphere per-fragment instead of per-vertex.
    * This produces better looking atmosphere with a slight performance penalty.
    */
  var perFragmentAtmosphere: Boolean = js.native
  
  /**
    * The saturation shift to apply to the atmosphere. Defaults to 0.0 (no shift).
    * A saturation shift of -1.0 is monochrome.
    */
  var saturationShift: Double = js.native
  
  /**
    * Determines if the atmosphere is shown.
    */
  var show: Boolean = js.native
}
