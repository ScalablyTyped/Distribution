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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@catho/quantum/Input", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputProps, js.Object, js.Any]
  
  type CustomValidate = (js.Function1[/* param */ js.UndefOr[ValueString], String]) | Error
  
  type Input = Component[InputProps, js.Object, js.Any]
  
  @js.native
  trait InputProps extends StObject {
    
    var descriptionLabel: js.UndefOr[String] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var helperText: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var mask: js.UndefOr[Mask | js.Array[Mask]] = js.native
    
    var maxLength: js.UndefOr[Double | String] = js.native
    
    var minLength: js.UndefOr[Double | String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
    
    var onClean: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var theme: js.UndefOr[BaseFontSizeColors] = js.native
    
    var `type`: js.UndefOr[email | text | tel | number | password | search] = js.native
    
    var validate: js.UndefOr[Validate | CustomValidate | (js.Array[Validate | CustomValidate])] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object InputProps {
    
    @scala.inline
    def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    @scala.inline
    implicit class InputPropsMutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescriptionLabel(value: String): Self = StObject.set(x, "descriptionLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionLabelUndefined: Self = StObject.set(x, "descriptionLabel", js.undefined)
      
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
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setMask(value: Mask | js.Array[Mask]): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskFunction1(value: /* rawValue */ String => js.Array[String]): Self = StObject.set(x, "mask", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      @scala.inline
      def setMaskVarargs(value: Mask*): Self = StObject.set(x, "mask", js.Array(value :_*))
      
      @scala.inline
      def setMaxLength(value: Double | String): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMinLength(value: Double | String): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClean(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClean", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCleanUndefined: Self = StObject.set(x, "onClean", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setTheme(value: BaseFontSizeColors): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: email | text | tel | number | password | search): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValidate(value: Validate | CustomValidate | (js.Array[Validate | CustomValidate])): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFunction1(
        value: js.UndefOr[
              (/* params */ MaxLength) | (/* params */ MinLength) | (/* params */ Value) | ValueString
            ] => String
      ): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateFunction2(value: (/* params */ Value, /* cpf */ js.UndefOr[String]) => String): Self = StObject.set(x, "validate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setValidateVarargs(value: (Validate | CustomValidate)*): Self = StObject.set(x, "validate", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type Mask = Boolean | RegExp | String | MaskFunction
  
  type MaskFunction = js.Function1[/* rawValue */ String, js.Array[String]]
  
  type Validate = (js.Function1[(/* params */ MaxLength) | (/* params */ MinLength) | (/* params */ Value), String]) | (js.Function2[/* params */ Value, /* cpf */ js.UndefOr[String], String])
}
