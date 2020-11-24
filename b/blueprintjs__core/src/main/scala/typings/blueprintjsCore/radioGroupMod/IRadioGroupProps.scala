package typings.blueprintjsCore.radioGroupMod

import typings.blueprintjsCore.propsMod.IOptionProps
import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.FormEvent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRadioGroupProps extends IProps {
  
  /**
    * Whether the group and _all_ its radios are disabled.
    * Individual radios can be disabled using their `disabled` prop.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the radio buttons are to be displayed inline horizontally.
    */
  var `inline`: js.UndefOr[Boolean] = js.native
  
  /** Optional label text to display above the radio buttons. */
  var label: js.UndefOr[ReactNode] = js.native
  
  /**
    * Name of the group, used to link radio buttons together in HTML.
    * If omitted, a unique name will be generated internally.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Callback invoked when the currently selected radio changes.
    * Use `event.currentTarget.value` to read the currently selected value.
    * This prop is required because this component only supports controlled usage.
    */
  def onChange(event: FormEvent[HTMLInputElement]): Unit = js.native
  
  /**
    * Array of options to render in the group. This prop is mutually exclusive
    * with `children`: either provide an array of `IOptionProps` objects or
    * provide `<Radio>` children elements.
    */
  var options: js.UndefOr[js.Array[IOptionProps]] = js.native
  
  /** Value of the selected radio. The child with this value will be `:checked`. */
  var selectedValue: js.UndefOr[String | Double] = js.native
}
object IRadioGroupProps {
  
  @scala.inline
  def apply(onChange: FormEvent[HTMLInputElement] => Unit): IRadioGroupProps = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange))
    __obj.asInstanceOf[IRadioGroupProps]
  }
  
  @scala.inline
  implicit class IRadioGroupPropsOps[Self <: IRadioGroupProps] (val x: Self) extends AnyVal {
    
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
    def setOnChange(value: FormEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setInline(value: Boolean): Self = this.set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInline: Self = this.set("inline", js.undefined)
    
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: IOptionProps*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[IOptionProps]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    
    @scala.inline
    def setSelectedValue(value: String | Double): Self = this.set("selectedValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedValue: Self = this.set("selectedValue", js.undefined)
  }
}
