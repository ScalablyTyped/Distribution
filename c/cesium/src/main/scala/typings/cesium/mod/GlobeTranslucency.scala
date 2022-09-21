package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "GlobeTranslucency")
@js.native
open class GlobeTranslucency () extends StObject {
  
  /**
    * A constant translucency to apply to back faces of the globe.
    * <br /><br />
    * {@link GlobeTranslucency#enabled} must be set to true for this option to take effect.
    * @example
    * // Set back face translucency to 0.5.
    * globe.translucency.backFaceAlpha = 0.5;
    * globe.translucency.enabled = true;
    */
  var backFaceAlpha: Double = js.native
  
  /**
    * Gets or sets near and far translucency properties of back faces of the globe based on the distance to the camera.
    * The translucency will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the translucency remains clamped to the nearest bound.  If undefined,
    * backFaceAlphaByDistance will be disabled.
    * <br /><br />
    * {@link GlobeTranslucency#enabled} must be set to true for this option to take effect.
    * @example
    * // Example 1.
    * // Set back face translucency to 0.5 when the
    * // camera is 1500 meters from the surface and 1.0
    * // as the camera distance approaches 8.0e6 meters.
    * globe.translucency.backFaceAlphaByDistance = new Cesium.NearFarScalar(1.5e2, 0.5, 8.0e6, 1.0);
    * globe.translucency.enabled = true;
    * @example
    * // Example 2.
    * // Disable back face translucency by distance
    * globe.translucency.backFaceAlphaByDistance = undefined;
    */
  var backFaceAlphaByDistance: NearFarScalar = js.native
  
  /**
    * When true, the globe is rendered as a translucent surface.
    * <br /><br />
    * The alpha is computed by blending {@link Globe#material}, {@link Globe#imageryLayers},
    * and {@link Globe#baseColor}, all of which may contain translucency, and then multiplying by
    * {@link GlobeTranslucency#frontFaceAlpha} and {@link GlobeTranslucency#frontFaceAlphaByDistance} for front faces and
    * {@link GlobeTranslucency#backFaceAlpha} and {@link GlobeTranslucency#backFaceAlphaByDistance} for back faces.
    * When the camera is underground back faces and front faces are swapped, i.e. back-facing geometry
    * is considered front facing.
    * <br /><br />
    * Translucency is disabled by default.
    */
  var enabled: Boolean = js.native
  
  /**
    * A constant translucency to apply to front faces of the globe.
    * <br /><br />
    * {@link GlobeTranslucency#enabled} must be set to true for this option to take effect.
    * @example
    * // Set front face translucency to 0.5.
    * globe.translucency.frontFaceAlpha = 0.5;
    * globe.translucency.enabled = true;
    */
  var frontFaceAlpha: Double = js.native
  
  /**
    * Gets or sets near and far translucency properties of front faces of the globe based on the distance to the camera.
    * The translucency will interpolate between the {@link NearFarScalar#nearValue} and
    * {@link NearFarScalar#farValue} while the camera distance falls within the lower and upper bounds
    * of the specified {@link NearFarScalar#near} and {@link NearFarScalar#far}.
    * Outside of these ranges the translucency remains clamped to the nearest bound.  If undefined,
    * frontFaceAlphaByDistance will be disabled.
    * <br /><br />
    * {@link GlobeTranslucency#enabled} must be set to true for this option to take effect.
    * @example
    * // Example 1.
    * // Set front face translucency to 0.5 when the
    * // camera is 1500 meters from the surface and 1.0
    * // as the camera distance approaches 8.0e6 meters.
    * globe.translucency.frontFaceAlphaByDistance = new Cesium.NearFarScalar(1.5e2, 0.5, 8.0e6, 1.0);
    * globe.translucency.enabled = true;
    * @example
    * // Example 2.
    * // Disable front face translucency by distance
    * globe.translucency.frontFaceAlphaByDistance = undefined;
    */
  var frontFaceAlphaByDistance: NearFarScalar = js.native
  
  /**
    * A property specifying a {@link Rectangle} used to limit translucency to a cartographic area.
    * Defaults to the maximum extent of cartographic coordinates.
    */
  var rectangle: Rectangle = js.native
}
