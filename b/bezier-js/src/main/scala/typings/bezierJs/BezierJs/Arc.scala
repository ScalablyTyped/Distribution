package typings.bezierJs.BezierJs

import typings.bezierJs.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Arc extends Point {
  
  var e: Double = js.native
  
  var interval: End = js.native
  
  var r: Double = js.native
  
  var s: Double = js.native
}
object Arc {
  
  @scala.inline
  def apply(e: Double, interval: End, r: Double, s: Double, x: Double, y: Double): Arc = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
  
  @scala.inline
  implicit class ArcMutableBuilder[Self <: Arc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE(value: Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: End): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: Double): Self = StObject.set(x, "s", value.asInstanceOf[js.Any])
  }
}
