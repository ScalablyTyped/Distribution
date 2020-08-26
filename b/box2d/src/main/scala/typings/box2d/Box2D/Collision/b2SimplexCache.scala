package typings.box2d.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2SimplexCache extends js.Object {
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
  implicit class b2SimplexCacheOps[Self <: b2SimplexCache] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexAVarargs(value: Double*): Self = this.set("indexA", js.Array(value :_*))
    @scala.inline
    def setIndexA(value: js.Array[Double]): Self = this.set("indexA", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexBVarargs(value: Double*): Self = this.set("indexB", js.Array(value :_*))
    @scala.inline
    def setIndexB(value: js.Array[Double]): Self = this.set("indexB", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetric(value: Double): Self = this.set("metric", value.asInstanceOf[js.Any])
  }
  
}

