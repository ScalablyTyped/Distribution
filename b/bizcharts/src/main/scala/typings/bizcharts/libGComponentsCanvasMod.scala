package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.antvGCanvas.mod.Renderer
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGComponentsCanvasMod extends Shortcut {
  
  @JSImport("bizcharts/lib/g-components/Canvas", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[(Pick[ICanvasProps, String | Double]) & RefAttributes[Any]] = js.native
  
  trait ICanvasProps
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var capture: js.UndefOr[Boolean] = js.undefined
    
    var container: js.UndefOr[String | HTMLElement] = js.undefined
    
    var cursor: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Cursor */ Any
      ] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var renderer: js.UndefOr[Renderer] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object ICanvasProps {
    
    inline def apply(): ICanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICanvasProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICanvasProps] (val x: Self) extends AnyVal {
      
      inline def setCapture(value: Boolean): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      inline def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      inline def setContainer(value: String | HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCursor(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Cursor */ Any
      ): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[(Pick[ICanvasProps, String | Double]) & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libGComponentsCanvasMod.foo` */
  override def _to: ForwardRefExoticComponent[(Pick[ICanvasProps, String | Double]) & RefAttributes[Any]] = default
}
