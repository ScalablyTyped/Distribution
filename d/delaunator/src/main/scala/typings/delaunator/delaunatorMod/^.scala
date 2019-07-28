package typings.delaunator.delaunatorMod

import typings.std.ArrayLike
import typings.std.Float64Array
import typings.std.Int32Array
import typings.std.Uint32Array
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
  /**
    * An array of input coordinates in the form [x0, y0, x1, y1, ....], of the type provided in the constructor (or Float64Array if you used Delaunator.from).
    */
  /* CompleteClass */
  override var coords: ArrayLike[Double] | Float64Array = js.native
  /**
    * A Int32Array array of triangle half-edge indices that allows you to traverse the triangulation.
    * i-th half-edge in the array corresponds to vertex triangles[i] the half-edge is coming from.
    * halfedges[i] is the index of a twin half-edge in an adjacent triangle (or -1 for outer half-edges on the convex hull).
    *
    * The flat array-based data structures might be counterintuitive, but they're one of the key reasons this library is fast.
    */
  /* CompleteClass */
  override var halfedges: Int32Array = js.native
  /**
    * A Uint32Array array of indices that reference points on the convex hull of the input data, counter-clockwise.
    */
  /* CompleteClass */
  override var hull: Uint32Array = js.native
  /**
    * A Uint32Array array of triangle vertex indices (each group of three numbers forms a triangle).
    * All triangles are directed counterclockwise.
    */
  /* CompleteClass */
  override var triangles: Uint32Array = js.native
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

