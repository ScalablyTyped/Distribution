package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.anon.Points
import typings.bizcharts.libGComponentsBaseHelperMod.IBaseProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsPolylineMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Polyline", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IPolylineProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IPolylineProps
    extends StObject
       with IBaseProps {
    
    var attrs: Points
  }
  object IPolylineProps {
    
    inline def apply(attrs: Points): IPolylineProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPolylineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPolylineProps] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: Points): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IPolylineProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsPolylineMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IPolylineProps, String | Double]) & RefAttributes[Any]] = default
}
