package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JacobianElement extends StObject {
  
  def multiplyElement(element: JacobianElement): Double
  
  def multiplyVectors(spacial: Vec3, rotational: Vec3): Double
  
  var rotational: Vec3
  
  var spatial: Vec3
}
object JacobianElement {
  
  inline def apply(
    multiplyElement: JacobianElement => Double,
    multiplyVectors: (Vec3, Vec3) => Double,
    rotational: Vec3,
    spatial: Vec3
  ): JacobianElement = {
    val __obj = js.Dynamic.literal(multiplyElement = js.Any.fromFunction1(multiplyElement), multiplyVectors = js.Any.fromFunction2(multiplyVectors), rotational = rotational.asInstanceOf[js.Any], spatial = spatial.asInstanceOf[js.Any])
    __obj.asInstanceOf[JacobianElement]
  }
  
  extension [Self <: JacobianElement](x: Self) {
    
    inline def setMultiplyElement(value: JacobianElement => Double): Self = StObject.set(x, "multiplyElement", js.Any.fromFunction1(value))
    
    inline def setMultiplyVectors(value: (Vec3, Vec3) => Double): Self = StObject.set(x, "multiplyVectors", js.Any.fromFunction2(value))
    
    inline def setRotational(value: Vec3): Self = StObject.set(x, "rotational", value.asInstanceOf[js.Any])
    
    inline def setSpatial(value: Vec3): Self = StObject.set(x, "spatial", value.asInstanceOf[js.Any])
  }
}
