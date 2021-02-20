package typings.babylonjs.anon

import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DashNb extends StObject {
  
  var dashNb: js.UndefOr[Double] = js.native
  
  var dashSize: js.UndefOr[Double] = js.native
  
  var gapSize: js.UndefOr[Double] = js.native
  
  var points: js.Array[Vector3] = js.native
}
object DashNb {
  
  @scala.inline
  def apply(points: js.Array[Vector3]): DashNb = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[DashNb]
  }
  
  @scala.inline
  implicit class DashNbMutableBuilder[Self <: DashNb] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDashNb(value: Double): Self = StObject.set(x, "dashNb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashNbUndefined: Self = StObject.set(x, "dashNb", js.undefined)
    
    @scala.inline
    def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashSizeUndefined: Self = StObject.set(x, "dashSize", js.undefined)
    
    @scala.inline
    def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[Vector3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Vector3*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
