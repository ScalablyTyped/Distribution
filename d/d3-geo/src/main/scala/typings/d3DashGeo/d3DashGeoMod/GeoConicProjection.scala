package typings.d3DashGeo.d3DashGeoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoConicProjection extends GeoProjection {
  /**
    * Return the standard parallels for the conic projection in degrees.
    */
  def parallels(): js.Tuple2[Double, Double] = js.native
  /**
    * Set the standard parallels for the conic projection in degrees and return the projection.
    *
    * @param value A two-dimensional array representing the standard parallels in degrees.
    */
  def parallels(value: js.Tuple2[Double, Double]): this.type = js.native
}

