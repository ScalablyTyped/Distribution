package typings.bezierJs.BezierJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Line extends StObject {
  
  var p1: Point = js.native
  
  var p2: Point = js.native
}
object Line {
  
  @scala.inline
  def apply(p1: Point, p2: Point): Line = {
    val __obj = js.Dynamic.literal(p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
  
  @scala.inline
  implicit class LineMutableBuilder[Self <: Line] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setP1(value: Point): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP2(value: Point): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
  }
}
