package typings.cathoQuantum

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.Component
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaMod {
  
  @JSImport("@catho/quantum/TextArea", JSImport.Default)
  @js.native
  class default ()
    extends Component[TextAreaProps, js.Object, js.Any]
  
  type TextArea = Component[TextAreaProps, js.Object, js.Any]
  
  @js.native
  trait TextAreaProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[String] = js.native
    
    var helperText: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String | Double] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var value: js.UndefOr[String] = js.native
  }
  object TextAreaProps {
    
    @scala.inline
    def apply(): TextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaProps]
    }
    
    @scala.inline
    implicit class TextAreaPropsMutableBuilder[Self <: TextAreaProps] (val x: Self) extends AnyVal {
      
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
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
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
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
