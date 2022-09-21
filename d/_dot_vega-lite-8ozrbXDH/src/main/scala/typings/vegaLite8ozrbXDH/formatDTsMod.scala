package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.Expr
import typings.vegaLite8ozrbXDH.anon.NormalizeStack
import typings.vegaLite8ozrbXDH.anon.Signal
import typings.vegaLite8ozrbXDH.channeldefDTsMod.DatumDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.PrimitiveValue
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.datetimeDTsMod.DateTime
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType
import typings.vegaLite8ozrbXDH.timeunitDotDTsMod.TimeUnit
import typings.vegaLite8ozrbXDH.typeDotDTsMod.Type
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.number
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.time
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/format.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/format.d.ts", "BIN_RANGE_DELIMITER")
  @js.native
  val BIN_RANGE_DELIMITER: /* " \\u2013 " */ String = js.native
  
  inline def binFormatExpression(
    startField: String,
    endField: String,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("binFormatExpression")(startField.asInstanceOf[js.Any], endField.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def binFormatExpression(
    startField: String,
    endField: String,
    format: Dict[Any],
    formatType: String,
    config: Config[ExprRef | SignalRef]
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("binFormatExpression")(startField.asInstanceOf[js.Any], endField.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatCustomType(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfigField: NormalizeStack): Signal = ^.asInstanceOf[js.Dynamic].applyDynamic("formatCustomType")(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfigField.asInstanceOf[js.Any]).asInstanceOf[Signal]
  
  inline def formatSignalRef(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfig: Expr): Signal = ^.asInstanceOf[js.Dynamic].applyDynamic("formatSignalRef")(hasFieldOrDatumDefFormatFormatTypeExprNormalizeStackConfig.asInstanceOf[js.Any]).asInstanceOf[Signal]
  
  inline def guideFormat(
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    `type`: Type,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  inline def guideFormat(
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    `type`: Type,
    format: Dict[Any],
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  inline def guideFormat(
    fieldOrDatumDef: FieldDef[String, Any],
    `type`: Type,
    format: String,
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  inline def guideFormat(
    fieldOrDatumDef: FieldDef[String, Any],
    `type`: Type,
    format: Dict[Any],
    formatType: String,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormat")(fieldOrDatumDef.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], format.asInstanceOf[js.Any], formatType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  
  inline def guideFormatType(
    formatType: String,
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleType: ScaleType
  ): time | number | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef]
  inline def guideFormatType(formatType: String, fieldOrDatumDef: FieldDef[String, Any], scaleType: ScaleType): time | number | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef]
  inline def guideFormatType(
    formatType: SignalRef,
    fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    scaleType: ScaleType
  ): time | number | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef]
  inline def guideFormatType(formatType: SignalRef, fieldOrDatumDef: FieldDef[String, Any], scaleType: ScaleType): time | number | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("guideFormatType")(formatType.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[time | number | SignalRef]
  
  inline def isCustomFormatType(formatType: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomFormatType")(formatType.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def numberFormat(`type`: Type, specifiedFormat: String, config: Config[ExprRef | SignalRef]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(`type`.asInstanceOf[js.Any], specifiedFormat.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def numberFormat(`type`: Type, specifiedFormat: Dict[Any], config: Config[ExprRef | SignalRef]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("numberFormat")(`type`.asInstanceOf[js.Any], specifiedFormat.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def timeFormat(
    specifiedFormat: String,
    timeUnit: TimeUnit,
    config: Config[ExprRef | SignalRef],
    omitTimeFormatConfig: Boolean
  ): String | Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFormat")(specifiedFormat.asInstanceOf[js.Any], timeUnit.asInstanceOf[js.Any], config.asInstanceOf[js.Any], omitTimeFormatConfig.asInstanceOf[js.Any])).asInstanceOf[String | Signal]
  
  inline def timeFormatExpression(
    field: String,
    timeUnit: TimeUnit,
    format: String,
    rawTimeFormat: String,
    // should be provided only for actual text and headers, not axis/legend labels
  isUTCScale: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFormatExpression")(field.asInstanceOf[js.Any], timeUnit.asInstanceOf[js.Any], format.asInstanceOf[js.Any], rawTimeFormat.asInstanceOf[js.Any], isUTCScale.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def timeFormatExpression(
    field: String,
    timeUnit: TimeUnit,
    format: Dict[Any],
    rawTimeFormat: String,
    // should be provided only for actual text and headers, not axis/legend labels
  isUTCScale: Boolean
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("timeFormatExpression")(field.asInstanceOf[js.Any], timeUnit.asInstanceOf[js.Any], format.asInstanceOf[js.Any], rawTimeFormat.asInstanceOf[js.Any], isUTCScale.asInstanceOf[js.Any])).asInstanceOf[String]
}
