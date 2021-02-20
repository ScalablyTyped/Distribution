package typings.bodyScrollLock

import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("body-scroll-lock", "clearAllBodyScrollLocks")
  @js.native
  def clearAllBodyScrollLocks(): Unit = js.native
  
  @JSImport("body-scroll-lock", "disableBodyScroll")
  @js.native
  def disableBodyScroll(targetElement: Element): Unit = js.native
  @JSImport("body-scroll-lock", "disableBodyScroll")
  @js.native
  def disableBodyScroll(targetElement: Element, options: BodyScrollOptions): Unit = js.native
  @JSImport("body-scroll-lock", "disableBodyScroll")
  @js.native
  def disableBodyScroll(targetElement: HTMLElement): Unit = js.native
  @JSImport("body-scroll-lock", "disableBodyScroll")
  @js.native
  def disableBodyScroll(targetElement: HTMLElement, options: BodyScrollOptions): Unit = js.native
  
  @JSImport("body-scroll-lock", "enableBodyScroll")
  @js.native
  def enableBodyScroll(targetElement: Element): Unit = js.native
  @JSImport("body-scroll-lock", "enableBodyScroll")
  @js.native
  def enableBodyScroll(targetElement: HTMLElement): Unit = js.native
  
  @js.native
  trait BodyScrollOptions extends StObject {
    
    var allowTouchMove: js.UndefOr[js.Function1[/* el */ HTMLElement | Element, Unit]] = js.native
    
    var reserveScrollBarGap: js.UndefOr[Boolean] = js.native
  }
  object BodyScrollOptions {
    
    @scala.inline
    def apply(): BodyScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BodyScrollOptions]
    }
    
    @scala.inline
    implicit class BodyScrollOptionsMutableBuilder[Self <: BodyScrollOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowTouchMove(value: /* el */ HTMLElement | Element => Unit): Self = StObject.set(x, "allowTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAllowTouchMoveUndefined: Self = StObject.set(x, "allowTouchMove", js.undefined)
      
      @scala.inline
      def setReserveScrollBarGap(value: Boolean): Self = StObject.set(x, "reserveScrollBarGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReserveScrollBarGapUndefined: Self = StObject.set(x, "reserveScrollBarGap", js.undefined)
    }
  }
}
