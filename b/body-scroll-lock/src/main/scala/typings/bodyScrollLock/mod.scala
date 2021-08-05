package typings.bodyScrollLock

import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("body-scroll-lock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearAllBodyScrollLocks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearAllBodyScrollLocks")().asInstanceOf[Unit]
  
  inline def disableBodyScroll(targetElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableBodyScroll")(targetElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def disableBodyScroll(targetElement: Element, options: BodyScrollOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disableBodyScroll")(targetElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def disableBodyScroll(targetElement: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableBodyScroll")(targetElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def disableBodyScroll(targetElement: HTMLElement, options: BodyScrollOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("disableBodyScroll")(targetElement.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableBodyScroll(targetElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBodyScroll")(targetElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def enableBodyScroll(targetElement: HTMLElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableBodyScroll")(targetElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait BodyScrollOptions extends StObject {
    
    var allowTouchMove: js.UndefOr[js.Function1[/* el */ HTMLElement | Element, Unit]] = js.undefined
    
    var reserveScrollBarGap: js.UndefOr[Boolean] = js.undefined
  }
  object BodyScrollOptions {
    
    inline def apply(): BodyScrollOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BodyScrollOptions]
    }
    
    extension [Self <: BodyScrollOptions](x: Self) {
      
      inline def setAllowTouchMove(value: /* el */ HTMLElement | Element => Unit): Self = StObject.set(x, "allowTouchMove", js.Any.fromFunction1(value))
      
      inline def setAllowTouchMoveUndefined: Self = StObject.set(x, "allowTouchMove", js.undefined)
      
      inline def setReserveScrollBarGap(value: Boolean): Self = StObject.set(x, "reserveScrollBarGap", value.asInstanceOf[js.Any])
      
      inline def setReserveScrollBarGapUndefined: Self = StObject.set(x, "reserveScrollBarGap", js.undefined)
    }
  }
}
