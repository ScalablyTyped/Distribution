package typings.d3Voronoi

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-voronoi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def voronoi[T](): VoronoiLayout[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("voronoi")().asInstanceOf[VoronoiLayout[T]]
  
  trait VoronoiCell[T] extends StObject {
    
    /**
      * An array of indexes into diagram.edges representing the cell’s polygon.
      */
    var halfedges: js.Array[Double]
    
    /**
      * The Voronoi Site of the cell’s associated input point.
      */
    var site: VoronoiSite[T]
  }
  object VoronoiCell {
    
    @scala.inline
    def apply[T](halfedges: js.Array[Double], site: VoronoiSite[T]): VoronoiCell[T] = {
      val __obj = js.Dynamic.literal(halfedges = halfedges.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoronoiCell[T]]
    }
    
    @scala.inline
    implicit class VoronoiCellMutableBuilder[Self <: VoronoiCell[?], T] (val x: Self & VoronoiCell[T]) extends AnyVal {
      
      @scala.inline
      def setHalfedges(value: js.Array[Double]): Self = StObject.set(x, "halfedges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHalfedgesVarargs(value: Double*): Self = StObject.set(x, "halfedges", js.Array(value :_*))
      
      @scala.inline
      def setSite(value: VoronoiSite[T]): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VoronoiDiagram[T] extends StObject {
    
    /**
      * Array of Voronoi Cells, one per input point; a cell may be null for a coincident point.
      */
    var cells: js.Array[VoronoiCell[T] | Null] = js.native
    
    /**
      * Array of Voronoi Edges
      */
    var edges: js.Array[VoronoiEdge[T]] = js.native
    
    /**
      * Return the nearest Voronoi Site to point [x, y]. If radius is specified, only sites within radius distance are considered.
      * If no Voronoi Site can be found (within the specified radius), null is returned.
      *
      * @param x x-coordinate
      * @param y y-coordinate
      * @param radius Optional parameter for search radius around [x, y]
      */
    def find(x: Double, y: Double): VoronoiSite[T] | Null = js.native
    def find(x: Double, y: Double, radius: Double): VoronoiSite[T] | Null = js.native
    
    /**
      * Returns the Delaunay triangulation of the specified data array as an array of links, one for each edge in the mesh.
      * Each link has the following attributes:
      * - source (the source node, an element in data)
      * - target (the target node, an element in data)
      *
      * Since the triangulation is computed as the dual of the Voronoi diagram, and the Voronoi diagram is clipped by the extent, a subset of the Delaunay links is returned.
      */
    def links(): js.Array[VoronoiLink[T]] = js.native
    
    /**
      * Return an array of polygons clipped to the extent, one for each cell in the diagram.
      * Each polygon is represented as an array of points [x, y] where x and y are the point coordinates,
      * and a data field that refers to the corresponding element in data.
      * Polygons are open: they do not contain a closing point that duplicates the first point;
      * a triangle, for example, is an array of three points. Polygons are also counterclockwise,
      * assuming the origin ⟨0,0⟩ is in the top-left corner.
      *
      * If the cell’s site is coincident with an earlier site, the associated polygon is null.
      */
    def polygons(): js.Array[VoronoiPolygon[T]] = js.native
    
    /**
      * Returns the Delaunay triangulation of the specified data array as an array of triangles.
      * Each triangle is a three-element array of elements from data.
      * Since the triangulation is computed as the dual of the Voronoi diagram, and the Voronoi diagram is clipped by the extent,
      * a subset of the Delaunay triangulation is returned.
      */
    def triangles(): js.Array[VoronoiTriangle[T]] = js.native
  }
  
  @js.native
  trait VoronoiEdge[T]
    extends StObject
       with VoronoiPointPair {
    
    /**
      * The Voronoi site on the left side of the edge.
      */
    var left: VoronoiSite[T] = js.native
    
    /**
      * The Voronoi site on the right side of the edge; `null` for a clipped border edge.
      */
    var right: VoronoiSite[T] | Null = js.native
  }
  
  @js.native
  trait VoronoiLayout[T] extends StObject {
    
    /**
      * Computes the Voronoi diagram for the specified data points.
      * @param data Array of data elements
      */
    def apply(data: js.Array[T]): VoronoiDiagram[T] = js.native
    
    /**
      * Returns the current clip extent which defaults to null.
      *
      * The extent bounds are specified as an array [[x0, y0], [x1, y1]],
      * where x0 is the left side of the extent, y0 is the top,
      * x1 is the right and y1 is the bottom.
      *
      * A clip extent is required when using voronoi.polygons.
      *
      */
    def extent(): (js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]) | Null = js.native
    /**
      * Set the clip extent of the Voronoi layout to the specified bounds and return the layout.
      *
      * A clip extent is required when using voronoi.polygons.
      *
      * @param extent The extent bounds are specified as an array [[x0, y0], [x1, y1]],
      * where x0 is the left side of the extent, y0 is the top, x1 is the right and y1 is the bottom.
      */
    def extent(extent: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): this.type = js.native
    
    /**
      * Return the Delaunay triangulation of the specified data array as an array of links.
      * Each link has source and target attributes referring to elements in data.
      *
      * @param data Array of data points.
      */
    def links(data: js.Array[T]): js.Array[VoronoiLink[T]] = js.native
    
    /**
      * Return an array of polygons clipped to the extent, one for each input point in the specified data points,
      * corresponding to the cells in the computed Voronoi diagram.
      *
      * Each polygon is represented as an array of points [x, y] where x and y are the point coordinates,
      * and a data field that refers to the corresponding element in data.
      * Polygons are open: they do not contain a closing point that duplicates the first point;
      * a triangle, for example, is an array of three points. Polygons are also counterclockwise,
      * assuming the origin ⟨0,0⟩ is in the top-left corner.
      *
      * If the cell’s site is coincident with an earlier site, the associated polygon is null.
      *
      * Important: Using polygon requires the extent to be set for the layout.
      *
      * @param data Array of data points.
      */
    def polygons(data: js.Array[T]): js.Array[VoronoiPolygon[T]] = js.native
    
    /**
      * Get the clip size of the Voronoi layout. Size is an alias for voronoi.extent
      * where the minimum x and y of the extent are ⟨0,0⟩.
      */
    def size(): (js.Tuple2[Double, Double]) | Null = js.native
    /**
      * Set the clip size and return the layout.
      *
      * Size is an alias for voronoi.extent where the minimum x and y of the extent are ⟨0,0⟩.
      *
      * @param size An array representing the x- and y-size of the clip extent,
      * where the minimum x and y of the extent are ⟨0,0⟩.
      */
    def size(size: js.Tuple2[Double, Double]): this.type = js.native
    
    /**
      * Return the Delaunay triangulation of the specified data array as an array of triangles.
      * Each triangle is a three-element array of elements from data.
      *
      * @param data Array of data points.
      */
    def triangles(data: js.Array[T]): js.Array[VoronoiTriangle[T]] = js.native
    
    /**
      * Return the current x-coordinate accessor,
      * which defaults to accessing the first element of an array (i.e. at index 0).
      */
    def x(): js.Function1[/* d */ T, Double] = js.native
    /**
      * Set the x-coordinate accessor and return the layout.
      *
      * @param x An accessor function which takes a data element as input and return a
      * numeric value for the x-coordinate.
      */
    def x(x: js.Function1[/* d */ T, Double]): this.type = js.native
    
    /**
      * Return the current y-coordinate accessor,
      * which defaults to accessing the second element of an array (i.e. at index 1).
      */
    def y(): js.Function1[/* d */ T, Double] = js.native
    /**
      * Set the y-coordinate accessor and return the layout.
      *
      * @param y An accessor function which takes a data element as input and return a
      * numeric value for the y-coordinate.
      */
    def y(y: js.Function1[/* d */ T, Double]): this.type = js.native
  }
  
  trait VoronoiLink[T] extends StObject {
    
    /**
      * The source node, an element in data.
      */
    var source: T
    
    /**
      * The target node, an element in data.
      */
    var target: T
  }
  object VoronoiLink {
    
    @scala.inline
    def apply[T](source: T, target: T): VoronoiLink[T] = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[VoronoiLink[T]]
    }
    
    @scala.inline
    implicit class VoronoiLinkMutableBuilder[Self <: VoronoiLink[?], T] (val x: Self & VoronoiLink[T]) extends AnyVal {
      
      @scala.inline
      def setSource(value: T): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VoronoiPoint
    extends StObject
       with Array[Double] {
    
    var `0`: Double = js.native
    
    var `1`: Double = js.native
  }
  
  @js.native
  trait VoronoiPointPair
    extends StObject
       with Array[js.Tuple2[Double, Double]] {
    
    var `0`: js.Tuple2[Double, Double] = js.native
    
    var `1`: js.Tuple2[Double, Double] = js.native
  }
  
  @js.native
  trait VoronoiPolygon[T]
    extends StObject
       with Array[js.Tuple2[Double, Double]] {
    
    /**
      * The input data corresponding to this Voronoi polygon.
      */
    var data: T = js.native
  }
  
  @js.native
  trait VoronoiSite[T]
    extends StObject
       with VoronoiPoint {
    
    /**
      * The input data corresponding to this site.
      */
    var data: T = js.native
    
    /**
      * The Voronoi Site’s index, corresponding to the associated input point.
      */
    var index: Double = js.native
  }
  
  type VoronoiTriangle[T] = js.Tuple3[T, T, T]
}
