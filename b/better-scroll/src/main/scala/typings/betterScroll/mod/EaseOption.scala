package typings.betterScroll.mod

import typings.betterScroll.anon.Fn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EaseOption extends StObject {
  
  var bounce: js.UndefOr[Fn] = js.undefined
  
  var swipe: js.UndefOr[Fn] = js.undefined
  
  var swipeBounce: js.UndefOr[Fn] = js.undefined
}
object EaseOption {
  
  @scala.inline
  def apply(): EaseOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EaseOption]
  }
  
  @scala.inline
  implicit class EaseOptionMutableBuilder[Self <: EaseOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBounce(value: Fn): Self = StObject.set(x, "bounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceUndefined: Self = StObject.set(x, "bounce", js.undefined)
    
    @scala.inline
    def setSwipe(value: Fn): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeBounce(value: Fn): Self = StObject.set(x, "swipeBounce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwipeBounceUndefined: Self = StObject.set(x, "swipeBounce", js.undefined)
    
    @scala.inline
    def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
  }
}
