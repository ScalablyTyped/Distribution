package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.anon.Radius
import typings.bizcharts.helperMod.IBaseProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Rect", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IRectProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IRectProps
    extends StObject
       with IBaseProps {
    
    var attrs: Radius
  }
  object IRectProps {
    
    inline def apply(attrs: Radius): IRectProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRectProps]
    }
    
    extension [Self <: IRectProps](x: Self) {
      
      inline def setAttrs(value: Radius): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IRectProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `rectMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IRectProps, String | Double]) & RefAttributes[Any]] = default
}
