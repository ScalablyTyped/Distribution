package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.Maps.ContourLine")
@js.native
class ContourLine protected () extends Polygon {
  /**
    * @constructor
    * @param boundary The boundary of this contour line
    * @param contourValue The value associated with this contour line
    */
  def this(boundary: js.Array[Location]) = this()
  def this(boundary: js.Array[Location], contourValue: java.lang.String) = this()
  def this(boundary: js.Array[Location], contourValue: scala.Double) = this()
  /** The data value associated with this contour line */
  var contourValue: scala.Double | java.lang.String = js.native
  /** The contour lines that are directly nested inside this contour line */
  var innerContourLines: js.Array[ContourLine] = js.native
  /** The outer/parent contour line of this contour */
  var outerContourLine: ContourLine = js.native
}

