package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Polar extends StObject {
  
  var radius: Double
  
  var theta: Double
  
  /**
    * Gets the rectangular coordinates of the current Polar
    * @returns the rectangular coordinates
    */
  def toVector2(): Vector2
  
  /**
    * Gets the rectangular coordinates of the current Polar
    * @param ref the reference to assign the result
    * @returns the updated reference
    */
  def toVector2ToRef(ref: Vector2): Vector2
}
object Polar {
  
  inline def apply(radius: Double, theta: Double, toVector2: () => Vector2, toVector2ToRef: Vector2 => Vector2): Polar = {
    val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], theta = theta.asInstanceOf[js.Any], toVector2 = js.Any.fromFunction0(toVector2), toVector2ToRef = js.Any.fromFunction1(toVector2ToRef))
    __obj.asInstanceOf[Polar]
  }
  
  extension [Self <: Polar](x: Self) {
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setTheta(value: Double): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    
    inline def setToVector2(value: () => Vector2): Self = StObject.set(x, "toVector2", js.Any.fromFunction0(value))
    
    inline def setToVector2ToRef(value: Vector2 => Vector2): Self = StObject.set(x, "toVector2ToRef", js.Any.fromFunction1(value))
  }
}
