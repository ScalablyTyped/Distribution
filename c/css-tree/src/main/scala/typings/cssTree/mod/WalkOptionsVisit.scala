package typings.cssTree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WalkOptionsVisit[NodeType /* <: CssNode */] extends StObject {
  
  var enter: js.UndefOr[EnterOrLeaveFn[NodeType]] = js.undefined
  
  var leave: js.UndefOr[EnterOrLeaveFn[NodeType]] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var visit: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any
}
object WalkOptionsVisit {
  
  inline def apply[NodeType /* <: CssNode */](
    visit: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any
  ): WalkOptionsVisit[NodeType] = {
    val __obj = js.Dynamic.literal(visit = visit.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkOptionsVisit[NodeType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WalkOptionsVisit[?], NodeType /* <: CssNode */] (val x: Self & WalkOptionsVisit[NodeType]) extends AnyVal {
    
    inline def setEnter(value: EnterOrLeaveFn[NodeType]): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    inline def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    inline def setLeave(value: EnterOrLeaveFn[NodeType]): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    inline def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setVisit(
      value: /* import warning: importer.ImportType#apply Failed type conversion: NodeType['type'] */ js.Any
    ): Self = StObject.set(x, "visit", value.asInstanceOf[js.Any])
  }
}
