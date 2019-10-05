package typings.d3DashDelaunay.d3DashDelaunayMod

import typings.d3DashDelaunay.d3DashDelaunayMod.Delaunay.Bounds
import typings.d3DashDelaunay.d3DashDelaunayMod.Delaunay.ClosableContext
import typings.d3DashDelaunay.d3DashDelaunayMod.Delaunay.LineContext
import typings.d3DashDelaunay.d3DashDelaunayMod.Delaunay.MoveContext
import typings.d3DashDelaunay.d3DashDelaunayMod.Delaunay.Polygon
import typings.d3DashDelaunay.d3DashDelaunayMod.Delaunay.RectContext
import typings.std.Float64Array
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-delaunay", "Voronoi")
@js.native
class Voronoi[P] protected () extends js.Object {
  /**
    * Internally used to implement Delaunay#voronoi.
    */
  def this(delaunay: Delaunay[P], bounds: Bounds) = this()
  /**
    * The circumcenters of the Delaunay triangles [cx0, cy0, cx1, cy1, ...].
    * Each contiguous pair of coordinates cx, cy is the circumcenter for the corresponding triangle.
    * These circumcenters form the coordinates of the Voronoi cell polygons.
    */
  var circumcenters: Float64Array = js.native
  /**
    * The Voronoi diagram’s associated Delaunay triangulation.
    */
  var delaunay: Delaunay[P] = js.native
  /**
    * An array [vx0, vy0, wx0, wy0, ...] where each non-zero quadruple describes an open (infinite) cell
    * on the outer hull, giving the directions of two open half-lines.
    */
  var vectors: Float64Array = js.native
  var xmax: Double = js.native
  /**
    * The bounds of the viewport [xmin, ymin, xmax, ymax] for rendering the Voronoi diagram.
    * These values only affect the rendering methods (voronoi.render, voronoi.renderBounds, cell.render).
    */
  var xmin: Double = js.native
  var ymax: Double = js.native
  var ymin: Double = js.native
  /**
    * Returns the convex, closed polygon [[x0, y0], [x1, y1], ..., [x0, y0]] representing the cell for the specified point i.
    */
  def cellPolygon(i: Double): Polygon = js.native
  /**
    * Returns an iterable over the polygons for each cell, in order.
    */
  def cellPolygons(): IterableIterator[Polygon] = js.native
  /**
    * Returns true if the cell with the specified index i contains the specified point ⟨x, y⟩.
    * (This method is not affected by the associated Voronoi diagram’s viewport bounds.)
    */
  def contains(i: Double, x: Double, y: Double): Boolean = js.native
  /**
    * Renders the mesh of Voronoi cells to an SVG path string.
    */
  def render(): String = js.native
  /**
    * Renders the mesh of Voronoi cells to the specified context.
    * The specified context must implement the context.moveTo and context.lineTo methods from the CanvasPathMethods API.
    */
  def render(context: MoveContext with LineContext): Unit = js.native
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
  def renderCell(i: Double, context: MoveContext with LineContext with ClosableContext): Unit = js.native
}

