package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalkOptionsNoVisit extends StObject {
  
  var enter: js.UndefOr[EnterOrLeaveFn[CssNode]] = js.undefined
  
  var leave: js.UndefOr[EnterOrLeaveFn[CssNode]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
}
object WalkOptionsNoVisit {
  
  @scala.inline
  def apply(): WalkOptionsNoVisit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WalkOptionsNoVisit]
  }
  
  @scala.inline
  implicit class WalkOptionsNoVisitMutableBuilder[Self <: WalkOptionsNoVisit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: EnterOrLeaveFn[CssNode]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setLeave(value: EnterOrLeaveFn[CssNode]): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    @scala.inline
    def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
  }
}
