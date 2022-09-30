package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.anon.Points
import typings.bizcharts.helperMod.IBaseProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gComponentsPolygonMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Polygon", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IPolygonProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IPolygonProps
    extends StObject
       with IBaseProps {
    
    var attrs: Points
  }
  object IPolygonProps {
    
    inline def apply(attrs: Points): IPolygonProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPolygonProps]
    }
    
    extension [Self <: IPolygonProps](x: Self) {
      
      inline def setAttrs(value: Points): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IPolygonProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `gComponentsPolygonMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IPolygonProps, String | Double]) & RefAttributes[Any]] = default
}
