package typings.blueprintjsTable.esmRegionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStyledRegionGroup extends js.Object {
  var className: js.UndefOr[String] = js.native
  var regions: js.Array[IRegion] = js.native
}

object IStyledRegionGroup {
  @scala.inline
  def apply(regions: js.Array[IRegion]): IStyledRegionGroup = {
    val __obj = js.Dynamic.literal(regions = regions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyledRegionGroup]
  }
  @scala.inline
  implicit class IStyledRegionGroupOps[Self <: IStyledRegionGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRegionsVarargs(value: IRegion*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[IRegion]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}

