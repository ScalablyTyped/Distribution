package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectCollisionMatrix extends StObject {
  
  def get(i: Double, j: Double): Double
  
  var matrix: js.Array[Double]
  
  def reset(): Unit
  
  def set(i: Double, j: Double, value: Double): Unit
  
  def setNumObjects(n: Double): Unit
}
object ObjectCollisionMatrix {
  
  inline def apply(
    get: (Double, Double) => Double,
    matrix: js.Array[Double],
    reset: () => Unit,
    set: (Double, Double, Double) => Unit,
    setNumObjects: Double => Unit
  ): ObjectCollisionMatrix = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), matrix = matrix.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction3(set), setNumObjects = js.Any.fromFunction1(setNumObjects))
    __obj.asInstanceOf[ObjectCollisionMatrix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectCollisionMatrix] (val x: Self) extends AnyVal {
    
    inline def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setMatrix(value: js.Array[Double]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    inline def setMatrixVarargs(value: Double*): Self = StObject.set(x, "matrix", js.Array(value*))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setSet(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    
    inline def setSetNumObjects(value: Double => Unit): Self = StObject.set(x, "setNumObjects", js.Any.fromFunction1(value))
  }
}
