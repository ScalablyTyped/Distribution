package typings.bezierJs.BezierJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pair extends StObject {
  
  var left: Bezier
  
  var right: Bezier
}
object Pair {
  
  @scala.inline
  def apply(left: Bezier, right: Bezier): Pair = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair]
  }
  
  @scala.inline
  implicit class PairMutableBuilder[Self <: Pair] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLeft(value: Bezier): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Bezier): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
  }
}
