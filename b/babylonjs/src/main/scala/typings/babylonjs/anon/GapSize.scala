package typings.babylonjs.anon

import typings.babylonjs.linesMeshMod.LinesMesh
import typings.babylonjs.mathVectorMod.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GapSize extends StObject {
  
  var dashNb: js.UndefOr[Double] = js.native
  
  var dashSize: js.UndefOr[Double] = js.native
  
  var gapSize: js.UndefOr[Double] = js.native
  
  var instance: js.UndefOr[LinesMesh] = js.native
  
  var points: js.Array[Vector3] = js.native
  
  var updatable: js.UndefOr[Boolean] = js.native
}
object GapSize {
  
  @scala.inline
  def apply(points: js.Array[Vector3]): GapSize = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[GapSize]
  }
  
  @scala.inline
  implicit class GapSizeMutableBuilder[Self <: GapSize] (val x: Self) extends AnyVal {
    
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
    def setInstance(value: LinesMesh): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[Vector3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: Vector3*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
