package typings.delaunator.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delaunator", JSImport.Namespace)
@js.native
class ^[P] protected () extends Delaunator[P] {
  /**
    * Constructs a delaunay triangulation object given a typed array of point coordinates of the form: [x0, y0, x1, y1, ...].
    * (use a typed array for best performance).
    */
  def this(points: ArrayLike[Double]) = this()
}

@JSImport("delaunator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Constructs a delaunay triangulation object given an array of points ([x, y] by default).
    */
  def from(points: ArrayLike[ArrayLike[Double]]): Delaunator[ArrayLike[Double]] = js.native
  /**
    * Constructs a delaunay triangulation object given an array of custom points. Duplicate points are skipped.
    * getX and getY are optional functions for custom point formats. Duplicate points are skipped.
    */
  def from[P](
    points: ArrayLike[P],
    getX: js.Function1[/* point */ P, Double],
    getY: js.Function1[/* point */ P, Double]
  ): Delaunator[P] = js.native
}

