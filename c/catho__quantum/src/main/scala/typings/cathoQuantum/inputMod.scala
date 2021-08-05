package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSizeColors
import typings.cathoQuantum.anon.Error
import typings.cathoQuantum.anon.MaxLength
import typings.cathoQuantum.anon.MinLength
import typings.cathoQuantum.anon.Value
import typings.cathoQuantum.anon.ValueString
import typings.cathoQuantum.cathoQuantumStrings.email
import typings.cathoQuantum.cathoQuantumStrings.number
import typings.cathoQuantum.cathoQuantumStrings.password
import typings.cathoQuantum.cathoQuantumStrings.search
import typings.cathoQuantum.cathoQuantumStrings.tel
import typings.cathoQuantum.cathoQuantumStrings.text
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLInputElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@catho/quantum/Input", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputProps, js.Object, js.Any]
  
  type CustomValidate = (js.Function1[/* param */ js.UndefOr[ValueString], String]) | Error
  
  type Input = Component[InputProps, js.Object, js.Any]
  
  trait InputProps extends StObject {
    
    var descriptionLabel: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var helperText: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[Mask | js.Array[Mask]] = js.undefined
    
    var maxLength: js.UndefOr[Double | String] = js.undefined
    
    var minLength: js.UndefOr[Double | String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClean: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[BaseFontSizeColors] = js.undefined
    
    var `type`: js.UndefOr[email | text | tel | number | password | search] = js.undefined
    
    var validate: js.UndefOr[Validate | CustomValidate | (js.Array[Validate | CustomValidate])] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object InputProps {
    
    inline def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    extension [Self <: InputProps](x: Self) {
      
      inline def setDescriptionLabel(value: String): Self = StObject.set(x, "descriptionLabel", value.asInstanceOf[js.Any])
      
      inline def setDescriptionLabelUndefined: Self = StObject.set(x, "descriptionLabel", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
      
      inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMask(value: Mask | js.Array[Mask]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskFunction1(value: /* rawValue */ String => js.Array[String]): Self = StObject.set(x, "mask", js.Any.fromFunction1(value))
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaskVarargs(value: Mask*): Self = StObject.set(x, "mask", js.Array(value :_*))
      
      inline def setMaxLength(value: Double | String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMinLength(value: Double | String): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClean(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClean", js.Any.fromFunction1(value))
      
      inline def setOnCleanUndefined: Self = StObject.set(x, "onClean", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setTheme(value: BaseFontSizeColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: email | text | tel | number | password | search): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidate(value: Validate | CustomValidate | (js.Array[Validate | CustomValidate])): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateFunction1(
        value: js.UndefOr[
              (/* params */ MaxLength) | (/* params */ MinLength) | (/* params */ Value) | ValueString
            ] => String
      ): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateFunction2(value: (/* params */ Value, /* cpf */ js.UndefOr[String]) => String): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValidateVarargs(value: (Validate | CustomValidate)*): Self = StObject.set(x, "validate", js.Array(value :_*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Mask = Boolean | RegExp | String | MaskFunction
  
  type MaskFunction = js.Function1[/* rawValue */ String, js.Array[String]]
  
  type Validate = (js.Function1[(/* params */ MaxLength) | (/* params */ MinLength) | (/* params */ Value), String]) | (js.Function2[/* params */ Value, /* cpf */ js.UndefOr[String], String])
}
