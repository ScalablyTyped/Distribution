package typings.chartJs.anon

import typings.chartJs.chartJsBooleans.`true`
import typings.chartJs.mod.ChartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var cancelable: `true`
  
  var event: ChartEvent
  
  var inChartArea: Boolean
  
  var replay: Boolean
}
object Event {
  
  inline def apply(event: ChartEvent, inChartArea: Boolean, replay: Boolean): Event = {
    val __obj = js.Dynamic.literal(cancelable = true, event = event.asInstanceOf[js.Any], inChartArea = inChartArea.asInstanceOf[js.Any], replay = replay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setCancelable(value: `true`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: ChartEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInChartArea(value: Boolean): Self = StObject.set(x, "inChartArea", value.asInstanceOf[js.Any])
    
    inline def setReplay(value: Boolean): Self = StObject.set(x, "replay", value.asInstanceOf[js.Any])
  }
}
