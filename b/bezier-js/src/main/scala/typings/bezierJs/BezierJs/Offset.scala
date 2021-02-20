package typings.bezierJs.BezierJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Offset extends Point {
  
  var c: Point = js.native
  
  var n: Point = js.native
}
object Offset {
  
  @scala.inline
  def apply(c: Point, n: Point, x: Double, y: Double): Offset = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
  
  @scala.inline
  implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setC(value: Point): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Point): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
  }
}
