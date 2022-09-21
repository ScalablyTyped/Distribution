package typings.vegaLite8ozrbXDH.anon

import typings.vegaLite8ozrbXDH.channeldefDTsMod.DatumDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.PrimitiveValue
import typings.vegaLite8ozrbXDH.datetimeDTsMod.DateTime
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.datum
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.datumDotdatum
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.parent
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expr extends StObject {
  
  var config: typings.vegaLite8ozrbXDH.configDotDTsMod.Config[ExprRef | SignalRef]
  
  var expr: js.UndefOr[datum | parent | datumDotdatum] = js.undefined
  
  var fieldOrDatumDef: (typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
  
  var format: String | Dict[Any]
  
  var formatType: String
  
  var normalizeStack: js.UndefOr[Boolean] = js.undefined
}
object Expr {
  
  inline def apply(
    config: typings.vegaLite8ozrbXDH.configDotDTsMod.Config[ExprRef | SignalRef],
    fieldOrDatumDef: (typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]),
    format: String | Dict[Any],
    formatType: String
  ): Expr = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], formatType = formatType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expr]
  }
  
  extension [Self <: Expr](x: Self) {
    
    inline def setConfig(value: typings.vegaLite8ozrbXDH.configDotDTsMod.Config[ExprRef | SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setExpr(value: datum | parent | datumDotdatum): Self = StObject.set(x, "expr", value.asInstanceOf[js.Any])
    
    inline def setExprUndefined: Self = StObject.set(x, "expr", js.undefined)
    
    inline def setFieldOrDatumDef(
      value: (typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])
    ): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String | Dict[Any]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatType(value: String): Self = StObject.set(x, "formatType", value.asInstanceOf[js.Any])
    
    inline def setNormalizeStack(value: Boolean): Self = StObject.set(x, "normalizeStack", value.asInstanceOf[js.Any])
    
    inline def setNormalizeStackUndefined: Self = StObject.set(x, "normalizeStack", js.undefined)
  }
}
