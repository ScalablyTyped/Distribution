package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatchFilterGroup extends js.Object {
  /**
    * The set of patch filters that make up the group.
    */
  var PatchFilters: PatchFilterList = js.native
}

object PatchFilterGroup {
  @scala.inline
  def apply(PatchFilters: PatchFilterList): PatchFilterGroup = {
    val __obj = js.Dynamic.literal(PatchFilters = PatchFilters.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchFilterGroup]
  }
  @scala.inline
  implicit class PatchFilterGroupOps[Self <: PatchFilterGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPatchFiltersVarargs(value: PatchFilter*): Self = this.set("PatchFilters", js.Array(value :_*))
    @scala.inline
    def setPatchFilters(value: PatchFilterList): Self = this.set("PatchFilters", value.asInstanceOf[js.Any])
  }
  
}

