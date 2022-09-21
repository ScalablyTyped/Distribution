package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channelDTsMod.NonPositionScaleChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleType extends StObject {
  
  var channel: NonPositionScaleChannel
  
  var scaleType: typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType
  
  var timeUnit: js.UndefOr[typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnit] = js.undefined
}
object ScaleType {
  
  inline def apply(channel: NonPositionScaleChannel, scaleType: typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType): ScaleType = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleType]
  }
  
  extension [Self <: ScaleType](x: Self) {
    
    inline def setChannel(value: NonPositionScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setScaleType(value: typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    
    inline def setTimeUnit(value: typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnit): Self = StObject.set(x, "timeUnit", value.asInstanceOf[js.Any])
    
    inline def setTimeUnitUndefined: Self = StObject.set(x, "timeUnit", js.undefined)
  }
}
