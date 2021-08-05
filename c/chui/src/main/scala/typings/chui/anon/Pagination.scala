package typings.chui.anon

import typings.chui.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pagination extends StObject {
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var pagination: js.UndefOr[Boolean] = js.undefined
  
  var panels: JQuery
  
  var target: js.Any
}
object Pagination {
  
  inline def apply(panels: JQuery, target: js.Any): Pagination = {
    val __obj = js.Dynamic.literal(panels = panels.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pagination]
  }
  
  extension [Self <: Pagination](x: Self) {
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setPagination(value: Boolean): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setPanels(value: JQuery): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: js.Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
