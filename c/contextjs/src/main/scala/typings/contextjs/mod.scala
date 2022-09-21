package typings.contextjs

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("contextjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach(selector: Any, menuObjects: js.Array[MenuObject]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attach")(selector.asInstanceOf[js.Any], menuObjects.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def destroy(selector: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def init(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Unit]
  inline def init(settings: InitSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def settings(settings: InitSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait InitSettings extends StObject {
    
    var above: js.UndefOr[String | Boolean] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var fadeSpeed: js.UndefOr[Double] = js.undefined
    
    var filter: js.UndefOr[js.Function1[/* e */ Element, Unit]] = js.undefined
    
    var preventDoubleContext: js.UndefOr[Boolean] = js.undefined
  }
  object InitSettings {
    
    inline def apply(): InitSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitSettings]
    }
    
    extension [Self <: InitSettings](x: Self) {
      
      inline def setAbove(value: String | Boolean): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
      
      inline def setAboveUndefined: Self = StObject.set(x, "above", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setFadeSpeed(value: Double): Self = StObject.set(x, "fadeSpeed", value.asInstanceOf[js.Any])
      
      inline def setFadeSpeedUndefined: Self = StObject.set(x, "fadeSpeed", js.undefined)
      
      inline def setFilter(value: /* e */ Element => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setPreventDoubleContext(value: Boolean): Self = StObject.set(x, "preventDoubleContext", value.asInstanceOf[js.Any])
      
      inline def setPreventDoubleContextUndefined: Self = StObject.set(x, "preventDoubleContext", js.undefined)
    }
  }
  
  trait MenuObject extends StObject {
    
    var action: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.undefined
    
    var divider: js.UndefOr[Boolean] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var subMenu: js.UndefOr[js.Array[MenuObject]] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object MenuObject {
    
    inline def apply(): MenuObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuObject]
    }
    
    extension [Self <: MenuObject](x: Self) {
      
      inline def setAction(value: /* e */ Event => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      inline def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setSubMenu(value: js.Array[MenuObject]): Self = StObject.set(x, "subMenu", value.asInstanceOf[js.Any])
      
      inline def setSubMenuUndefined: Self = StObject.set(x, "subMenu", js.undefined)
      
      inline def setSubMenuVarargs(value: MenuObject*): Self = StObject.set(x, "subMenu", js.Array(value*))
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
