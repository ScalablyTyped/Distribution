package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSize
import typings.cathoQuantum.anon.Label
import typings.downshift.mod.ControllerStateAndHelpers
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownMod {
  
  @JSImport("@catho/quantum/Dropdown", JSImport.Default)
  @js.native
  class default ()
    extends Component[DropdownProps, js.Object, js.Any]
  
  type Dropdown = Component[DropdownProps, js.Object, js.Any]
  
  @js.native
  trait DropdownProps extends StObject {
    
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
    implicit class DropdownPropsMutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutocomplete(value: Boolean): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIgnoreSpecialChars(value: Boolean): Self = StObject.set(x, "ignoreSpecialChars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSpecialCharsUndefined: Self = StObject.set(x, "ignoreSpecialChars", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[ItemPropType]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      @scala.inline
      def setItemsVarargs(value: ItemPropType*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* selectedItem */ ItemPropType | Null, /* stateAndHelpers */ ControllerStateAndHelpers[ItemPropType]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setSelectedItem(value: ItemPropType): Self = StObject.set(x, "selectedItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedItemUndefined: Self = StObject.set(x, "selectedItem", js.undefined)
      
      @scala.inline
      def setTheme(value: BaseFontSize): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type ItemPropType = String | Label
}
