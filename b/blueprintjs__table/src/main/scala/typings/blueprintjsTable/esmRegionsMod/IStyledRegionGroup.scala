package typings.blueprintjsTable.esmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyledRegionGroup extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var regions: js.Array[IRegion]
}

object IStyledRegionGroup {
  @scala.inline
  def apply(regions: js.Array[IRegion], className: String = null): IStyledRegionGroup = {
    val __obj = js.Dynamic.literal(regions = regions.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyledRegionGroup]
  }
}

