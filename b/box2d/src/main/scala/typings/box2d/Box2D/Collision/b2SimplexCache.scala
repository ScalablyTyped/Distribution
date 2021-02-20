package typings.box2d.Box2D.Collision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait b2SimplexCache extends StObject {
  
  /**
    * Number in cache.
    **/
  var count: Double = js.native
  
  /**
    * Vertices on shape a.
    **/
  var indexA: js.Array[Double] = js.native
  
  /**
    * Vertices on shape b.
    **/
  var indexB: js.Array[Double] = js.native
  
  /**
    * Length or area.
    **/
  var metric: Double = js.native
}
object b2SimplexCache {
  
  @scala.inline
  def apply(count: Double, indexA: js.Array[Double], indexB: js.Array[Double], metric: Double): b2SimplexCache = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], indexA = indexA.asInstanceOf[js.Any], indexB = indexB.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2SimplexCache]
  }
  
  @scala.inline
  implicit class b2SimplexCacheMutableBuilder[Self <: b2SimplexCache] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexA(value: js.Array[Double]): Self = StObject.set(x, "indexA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexAVarargs(value: Double*): Self = StObject.set(x, "indexA", js.Array(value :_*))
    
    @scala.inline
    def setIndexB(value: js.Array[Double]): Self = StObject.set(x, "indexB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexBVarargs(value: Double*): Self = StObject.set(x, "indexB", js.Array(value :_*))
    
    @scala.inline
    def setMetric(value: Double): Self = StObject.set(x, "metric", value.asInstanceOf[js.Any])
  }
}
