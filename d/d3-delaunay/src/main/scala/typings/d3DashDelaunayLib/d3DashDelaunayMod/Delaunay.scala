package typings
package d3DashDelaunayLib.d3DashDelaunayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-delaunay", "Delaunay")
@js.native
class Delaunay[P] protected () extends js.Object {
  /**
    * Returns the Delaunay triangulation for the given flat array [x0, y0, x1, y1, …] of points.
    */
  def this(points: stdLib.ArrayLike[scala.Double]) = this()
  /**
    * The halfedge indices as an Int32Array [j0, j1, ...].
    * For each index 0 <= i < halfedges.length, there is a halfedge from triangle vertex j = halfedges[i] to triangle vertex i.
    */
  var halfedges: stdLib.Int32Array = js.native
  /**
    * An arbitrary node on the convex hull.
    * The convex hull is represented as a circular doubly-linked list of nodes.
    */
  var hull: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Node = js.native
  /**
    * The incoming halfedge indexes as a Int32Array [e0, e1, e2, ...].
    * For each point i, inedges[i] is the halfedge index e of an incoming halfedge.
    * For coincident points, the halfedge index is -1; for points on the convex hull, the incoming halfedge is on the convex hull; for other points, the choice of incoming halfedge is arbitrary.
    */
  var inedges: stdLib.Int32Array = js.native
  /**
    * The outgoing halfedge indexes as a Int32Array [e0, e1, e2, ...].
    * For each point i on the convex hull, outedges[i] is the halfedge index e of the corresponding outgoing halfedge; for other points, the halfedge index is -1.
    */
  var outedges: stdLib.Int32Array = js.native
  /**
    * The coordinates of the points as an array [x0, y0, x1, y1, ...].
    * Typically, this is a Float64Array, however you can use any array-like type in the constructor.
    */
  var points: stdLib.ArrayLike[scala.Double] = js.native
  /**
    * The triangle vertex indices as an Uint32Array [i0, j0, k0, i1, j1, k1, ...].
    * Each contiguous triplet of indices i, j, k forms a counterclockwise triangle.
    * The coordinates of the triangle's points can be found by going through 'points'.
    */
  var triangles: stdLib.Uint32Array = js.native
  /**
    * Returns the index of the input point that is closest to the specified point ⟨x, y⟩.
    * The search is started at the specified point i. If i is not specified, it defaults to zero.
    */
  def find(x: scala.Double, y: scala.Double): scala.Double = js.native
  def find(x: scala.Double, y: scala.Double, i: scala.Double): scala.Double = js.native
  /**
    * Returns the closed polygon [[x0, y0], [x1, y1], ..., [x0, y0]] representing the convex hull.
    */
  def hullPolygon(): d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Polygon = js.native
  /**
    * Returns an iterable over the indexes of the neighboring points to the specified point i.
    * The iterable is empty if i is a coincident point.
    */
  def neighbors(i: scala.Double): stdLib.IterableIterator[scala.Double] = js.native
  /**
    * Renders the edges of the Delaunay triangulation to an SVG path string.
    */
  def render(): java.lang.String = js.native
  /**
    * Renders the edges of the Delaunay triangulation to the specified context.
    * The specified context must implement the context.moveTo and context.lineTo methods from the CanvasPathMethods API.
    */
  def render(
    context: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.MoveContext with d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.LineContext
  ): scala.Unit = js.native
  /**
    * Renders the convex hull of the Delaunay triangulation to an SVG path string.
    */
  def renderHull(): java.lang.String = js.native
  /**
    * Renders the convex hull of the Delaunay triangulation to the specified context.
    * The specified context must implement the context.moveTo and context.lineTo methods from the CanvasPathMethods API.
    */
  def renderHull(
    context: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.MoveContext with d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.LineContext
  ): scala.Unit = js.native
  /**
    * Renders the input points of the Delaunay triangulation to an SVG path string as circles with radius 2.
    */
  def renderPoints(): java.lang.String = js.native
  /**
    * Renders the input points of the Delaunay triangulation to the specified context as circles with the specified radius.
    * If radius is not specified, it defaults to 2.
    * The specified context must implement the context.moveTo and context.arc methods from the CanvasPathMethods API.
    */
  def renderPoints(
    context: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.MoveContext with d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.ArcContext
  ): scala.Unit = js.native
  def renderPoints(
    context: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.MoveContext with d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.ArcContext,
    radius: scala.Double
  ): scala.Unit = js.native
  /**
    * Renders the input points of the Delaunay triangulation to an SVG path string as circles with the specified radius.
    */
  def renderPoints(context: js.UndefOr[scala.Nothing], radius: scala.Double): java.lang.String = js.native
  /**
    * Renders triangle i of the Delaunay triangulation to an SVG path string.
    */
  def renderTriangle(i: scala.Double): java.lang.String = js.native
  /**
    * Renders triangle i of the Delaunay triangulation to the specified context.
    * The specified context must implement the context.moveTo, context.lineTo and context.closePath methods from the CanvasPathMethods API.
    */
  def renderTriangle(
    i: scala.Double,
    context: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.MoveContext with d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.LineContext with d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.ClosableContext
  ): scala.Unit = js.native
  /**
    * Returns the closed polygon [[x0, y0], [x1, y1], [x2, y2], [x0, y0]] representing the triangle i.
    */
  def trianglePolygon(i: scala.Double): d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Triangle = js.native
  /**
    * Returns an iterable over the polygons for each triangle, in order.
    */
  def trianglePolygons(): stdLib.IterableIterator[d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Triangle] = js.native
  /**
    * Returns the Voronoi diagram for the associated points.
    * When rendering, the diagram will be clipped to the specified bounds = [xmin, ymin, xmax, ymax].
    * If bounds is not specified, it defaults to [0, 0, 960, 500].
    * See To Infinity and Back Again for an interactive explanation of Voronoi cell clipping.
    */
  def voronoi(): Voronoi[P] = js.native
  def voronoi(bounds: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Bounds): Voronoi[P] = js.native
}

