package typings.cleanCss.mod

import typings.cleanCss.anon.AdjacentSpace
import typings.cleanCss.anon.BackgroundClipMerging
import typings.cleanCss.anon.Ch
import typings.cleanCss.anon.Opacity
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
  var colors: js.UndefOr[Opacity] = js.undefined
  /**
    * A hash of properties that can be set with compatibility
    */
  var properties: js.UndefOr[BackgroundClipMerging] = js.undefined
  /**
    * A hash of options related to compatibility of selectors
    */
  var selectors: js.UndefOr[AdjacentSpace] = js.undefined
  /**
    * A hash of options related to comparability of supported units
    */
  var units: js.UndefOr[Ch] = js.undefined
}

object CompatibilityOptions {
  @scala.inline
  def apply(
    colors: Opacity = null,
    properties: BackgroundClipMerging = null,
    selectors: AdjacentSpace = null,
    units: Ch = null
  ): CompatibilityOptions = {
    val __obj = js.Dynamic.literal()
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (selectors != null) __obj.updateDynamic("selectors")(selectors.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompatibilityOptions]
  }
}

