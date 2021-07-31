package typings.delaunator

import typings.std.ArrayLike
import typings.std.Float64Array
import typings.std.Int32Array
import typings.std.Uint32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("delaunator", JSImport.Namespace)
  @js.native
  class ^[P] protected ()
    extends StObject
       with Delaunator[P] {
    /**
      * Constructs a delaunay triangulation object given a typed array of point coordinates of the form: [x0, y0, x1, y1, ...].
      * (use a typed array for best performance).
      */
    def this(points: ArrayLike[Double]) = this()
    
    /**
      * An array of input coordinates in the form [x0, y0, x1, y1, ....], of the type provided in the constructor (or Float64Array if you used Delaunator.from).
      */
    /* CompleteClass */
    var coords: ArrayLike[Double] | Float64Array = js.native
    
    /**
      * A Int32Array array of triangle half-edge indices that allows you to traverse the triangulation.
      * i-th half-edge in the array corresponds to vertex triangles[i] the half-edge is coming from.
      * halfedges[i] is the index of a twin half-edge in an adjacent triangle (or -1 for outer half-edges on the convex hull).
      *
      * The flat array-based data structures might be counterintuitive, but they're one of the key reasons this library is fast.
      */
    /* CompleteClass */
    var halfedges: Int32Array = js.native
    
    /**
      * A Uint32Array array of indices that reference points on the convex hull of the input data, counter-clockwise.
      */
    /* CompleteClass */
    var hull: Uint32Array = js.native
    
    /**
      * A Uint32Array array of triangle vertex indices (each group of three numbers forms a triangle).
      * All triangles are directed counterclockwise.
      */
    /* CompleteClass */
    var triangles: Uint32Array = js.native
  }
  @JSImport("delaunator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a delaunay triangulation object given an array of points ([x, y] by default).
    */
  /* static member */
  @scala.inline
  def from(points: ArrayLike[ArrayLike[Double]]): Delaunator[ArrayLike[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(points.asInstanceOf[js.Any]).asInstanceOf[Delaunator[ArrayLike[Double]]]
  /**
    * Constructs a delaunay triangulation object given an array of custom points. Duplicate points are skipped.
    * getX and getY are optional functions for custom point formats. Duplicate points are skipped.
    */
  /* static member */
  @scala.inline
  def from[P](
    points: ArrayLike[P],
    getX: js.Function1[/* point */ P, Double],
    getY: js.Function1[/* point */ P, Double]
  ): Delaunator[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(points.asInstanceOf[js.Any], getX.asInstanceOf[js.Any], getY.asInstanceOf[js.Any])).asInstanceOf[Delaunator[P]]
  
  trait Delaunator[P] extends StObject {
    
    /**
      * An array of input coordinates in the form [x0, y0, x1, y1, ....], of the type provided in the constructor (or Float64Array if you used Delaunator.from).
      */
    var coords: ArrayLike[Double] | Float64Array
    
    /**
      * A Int32Array array of triangle half-edge indices that allows you to traverse the triangulation.
      * i-th half-edge in the array corresponds to vertex triangles[i] the half-edge is coming from.
      * halfedges[i] is the index of a twin half-edge in an adjacent triangle (or -1 for outer half-edges on the convex hull).
      *
      * The flat array-based data structures might be counterintuitive, but they're one of the key reasons this library is fast.
      */
    var halfedges: Int32Array
    
    /**
      * A Uint32Array array of indices that reference points on the convex hull of the input data, counter-clockwise.
      */
    var hull: Uint32Array
    
    /**
      * A Uint32Array array of triangle vertex indices (each group of three numbers forms a triangle).
      * All triangles are directed counterclockwise.
      */
    var triangles: Uint32Array
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
    implicit class DelaunatorMutableBuilder[Self <: Delaunator[?], P] (val x: Self & Delaunator[P]) extends AnyVal {
      
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
