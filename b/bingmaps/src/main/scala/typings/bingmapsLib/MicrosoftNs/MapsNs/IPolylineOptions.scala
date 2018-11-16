package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPolylineOptions extends IPrimitiveOptions {
  /** Indicates if drawn shape should be generalized based on the zoom level to improve rendering performance. Default true **/
  var generalizable: js.UndefOr[scala.Boolean] = js.undefined
  /** CSS string or Color object as the poly's color. */
  var strokeColor: js.UndefOr[java.lang.String | Color] = js.undefined
  /** An array of numbers separated by spaces, or a string separated by spaces/commas specifying the repetitive stroke pattern. */
  var strokeDashArray: js.UndefOr[js.Array[scala.Double] | java.lang.String] = js.undefined
  /** The thickness of the poly stroke. */
  var strokeThickness: js.UndefOr[scala.Double] = js.undefined
}

