package typings.chartist

import typings.chartist.distCoreTypesMod.AxisOptions
import typings.chartist.distCoreTypesMod.DataEvent
import typings.chartist.distCoreTypesMod.Options
import typings.chartist.distCoreTypesMod.OptionsChangedEvent
import typings.chartist.distSvgTypesMod.AnimationEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distChartsTypesMod {
  
  trait BaseChartEventsTypes[TCreateEvent, TDrawEvents] extends StObject {
    
    var animationBegin: AnimationEvent
    
    var animationEnd: AnimationEvent
    
    var created: TCreateEvent
    
    var data: DataEvent
    
    var draw: TDrawEvents
    
    var options: OptionsChangedEvent[Options[AxisOptions, AxisOptions]]
  }
  object BaseChartEventsTypes {
    
    inline def apply[TCreateEvent, TDrawEvents](
      animationBegin: AnimationEvent,
      animationEnd: AnimationEvent,
      created: TCreateEvent,
      data: DataEvent,
      draw: TDrawEvents,
      options: OptionsChangedEvent[Options[AxisOptions, AxisOptions]]
    ): BaseChartEventsTypes[TCreateEvent, TDrawEvents] = {
      val __obj = js.Dynamic.literal(animationBegin = animationBegin.asInstanceOf[js.Any], animationEnd = animationEnd.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], draw = draw.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseChartEventsTypes[TCreateEvent, TDrawEvents]]
    }
    
    extension [Self <: BaseChartEventsTypes[?, ?], TCreateEvent, TDrawEvents](x: Self & (BaseChartEventsTypes[TCreateEvent, TDrawEvents])) {
      
      inline def setAnimationBegin(value: AnimationEvent): Self = StObject.set(x, "animationBegin", value.asInstanceOf[js.Any])
      
      inline def setAnimationEnd(value: AnimationEvent): Self = StObject.set(x, "animationEnd", value.asInstanceOf[js.Any])
      
      inline def setCreated(value: TCreateEvent): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      inline def setData(value: DataEvent): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDraw(value: TDrawEvents): Self = StObject.set(x, "draw", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: OptionsChangedEvent[Options[AxisOptions, AxisOptions]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
