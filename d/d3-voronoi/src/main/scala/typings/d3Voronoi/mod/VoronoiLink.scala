package typings.d3Voronoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoronoiLink[T] extends js.Object {
  /**
    * The source node, an element in data.
    */
  var source: T
  /**
    * The target node, an element in data.
    */
  var target: T
}

object VoronoiLink {
  @scala.inline
  def apply[T](source: T, target: T): VoronoiLink[T] = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiLink[T]]
  }
}

