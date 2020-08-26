package typings.baseui.phoneInputMod

import typings.baseui.anon.ReadonlyArrayReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountrySelectDropdownProps extends js.Object {
  var children: js.UndefOr[ReadonlyArrayReactNode] = js.native
  var country: js.UndefOr[Country] = js.native
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.native
  var maxDropdownHeight: js.UndefOr[String] = js.native
  var overrides: js.UndefOr[typings.baseui.anon.CountrySelectDropdown] = js.native
}

object CountrySelectDropdownProps {
  @scala.inline
  def apply(): CountrySelectDropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountrySelectDropdownProps]
  }
  @scala.inline
  implicit class CountrySelectDropdownPropsOps[Self <: CountrySelectDropdownProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReadonlyArrayReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setCountry(value: Country): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setMapIsoToLabel(value: /* iso */ String => String): Self = this.set("mapIsoToLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapIsoToLabel: Self = this.set("mapIsoToLabel", js.undefined)
    @scala.inline
    def setMaxDropdownHeight(value: String): Self = this.set("maxDropdownHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDropdownHeight: Self = this.set("maxDropdownHeight", js.undefined)
    @scala.inline
    def setOverrides(value: typings.baseui.anon.CountrySelectDropdown): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

