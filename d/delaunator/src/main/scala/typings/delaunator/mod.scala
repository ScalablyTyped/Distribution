package typings.delaunator

import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("delaunator", JSImport.Namespace)
  @js.native
  open class ^[P] protected ()
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
    var coords: ArrayLike[Double] | js.typedarray.Float64Array = js.native
    
    /**
      * A Int32Array array of triangle half-edge indices that allows you to traverse the triangulation.
      * i-th half-edge in the array corresponds to vertex triangles[i] the half-edge is coming from.
      * halfedges[i] is the index of a twin half-edge in an adjacent triangle (or -1 for outer half-edges on the convex hull).
      *
      * The flat array-based data structures might be counterintuitive, but they're one of the key reasons this library is fast.
      */
    /* CompleteClass */
    var halfedges: js.typedarray.Int32Array = js.native
    
    /**
      * A Uint32Array array of indices that reference points on the convex hull of the input data, counter-clockwise.
      */
    /* CompleteClass */
    var hull: js.typedarray.Uint32Array = js.native
    
    /**
      * A Uint32Array array of triangle vertex indices (each group of three numbers forms a triangle).
      * All triangles are directed counterclockwise.
      */
    /* CompleteClass */
    var triangles: js.typedarray.Uint32Array = js.native
    
    /**
      * Updates the triangulation if you modified delaunay.coords values in place, avoiding expensive memory
      * allocations. Useful for iterative relaxation algorithms such as Lloyd's.
      */
    /* CompleteClass */
    override def update(): Unit = js.native
  }
  @JSImport("delaunator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Constructs a delaunay triangulation object given an array of points ([x, y] by default).
    */
  /* static member */
  inline def from(points: ArrayLike[ArrayLike[Double]]): Delaunator[ArrayLike[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(points.asInstanceOf[js.Any]).asInstanceOf[Delaunator[ArrayLike[Double]]]
  /**
    * Constructs a delaunay triangulation object given an array of custom points. Duplicate points are skipped.
    * getX and getY are optional functions for custom point formats. Duplicate points are skipped.
    */
  /* static member */
  inline def from[P](
    points: ArrayLike[P],
    getX: js.Function1[/* point */ P, Double],
    getY: js.Function1[/* point */ P, Double]
  ): Delaunator[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(points.asInstanceOf[js.Any], getX.asInstanceOf[js.Any], getY.asInstanceOf[js.Any])).asInstanceOf[Delaunator[P]]
  
  trait Delaunator[P] extends StObject {
    
    /**
      * An array of input coordinates in the form [x0, y0, x1, y1, ....], of the type provided in the constructor (or Float64Array if you used Delaunator.from).
      */
    var coords: ArrayLike[Double] | js.typedarray.Float64Array
    
    /**
      * A Int32Array array of triangle half-edge indices that allows you to traverse the triangulation.
      * i-th half-edge in the array corresponds to vertex triangles[i] the half-edge is coming from.
      * halfedges[i] is the index of a twin half-edge in an adjacent triangle (or -1 for outer half-edges on the convex hull).
      *
      * The flat array-based data structures might be counterintuitive, but they're one of the key reasons this library is fast.
      */
    var halfedges: js.typedarray.Int32Array
    
    /**
      * A Uint32Array array of indices that reference points on the convex hull of the input data, counter-clockwise.
      */
    var hull: js.typedarray.Uint32Array
    
    /**
      * A Uint32Array array of triangle vertex indices (each group of three numbers forms a triangle).
      * All triangles are directed counterclockwise.
      */
    var triangles: js.typedarray.Uint32Array
    
    /**
      * Updates the triangulation if you modified delaunay.coords values in place, avoiding expensive memory
      * allocations. Useful for iterative relaxation algorithms such as Lloyd's.
      */
    def update(): Unit
  }
  object Delaunator {
    
    inline def apply[P](
      coords: ArrayLike[Double] | js.typedarray.Float64Array,
      halfedges: js.typedarray.Int32Array,
      hull: js.typedarray.Uint32Array,
      triangles: js.typedarray.Uint32Array,
      update: () => Unit
    ): Delaunator[P] = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], halfedges = halfedges.asInstanceOf[js.Any], hull = hull.asInstanceOf[js.Any], triangles = triangles.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Delaunator[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delaunator[?], P] (val x: Self & Delaunator[P]) extends AnyVal {
      
      inline def setCoords(value: ArrayLike[Double] | js.typedarray.Float64Array): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setHalfedges(value: js.typedarray.Int32Array): Self = StObject.set(x, "halfedges", value.asInstanceOf[js.Any])
      
      inline def setHull(value: js.typedarray.Uint32Array): Self = StObject.set(x, "hull", value.asInstanceOf[js.Any])
      
      inline def setTriangles(value: js.typedarray.Uint32Array): Self = StObject.set(x, "triangles", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
