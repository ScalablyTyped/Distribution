package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.anon.Rx
import typings.bizcharts.helperMod.IBaseProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipseMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Ellipse", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IEllipseProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IEllipseProps
    extends StObject
       with IBaseProps {
    
    var attrs: Rx
  }
  object IEllipseProps {
    
    inline def apply(attrs: Rx): IEllipseProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IEllipseProps]
    }
    
    extension [Self <: IEllipseProps](x: Self) {
      
      inline def setAttrs(value: Rx): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IEllipseProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `ellipseMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IEllipseProps, String | Double]) & RefAttributes[Any]] = default
}
