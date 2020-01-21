package typings.d3Voronoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoronoiLayout[T] extends js.Object {
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

