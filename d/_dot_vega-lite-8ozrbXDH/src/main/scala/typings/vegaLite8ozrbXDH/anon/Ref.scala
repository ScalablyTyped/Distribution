package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channelDTsMod.PolarPositionChannel
import typings.vegaLite8ozrbXDH.channelDTsMod.PositionChannel
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgValueRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ref extends StObject {
  
  var channel: PositionChannel | PolarPositionChannel
  
  var config: typings.vegaLite8ozrbXDH.configDotDTsMod.Config[SignalRef]
  
  var fieldDef: typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef[String, Any]
  
  var markDef: typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef[typings.vegaLite8ozrbXDH.markDotDTsMod.Mark, ExprRef | SignalRef]
  
  var ref: VgValueRef
}
object Ref {
  
  inline def apply(
    channel: PositionChannel | PolarPositionChannel,
    config: typings.vegaLite8ozrbXDH.configDotDTsMod.Config[SignalRef],
    fieldDef: typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef[String, Any],
    markDef: typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef[typings.vegaLite8ozrbXDH.markDotDTsMod.Mark, ExprRef | SignalRef],
    ref: VgValueRef
  ): Ref = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ref]
  }
  
  extension [Self <: Ref](x: Self) {
    
    inline def setChannel(value: PositionChannel | PolarPositionChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: typings.vegaLite8ozrbXDH.configDotDTsMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFieldDef(value: typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef[String, Any]): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    inline def setMarkDef(
      value: typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef[typings.vegaLite8ozrbXDH.markDotDTsMod.Mark, ExprRef | SignalRef]
    ): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
    
    inline def setRef(value: VgValueRef): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
