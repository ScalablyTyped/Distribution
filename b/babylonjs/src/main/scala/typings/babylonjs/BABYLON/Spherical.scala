package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Spherical extends StObject {
  
  var phi: Double
  
  var radius: Double
  
  var theta: Double
  
  /**
    * Gets a Vector3 from the current spherical coordinates
    * @returns the Vector3
    */
  def toVector3(): Vector3
  
  /**
    * Assigns the rectangular coordinates of the current Spherical to a Vector3
    * @param ref the Vector3 to update
    * @returns the updated Vector3
    */
  def toVector3ToRef(ref: DeepImmutable[Vector3]): Vector3
}
object Spherical {
  
  inline def apply(
    phi: Double,
    radius: Double,
    theta: Double,
    toVector3: () => Vector3,
    toVector3ToRef: DeepImmutable[Vector3] => Vector3
  ): Spherical = {
    val __obj = js.Dynamic.literal(phi = phi.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], theta = theta.asInstanceOf[js.Any], toVector3 = js.Any.fromFunction0(toVector3), toVector3ToRef = js.Any.fromFunction1(toVector3ToRef))
    __obj.asInstanceOf[Spherical]
  }
  
  extension [Self <: Spherical](x: Self) {
    
    inline def setPhi(value: Double): Self = StObject.set(x, "phi", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    inline def setToVector3(value: () => Vector3): Self = StObject.set(x, "toVector3", js.Any.fromFunction0(value))
    
    inline def setToVector3ToRef(value: DeepImmutable[Vector3] => Vector3): Self = StObject.set(x, "toVector3ToRef", js.Any.fromFunction1(value))
  }
}
