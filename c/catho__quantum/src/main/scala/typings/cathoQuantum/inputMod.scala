package typings.cathoQuantum

import typings.cathoQuantum.anon.BaseFontSizeColorsSpacing
import typings.cathoQuantum.anon.Error
import typings.cathoQuantum.anon.MaxLength
import typings.cathoQuantum.anon.MinLength
import typings.cathoQuantum.anon.ValueString
import typings.cathoQuantum.anon.`13`
import typings.cathoQuantum.cathoQuantumStrings.dark
import typings.cathoQuantum.cathoQuantumStrings.email
import typings.cathoQuantum.cathoQuantumStrings.number
import typings.cathoQuantum.cathoQuantumStrings.password
import typings.cathoQuantum.cathoQuantumStrings.search
import typings.cathoQuantum.cathoQuantumStrings.tel
import typings.cathoQuantum.cathoQuantumStrings.text
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.Component
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@catho/quantum/Input", JSImport.Default)
  @js.native
  open class default ()
    extends Component[InputProps, js.Object, Any]
  
  type CustomValidate = (js.Function1[/* param */ js.UndefOr[ValueString], String]) | Error
  
  type Input = Component[InputProps, js.Object, Any]
  
  trait InputProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    var descriptionLabel: js.UndefOr[String] = js.undefined
    
    var error: js.UndefOr[String] = js.undefined
    
    var helperText: js.UndefOr[String] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var mask: js.UndefOr[Mask | js.Array[Mask]] = js.undefined
    
    @JSName("onChange")
    var onChange_InputProps: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClean: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var skin: js.UndefOr[typings.cathoQuantum.cathoQuantumStrings.default | dark] = js.undefined
    
    var theme: js.UndefOr[BaseFontSizeColorsSpacing] = js.undefined
    
    @JSName("type")
    var type_InputProps: js.UndefOr[email | text | tel | number | password | search] = js.undefined
    
    var validate: js.UndefOr[Validate | CustomValidate | (js.Array[Validate | CustomValidate])] = js.undefined
    
    @JSName("value")
    var value_InputProps: js.UndefOr[String] = js.undefined
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
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setMask(value: Mask | js.Array[Mask]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskFunction1(value: /* rawValue */ String => js.Array[String]): Self = StObject.set(x, "mask", js.Any.fromFunction1(value))
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setMaskVarargs(value: Mask*): Self = StObject.set(x, "mask", js.Array(value*))
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClean(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClean", js.Any.fromFunction1(value))
      
      inline def setOnCleanUndefined: Self = StObject.set(x, "onClean", js.undefined)
      
      inline def setSkin(value: typings.cathoQuantum.cathoQuantumStrings.default | dark): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTheme(value: BaseFontSizeColorsSpacing): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: email | text | tel | number | password | search): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValidate(value: Validate | CustomValidate | (js.Array[Validate | CustomValidate])): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateFunction1(
        value: js.UndefOr[
              (/* params */ `13`) | (/* params */ MaxLength) | (/* params */ MinLength) | ValueString
            ] => String
      ): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      inline def setValidateFunction2(value: (/* params */ `13`, /* cpf */ js.UndefOr[String]) => String): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValidateVarargs(value: (Validate | CustomValidate)*): Self = StObject.set(x, "validate", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Mask = Boolean | js.RegExp | String | MaskFunction
  
  type MaskFunction = js.Function1[/* rawValue */ String, js.Array[String]]
  
  type Validate = (js.Function1[(/* params */ `13`) | (/* params */ MaxLength) | (/* params */ MinLength), String]) | (js.Function2[/* params */ `13`, /* cpf */ js.UndefOr[String], String])
}
