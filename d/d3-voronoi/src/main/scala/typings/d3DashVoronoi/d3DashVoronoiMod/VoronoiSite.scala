package typings.d3DashVoronoi.d3DashVoronoiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoronoiSite[T] extends VoronoiPoint {
  /**
    * The input data corresponding to this site.
    */
  var data: T = js.native
  /**
    * The Voronoi Site’s index, corresponding to the associated input point.
    */
  var index: Double = js.native
}

