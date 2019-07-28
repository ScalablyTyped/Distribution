package typings.bingmaps.MicrosoftNs.MapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingsStyle extends js.Object {
  /** A hex color value that all land is first flushed to before things are drawn on it. */
  var landColor: js.UndefOr[String] = js.undefined
  /** Specifies whether or not to draw elevation shading on the map. */
  var shadedReliefVisible: js.UndefOr[Boolean] = js.undefined
}

object ISettingsStyle {
  @scala.inline
  def apply(landColor: String = null, shadedReliefVisible: js.UndefOr[Boolean] = js.undefined): ISettingsStyle = {
    val __obj = js.Dynamic.literal()
    if (landColor != null) __obj.updateDynamic("landColor")(landColor)
    if (!js.isUndefined(shadedReliefVisible)) __obj.updateDynamic("shadedReliefVisible")(shadedReliefVisible)
    __obj.asInstanceOf[ISettingsStyle]
  }
}

