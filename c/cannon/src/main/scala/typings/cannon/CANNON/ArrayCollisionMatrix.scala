package typings.cannon.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayCollisionMatrix extends StObject {
  
  def get(i: Double, j: Double): Double
  
  var matrix: js.Array[Mat3]
  
  def reset(): Unit
  
  def set(i: Double, j: Double, value: Double): Unit
  
  def setNumObjects(n: Double): Unit
}
object ArrayCollisionMatrix {
  
  @scala.inline
  def apply(
    get: (Double, Double) => Double,
    matrix: js.Array[Mat3],
    reset: () => Unit,
    set: (Double, Double, Double) => Unit,
    setNumObjects: Double => Unit
  ): ArrayCollisionMatrix = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), matrix = matrix.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), set = js.Any.fromFunction3(set), setNumObjects = js.Any.fromFunction1(setNumObjects))
    __obj.asInstanceOf[ArrayCollisionMatrix]
  }
  
  @scala.inline
  implicit class ArrayCollisionMatrixMutableBuilder[Self <: ArrayCollisionMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: (Double, Double) => Double): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMatrix(value: js.Array[Mat3]): Self = StObject.set(x, "matrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatrixVarargs(value: Mat3*): Self = StObject.set(x, "matrix", js.Array(value :_*))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetNumObjects(value: Double => Unit): Self = StObject.set(x, "setNumObjects", js.Any.fromFunction1(value))
  }
}
