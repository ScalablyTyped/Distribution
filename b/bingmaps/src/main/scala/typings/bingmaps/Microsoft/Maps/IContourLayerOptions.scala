package typings.bingmaps.Microsoft.Maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** 
  * The contour layer options
  */
trait IContourLayerOptions extends js.Object {
  /** A callback function which defines the color of the contour line fill. */
  var colorCallback: js.UndefOr[js.Function1[/* contourValue */ Double | String, String | Color]] = js.undefined
  /** The polygon options that apply to all contour lines of this layer */
  var polygonOptions: js.UndefOr[IPolygonOptions] = js.undefined
  /** Whether the layer is visible */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** The z-index of this layer */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object IContourLayerOptions {
  @scala.inline
  def apply(
    colorCallback: /* contourValue */ Double | String => String | Color = null,
    polygonOptions: IPolygonOptions = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: js.UndefOr[Double] = js.undefined
  ): IContourLayerOptions = {
    val __obj = js.Dynamic.literal()
    if (colorCallback != null) __obj.updateDynamic("colorCallback")(js.Any.fromFunction1(colorCallback))
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndex)) __obj.updateDynamic("zIndex")(zIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContourLayerOptions]
  }
}

