package typings.box2d.Box2D.Collision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait b2SimplexCache extends StObject {
  
  /**
    * Number in cache.
    **/
  var count: Double
  
  /**
    * Vertices on shape a.
    **/
  var indexA: js.Array[Double]
  
  /**
    * Vertices on shape b.
    **/
  var indexB: js.Array[Double]
  
  /**
    * Length or area.
    **/
  var metric: Double
}
object b2SimplexCache {
  
  inline def apply(count: Double, indexA: js.Array[Double], indexB: js.Array[Double], metric: Double): b2SimplexCache = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], indexA = indexA.asInstanceOf[js.Any], indexB = indexB.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2SimplexCache]
  }
  
  extension [Self <: b2SimplexCache](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setIndexA(value: js.Array[Double]): Self = StObject.set(x, "indexA", value.asInstanceOf[js.Any])
    
    inline def setIndexAVarargs(value: Double*): Self = StObject.set(x, "indexA", js.Array(value :_*))
    
    inline def setIndexB(value: js.Array[Double]): Self = StObject.set(x, "indexB", value.asInstanceOf[js.Any])
    
    inline def setIndexBVarargs(value: Double*): Self = StObject.set(x, "indexB", js.Array(value :_*))
    
    inline def setMetric(value: Double): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
  }
}
