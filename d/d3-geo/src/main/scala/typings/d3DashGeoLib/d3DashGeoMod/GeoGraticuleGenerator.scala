package typings
package d3DashGeoLib.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoGraticuleGenerator extends js.Object {
  /**
       * Returns a GeoJSON MultiLineString geometry object representing all meridians and parallels for this graticule.
       */
  def apply(): geojsonLib.geojsonMod.MultiLineString = js.native
  /**
       * Returns the current minor extent, which defaults to ⟨⟨-180°, -80° - ε⟩, ⟨180°, 80° + ε⟩⟩.
       */
  def extent(): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
       * Sets the major and minor extents of this graticule.
       *
       * @param extent Extent to use for major and minor extent of graticule.
       */
  def extent(extent: js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]): this.type = js.native
  /**
       * Returns the current major extent, which defaults to ⟨⟨-180°, -90° + ε⟩, ⟨180°, 90° - ε⟩⟩.
       */
  def extentMajor(): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
       * Sets the major extent of this graticule.
       *
       * @param extent Major extent of graticule.
       */
  def extentMajor(extent: js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]): this.type = js.native
  /**
       * Returns the current minor extent, which defaults to  ⟨⟨-180°, -80° - ε⟩, ⟨180°, 80° + ε⟩⟩.
       */
  def extentMinor(): js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]] = js.native
  /**
       * Sets the minor extent of this graticule.
       *
       * @param extent Minor extent of graticule.
       */
  def extentMinor(extent: js.Tuple2[js.Tuple2[scala.Double, scala.Double], js.Tuple2[scala.Double, scala.Double]]): this.type = js.native
  /**
       * Returns an array of GeoJSON LineString geometry objects, one for each meridian or parallel for this graticule.
       */
  def lines(): js.Array[geojsonLib.geojsonMod.LineString] = js.native
  /**
       * Returns a GeoJSON Polygon geometry object representing the outline of this graticule, i.e. along the meridians and parallels defining its extent.
       */
  def outline(): geojsonLib.geojsonMod.Polygon = js.native
  /**
       * Returns the current precision, which defaults to 2.5°.
       */
  def precision(): scala.Double = js.native
  /**
       * Sets the precision for this graticule, in degrees.
       *
       * @param angle Precision in degrees.
       */
  def precision(angle: scala.Double): this.type = js.native
  /**
       * Returns the current minor step, which defaults to ⟨10°, 10°⟩.
       */
  def step(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
       * Sets the major and minor step for this graticule
       *
       * @param step Major and minor step to use for this graticule.
       */
  def step(step: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
  /**
       * Returns the current major step, which defaults to ⟨90°, 360°⟩.
       */
  def stepMajor(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
       * Sets the major step for this graticule.
       *
       * @param step Major step.
       */
  def stepMajor(step: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
  /**
       * Returns the current major step, which defaults to ⟨10°, 10°⟩.
       */
  def stepMinor(): js.Tuple2[scala.Double, scala.Double] = js.native
  /**
       * Sets the minor step for this graticule.
       *
       * @param step Minor step.
       */
  def stepMinor(step: js.Tuple2[scala.Double, scala.Double]): this.type = js.native
}

