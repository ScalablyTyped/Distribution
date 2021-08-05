package typings.ckeditorCkeditor5Utils.mod

import typings.std.ClientRect
import typings.std.HTMLElement
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var element: HTMLElement
  
  var fitInViewport: js.UndefOr[Boolean] = js.undefined
  
  var limiter: js.UndefOr[
    HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
  ] = js.undefined
  
  var positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]]
  
  var target: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
}
object Options {
  
  inline def apply(
    element: HTMLElement,
    positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]],
    target: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
  ): Options = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setFitInViewport(value: Boolean): Self = StObject.set(x, "fitInViewport", value.asInstanceOf[js.Any])
    
    inline def setFitInViewportUndefined: Self = StObject.set(x, "fitInViewport", js.undefined)
    
    inline def setLimiter(
      value: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
    ): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
    
    inline def setLimiterFunction0(value: () => HTMLElement | Range | ClientRect | Rect): Self = StObject.set(x, "limiter", js.Any.fromFunction0(value))
    
    inline def setLimiterUndefined: Self = StObject.set(x, "limiter", js.undefined)
    
    inline def setPositions(value: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: (js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position])*): Self = StObject.set(x, "positions", js.Array(value :_*))
    
    inline def setTarget(
      value: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
    ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetFunction0(value: () => HTMLElement | Range | ClientRect | Rect): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
  }
}
