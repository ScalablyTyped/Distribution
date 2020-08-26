package typings.baseui.anon

import typings.baseui.baseuiStrings.any
import typings.baseui.baseuiStrings.label
import typings.baseui.baseuiStrings.start
import typings.baseui.baseuiStrings.value
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterOption extends js.Object {
  var filterOption: js.UndefOr[
    js.Function2[/* option */ typings.baseui.selectMod.Option, /* filterValue */ String, Boolean]
  ] = js.native
  var ignoreCase: js.UndefOr[Boolean] = js.native
  var labelKey: js.UndefOr[String] = js.native
  var matchPos: js.UndefOr[any | start] = js.native
  var matchProp: js.UndefOr[any | label | value] = js.native
  var trimFilter: js.UndefOr[Boolean] = js.native
  var valueKey: js.UndefOr[String] = js.native
}

object FilterOption {
  @scala.inline
  def apply(): FilterOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterOption]
  }
  @scala.inline
  implicit class FilterOptionOps[Self <: FilterOption] (val x: Self) extends AnyVal {
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
    def setFilterOption(value: (/* option */ typings.baseui.selectMod.Option, /* filterValue */ String) => Boolean): Self = this.set("filterOption", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFilterOption: Self = this.set("filterOption", js.undefined)
    @scala.inline
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreCase: Self = this.set("ignoreCase", js.undefined)
    @scala.inline
    def setLabelKey(value: String): Self = this.set("labelKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelKey: Self = this.set("labelKey", js.undefined)
    @scala.inline
    def setMatchPos(value: any | start): Self = this.set("matchPos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchPos: Self = this.set("matchPos", js.undefined)
    @scala.inline
    def setMatchProp(value: any | label | value): Self = this.set("matchProp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchProp: Self = this.set("matchProp", js.undefined)
    @scala.inline
    def setTrimFilter(value: Boolean): Self = this.set("trimFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrimFilter: Self = this.set("trimFilter", js.undefined)
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
  }
  
}

