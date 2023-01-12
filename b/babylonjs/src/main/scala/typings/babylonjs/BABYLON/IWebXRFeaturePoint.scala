package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebXRFeaturePoint extends StObject {
  
  /**
    * Represents the confidence value of the feature point in world space. 0 being least confident, and 1 being most confident.
    */
  var confidenceValue: Double
  
  /**
    * Represents the position of the feature point in world space.
    */
  var position: Vector3
}
object IWebXRFeaturePoint {
  
  inline def apply(confidenceValue: Double, position: Vector3): IWebXRFeaturePoint = {
    val __obj = js.Dynamic.literal(confidenceValue = confidenceValue.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebXRFeaturePoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebXRFeaturePoint] (val x: Self) extends AnyVal {
    
    inline def setConfidenceValue(value: Double): Self = StObject.set(x, "confidenceValue", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
