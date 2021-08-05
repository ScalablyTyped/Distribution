package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Round extends StObject {
  
  def ceil(n: Double): Double
  
  def floor(n: Double): Double
  
  def round(n: Double): Double
}
object Round {
  
  inline def apply(ceil: Double => Double, floor: Double => Double, round: Double => Double): Round = {
    val __obj = js.Dynamic.literal(ceil = js.Any.fromFunction1(ceil), floor = js.Any.fromFunction1(floor), round = js.Any.fromFunction1(round))
    __obj.asInstanceOf[Round]
  }
  
  extension [Self <: Round](x: Self) {
    
    inline def setCeil(value: Double => Double): Self = StObject.set(x, "ceil", js.Any.fromFunction1(value))
    
    inline def setFloor(value: Double => Double): Self = StObject.set(x, "floor", js.Any.fromFunction1(value))
    
    inline def setRound(value: Double => Double): Self = StObject.set(x, "round", js.Any.fromFunction1(value))
  }
}