/* static members */
@JSImport("d3-delaunay", "Delaunay")
@js.native
object Delaunay extends js.Object {
  /**
    * Returns the Delaunay triangulation for the given array or iterable of points where each point is an array in the form: [x, y].
    */
  def from(points: stdLib.ArrayLike[d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Point]): d3DashDelaunayLib.d3DashDelaunayMod.Delaunay[d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Point] = js.native
  def from(points: stdLib.Iterable[d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Point]): d3DashDelaunayLib.d3DashDelaunayMod.Delaunay[d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Point] = js.native
  /**
    * Returns the Delaunay triangulation for the given array or iterable of points.
    * Otherwise, the getX and getY functions are invoked for each point in order, and must return the respective x- and y-coordinate for each point.
    * If that is specified, the functions getX and getY are invoked with that as this.
    * (See Array.from for reference.)
    */
  def from[P](
    points: stdLib.ArrayLike[P],
    getX: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.GetCoordinate[P, stdLib.ArrayLike[P] | stdLib.Iterable[P]],
    getY: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.GetCoordinate[P, stdLib.ArrayLike[P] | stdLib.Iterable[P]]
  ): d3DashDelaunayLib.d3DashDelaunayMod.Delaunay[P] = js.native
  def from[P](
    points: stdLib.ArrayLike[P],
    getX: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.GetCoordinate[P, stdLib.ArrayLike[P] | stdLib.Iterable[P]],
    getY: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.GetCoordinate[P, stdLib.ArrayLike[P] | stdLib.Iterable[P]],
    that: js.Any
  ): d3DashDelaunayLib.d3DashDelaunayMod.Delaunay[P] = js.native
  def from[P](
    points: stdLib.Iterable[P],
    getX: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.GetCoordinate[P, stdLib.ArrayLike[P] | stdLib.Iterable[P]],
    getY: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.GetCoordinate[P, stdLib.ArrayLike[P] | stdLib.Iterable[P]]
  ): d3DashDelaunayLib.d3DashDelaunayMod.Delaunay[P] = js.native
  def from[P](
    points: stdLib.Iterable[P],
    getX: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.GetCoordinate[P, stdLib.ArrayLike[P] | stdLib.Iterable[P]],
    getY: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.GetCoordinate[P, stdLib.ArrayLike[P] | stdLib.Iterable[P]],
    that: js.Any
  ): d3DashDelaunayLib.d3DashDelaunayMod.Delaunay[P] = js.native
}

