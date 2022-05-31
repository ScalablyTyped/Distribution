package typings.babylonjs.anon

import typings.babylonjs.BABYLON.LinesMesh
import typings.babylonjs.BABYLON.Vector3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GapSizeInstance extends StObject {
  
  var dashNb: js.UndefOr[Double] = js.undefined
  
  var dashSize: js.UndefOr[Double] = js.undefined
  
  var gapSize: js.UndefOr[Double] = js.undefined
  
  var instance: js.UndefOr[LinesMesh] = js.undefined
  
  var points: js.Array[Vector3]
  
  var updatable: js.UndefOr[Boolean] = js.undefined
}
object GapSizeInstance {
  
  inline def apply(points: js.Array[Vector3]): GapSizeInstance = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[GapSizeInstance]
  }
  
  extension [Self <: GapSizeInstance](x: Self) {
    
    inline def setDashNb(value: Double): Self = StObject.set(x, "dashNb", value.asInstanceOf[js.Any])
    
    inline def setDashNbUndefined: Self = StObject.set(x, "dashNb", js.undefined)
    
    inline def setDashSize(value: Double): Self = StObject.set(x, "dashSize", value.asInstanceOf[js.Any])
    
    inline def setDashSizeUndefined: Self = StObject.set(x, "dashSize", js.undefined)
    
    inline def setGapSize(value: Double): Self = StObject.set(x, "gapSize", value.asInstanceOf[js.Any])
    
    inline def setGapSizeUndefined: Self = StObject.set(x, "gapSize", js.undefined)
    
    inline def setInstance(value: LinesMesh): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setPoints(value: js.Array[Vector3]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Vector3*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
  }
}
