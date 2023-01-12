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

object libComponentsFormGroupFormGroupMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/FormGroup/FormGroup", JSImport.Default)
  @js.native
  val default: FC[FormGroupProps] = js.native
  
  trait FormGroupProps
    extends StObject
       with FieldsetHTMLAttributes[HTMLFieldSetElement] {
    
    var hasMargin: js.UndefOr[Boolean] = js.undefined
    
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    var legendId: js.UndefOr[String] = js.undefined
    
    var legendText: NonNullable[ReactNode]
    
    var message: js.UndefOr[Boolean] = js.undefined
    
    var messageText: js.UndefOr[ReactNode] = js.undefined
  }
  object FormGroupProps {
    
    inline def apply(): FormGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormGroupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormGroupProps] (val x: Self) extends AnyVal {
      
      inline def setHasMargin(value: Boolean): Self = StObject.set(x, "hasMargin", value.asInstanceOf[js.Any])
      
      inline def setHasMarginUndefined: Self = StObject.set(x, "hasMargin", js.undefined)
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setLegendId(value: String): Self = StObject.set(x, "legendId", value.asInstanceOf[js.Any])
      
      inline def setLegendIdUndefined: Self = StObject.set(x, "legendId", js.undefined)
      
      inline def setLegendText(value: NonNullable[ReactNode]): Self = StObject.set(x, "legendText", value.asInstanceOf[js.Any])
      
      inline def setLegendTextUndefined: Self = StObject.set(x, "legendText", js.undefined)
      
      inline def setMessage(value: Boolean): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageText(value: ReactNode): Self = StObject.set(x, "messageText", value.asInstanceOf[js.Any])
      
      inline def setMessageTextUndefined: Self = StObject.set(x, "messageText", js.undefined)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
  
  type _To = FC[FormGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsFormGroupFormGroupMod.foo` */
  override def _to: FC[FormGroupProps] = default
}
