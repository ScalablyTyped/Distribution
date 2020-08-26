package typings.baseui.comboboxMod

import typings.baseui.anon.CloseListbox
import typings.baseui.anon.Input
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropsT[OptionT] extends js.Object {
  var autocomplete: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var mapOptionToNode: js.UndefOr[js.Function1[/* hasIsSelectedOption */ js.Any, ReactNode]] = js.native
  var name: js.UndefOr[String] = js.native
  var onChange: js.UndefOr[js.Function2[/* value */ String, /* option */ OptionT | Null, _]] = js.native
  var onSubmit: js.UndefOr[js.Function1[/* params */ CloseListbox, _]] = js.native
  var options: OptionT = js.native
  var overrides: js.UndefOr[Input] = js.native
  var size: js.UndefOr[compact | default_ | large_ | mini] = js.native
  var value: String = js.native
  def mapOptionToString(OptionT: js.Any): String = js.native
}

object PropsT {
  @scala.inline
  def apply[OptionT](mapOptionToString: js.Any => String, options: OptionT, value: String): PropsT[OptionT] = {
    val __obj = js.Dynamic.literal(mapOptionToString = js.Any.fromFunction1(mapOptionToString), options = options.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsT[OptionT]]
  }
  @scala.inline
  implicit class PropsTOps[Self <: PropsT[_], OptionT] (val x: Self with PropsT[OptionT]) extends AnyVal {
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
    def setMapOptionToString(value: js.Any => String): Self = this.set("mapOptionToString", js.Any.fromFunction1(value))
    @scala.inline
    def setOptions(value: OptionT): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutocomplete(value: Boolean): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setMapOptionToNode(value: /* hasIsSelectedOption */ js.Any => ReactNode): Self = this.set("mapOptionToNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapOptionToNode: Self = this.set("mapOptionToNode", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ String, /* option */ OptionT | Null) => _): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOnSubmit(value: /* params */ CloseListbox => _): Self = this.set("onSubmit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOverrides(value: Input): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setSize(value: compact | default_ | large_ | mini): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

