package typings.devextremeB5DqTZzf.anon

import typings.devextremeB5DqTZzf.mod.DevExpress.core.DxElement_
import typings.devextremeB5DqTZzf.mod.DevExpress.events.DxEvent
import typings.devextremeB5DqTZzf.mod.DevExpress.viz.dxPolarChart
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Argument extends StObject {
  
  var argument: js.UndefOr[js.Date | Double | String] = js.undefined
  
  var component: js.UndefOr[dxPolarChart] = js.undefined
  
  var element: js.UndefOr[DxElement_[HTMLElement]] = js.undefined
  
  var event: js.UndefOr[DxEvent[Event]] = js.undefined
  
  var model: js.UndefOr[Any] = js.undefined
}
object Argument {
  
  inline def apply(): Argument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Argument]
  }
  
  extension [Self <: Argument](x: Self) {
    
    inline def setArgument(value: js.Date | Double | String): Self = StObject.set(x, "argument", value.asInstanceOf[js.Any])
    
    inline def setArgumentUndefined: Self = StObject.set(x, "argument", js.undefined)
    
    inline def setComponent(value: dxPolarChart): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setEvent(value: DxEvent[Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
