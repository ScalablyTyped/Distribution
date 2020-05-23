package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContourLine extends Polygon {
  /** The data value associated with this contour line */
  var contourValue: Double | String = js.native
  /** The contour lines that are directly nested inside this contour line */
  var innerContourLines: js.Array[ContourLine] = js.native
  /** The outer/parent contour line of this contour */
  var outerContourLine: ContourLine = js.native
}

