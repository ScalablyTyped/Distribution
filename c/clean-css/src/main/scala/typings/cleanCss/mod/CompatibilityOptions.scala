package typings.cleanCss.mod

import typings.cleanCss.AnonAdjacentSpace
import typings.cleanCss.AnonBackgroundClipMerging
import typings.cleanCss.AnonCh
import typings.cleanCss.AnonOpacity
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
  var colors: js.UndefOr[AnonOpacity] = js.undefined
  /**
    * A hash of properties that can be set with compatibility
    */
  var properties: js.UndefOr[AnonBackgroundClipMerging] = js.undefined
  /**
    * A hash of options related to compatibility of selectors
    */
  var selectors: js.UndefOr[AnonAdjacentSpace] = js.undefined
  /**
    * A hash of options related to comparability of supported units
    */
  var units: js.UndefOr[AnonCh] = js.undefined
}

object CompatibilityOptions {
  @scala.inline
  def apply(
    colors: AnonOpacity = null,
    properties: AnonBackgroundClipMerging = null,
    selectors: AnonAdjacentSpace = null,
    units: AnonCh = null
  ): CompatibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompatibilityOptions]
  }
}

