package typings.delaunator

import typings.std.ArrayLike
import typings.std.Float64Array
import typings.std.Int32Array
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("delaunator", JSImport.Namespace)
  @js.native
  class ^[P] protected () extends Delaunator[P] {
    /**
      * Constructs a delaunay triangulation object given a typed array of point coordinates of the form: [x0, y0, x1, y1, ...].
      * (use a typed array for best performance).
      */
    def this(points: ArrayLike[Double]) = this()
  }
  
  /**
    * Constructs a delaunay triangulation object given an array of points ([x, y] by default).
    */
  /* static member */
  @JSImport("delaunator", "from")
  @js.native
  def from(points: ArrayLike[ArrayLike[Double]]): Delaunator[ArrayLike[Double]] = js.native
  /**
    * Constructs a delaunay triangulation object given an array of custom points. Duplicate points are skipped.
    * getX and getY are optional functions for custom point formats. Duplicate points are skipped.
    */
  /* static member */
  @JSImport("delaunator", "from")
  @js.native
  def from[P](
    points: ArrayLike[P],
    getX: js.Function1[/* point */ P, Double],
    getY: js.Function1[/* point */ P, Double]
  ): Delaunator[P] = js.native
  
  @js.native
  trait Delaunator[P] extends StObject {
    
    /**
      * An array of input coordinates in the form [x0, y0, x1, y1, ....], of the type provided in the constructor (or Float64Array if you used Delaunator.from).
      */
    var coords: ArrayLike[Double] | Float64Array = js.native
    
    /**
      * A Int32Array array of triangle half-edge indices that allows you to traverse the triangulation.
      * i-th half-edge in the array corresponds to vertex triangles[i] the half-edge is coming from.
      * halfedges[i] is the index of a twin half-edge in an adjacent triangle (or -1 for outer half-edges on the convex hull).
      *
      * The flat array-based data structures might be counterintuitive, but they're one of the key reasons this library is fast.
      */
    var halfedges: Int32Array = js.native
    
    /**
      * A Uint32Array array of indices that reference points on the convex hull of the input data, counter-clockwise.
      */
    var hull: Uint32Array = js.native
    
    /**
      * A Uint32Array array of triangle vertex indices (each group of three numbers forms a triangle).
      * All triangles are directed counterclockwise.
      */
    var triangles: Uint32Array = js.native
  }
  object Delaunator {
    
    @scala.inline
    def apply[P](
      coords: ArrayLike[Double] | Float64Array,
      halfedges: Int32Array,
      hull: Uint32Array,
      triangles: Uint32Array
    ): Delaunator[P] = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], halfedges = halfedges.asInstanceOf[js.Any], hull = hull.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delaunator[P]]
    }
    
    @scala.inline
    implicit class DelaunatorMutableBuilder[Self <: Delaunator[_], P] (val x: Self with Delaunator[P]) extends AnyVal {
      
      @scala.inline
      def setCoords(value: ArrayLike[Double] | Float64Array): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfedges(value: Int32Array): Self = StObject.set(x, "halfedges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHull(value: Uint32Array): Self = StObject.set(x, "hull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriangles(value: Uint32Array): Self = StObject.set(x, "triangles", value.asInstanceOf[js.Any])
    }
  }
}
