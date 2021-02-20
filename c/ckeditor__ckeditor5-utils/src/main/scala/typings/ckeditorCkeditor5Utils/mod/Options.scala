package typings.ckeditorCkeditor5Utils.mod

import typings.std.ClientRect
import typings.std.HTMLElement
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var element: HTMLElement = js.native
  
  var fitInViewport: js.UndefOr[Boolean] = js.native
  
  var limiter: js.UndefOr[
    HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
  ] = js.native
  
  var positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]] = js.native
  
  var target: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect]) = js.native
}
object Options {
  
  @scala.inline
  def apply(
    element: HTMLElement,
    positions: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]],
    target: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
  ): Options = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitInViewport(value: Boolean): Self = StObject.set(x, "fitInViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitInViewportUndefined: Self = StObject.set(x, "fitInViewport", js.undefined)
    
    @scala.inline
    def setLimiter(
      value: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
    ): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimiterFunction0(value: () => HTMLElement | Range | ClientRect | Rect): Self = StObject.set(x, "limiter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLimiterUndefined: Self = StObject.set(x, "limiter", js.undefined)
    
    @scala.inline
    def setPositions(value: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: (js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position])*): Self = StObject.set(x, "positions", js.Array(value :_*))
    
    @scala.inline
    def setTarget(
      value: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
    ): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFunction0(value: () => HTMLElement | Range | ClientRect | Rect): Self = StObject.set(x, "target", js.Any.fromFunction0(value))
  }
}
