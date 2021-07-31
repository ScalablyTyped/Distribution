package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.FieldsetHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLFieldSetElement
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formGroupFormGroupMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FormGroup/FormGroup", JSImport.Default)
  @js.native
  val default: FC[FormGroupProps] = js.native
  
  trait FormGroupProps
    extends StObject
       with FieldsetHTMLAttributes[HTMLFieldSetElement] {
    
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    var legendText: NonNullable[ReactNode]
    
    var message: js.UndefOr[Boolean] = js.undefined
    
    var messageText: js.UndefOr[ReactNode] = js.undefined
  }
  object FormGroupProps {
    
    @scala.inline
    def apply(): FormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormGroupProps]
    }
    
    @scala.inline
    implicit class FormGroupPropsMutableBuilder[Self <: FormGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setLegendText(value: NonNullable[ReactNode]): Self = StObject.set(x, "legendText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendTextUndefined: Self = StObject.set(x, "legendText", js.undefined)
      
      @scala.inline
      def setMessage(value: Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageText(value: ReactNode): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  type _To = FC[FormGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `formGroupFormGroupMod.foo` */
  override def _to: FC[FormGroupProps] = default
}
