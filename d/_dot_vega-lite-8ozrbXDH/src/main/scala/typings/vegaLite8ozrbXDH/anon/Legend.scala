package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channelDTsMod.NonPositionScaleChannel
import typings.vegaLite8ozrbXDH.legendDTsMod.LegendInternal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Legend extends StObject {
  
  var channel: NonPositionScaleChannel
  
  var legend: LegendInternal
  
  var scaleType: typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType
  
  var timeUnit: js.UndefOr[typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnit] = js.undefined
}
object Legend {
  
  inline def apply(
    channel: NonPositionScaleChannel,
    legend: LegendInternal,
    scaleType: typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType
  ): Legend = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], legend = legend.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
  
  extension [Self <: Legend](x: Self) {
    
    inline def setChannel(value: NonPositionScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setLegend(value: LegendInternal): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setScaleType(value: typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setTimeUnit(value: typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnit): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
  }
}
