package typings.cornerstoneCore.mod

import typings.cornerstoneCore.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  def invert(): Unit
  
  var m: js.Array[Double]
  
  def multiply(matrix: Any): Unit
  
  def reset(): Unit
  
  def rotate(rad: Any): Unit
  
  def scale(sx: Any, sy: Any): Unit
  
  def transformPoint(px: Any, py: Any): X
  
  def translate(x: Any, y: Any): Unit
}
object Transform {
  
  inline def apply(
    invert: () => Unit,
    m: js.Array[Double],
    multiply: Any => Unit,
    reset: () => Unit,
    rotate: Any => Unit,
    scale: (Any, Any) => Unit,
    transformPoint: (Any, Any) => X,
    translate: (Any, Any) => Unit
  ): Transform = {
    val __obj = js.Dynamic.literal(invert = js.Any.fromFunction0(invert), m = m.asInstanceOf[js.Any], multiply = js.Any.fromFunction1(multiply), reset = js.Any.fromFunction0(reset), rotate = js.Any.fromFunction1(rotate), scale = js.Any.fromFunction2(scale), transformPoint = js.Any.fromFunction2(transformPoint), translate = js.Any.fromFunction2(translate))
    __obj.asInstanceOf[Transform]
  }
  
  extension [Self <: Transform](x: Self) {
    
    inline def setInvert(value: () => Unit): Self = StObject.set(x, "invert", js.Any.fromFunction0(value))
    
    inline def setM(value: js.Array[Double]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMVarargs(value: Double*): Self = StObject.set(x, "m", js.Array(value*))
    
    inline def setMultiply(value: Any => Unit): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setRotate(value: Any => Unit): Self = StObject.set(x, "rotate", js.Any.fromFunction1(value))
    
    inline def setScale(value: (Any, Any) => Unit): Self = StObject.set(x, "scale", js.Any.fromFunction2(value))
    
    inline def setTransformPoint(value: (Any, Any) => X): Self = StObject.set(x, "transformPoint", js.Any.fromFunction2(value))
    
    inline def setTranslate(value: (Any, Any) => Unit): Self = StObject.set(x, "translate", js.Any.fromFunction2(value))
  }
}
