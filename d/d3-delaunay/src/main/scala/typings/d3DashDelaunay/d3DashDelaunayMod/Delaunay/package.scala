package typings.d3DashDelaunay.d3DashDelaunayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Delaunay {
  /**
    * A rectangular area [x, y, width, height].
    */
  type Bounds = js.Array[Double]
  /**
    * A function to extract a x- or y-coordinate from the specified point.
    */
  type GetCoordinate[P, PS] = js.Function3[/* point */ P, /* i */ Double, /* points */ PS, Double]
  /**
    * A point represented as an array tuple [x, y].
    */
  type Point = js.Array[Double]
  /**
    * A closed polygon [[x0, y0], [x1, y1], ..., [x0, y0]].
    */
  type Polygon = js.Array[Point]
  /**
    * A closed polygon [[x0, y0], [x1, y1], [x2, y2], [x0, y0]] representing a triangle.
    */
  type Triangle = js.Array[Point]
}
