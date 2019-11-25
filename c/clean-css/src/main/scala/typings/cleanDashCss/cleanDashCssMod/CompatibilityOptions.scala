package typings.cleanDashCss.cleanDashCssMod

import typings.cleanDashCss.Anon_AdjacentSpace
import typings.cleanDashCss.Anon_BackgroundClipMerging
import typings.cleanDashCss.Anon_Ch
import typings.cleanDashCss.Anon_Opacity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fine grained configuration for compatibility option
  */
trait CompatibilityOptions extends js.Object {
  /**
    * A hash of compatibility options related to color
    */
  var colors: js.UndefOr[Anon_Opacity] = js.undefined
  /**
    * A hash of properties that can be set with compatibility
    */
  var properties: js.UndefOr[Anon_BackgroundClipMerging] = js.undefined
  /**
    * A hash of options related to compatibility of selectors
    */
  var selectors: js.UndefOr[Anon_AdjacentSpace] = js.undefined
  /**
    * A hash of options related to comparability of supported units
    */
  var units: js.UndefOr[Anon_Ch] = js.undefined
}

object CompatibilityOptions {
  @scala.inline
  def apply(
    colors: Anon_Opacity = null,
    properties: Anon_BackgroundClipMerging = null,
    selectors: Anon_AdjacentSpace = null,
    units: Anon_Ch = null
  ): CompatibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompatibilityOptions]
  }
}

