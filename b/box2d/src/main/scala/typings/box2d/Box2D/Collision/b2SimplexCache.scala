package typings.box2d.Box2D.Collision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait b2SimplexCache extends js.Object {
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
  @scala.inline
  def apply(count: Double, indexA: js.Array[Double], indexB: js.Array[Double], metric: Double): b2SimplexCache = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], indexA = indexA.asInstanceOf[js.Any], indexB = indexB.asInstanceOf[js.Any], metric = metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2SimplexCache]
  }
}

