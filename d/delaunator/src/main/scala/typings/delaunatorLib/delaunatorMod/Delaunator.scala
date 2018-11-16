package typings
package delaunatorLib.delaunatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Delaunator[P] extends js.Object {
  /**
       * A flat Int32Array array of triangle half-edge indices that allows you to traverse the triangulation.
       * i-th half-edge in the array corresponds to vertex triangles[i] the half-edge is coming from.
       * halfedges[i] is the index of a twin half-edge in an adjacent triangle (or -1 for outer half-edges on the convex hull).
       *
       * The flat array-based data structures might be counterintuitive, but they're one of the key reasons this library is fast.
       */
  var halfedges: stdLib.Int32Array
  /**
       * A circular doubly-linked list that holds a convex hull of the delaunay triangulation.
       */
  var hull: delaunatorLib.delaunatorMod.DelaunatorNs.Node
  /**
       * A flat Uint32Array array of triangle vertex indices (each group of three numbers forms a triangle). All triangles are directed counterclockwise.
       */
  var triangles: stdLib.Uint32Array
}

