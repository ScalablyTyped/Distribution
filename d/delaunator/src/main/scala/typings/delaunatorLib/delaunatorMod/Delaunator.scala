package typings
package delaunatorLib.delaunatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delaunator[P] extends js.Object {
  /**
    * An array of input coordinates in the form [x0, y0, x1, y1, ....], of the type provided in the constructor (or Float64Array if you used Delaunator.from).
    */
  var coords: stdLib.ArrayLike[scala.Double] | stdLib.Float64Array
  /**
    * A Int32Array array of triangle half-edge indices that allows you to traverse the triangulation.
    * i-th half-edge in the array corresponds to vertex triangles[i] the half-edge is coming from.
    * halfedges[i] is the index of a twin half-edge in an adjacent triangle (or -1 for outer half-edges on the convex hull).
    *
    * The flat array-based data structures might be counterintuitive, but they're one of the key reasons this library is fast.
    */
  var halfedges: stdLib.Int32Array
  /**
    * A Uint32Array array of indices that reference points on the convex hull of the input data, counter-clockwise.
    */
  var hull: stdLib.Uint32Array
  /**
    * A Uint32Array array of triangle vertex indices (each group of three numbers forms a triangle).
    * All triangles are directed counterclockwise.
    */
  var triangles: stdLib.Uint32Array
}

object Delaunator {
  @scala.inline
  def apply[P](
    coords: stdLib.ArrayLike[scala.Double] | stdLib.Float64Array,
    halfedges: stdLib.Int32Array,
    hull: stdLib.Uint32Array,
    triangles: stdLib.Uint32Array
  ): Delaunator[P] = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], halfedges = halfedges, hull = hull, triangles = triangles)
  
    __obj.asInstanceOf[Delaunator[P]]
  }
}

