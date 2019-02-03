package typings
package delaunatorLib.delaunatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("delaunator", JSImport.Namespace)
@js.native
class namespaced[P] protected () extends Delaunator[P] {
  /**
    * Constructs a delaunay triangulation object given a typed array of point coordinates of the form: [x0, y0, x1, y1, ...].
    */
  def this(points: stdLib.ArrayLike[scala.Double]) = this()
  /**
    * A flat Int32Array array of triangle half-edge indices that allows you to traverse the triangulation.
    * i-th half-edge in the array corresponds to vertex triangles[i] the half-edge is coming from.
    * halfedges[i] is the index of a twin half-edge in an adjacent triangle (or -1 for outer half-edges on the convex hull).
    *
    * The flat array-based data structures might be counterintuitive, but they're one of the key reasons this library is fast.
    */
  /* CompleteClass */
  override var halfedges: stdLib.Int32Array = js.native
  /**
    * A circular doubly-linked list that holds a convex hull of the delaunay triangulation.
    */
  /* CompleteClass */
  override var hull: delaunatorLib.delaunatorMod.DelaunatorNs.Node = js.native
  /**
    * A flat Uint32Array array of triangle vertex indices (each group of three numbers forms a triangle). All triangles are directed counterclockwise.
    */
  /* CompleteClass */
  override var triangles: stdLib.Uint32Array = js.native
}

/* static members */
@JSImport("delaunator", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
    * Constructs a delaunay triangulation object given an array of points (e.g. [x, y]). Duplicate points are skipped.
    */
  def from(points: stdLib.ArrayLike[stdLib.ArrayLike[scala.Double]]): delaunatorLib.delaunatorMod.Delaunator[stdLib.ArrayLike[scala.Double]] = js.native
  /**
    * Constructs a delaunay triangulation object given an array of custom points. Duplicate points are skipped.
    */
  def from[P](
    points: stdLib.ArrayLike[P],
    getX: js.Function1[/* point */ P, scala.Double],
    getY: js.Function1[/* point */ P, scala.Double]
  ): delaunatorLib.delaunatorMod.Delaunator[P] = js.native
}

