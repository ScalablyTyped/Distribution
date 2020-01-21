package typings.d3Delaunay.mod

import typings.d3Delaunay.mod.Delaunay.ArcContext
import typings.d3Delaunay.mod.Delaunay.Bounds
import typings.d3Delaunay.mod.Delaunay.ClosableContext
import typings.d3Delaunay.mod.Delaunay.LineContext
import typings.d3Delaunay.mod.Delaunay.MoveContext
import typings.d3Delaunay.mod.Delaunay.Node
import typings.d3Delaunay.mod.Delaunay.Polygon
import typings.d3Delaunay.mod.Delaunay.Triangle
import typings.std.ArrayLike
import typings.std.Int32Array
import typings.std.IterableIterator
import typings.std.Uint32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-delaunay", "Delaunay")
@js.native
class Delaunay_[P] protected () extends js.Object {
  /**
    * Returns the Delaunay triangulation for the given flat array [x0, y0, x1, y1, …] of points.
    */
  def this(points: ArrayLike[Double]) = this()
  /**
    * The halfedge indices as an Int32Array [j0, j1, ...].
    * For each index 0 <= i < halfedges.length, there is a halfedge from triangle vertex j = halfedges[i] to triangle vertex i.
    */
  var halfedges: Int32Array = js.native
  /**
    * An arbitrary node on the convex hull.
    * The convex hull is represented as a circular doubly-linked list of nodes.
    */
  var hull: Node = js.native
  /**
    * The incoming halfedge indexes as a Int32Array [e0, e1, e2, ...].
    * For each point i, inedges[i] is the halfedge index e of an incoming halfedge.
    * For coincident points, the halfedge index is -1; for points on the convex hull, the incoming halfedge is on the convex hull; for other points, the choice of incoming halfedge is arbitrary.
    */
  var inedges: Int32Array = js.native
  /**
    * The outgoing halfedge indexes as a Int32Array [e0, e1, e2, ...].
    * For each point i on the convex hull, outedges[i] is the halfedge index e of the corresponding outgoing halfedge; for other points, the halfedge index is -1.
    */
  var outedges: Int32Array = js.native
  /**
    * The coordinates of the points as an array [x0, y0, x1, y1, ...].
    * Typically, this is a Float64Array, however you can use any array-like type in the constructor.
    */
  var points: ArrayLike[Double] = js.native
  /**
    * The triangle vertex indices as an Uint32Array [i0, j0, k0, i1, j1, k1, ...].
    * Each contiguous triplet of indices i, j, k forms a counterclockwise triangle.
    * The coordinates of the triangle's points can be found by going through 'points'.
    */
  var triangles: Uint32Array = js.native
  /**
    * Returns the index of the input point that is closest to the specified point ⟨x, y⟩.
    * The search is started at the specified point i. If i is not specified, it defaults to zero.
    */
  def find(x: Double, y: Double): Double = js.native
  def find(x: Double, y: Double, i: Double): Double = js.native
  /**
    * Returns the closed polygon [[x0, y0], [x1, y1], ..., [x0, y0]] representing the convex hull.
    */
  def hullPolygon(): Polygon = js.native
  /**
    * Returns an iterable over the indexes of the neighboring points to the specified point i.
    * The iterable is empty if i is a coincident point.
    */
  def neighbors(i: Double): IterableIterator[Double] = js.native
  /**
    * Renders the edges of the Delaunay triangulation to an SVG path string.
    */
  def render(): String = js.native
  /**
    * Renders the edges of the Delaunay triangulation to the specified context.
    * The specified context must implement the context.moveTo and context.lineTo methods from the CanvasPathMethods API.
    */
  def render(context: MoveContext with LineContext): Unit = js.native
  /**
    * Renders the convex hull of the Delaunay triangulation to an SVG path string.
    */
  def renderHull(): String = js.native
  /**
    * Renders the convex hull of the Delaunay triangulation to the specified context.
    * The specified context must implement the context.moveTo and context.lineTo methods from the CanvasPathMethods API.
    */
  def renderHull(context: MoveContext with LineContext): Unit = js.native
  /**
    * Renders the input points of the Delaunay triangulation to an SVG path string as circles with radius 2.
    */
  def renderPoints(): String = js.native
  /**
    * Renders the input points of the Delaunay triangulation to the specified context as circles with the specified radius.
    * If radius is not specified, it defaults to 2.
    * The specified context must implement the context.moveTo and context.arc methods from the CanvasPathMethods API.
    */
  def renderPoints(context: MoveContext with ArcContext): Unit = js.native
  def renderPoints(context: MoveContext with ArcContext, radius: Double): Unit = js.native
  /**
    * Renders the input points of the Delaunay triangulation to an SVG path string as circles with the specified radius.
    */
  def renderPoints(context: js.UndefOr[scala.Nothing], radius: Double): String = js.native
  /**
    * Renders triangle i of the Delaunay triangulation to an SVG path string.
    */
  def renderTriangle(i: Double): String = js.native
  /**
    * Renders triangle i of the Delaunay triangulation to the specified context.
    * The specified context must implement the context.moveTo, context.lineTo and context.closePath methods from the CanvasPathMethods API.
    */
  def renderTriangle(i: Double, context: MoveContext with LineContext with ClosableContext): Unit = js.native
  /**
    * Returns the closed polygon [[x0, y0], [x1, y1], [x2, y2], [x0, y0]] representing the triangle i.
    */
  def trianglePolygon(i: Double): Triangle = js.native
  /**
    * Returns an iterable over the polygons for each triangle, in order.
    */
  def trianglePolygons(): IterableIterator[Triangle] = js.native
  /**
    * Returns the Voronoi diagram for the associated points.
    * When rendering, the diagram will be clipped to the specified bounds = [xmin, ymin, xmax, ymax].
    * If bounds is not specified, it defaults to [0, 0, 960, 500].
    * See To Infinity and Back Again for an interactive explanation of Voronoi cell clipping.
    */
  def voronoi(): Voronoi[P] = js.native
  def voronoi(bounds: Bounds): Voronoi[P] = js.native
}

