package typings.d3Delaunay

import typings.d3Delaunay.anon.Polygonindexnumber
import typings.d3Delaunay.mod.Delaunay.ArcContext
import typings.d3Delaunay.mod.Delaunay.Bounds
import typings.d3Delaunay.mod.Delaunay.ClosableContext
import typings.d3Delaunay.mod.Delaunay.LineContext
import typings.d3Delaunay.mod.Delaunay.MoveContext
import typings.d3Delaunay.mod.Delaunay.Polygon
import typings.d3Delaunay.mod.Delaunay.RectContext
import typings.d3Delaunay.mod.Delaunay.Triangle
import typings.std.ArrayLike
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-delaunay", "Delaunay")
  @js.native
  open class Delaunay[P] protected () extends StObject {
    /**
      * Returns the Delaunay triangulation for the given flat array [x0, y0, x1, y1, …] of points.
      */
    def this(points: ArrayLike[Double]) = this()
    
    /**
      * Returns the index of the input point that is closest to the specified point ⟨x, y⟩.
      * The search is started at the specified point i. If i is not specified, it defaults to zero.
      */
    def find(x: Double, y: Double): Double = js.native
    def find(x: Double, y: Double, i: Double): Double = js.native
    
    /**
      * The halfedge indices as an Int32Array [j0, j1, ...].
      * For each index 0 <= i < halfedges.length, there is a halfedge from triangle vertex j = halfedges[i] to triangle vertex i.
      */
    var halfedges: js.typedarray.Int32Array = js.native
    
    /**
      * An Int32Array of point indexes that form the convex hull in counterclockwise order.
      * If the points are collinear, returns them ordered.
      */
    var hull: js.typedarray.Uint32Array = js.native
    
    /**
      * Returns the closed polygon [[x0, y0], [x1, y1], ..., [x0, y0]] representing the convex hull.
      */
    def hullPolygon(): Polygon = js.native
    
    /**
      * The incoming halfedge indexes as a Int32Array [e0, e1, e2, ...].
      * For each point i, inedges[i] is the halfedge index e of an incoming halfedge.
      * For coincident points, the halfedge index is -1; for points on the convex hull, the incoming halfedge is on the convex hull; for other points, the choice of incoming halfedge is arbitrary.
      */
    var inedges: js.typedarray.Int32Array = js.native
    
    /**
      * Returns an iterable over the indexes of the neighboring points to the specified point i.
      * The iterable is empty if i is a coincident point.
      */
    def neighbors(i: Double): IterableIterator[Double] = js.native
    
    /**
      * The coordinates of the points as an array [x0, y0, x1, y1, ...].
      * Typically, this is a Float64Array, however you can use any array-like type in the constructor.
      */
    var points: ArrayLike[Double] = js.native
    
    /**
      * Renders the edges of the Delaunay triangulation to an SVG path string.
      */
    def render(): String = js.native
    /**
      * Renders the edges of the Delaunay triangulation to the specified context.
      * The specified context must implement the context.moveTo and context.lineTo methods from the CanvasPathMethods API.
      */
    def render(context: MoveContext & LineContext): Unit = js.native
    
    /**
      * Renders the convex hull of the Delaunay triangulation to an SVG path string.
      */
    def renderHull(): String = js.native
    /**
      * Renders the convex hull of the Delaunay triangulation to the specified context.
      * The specified context must implement the context.moveTo and context.lineTo methods from the CanvasPathMethods API.
      */
    def renderHull(context: MoveContext & LineContext): Unit = js.native
    
    /**
      * Renders the input points of the Delaunay triangulation to an SVG path string as circles with radius 2.
      */
    def renderPoints(): String = js.native
    /**
      * Renders the input points of the Delaunay triangulation to the specified context as circles with the specified radius.
      * If radius is not specified, it defaults to 2.
      * The specified context must implement the context.moveTo and context.arc methods from the CanvasPathMethods API.
      */
    def renderPoints(context: MoveContext & ArcContext): Unit = js.native
    def renderPoints(context: MoveContext & ArcContext, radius: Double): Unit = js.native
    /**
      * Renders the input points of the Delaunay triangulation to an SVG path string as circles with the specified radius.
      */
    def renderPoints(context: Unit, radius: Double): String = js.native
    
    /**
      * Renders triangle i of the Delaunay triangulation to an SVG path string.
      */
    def renderTriangle(i: Double): String = js.native
    /**
      * Renders triangle i of the Delaunay triangulation to the specified context.
      * The specified context must implement the context.moveTo, context.lineTo and context.closePath methods from the CanvasPathMethods API.
      */
    def renderTriangle(i: Double, context: MoveContext & LineContext & ClosableContext): Unit = js.native
    
    /**
      * Returns the closed polygon [[x0, y0], [x1, y1], [x2, y2], [x0, y0]] representing the triangle i.
      */
    def trianglePolygon(i: Double): Triangle = js.native
    
    /**
      * Returns an iterable over the polygons for each triangle, in order.
      */
    def trianglePolygons(): IterableIterator[Triangle] = js.native
    
    /**
      * The triangle vertex indices as an Uint32Array [i0, j0, k0, i1, j1, k1, ...].
      * Each contiguous triplet of indices i, j, k forms a counterclockwise triangle.
      * The coordinates of the triangle's points can be found by going through 'points'.
      */
    var triangles: js.typedarray.Uint32Array = js.native
    
    /**
      * Updates the triangulation after the points have been modified in-place.
      */
    def update(): this.type = js.native
    
    /**
      * Returns the Voronoi diagram for the associated points.
      * When rendering, the diagram will be clipped to the specified bounds = [xmin, ymin, xmax, ymax].
      * If bounds is not specified, it defaults to [0, 0, 960, 500].
      * See To Infinity and Back Again for an interactive explanation of Voronoi cell clipping.
      */
    def voronoi(): Voronoi[P] = js.native
    def voronoi(bounds: Bounds): Voronoi[P] = js.native
  }
  /* static members */
  object Delaunay {
    
    @JSImport("d3-delaunay", "Delaunay")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(points: js.Iterable[Point]): Delaunay[Point] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(points.asInstanceOf[js.Any]).asInstanceOf[Delaunay[Point]]
    /**
      * Returns the Delaunay triangulation for the given array or iterable of points where each point is an array in the form: [x, y].
      */
    inline def from(points: ArrayLike[Point]): Delaunay[Point] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(points.asInstanceOf[js.Any]).asInstanceOf[Delaunay[Point]]
    inline def from[P](
      points: js.Iterable[P],
      getX: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
      getY: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]]
    ): Delaunay[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(points.asInstanceOf[js.Any], getX.asInstanceOf[js.Any], getY.asInstanceOf[js.Any])).asInstanceOf[Delaunay[P]]
    inline def from[P](
      points: js.Iterable[P],
      getX: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
      getY: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
      that: Any
    ): Delaunay[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(points.asInstanceOf[js.Any], getX.asInstanceOf[js.Any], getY.asInstanceOf[js.Any], that.asInstanceOf[js.Any])).asInstanceOf[Delaunay[P]]
    /**
      * Returns the Delaunay triangulation for the given array or iterable of points.
      * Otherwise, the getX and getY functions are invoked for each point in order, and must return the respective x- and y-coordinate for each point.
      * If that is specified, the functions getX and getY are invoked with that as this.
      * (See Array.from for reference.)
      */
    inline def from[P](
      points: ArrayLike[P],
      getX: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
      getY: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]]
    ): Delaunay[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(points.asInstanceOf[js.Any], getX.asInstanceOf[js.Any], getY.asInstanceOf[js.Any])).asInstanceOf[Delaunay[P]]
    inline def from[P](
      points: ArrayLike[P],
      getX: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
      getY: GetCoordinate[P, ArrayLike[P] | js.Iterable[P]],
      that: Any
    ): Delaunay[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(points.asInstanceOf[js.Any], getX.asInstanceOf[js.Any], getY.asInstanceOf[js.Any], that.asInstanceOf[js.Any])).asInstanceOf[Delaunay[P]]
    
    /**
      * An interface for the arc() method of the CanvasPathMethods API.
      */
    @js.native
    trait ArcContext extends StObject {
      
      /**
        * arc() method of the CanvasPathMethods API.
        */
      def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
      def arc(
        x: Double,
        y: Double,
        radius: Double,
        startAngle: Double,
        endAngle: Double,
        counterclockwise: Boolean
      ): Unit = js.native
    }
    
    /**
      * A rectangular area [x, y, width, height].
      */
    type Bounds = js.Tuple4[Double, Double, Double, Double]
    
    /**
      * An interface for the closePath() method of the CanvasPathMethods API.
      */
    trait ClosableContext extends StObject {
      
      /**
        * closePath() method of the CanvasPathMethods API.
        */
      def closePath(): Unit
    }
    object ClosableContext {
      
      inline def apply(closePath: () => Unit): ClosableContext = {
        val __obj = js.Dynamic.literal(closePath = js.Any.fromFunction0(closePath))
        __obj.asInstanceOf[ClosableContext]
      }
      
      extension [Self <: ClosableContext](x: Self) {
        
        inline def setClosePath(value: () => Unit): Self = StObject.set(x, "closePath", js.Any.fromFunction0(value))
      }
    }
    
    /**
      * A function to extract a x- or y-coordinate from the specified point.
      */
    type GetCoordinate[P, PS] = js.Function3[/* point */ P, /* i */ Double, /* points */ PS, Double]
    
    /**
      * An interface for the lineTo() method of the CanvasPathMethods API.
      */
    trait LineContext extends StObject {
      
      /**
        * lineTo() method of the CanvasPathMethods API.
        */
      def lineTo(x: Double, y: Double): Unit
    }
    object LineContext {
      
      inline def apply(lineTo: (Double, Double) => Unit): LineContext = {
        val __obj = js.Dynamic.literal(lineTo = js.Any.fromFunction2(lineTo))
        __obj.asInstanceOf[LineContext]
      }
      
      extension [Self <: LineContext](x: Self) {
        
        inline def setLineTo(value: (Double, Double) => Unit): Self = StObject.set(x, "lineTo", js.Any.fromFunction2(value))
      }
    }
    
    /**
      * An interface for the moveTo() method of the CanvasPathMethods API.
      */
    trait MoveContext extends StObject {
      
      /**
        * moveTo() method of the CanvasPathMethods API.
        */
      def moveTo(x: Double, y: Double): Unit
    }
    object MoveContext {
      
      inline def apply(moveTo: (Double, Double) => Unit): MoveContext = {
        val __obj = js.Dynamic.literal(moveTo = js.Any.fromFunction2(moveTo))
        __obj.asInstanceOf[MoveContext]
      }
      
      extension [Self <: MoveContext](x: Self) {
        
        inline def setMoveTo(value: (Double, Double) => Unit): Self = StObject.set(x, "moveTo", js.Any.fromFunction2(value))
      }
    }
    
    /**
      * A point represented as an array tuple [x, y].
      */
    type Point = js.Tuple2[Double, Double]
    
    /**
      * A closed polygon [[x0, y0], [x1, y1], ..., [x0, y0]].
      */
    type Polygon = js.Array[Point]
    
    /**
      * An interface for the rect() method of the CanvasPathMethods API.
      */
    trait RectContext extends StObject {
      
      /**
        * rect() method of the CanvasPathMethods API.
        */
      def rect(x: Double, y: Double, width: Double, height: Double): Unit
    }
    object RectContext {
      
      inline def apply(rect: (Double, Double, Double, Double) => Unit): RectContext = {
        val __obj = js.Dynamic.literal(rect = js.Any.fromFunction4(rect))
        __obj.asInstanceOf[RectContext]
      }
      
      extension [Self <: RectContext](x: Self) {
        
        inline def setRect(value: (Double, Double, Double, Double) => Unit): Self = StObject.set(x, "rect", js.Any.fromFunction4(value))
      }
    }
    
    /**
      * A closed polygon [[x0, y0], [x1, y1], [x2, y2], [x0, y0]] representing a triangle.
      */
    type Triangle = js.Array[Point]
  }
  
  @JSImport("d3-delaunay", "Voronoi")
  @js.native
  open class Voronoi[P] () extends StObject {
    
    /**
      * Returns the convex, closed polygon [[x0, y0], [x1, y1], ..., [x0, y0]] representing the cell for the specified point i.
      */
    def cellPolygon(i: Double): Polygon = js.native
    
    /**
      * Returns an iterable over the non-empty polygons for each cell, with the cell index as property.
      */
    def cellPolygons(): IterableIterator[Polygonindexnumber] = js.native
    
    /**
      * The circumcenters of the Delaunay triangles [cx0, cy0, cx1, cy1, ...].
      * Each contiguous pair of coordinates cx, cy is the circumcenter for the corresponding triangle.
      * These circumcenters form the coordinates of the Voronoi cell polygons.
      */
    var circumcenters: js.typedarray.Float64Array = js.native
    
    /**
      * Returns true if the cell with the specified index i contains the specified point ⟨x, y⟩.
      * (This method is not affected by the associated Voronoi diagram’s viewport bounds.)
      */
    def contains(i: Double, x: Double, y: Double): Boolean = js.native
    
    /**
      * The Voronoi diagram’s associated Delaunay triangulation.
      */
    var delaunay: Delaunay[P] = js.native
    
    /**
      * Returns an iterable over the indexes of the cells that share a common edge with the specified cell i.
      * Voronoi neighbors are always neighbors on the Delaunay graph, but the converse is false when the common edge has been clipped out by the Voronoi diagram’s viewport.
      */
    def neighbors(i: Double): js.Iterable[Double] = js.native
    
    /**
      * Renders the mesh of Voronoi cells to an SVG path string.
      */
    def render(): String = js.native
    /**
      * Renders the mesh of Voronoi cells to the specified context.
      * The specified context must implement the context.moveTo and context.lineTo methods from the CanvasPathMethods API.
      */
    def render(context: MoveContext & LineContext): Unit = js.native
    
    /**
      * Renders the viewport extent to an SVG path string.
      */
    def renderBounds(): String = js.native
    /**
      * Renders the viewport extent to the specified context.
      * The specified context must implement the context.rect method from the CanvasPathMethods API.
      * Equivalent to context.rect(voronoi.xmin, voronoi.ymin, voronoi.xmax - voronoi.xmin, voronoi.ymax - voronoi.ymin).
      */
    def renderBounds(context: RectContext): Unit = js.native
    
    /**
      * Renders the cell with the specified index i to an SVG path string.
      */
    def renderCell(i: Double): String = js.native
    /**
      * Renders the cell with the specified index i to the specified context.
      * The specified context must implement the context.moveTo, context.lineTo, and context.closePath methods from the CanvasPathMethods API.
      */
    def renderCell(i: Double, context: MoveContext & LineContext & ClosableContext): Unit = js.native
    
    /**
      * Updates the Voronoi diagram and underlying triangulation after the points have been modified in-place — useful for Lloyd’s relaxation.
      */
    def update(): this.type = js.native
    
    /**
      * An array [vx0, vy0, wx0, wy0, ...] where each non-zero quadruple describes an open (infinite) cell
      * on the outer hull, giving the directions of two open half-lines.
      */
    var vectors: js.typedarray.Float64Array = js.native
    
    var xmax: Double = js.native
    
    /**
      * The bounds of the viewport [xmin, ymin, xmax, ymax] for rendering the Voronoi diagram.
      * These values only affect the rendering methods (voronoi.render, voronoi.renderBounds, cell.render).
      */
    var xmin: Double = js.native
    
    var ymax: Double = js.native
    
    var ymin: Double = js.native
  }
}
