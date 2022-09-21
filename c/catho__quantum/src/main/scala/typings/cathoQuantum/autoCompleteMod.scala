package typings.cathoQuantum

import typings.cathoQuantum.anon.Spacing
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoCompleteMod {
  
  @JSImport("@catho/quantum/AutoComplete", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AutoCompleteProps, js.Object, Any]
  
  type AutoComplete = Component[AutoCompleteProps, js.Object, Any]
  
  trait AutoCompleteProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var helperText: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var minlength: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    var onSelectedItem: js.UndefOr[js.Function1[/* item */ String, Unit]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var suggestions: js.Array[String]
    
    var theme: js.UndefOr[Spacing] = js.undefined
  }
  object AutoCompleteProps {
    
    inline def apply(suggestions: js.Array[String]): AutoCompleteProps = {
      val __obj = js.Dynamic.literal(suggestions = suggestions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoCompleteProps]
    }
    
    extension [Self <: AutoCompleteProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMinlength(value: String): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
      
      inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: /* value */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnSelectedItem(value: /* item */ String => Unit): Self = StObject.set(x, "onSelectedItem", js.Any.fromFunction1(value))
      
      inline def setOnSelectedItemUndefined: Self = StObject.set(x, "onSelectedItem", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setSuggestions(value: js.Array[String]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
      
      inline def setSuggestionsVarargs(value: String*): Self = StObject.set(x, "suggestions", js.Array(value*))
      
      inline def setTheme(value: Spacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}
