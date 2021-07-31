package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overlay extends StObject {
  
  var draw: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var hide: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var initialize: js.UndefOr[js.Function1[/* map */ Map, HTMLElement]] = js.undefined
  
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.undefined
  
  var show: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object Overlay {
  
  @scala.inline
  def apply(): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overlay]
  }
  
  @scala.inline
  implicit class OverlayMutableBuilder[Self <: Overlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraw(value: () => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDrawUndefined: Self = StObject.set(x, "draw", js.undefined)
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    @scala.inline
    def setInitialize(value: /* map */ Map => HTMLElement): Self = StObject.set(x, "initialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
    
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = StObject.set(x, "isVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
