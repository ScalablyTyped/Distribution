package typings.cathoQuantum.dropdownMod

import typings.cathoQuantum.anon.BaseFontSize
import typings.downshift.mod.ControllerStateAndHelpers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownProps extends js.Object {
  
  var autocomplete: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var helperText: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var ignoreSpecialChars: js.UndefOr[Boolean] = js.native
  
  var items: js.UndefOr[js.Array[ItemPropType]] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  /** More about stateAndHelpers parameter here https://github.com/downshift-js/downshift#children-function */
  var onChange: js.UndefOr[
    js.Function2[
      /* selectedItem */ ItemPropType | Null, 
      /* stateAndHelpers */ ControllerStateAndHelpers[ItemPropType], 
      Unit
    ]
  ] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var selectedItem: js.UndefOr[ItemPropType] = js.native
  
  var theme: js.UndefOr[BaseFontSize] = js.native
}
object DropdownProps {
  
  @scala.inline
  def apply(): DropdownProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownProps]
  }
  
  @scala.inline
  implicit class DropdownPropsOps[Self <: DropdownProps] (val x: Self) extends AnyVal {
    
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
    def setAutocomplete(value: Boolean): Self = this.set("autocomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setHelperText(value: String): Self = this.set("helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelperText: Self = this.set("helperText", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIgnoreSpecialChars(value: Boolean): Self = this.set("ignoreSpecialChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSpecialChars: Self = this.set("ignoreSpecialChars", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ItemPropType*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[ItemPropType]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setOnChange(
      value: (/* selectedItem */ ItemPropType | Null, /* stateAndHelpers */ ControllerStateAndHelpers[ItemPropType]) => Unit
    ): Self = this.set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: ItemPropType): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    
    @scala.inline
    def setTheme(value: BaseFontSize): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
