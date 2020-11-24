package typings.d3Voronoi.mod

import typings.std.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VoronoiPolygon[T]
  extends Array[js.Tuple2[Double, Double]] {
  
  /**
    * The input data corresponding to this Voronoi polygon.
    */
  var data: T = js.native
}
