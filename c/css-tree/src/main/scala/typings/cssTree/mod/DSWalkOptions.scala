package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DSWalkOptions extends StObject {
  
  var enter: js.UndefOr[DSWalkEnterOrLeaveFn] = js.native
  
  var leave: js.UndefOr[DSWalkEnterOrLeaveFn] = js.native
}
object DSWalkOptions {
  
  @scala.inline
  def apply(): DSWalkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DSWalkOptions]
  }
  
  @scala.inline
  implicit class DSWalkOptionsMutableBuilder[Self <: DSWalkOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: /* node */ DSNode => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setLeave(value: /* node */ DSNode => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
  }
}
