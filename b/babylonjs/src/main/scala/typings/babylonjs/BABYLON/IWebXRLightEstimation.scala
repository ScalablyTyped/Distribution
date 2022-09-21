package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRLightEstimation extends StObject {
  
  /**
    * Color of light source
    */
  var lightColor: Color3
  
  /**
    * The direction from the light source
    */
  var lightDirection: Vector3
  
  /**
    * The intensity of the light source
    */
  var lightIntensity: Double
  
  /**
    * Spherical harmonics coefficients of the light source
    */
  var sphericalHarmonics: SphericalHarmonics
}
object IWebXRLightEstimation {
  
  inline def apply(
    lightColor: Color3,
    lightDirection: Vector3,
    lightIntensity: Double,
    sphericalHarmonics: SphericalHarmonics
  ): IWebXRLightEstimation = {
    val __obj = js.Dynamic.literal(lightColor = lightColor.asInstanceOf[js.Any], lightDirection = lightDirection.asInstanceOf[js.Any], lightIntensity = lightIntensity.asInstanceOf[js.Any], sphericalHarmonics = sphericalHarmonics.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRLightEstimation]
  }
  
  extension [Self <: IWebXRLightEstimation](x: Self) {
    
    inline def setLightColor(value: Color3): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    inline def setLightDirection(value: Vector3): Self = StObject.set(x, "lightDirection", value.asInstanceOf[js.Any])
    
    inline def setLightIntensity(value: Double): Self = StObject.set(x, "lightIntensity", value.asInstanceOf[js.Any])
    
    inline def setSphericalHarmonics(value: SphericalHarmonics): Self = StObject.set(x, "sphericalHarmonics", value.asInstanceOf[js.Any])
  }
}
