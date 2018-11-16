package typings
package bingmapsLib.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
     * The contour layer options
     */

trait IContourLayerOptions extends js.Object {
  /** A callback function which defines the color of the contour line fill. */
  var colorCallback: js.UndefOr[
    js.Function1[/* contourValue */ scala.Double | java.lang.String, java.lang.String | Color]
  ] = js.undefined
  /** The polygon options that apply to all contour lines of this layer */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.undefined
  /** Whether the layer is visible */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** The z-index of this layer */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

