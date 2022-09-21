package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channeldefDTsMod.DatumDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.PrimitiveValue
import typings.vegaLite8ozrbXDH.channeldefDTsMod.SecondaryChannelDef
import typings.vegaLite8ozrbXDH.datetimeDTsMod.DateTime
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: typings.vegaLite8ozrbXDH.configDotDTsMod.Config[SignalRef]
  
  var fieldDef: (typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
  
  var fieldDef2: js.UndefOr[SecondaryChannelDef[String]] = js.undefined
  
  var markDef: typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef[typings.vegaLite8ozrbXDH.markDotDTsMod.Mark, SignalRef]
}
object Config {
  
  inline def apply(
    config: typings.vegaLite8ozrbXDH.configDotDTsMod.Config[SignalRef],
    fieldDef: (typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
    markDef: typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef[typings.vegaLite8ozrbXDH.markDotDTsMod.Mark, SignalRef]
  ): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], fieldDef = fieldDef.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: typings.vegaLite8ozrbXDH.configDotDTsMod.Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setFieldDef(
      value: (typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    ): Self = StObject.set(x, "fieldDef", value.asInstanceOf[js.Any])
    
    inline def setFieldDef2(value: SecondaryChannelDef[String]): Self = StObject.set(x, "fieldDef2", value.asInstanceOf[js.Any])
    
    inline def setFieldDef2Undefined: Self = StObject.set(x, "fieldDef2", js.undefined)
    
    inline def setMarkDef(
      value: typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef[typings.vegaLite8ozrbXDH.markDotDTsMod.Mark, SignalRef]
    ): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
  }
}
