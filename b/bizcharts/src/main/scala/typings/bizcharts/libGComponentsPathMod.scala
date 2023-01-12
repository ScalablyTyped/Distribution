package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.anon.Path
import typings.bizcharts.libGComponentsBaseHelperMod.IBaseProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsPathMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Path", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[IImageProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait IImageProps
    extends StObject
       with IBaseProps {
    
    var attrs: Path
  }
  object IImageProps {
    
    inline def apply(attrs: Path): IImageProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any])
      __obj.asInstanceOf[IImageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IImageProps] (val x: Self) extends AnyVal {
      
      inline def setAttrs(value: Path): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[IImageProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsPathMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[IImageProps, String | Double]) & RefAttributes[Any]] = default
}
