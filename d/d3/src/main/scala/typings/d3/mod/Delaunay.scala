package typings.d3.mod

import typings.d3Delaunay.mod.Delaunay.GetCoordinate
import typings.d3Delaunay.mod.Delaunay.Point
import typings.std.ArrayLike
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3", "Delaunay")
@js.native
class Delaunay[P] protected ()
  extends typings.d3Delaunay.mod.Delaunay[P] {
  /**
    * Returns the Delaunay triangulation for the given flat array [x0, y0, x1, y1, …] of points.
    */
  def this(points: ArrayLike[Double]) = this()
}
/* static members */
@JSImport("d3", "Delaunay")
@js.native
object Delaunay extends js.Object {
  
  /**
    * Returns the Delaunay triangulation for the given array or iterable of points where each point is an array in the form: [x, y].
    */
  def from(points: ArrayLike[Point]): typings.d3Delaunay.mod.Delaunay[Point] = js.native
  def from(points: Iterable[Point]): typings.d3Delaunay.mod.Delaunay[Point] = js.native
  /**
    * Returns the Delaunay triangulation for the given array or iterable of points.
    * Otherwise, the getX and getY functions are invoked for each point in order, and must return the respective x- and y-coordinate for each point.
    * If that is specified, the functions getX and getY are invoked with that as this.
    * (See Array.from for reference.)
    */
  def from[P](
    points: ArrayLike[P],
    getX: GetCoordinate[P, ArrayLike[P] | Iterable[P]],
    getY: GetCoordinate[P, ArrayLike[P] | Iterable[P]]
  ): typings.d3Delaunay.mod.Delaunay[P] = js.native
  def from[P](
    points: ArrayLike[P],
    getX: GetCoordinate[P, ArrayLike[P] | Iterable[P]],
    getY: GetCoordinate[P, ArrayLike[P] | Iterable[P]],
    that: js.Any
  ): typings.d3Delaunay.mod.Delaunay[P] = js.native
  def from[P](
    points: Iterable[P],
    getX: GetCoordinate[P, ArrayLike[P] | Iterable[P]],
    getY: GetCoordinate[P, ArrayLike[P] | Iterable[P]]
  ): typings.d3Delaunay.mod.Delaunay[P] = js.native
  def from[P](
    points: Iterable[P],
    getX: GetCoordinate[P, ArrayLike[P] | Iterable[P]],
    getY: GetCoordinate[P, ArrayLike[P] | Iterable[P]],
    that: js.Any
  ): typings.d3Delaunay.mod.Delaunay[P] = js.native
}
