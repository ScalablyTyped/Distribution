package typings.dc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Round extends StObject {
  
  def ceil(n: Double): Double = js.native
  
  def floor(n: Double): Double = js.native
  
  def round(n: Double): Double = js.native
}
object Round {
  
  @scala.inline
  def apply(ceil: Double => Double, floor: Double => Double, round: Double => Double): Round = {
    val __obj = js.Dynamic.literal(ceil = js.Any.fromFunction1(ceil), floor = js.Any.fromFunction1(floor), round = js.Any.fromFunction1(round))
    __obj.asInstanceOf[Round]
  }
  
  @scala.inline
  implicit class RoundMutableBuilder[Self <: Round] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCeil(value: Double => Double): Self = StObject.set(x, "ceil", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFloor(value: Double => Double): Self = StObject.set(x, "floor", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRound(value: Double => Double): Self = StObject.set(x, "round", js.Any.fromFunction1(value))
  }
}
