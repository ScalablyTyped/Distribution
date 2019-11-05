package typings.baidumapDashWebDashSdk.BMap

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapStyleItemStylers
  extends /* k */ StringDictionary[js.UndefOr[String]] {
  var color: js.UndefOr[String] = js.undefined
  var curZoomRegion: js.UndefOr[String] = js.undefined
  var curZoomRegionId: js.UndefOr[String] = js.undefined
  var fontsize: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[String] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
  var weight: js.UndefOr[String] = js.undefined
}

object MapStyleItemStylers {
  @scala.inline
  def apply(
    StringDictionary: /* k */ StringDictionary[js.UndefOr[String]] = null,
    color: String = null,
    curZoomRegion: String = null,
    curZoomRegionId: String = null,
    fontsize: String = null,
    level: String = null,
    visibility: String = null,
    weight: String = null
  ): MapStyleItemStylers = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (color != null) __obj.updateDynamic("color")(color)
    if (curZoomRegion != null) __obj.updateDynamic("curZoomRegion")(curZoomRegion)
    if (curZoomRegionId != null) __obj.updateDynamic("curZoomRegionId")(curZoomRegionId)
    if (fontsize != null) __obj.updateDynamic("fontsize")(fontsize)
    if (level != null) __obj.updateDynamic("level")(level)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    if (weight != null) __obj.updateDynamic("weight")(weight)
    __obj.asInstanceOf[MapStyleItemStylers]
  }
}

