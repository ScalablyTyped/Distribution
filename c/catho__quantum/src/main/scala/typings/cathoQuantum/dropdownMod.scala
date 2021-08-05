package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSize
import typings.cathoQuantum.anon.Label
import typings.downshift.mod.ControllerStateAndHelpers
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  @JSImport("@catho/quantum/Dropdown", JSImport.Default)
  @js.native
  class default ()
    extends Component[DropdownProps, js.Object, js.Any]
  
  type Dropdown = Component[DropdownProps, js.Object, js.Any]
  
  trait DropdownProps extends StObject {
    
    var autocomplete: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var helperText: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var ignoreSpecialChars: js.UndefOr[Boolean] = js.undefined
    
    var items: js.UndefOr[js.Array[ItemPropType]] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    /** More about stateAndHelpers parameter here https://github.com/downshift-js/downshift#children-function */
    var onChange: js.UndefOr[
        js.Function2[
          /* selectedItem */ ItemPropType | Null, 
          /* stateAndHelpers */ ControllerStateAndHelpers[ItemPropType], 
          Unit
        ]
      ] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var selectedItem: js.UndefOr[ItemPropType] = js.undefined
    
    var theme: js.UndefOr[BaseFontSize] = js.undefined
  }
  object DropdownProps {
    
    inline def apply(): DropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps]
    }
    
    extension [Self <: DropdownProps](x: Self) {
      
      inline def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIgnoreSpecialChars(value: Boolean): Self = StObject.set(x, "ignoreSpecialChars", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSpecialCharsUndefined: Self = StObject.set(x, "ignoreSpecialChars", js.undefined)
      
      inline def setItems(value: js.Array[ItemPropType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: ItemPropType*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnChange(
        value: (/* selectedItem */ ItemPropType | Null, /* stateAndHelpers */ ControllerStateAndHelpers[ItemPropType]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSelectedItem(value: ItemPropType): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      inline def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      inline def setTheme(value: BaseFontSize): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type ItemPropType = String | Label
}
