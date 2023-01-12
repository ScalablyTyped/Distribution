package typings.carbonComponentsReact

import org.scalablytyped.runtime.Shortcut
import typings.carbonComponentsReact.typingsSharedMod.ForwardRefReturn
import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsButtonSetButtonSetMod extends Shortcut {
  
  @JSImport("carbon-components-react/lib/components/ButtonSet/ButtonSet", JSImport.Default)
  @js.native
  val default: ForwardRefReturn[HTMLDivElement, ButtonSetProps] = js.native
  
  trait ButtonSetProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    var stacked: js.UndefOr[Boolean] = js.undefined
  }
  object ButtonSetProps {
    
    inline def apply(): ButtonSetProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonSetProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonSetProps] (val x: Self) extends AnyVal {
      
      inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    }
  }
  
  type _To = ForwardRefReturn[HTMLDivElement, ButtonSetProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsButtonSetButtonSetMod.foo` */
  override def _to: ForwardRefReturn[HTMLDivElement, ButtonSetProps] = default
}
