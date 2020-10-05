package typings.d3Voronoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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

