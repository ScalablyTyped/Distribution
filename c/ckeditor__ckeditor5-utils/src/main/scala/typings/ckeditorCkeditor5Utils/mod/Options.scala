package typings.ckeditorCkeditor5Utils.mod

import typings.std.ClientRect
import typings.std.HTMLElement
import typings.std.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
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
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionsVarargs(value: (js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position])*): Self = this.set("positions", js.Array(value :_*))
    
    @scala.inline
    def setPositions(value: js.Array[js.Function2[/* targetRect */ Rect, /* elementRect */ Rect, Position]]): Self = this.set("positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetFunction0(value: () => HTMLElement | Range | ClientRect | Rect): Self = this.set("target", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(
      value: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
    ): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitInViewport(value: Boolean): Self = this.set("fitInViewport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFitInViewport: Self = this.set("fitInViewport", js.undefined)
    
    @scala.inline
    def setLimiterFunction0(value: () => HTMLElement | Range | ClientRect | Rect): Self = this.set("limiter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLimiter(
      value: HTMLElement | Range | ClientRect | Rect | (js.Function0[HTMLElement | Range | ClientRect | Rect])
    ): Self = this.set("limiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimiter: Self = this.set("limiter", js.undefined)
  }
}
