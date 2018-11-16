package typings
package d3DashHexbinLib.d3DashHexbinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hexbin[T] extends js.Object {
  /**
       * Bins the specified array of points, returning an array of hexagonal bins.
       * For each point in the specified points array, the x- and y-accessors are
       * invoked to compute the x- and y-coordinates of the point, which is then
       * used to assign the point to a hexagonal bin.
       * If either the x- or y-coordinate is NaN, the point is ignored and will
       * not be in any of the returned bins.
       */
  def apply(points: js.Array[T]): js.Array[HexbinBin[T]] = js.native
  /**
       * Returns an array of [x, y] points representing the centers of every
       * hexagon in the extent.
       */
  def centers(): js.Array[js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
       * Returns the generator’s current extent `[[x0, y0], [x1, y1]]`,
       * where `x0` and `y0` are the lower bounds and `x1` and `y1` are the upper bounds.
       *
       * The extent defaults to `[[0, 0], [1, 1]]`.
       */
  def extent(): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
       * Sets the hexbin generator’s extent to the specified bounds
       * `[[x0, y0], [x1, y1]]` and returns the hexbin generator.
       */
  def extent(extent: js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]): this.type = js.native
  /**
       * Returns the SVG path string for the hexagon centered at the origin ⟨0,0⟩.
       * The path string is defined with relative coordinates such that you can
       * easily translate the hexagon to the desired position.
       * If radius is not specified, the hexbin’s current radius is used.
       * If radius is specified, a hexagon with the specified radius is returned;
       * this is useful for area-encoded bivariate hexbins.
       *
       * @param radius Radius number
       */
  def hexagon(): java.lang.String = js.native
  /**
       * Returns the SVG path string for the hexagon centered at the origin ⟨0,0⟩.
       * The path string is defined with relative coordinates such that you can
       * easily translate the hexagon to the desired position.
       * If radius is not specified, the hexbin’s current radius is used.
       * If radius is specified, a hexagon with the specified radius is returned;
       * this is useful for area-encoded bivariate hexbins.
       *
       * @param radius Radius number
       */
  def hexagon(radius: scala.Double): java.lang.String = js.native
  /**
       * Returns an SVG path string representing the hexagonal mesh that covers
       * the extent; the returned path is intended to be stroked.
       * The mesh may extend slightly beyond the extent and may need to be clipped.
       */
  def mesh(): java.lang.String = js.native
  /**
       * Returns the current radius, which defaults to 1.
       *
       * The hexagons are pointy-topped (rather than flat-topped);
       * the width of each hexagon is radius × 2 × sin(π / 3)
       * and the height of each hexagon radius × 3 / 2.
       */
  def radius(): scala.Double = js.native
  /**
       * Sets the radius of the hexagon to the specified number.
       *
       * The hexagons are pointy-topped (rather than flat-topped);
       * the width of each hexagon is radius × 2 × sin(π / 3)
       * and the height of each hexagon radius × 3 / 2.
       */
  def radius(radius: scala.Double): this.type = js.native
  /**
       * Returns the generator’s current size `[x1 - x0, y1 - y0]`,
       * where `x0` and `y0` are the lower bounds and `x1` and `y1` are the upper bounds.
       *
       * The size defaults to [1, 1].
       */
  def size(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
       * Sets the extent to the specified bounds `[[0, 0], [dx, dy]]` and returns the hexbin generator.
       *
       * This is a convenience method for setting the extent.
       */
  def size(size: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
  /**
       * Returns the current x-coordinate accessor, which defaults to: `x(d) => d[0]`.
       *
       * The x-coordinate accessor is used by hexbin to compute the x-coordinate
       * of each point. The default value assumes each point is specified as
       * a two-element array of numbers [x, y].
       */
  def x(): js.Function1[/* d */ T, scala.Double] = js.native
  /**
       * Sets the x-coordinate accessor to the specified function and returns this hexbin generator.
       *
       * The x-coordinate accessor is used by hexbin to compute the x-coordinate
       * of each point. The default value assumes each point is specified as
       * a two-element array of numbers [x, y].
       */
  def x(x: js.Function1[/* d */ T, scala.Double]): this.type = js.native
  /**
       * Returns the current y-coordinate accessor, which defaults to: `y(d) => d[1]`.
       *
       * The y-coordinate accessor is used by hexbin to compute the y-coordinate
       * of each point. The default value assumes each point is specified as
       * a two-element array of numbers [x, y].
       */
  def y(): js.Function1[/* d */ T, scala.Double] = js.native
  /**
       * Sets the y-coordinate accessor to the specified function and returns this hexbin generator.
       *
       * The y-coordinate accessor is used by hexbin to compute the y-coordinate
       * of each point. The default value assumes each point is specified as
       * a two-element array of numbers [x, y].
       */
  def y(y: js.Function1[/* d */ T, scala.Double]): this.type = js.native
}

