package typings.bezierJs.BezierJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closest extends StObject {
  
  var mdist: Double
  
  var mpos: Double
}
object Closest {
  
  @scala.inline
  def apply(mdist: Double, mpos: Double): Closest = {
    val __obj = js.Dynamic.literal(mdist = mdist.asInstanceOf[js.Any], mpos = mpos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closest]
  }
  
  @scala.inline
  implicit class ClosestMutableBuilder[Self <: Closest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMdist(value: Double): Self = StObject.set(x, "mdist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMpos(value: Double): Self = StObject.set(x, "mpos", value.asInstanceOf[js.Any])
  }
}
