package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPolylineOptions extends IPrimitiveOptions {
  /** Indicates if drawn shape should be generalized based on the zoom level to improve rendering performance. Default true **/
  var generalizable: js.UndefOr[Boolean] = js.undefined
  /** CSS string or Color object as the poly's color. */
  var strokeColor: js.UndefOr[String | Color] = js.undefined
  /** An array of numbers separated by spaces, or a string separated by spaces/commas specifying the repetitive stroke pattern. */
  var strokeDashArray: js.UndefOr[js.Array[Double] | String] = js.undefined
  /** The thickness of the poly stroke. */
  var strokeThickness: js.UndefOr[Double] = js.undefined
}

object IPolylineOptions {
  @scala.inline
  def apply(
    cursor: String = null,
    generalizable: js.UndefOr[Boolean] = js.undefined,
    strokeColor: String | Color = null,
    strokeDashArray: js.Array[Double] | String = null,
    strokeThickness: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): IPolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(generalizable)) __obj.updateDynamic("generalizable")(generalizable)
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeDashArray != null) __obj.updateDynamic("strokeDashArray")(strokeDashArray.asInstanceOf[js.Any])
    if (strokeThickness != null) __obj.updateDynamic("strokeThickness")(strokeThickness.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[IPolylineOptions]
  }
}

