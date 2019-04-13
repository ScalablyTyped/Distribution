package typings
package cleanDashCssLib.cleanDashCssMod

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
  var colors: js.UndefOr[cleanDashCssLib.Anon_Opacity] = js.undefined
  /**
    * A hash of properties that can be set with compatibility
    */
  var properties: js.UndefOr[cleanDashCssLib.Anon_BackgroundClipMerging] = js.undefined
  /**
    * A hash of options related to compatibility of selectors
    */
  var selectors: js.UndefOr[cleanDashCssLib.Anon_AdjacentSpace] = js.undefined
  /**
    * A hash of options related to comparability of supported units
    */
  var units: js.UndefOr[cleanDashCssLib.Anon_Ch] = js.undefined
}

object CompatibilityOptions {
  @scala.inline
  def apply(
    colors: cleanDashCssLib.Anon_Opacity = null,
    properties: cleanDashCssLib.Anon_BackgroundClipMerging = null,
    selectors: cleanDashCssLib.Anon_AdjacentSpace = null,
    units: cleanDashCssLib.Anon_Ch = null
  ): CompatibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (selectors != null) __obj.updateDynamic("selectors")(selectors)
    if (units != null) __obj.updateDynamic("units")(units)
    __obj.asInstanceOf[CompatibilityOptions]
  }
}

