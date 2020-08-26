package typings.cathoQuantum.checkboxMod

import typings.cathoQuantum.anon.Checked
import typings.cathoQuantum.anon.ColorsSpacing
import typings.cathoQuantum.cathoQuantumStrings.button
import typings.cathoQuantum.cathoQuantumStrings.checkbox
import typings.cathoQuantum.cathoQuantumStrings.large
import typings.cathoQuantum.cathoQuantumStrings.medium
import typings.cathoQuantum.cathoQuantumStrings.small
import typings.cathoQuantum.cathoQuantumStrings.xlarge
import typings.cathoQuantum.cathoQuantumStrings.xsmall
import typings.react.mod.ChangeEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckboxGroupProps extends js.Object {
  var children: js.UndefOr[js.Array[Element] | Element] = js.native
  var error: js.UndefOr[String] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[
    js.Function2[
      /* items */ js.UndefOr[Options], 
      /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]], 
      Unit
    ]
  ] = js.native
  var options: js.UndefOr[Options] = js.native
  var size: js.UndefOr[xsmall | small | medium | large | xlarge] = js.native
  var theme: js.UndefOr[ColorsSpacing] = js.native
  var `type`: checkbox | button = js.native
}

object CheckboxGroupProps {
  @scala.inline
  def apply(`type`: checkbox | button): CheckboxGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckboxGroupProps]
  }
  @scala.inline
  implicit class CheckboxGroupPropsOps[Self <: CheckboxGroupProps] (val x: Self) extends AnyVal {
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
    def setType(value: checkbox | button): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: Element*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[Element] | Element): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    @scala.inline
    def setOnChange(
      value: (/* items */ js.UndefOr[Options], /* event */ js.UndefOr[ChangeEvent[HTMLInputElement]]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOptionsVarargs(value: Checked*): Self = this.set("options", js.Array(value :_*))
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setSize(value: xsmall | small | medium | large | xlarge): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTheme(value: ColorsSpacing): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

