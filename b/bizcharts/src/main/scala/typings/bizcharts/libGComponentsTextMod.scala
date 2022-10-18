package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.anon.Text
import typings.bizcharts.libGComponentsBaseHelperMod.IBaseProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsTextMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Text", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[ITextProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait ITextProps
    extends StObject
       with IBaseProps {
    
    var attrs: Text
  }
  object ITextProps {
    
    inline def apply(attrs: Text): ITextProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextProps]
    }
    
    extension [Self <: ITextProps](x: Self) {
      
      inline def setAttrs(value: Text): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[ITextProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsTextMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[ITextProps, String | Double]) & RefAttributes[Any]] = default
}
