package typings
package d3DashDelaunayLib.d3DashDelaunayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3-delaunay", "Voronoi")
@js.native
class Voronoi[P] protected () extends js.Object {
  /**
       * Internally used to implement Delaunay#voronoi.
       */
  def this(delaunay: Delaunay[P], bounds: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Bounds) = this()
  /**
       * The circumcenters of the Delaunay triangles [cx0, cy0, cx1, cy1, ...].
       * Each contiguous pair of coordinates cx, cy is the circumcenter for the corresponding triangle.
       * These circumcenters form the coordinates of the Voronoi cell polygons.
       */
  var circumcenters: stdLib.Float64Array = js.native
  /**
       * The Voronoi diagram’s associated Delaunay triangulation.
       */
  var delaunay: Delaunay[P] = js.native
  /**
       * An array [vx0, vy0, wx0, wy0, ...] where each non-zero quadruple describes an open (infinite) cell
       * on the outer hull, giving the directions of two open half-lines.
       */
  var vectors: stdLib.Float64Array = js.native
  var xmax: scala.Double = js.native
  /**
       * The bounds of the viewport [xmin, ymin, xmax, ymax] for rendering the Voronoi diagram.
       * These values only affect the rendering methods (voronoi.render, voronoi.renderBounds, cell.render).
       */
  var xmin: scala.Double = js.native
  var ymax: scala.Double = js.native
  var ymin: scala.Double = js.native
  /**
       * Returns the convex, closed polygon [[x0, y0], [x1, y1], ..., [x0, y0]] representing the cell for the specified point i.
       */
  def cellPolygon(i: scala.Double): d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Polygon = js.native
  /**
       * Returns an iterable over the polygons for each cell, in order.
       */
  def cellPolygons(): stdLib.IterableIterator[d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.Polygon] = js.native
  /**
       * Returns true if the cell with the specified index i contains the specified point ⟨x, y⟩.
       * (This method is not affected by the associated Voronoi diagram’s viewport bounds.)
       */
  def contains(i: scala.Double, x: scala.Double, y: scala.Double): scala.Boolean = js.native
  /**
       * Renders the mesh of Voronoi cells to an SVG path string.
       */
  def render(): java.lang.String = js.native
  /**
       * Renders the mesh of Voronoi cells to the specified context.
       * The specified context must implement the context.moveTo and context.lineTo methods from the CanvasPathMethods API.
       */
  def render(
    context: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.MoveContext with d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.LineContext
  ): scala.Unit = js.native
  /**
       * Renders the viewport extent to an SVG path string.
       */
  def renderBounds(): java.lang.String = js.native
  /**
       * Renders the viewport extent to the specified context.
       * The specified context must implement the context.rect method from the CanvasPathMethods API.
       * Equivalent to context.rect(voronoi.xmin, voronoi.ymin, voronoi.xmax - voronoi.xmin, voronoi.ymax - voronoi.ymin).
       */
  def renderBounds(context: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.RectContext): scala.Unit = js.native
  /**
       * Renders the cell with the specified index i to an SVG path string.
       */
  def renderCell(i: scala.Double): java.lang.String = js.native
  /**
       * Renders the cell with the specified index i to the specified context.
       * The specified context must implement the context.moveTo, context.lineTo, and context.closePath methods from the CanvasPathMethods API.
       */
  def renderCell(
    i: scala.Double,
    context: d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.MoveContext with d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.LineContext with d3DashDelaunayLib.d3DashDelaunayMod.DelaunayNs.ClosableContext
  ): scala.Unit = js.native
}

