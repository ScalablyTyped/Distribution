package typings
package backboneDotMarionetteLib.backboneDotMarionetteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionViewOptions extends js.Object {
  /**
    * DEPRECATED: If you replace the current view with a new view by calling show, by
    * default it will automatically destroy the previous view. You can
    * prevent this behavior by setting this option to true.
    */
  var preventDestroy: js.UndefOr[scala.Boolean] = js.undefined
}

object RegionViewOptions {
  @scala.inline
  def apply(preventDestroy: js.UndefOr[scala.Boolean] = js.undefined): RegionViewOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventDestroy)) __obj.updateDynamic("preventDestroy")(preventDestroy)
    __obj.asInstanceOf[RegionViewOptions]
  }
}

