package typings
package d3DashVoronoiLib.d3DashVoronoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoronoiPolygon[T]
  extends stdLib.Array[js.Tuple2[scala.Double, scala.Double]] {
  /**
       * The input data corresponding to this Voronoi polygon.
       */
  var data: T = js.native
}

