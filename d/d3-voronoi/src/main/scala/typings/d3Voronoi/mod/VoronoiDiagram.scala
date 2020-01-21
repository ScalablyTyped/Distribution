package typings.d3Voronoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoronoiDiagram[T] extends js.Object {
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

