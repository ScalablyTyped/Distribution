package typings.contextjs

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("contextjs", "attach")
  @js.native
  def attach(selector: js.Any, menuObjects: js.Array[MenuObject]): Unit = js.native
  
  @JSImport("contextjs", "destroy")
  @js.native
  def destroy(selector: js.Any): Unit = js.native
  
  @JSImport("contextjs", "init")
  @js.native
  def init(): Unit = js.native
  @JSImport("contextjs", "init")
  @js.native
  def init(settings: InitSettings): Unit = js.native
  
  @JSImport("contextjs", "settings")
  @js.native
  def settings(settings: InitSettings): Unit = js.native
  
  @js.native
  trait InitSettings extends StObject {
    
    var above: js.UndefOr[String | Boolean] = js.native
    
    var compress: js.UndefOr[Boolean] = js.native
    
    var fadeSpeed: js.UndefOr[Double] = js.native
    
    var filter: js.UndefOr[js.Function1[/* e */ Element, Unit]] = js.native
    
    var preventDoubleContext: js.UndefOr[Boolean] = js.native
  }
  object InitSettings {
    
    @scala.inline
    def apply(): InitSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitSettings]
    }
    
    @scala.inline
    implicit class InitSettingsMutableBuilder[Self <: InitSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbove(value: String | Boolean): Self = StObject.set(x, "above", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboveUndefined: Self = StObject.set(x, "above", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setFadeSpeed(value: Double): Self = StObject.set(x, "fadeSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeSpeedUndefined: Self = StObject.set(x, "fadeSpeed", js.undefined)
      
      @scala.inline
      def setFilter(value: /* e */ Element => Unit): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setPreventDoubleContext(value: Boolean): Self = StObject.set(x, "preventDoubleContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDoubleContextUndefined: Self = StObject.set(x, "preventDoubleContext", js.undefined)
    }
  }
  
  @js.native
  trait MenuObject extends StObject {
    
    var action: js.UndefOr[js.Function1[/* e */ Event, Unit]] = js.native
    
    var divider: js.UndefOr[Boolean] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var subMenu: js.UndefOr[js.Array[MenuObject]] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object MenuObject {
    
    @scala.inline
    def apply(): MenuObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuObject]
    }
    
    @scala.inline
    implicit class MenuObjectMutableBuilder[Self <: MenuObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: /* e */ Event => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setDivider(value: Boolean): Self = StObject.set(x, "divider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDividerUndefined: Self = StObject.set(x, "divider", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setSubMenu(value: js.Array[MenuObject]): Self = StObject.set(x, "subMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubMenuUndefined: Self = StObject.set(x, "subMenu", js.undefined)
      
      @scala.inline
      def setSubMenuVarargs(value: MenuObject*): Self = StObject.set(x, "subMenu", js.Array(value :_*))
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
