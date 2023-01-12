package typings.chartJs.anon

import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.mod.ChartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Changed extends StObject {
  
  var cancelable: `false`
  
  var changed: js.UndefOr[Boolean] = js.undefined
  
  var event: ChartEvent
  
  var inChartArea: Boolean
  
  var replay: Boolean
}
object Changed {
  
  inline def apply(event: ChartEvent, inChartArea: Boolean, replay: Boolean): Changed = {
    val __obj = js.Dynamic.literal(cancelable = false, event = event.asInstanceOf[js.Any], inChartArea = inChartArea.asInstanceOf[js.Any], replay = replay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Changed] (val x: Self) extends AnyVal {
    
    inline def setCancelable(value: `false`): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setChanged(value: Boolean): Self = StObject.set(x, "changed", value.asInstanceOf[js.Any])
    
    inline def setChangedUndefined: Self = StObject.set(x, "changed", js.undefined)
    
    inline def setEvent(value: ChartEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setInChartArea(value: Boolean): Self = StObject.set(x, "inChartArea", value.asInstanceOf[js.Any])
    
    inline def setReplay(value: Boolean): Self = StObject.set(x, "replay", value.asInstanceOf[js.Any])
  }
}
