package typings.babylonjs

import typings.std.DOMPointReadOnly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRLightEstimate extends StObject {
  
  val primaryLightDirection: DOMPointReadOnly
  
  val primaryLightIntensity: DOMPointReadOnly
  
  val sphericalHarmonicsCoefficients: js.typedarray.Float32Array
}
object XRLightEstimate {
  
  inline def apply(
    primaryLightDirection: DOMPointReadOnly,
    primaryLightIntensity: DOMPointReadOnly,
    sphericalHarmonicsCoefficients: js.typedarray.Float32Array
  ): XRLightEstimate = {
    val __obj = js.Dynamic.literal(primaryLightDirection = primaryLightDirection.asInstanceOf[js.Any], primaryLightIntensity = primaryLightIntensity.asInstanceOf[js.Any], sphericalHarmonicsCoefficients = sphericalHarmonicsCoefficients.asInstanceOf[js.Any])
    __obj.asInstanceOf[XRLightEstimate]
  }
  
  extension [Self <: XRLightEstimate](x: Self) {
    
    inline def setPrimaryLightDirection(value: DOMPointReadOnly): Self = StObject.set(x, "primaryLightDirection", value.asInstanceOf[js.Any])
    
    inline def setPrimaryLightIntensity(value: DOMPointReadOnly): Self = StObject.set(x, "primaryLightIntensity", value.asInstanceOf[js.Any])
    
    inline def setSphericalHarmonicsCoefficients(value: js.typedarray.Float32Array): Self = StObject.set(x, "sphericalHarmonicsCoefficients", value.asInstanceOf[js.Any])
  }
}
