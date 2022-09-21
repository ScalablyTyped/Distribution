package typings.babylonjs.anon

import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GapSize extends StObject {
  
  var dashNb: js.UndefOr[Double] = js.undefined
  
  var dashSize: js.UndefOr[Double] = js.undefined
  
  var gapSize: js.UndefOr[Double] = js.undefined
  
  var points: js.Array[Vector3]
}
object GapSize {
  
  inline def apply(points: js.Array[Vector3]): GapSize = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[GapSize]
  }
  
  extension [Self <: GapSize](x: Self) {
    
    inline def setDashNb(value: Double): Self = StObject.set(x, "dashNb", value.asInstanceOf[js.Any])
    
    inline def setDashNbUndefined: Self = StObject.set(x, "dashNb", js.undefined)
    
    inline def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
    
    inline def setDashSizeUndefined: Self = StObject.set(x, "dashSize", js.undefined)
    
    inline def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
    
    inline def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
    
    inline def setPoints(value: js.Array[Vector3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Vector3*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
