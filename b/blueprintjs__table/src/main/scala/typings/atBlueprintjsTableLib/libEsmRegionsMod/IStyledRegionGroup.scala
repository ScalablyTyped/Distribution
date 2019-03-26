package typings
package atBlueprintjsTableLib.libEsmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyledRegionGroup extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var regions: js.Array[IRegion]
}

object IStyledRegionGroup {
  @scala.inline
  def apply(regions: js.Array[IRegion], className: java.lang.String = null): IStyledRegionGroup = {
    val __obj = js.Dynamic.literal(regions = regions)
    if (className != null) __obj.updateDynamic("className")(className)
    __obj.asInstanceOf[IStyledRegionGroup]
  }
}

