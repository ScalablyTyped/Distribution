package typings.bootstrapNotify

import typings.bootstrapNotify.anon.Align
import typings.bootstrapNotify.anon.Enter
import typings.bootstrapNotify.anon.X
import typings.jquery.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifySettings extends StObject {
  
  var allow_dismiss: js.UndefOr[Boolean] = js.undefined
  
  var allow_duplicates: js.UndefOr[Boolean] = js.undefined
  
  var animate: js.UndefOr[Enter] = js.undefined
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var element: js.UndefOr[String] = js.undefined
  
  var icon_type: js.UndefOr[String] = js.undefined
  
  var mouse_over: js.UndefOr[String] = js.undefined
  
  var newest_on_top: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Double | X] = js.undefined
  
  var onClose: js.UndefOr[js.Function1[/* $ele */ JQuery[HTMLElement], Unit]] = js.undefined
  
  var onClosed: js.UndefOr[js.Function1[/* $ele */ JQuery[HTMLElement], Unit]] = js.undefined
  
  var onShow: js.UndefOr[js.Function1[/* $ele */ JQuery[HTMLElement], Unit]] = js.undefined
  
  var onShown: js.UndefOr[js.Function1[/* $ele */ JQuery[HTMLElement], Unit]] = js.undefined
  
  var placement: js.UndefOr[Align] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var showProgressbar: js.UndefOr[Boolean] = js.undefined
  
  var spacing: js.UndefOr[Double] = js.undefined
  
  var template: js.UndefOr[String] = js.undefined
  
  var timer: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var url_target: js.UndefOr[String] = js.undefined
  
  var z_index: js.UndefOr[Double] = js.undefined
}
object NotifySettings {
  
  inline def apply(): NotifySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotifySettings]
  }
  
  extension [Self <: NotifySettings](x: Self) {
    
    inline def setAllow_dismiss(value: Boolean): Self = StObject.set(x, "allow_dismiss", value.asInstanceOf[js.Any])
    
    inline def setAllow_dismissUndefined: Self = StObject.set(x, "allow_dismiss", js.undefined)
    
    inline def setAllow_duplicates(value: Boolean): Self = StObject.set(x, "allow_duplicates", value.asInstanceOf[js.Any])
    
    inline def setAllow_duplicatesUndefined: Self = StObject.set(x, "allow_duplicates", js.undefined)
    
    inline def setAnimate(value: Enter): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setIcon_type(value: String): Self = StObject.set(x, "icon_type", value.asInstanceOf[js.Any])
    
    inline def setIcon_typeUndefined: Self = StObject.set(x, "icon_type", js.undefined)
    
    inline def setMouse_over(value: String): Self = StObject.set(x, "mouse_over", value.asInstanceOf[js.Any])
    
    inline def setMouse_overUndefined: Self = StObject.set(x, "mouse_over", js.undefined)
    
    inline def setNewest_on_top(value: Boolean): Self = StObject.set(x, "newest_on_top", value.asInstanceOf[js.Any])
    
    inline def setNewest_on_topUndefined: Self = StObject.set(x, "newest_on_top", js.undefined)
    
    inline def setOffset(value: Double | X): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOnClose(value: /* $ele */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
    
    inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    inline def setOnClosed(value: /* $ele */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "onClosed", js.Any.fromFunction1(value))
    
    inline def setOnClosedUndefined: Self = StObject.set(x, "onClosed", js.undefined)
    
    inline def setOnShow(value: /* $ele */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction1(value))
    
    inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
    
    inline def setOnShown(value: /* $ele */ JQuery[HTMLElement] => Unit): Self = StObject.set(x, "onShown", js.Any.fromFunction1(value))
    
    inline def setOnShownUndefined: Self = StObject.set(x, "onShown", js.undefined)
    
    inline def setPlacement(value: Align): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
    
    inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setShowProgressbar(value: Boolean): Self = StObject.set(x, "showProgressbar", value.asInstanceOf[js.Any])
    
    inline def setShowProgressbarUndefined: Self = StObject.set(x, "showProgressbar", js.undefined)
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    
    inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setTimer(value: Double): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    
    inline def setTimerUndefined: Self = StObject.set(x, "timer", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl_target(value: String): Self = StObject.set(x, "url_target", value.asInstanceOf[js.Any])
    
    inline def setUrl_targetUndefined: Self = StObject.set(x, "url_target", js.undefined)
    
    inline def setZ_index(value: Double): Self = StObject.set(x, "z_index", value.asInstanceOf[js.Any])
    
    inline def setZ_indexUndefined: Self = StObject.set(x, "z_index", js.undefined)
  }
}
