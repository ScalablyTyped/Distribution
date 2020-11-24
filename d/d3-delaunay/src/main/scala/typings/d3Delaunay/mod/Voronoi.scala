package typings.d3Delaunay.mod

import typings.d3Delaunay.anon.Polygonindexnumber
import typings.d3Delaunay.mod.Delaunay.ClosableContext
import typings.d3Delaunay.mod.Delaunay.LineContext
import typings.d3Delaunay.mod.Delaunay.MoveContext
import typings.d3Delaunay.mod.Delaunay.Polygon
import typings.d3Delaunay.mod.Delaunay.RectContext
import typings.std.Float64Array
import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("d3-delaunay", "Voronoi")
@js.native
class Voronoi[P] () extends js.Object {
  
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
  var circumcenters: Float64Array = js.native
  
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
  def neighbors(i: Double): Iterable[Double] = js.native
  
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
  
  /**
    * Updates the Voronoi diagram and underlying triangulation after the points have been modified in-place — useful for Lloyd’s relaxation.
    */
  def update(): this.type = js.native
  
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
}
