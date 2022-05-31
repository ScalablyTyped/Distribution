package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Math extends StObject {
  
  def fround(x: Double): Double
  
  def imul(a: Double, b: Double): Double
}
object Math {
  
  inline def apply(fround: Double => Double, imul: (Double, Double) => Double): Math = {
    val __obj = js.Dynamic.literal(fround = js.Any.fromFunction1(fround), imul = js.Any.fromFunction2(imul))
    __obj.asInstanceOf[Math]
  }
  
  extension [Self <: Math](x: Self) {
    
    inline def setFround(value: Double => Double): Self = StObject.set(x, "fround", js.Any.fromFunction1(value))
    
    inline def setImul(value: (Double, Double) => Double): Self = StObject.set(x, "imul", js.Any.fromFunction2(value))
  }
}
