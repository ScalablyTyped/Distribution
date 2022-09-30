package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.anon.X1
import typings.bizcharts.helperMod.IBaseProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gComponentsLineMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Line", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[ILineProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait ILineProps
    extends StObject
       with IBaseProps {
    
    var attrs: X1
  }
  object ILineProps {
    
    inline def apply(attrs: X1): ILineProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILineProps]
    }
    
    extension [Self <: ILineProps](x: Self) {
      
      inline def setAttrs(value: X1): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[ILineProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `gComponentsLineMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[ILineProps, String | Double]) & RefAttributes[Any]] = default
}
