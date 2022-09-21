package typings.vegaLite8ozrbXDH

import typings.std.Exclude
import typings.vegaLite8ozrbXDH.anon.Step
import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.ScaleDatumDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.ScaleFieldDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.TypedFieldDef
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.datetimeDTsMod.DateTime
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.markDotDTsMod.Mark
import typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef
import typings.vegaLite8ozrbXDH.markDotDTsMod.RectConfig
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.scaleDTsMod.Domain
import typings.vegaLite8ozrbXDH.scaleDTsMod.DomainUnionWith
import typings.vegaLite8ozrbXDH.scaleDTsMod.FieldRange
import typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleConfig
import typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType
import typings.vegaLite8ozrbXDH.scaleDTsMod.SchemeParams
import typings.vegaLite8ozrbXDH.selectionDTsMod.ParameterExtent
import typings.vegaLite8ozrbXDH.signalDTsMod.SignalRefWrapper
import typings.vegaLite8ozrbXDH.sortDTsMod.Sort
import typings.vegaLite8ozrbXDH.typeDotDTsMod.Type
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.binned
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.range
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.unaggregated
import typings.vegaTypings.scaleMod.RangeEnum
import typings.vegaTypings.scaleMod.ScaleBins
import typings.vegaTypings.scaleMod.ScaleInterpolateEnum
import typings.vegaTypings.scaleMod.ScaleInterpolateParams
import typings.vegaTypings.scaleMod.TimeInterval
import typings.vegaTypings.scaleMod.TimeIntervalStep
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object propertiesDDotTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bins_binned(model: Model, fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]): SignalRefWrapper | Step = (^.asInstanceOf[js.Dynamic].applyDynamic("bins")(model.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any])).asInstanceOf[SignalRefWrapper | Step]
  
  inline def interpolate(channel: ScaleChannel, `type`: Type): js.UndefOr[ScaleInterpolateEnum | ExprRef | SignalRef | ScaleInterpolateParams] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(channel.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ScaleInterpolateEnum | ExprRef | SignalRef | ScaleInterpolateParams]]
  
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: Double,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: Unit,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: DateTime,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: ExprRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: SignalRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: Double,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: Unit,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: DateTime,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: ExprRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: SignalRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: Double,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: Unit,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: DateTime,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: ExprRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: SignalRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: Double,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: Unit,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: DateTime,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: ExprRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: SignalRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: Double,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: Unit,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: DateTime,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: ExprRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: SignalRef,
    fieldOrDatumDef: ScaleDatumDef[String]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: Double,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: Unit,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: DateTime,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: ExprRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Double,
    domainMax: SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: Double,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: Unit,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: DateTime,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: ExprRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: Unit,
    domainMax: SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: Double,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: Unit,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: DateTime,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: ExprRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: DateTime,
    domainMax: SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: Double,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: Unit,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: DateTime,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: ExprRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: ExprRef,
    domainMax: SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: Double,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: Unit,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: DateTime,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: ExprRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  inline def nice_binned(
    scaleType: ScaleType,
    channel: ScaleChannel,
    specifiedDomain: Domain,
    domainMin: SignalRef,
    domainMax: SignalRef,
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]
  ): Boolean | TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("nice")(scaleType.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], domainMin.asInstanceOf[js.Any], domainMax.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any])).asInstanceOf[Boolean | TimeInterval]
  
  inline def padding(
    channel: ScaleChannel,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    fieldOrDatumDef: ScaleDatumDef[String],
    markDef: MarkDef[Mark, SignalRef],
    barConfig: RectConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("padding")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], barConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  
  inline def paddingInner(
    paddingValue: Double,
    channel: ScaleChannel,
    mark: Mark,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingInner")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingInner(
    paddingValue: Double,
    channel: ScaleChannel,
    mark: Mark,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingInner")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingInner(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    mark: Mark,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingInner")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingInner(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    mark: Mark,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingInner")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  
  inline def paddingOuter(
    paddingValue: Double,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: Double,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: Double,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: Double,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: Double,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: SignalRef,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: Double,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: SignalRef,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: Double,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: Double,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: SignalRef,
    scaleConfig: ScaleConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  inline def paddingOuter(
    paddingValue: SignalRef,
    channel: ScaleChannel,
    scaleType: ScaleType,
    paddingInnerValue: SignalRef,
    scaleConfig: ScaleConfig[SignalRef],
    hasNestedOffsetScale: Boolean
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("paddingOuter")(paddingValue.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], paddingInnerValue.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  
  inline def padding_binned(
    channel: ScaleChannel,
    scaleType: ScaleType,
    scaleConfig: ScaleConfig[SignalRef],
    fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    markDef: MarkDef[Mark, SignalRef],
    barConfig: RectConfig[SignalRef]
  ): Double | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("padding")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any], fieldOrDatumDef.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], barConfig.asInstanceOf[js.Any])).asInstanceOf[Double | SignalRef]
  
  inline def parseNonUnitScaleProperty(
    model: Model,
    property: /* keyof .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/scale.d.ts.Scale<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/expr.d.ts.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/scale/component.d.ts.ScaleComponentProps */ String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNonUnitScaleProperty")(model.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseScaleProperty_range(
    model: Model,
    property: Exclude[
      /* keyof .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/scale.d.ts.Scale<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/expr.d.ts.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/scale/component.d.ts.ScaleComponentProps */ String, 
      range
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseScaleProperty")(model.asInstanceOf[js.Any], property.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseScaleRange(model: Model): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseScaleRange")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reverse(
    scaleType: ScaleType,
    sort: Sort[String],
    channel: ScaleChannel,
    scaleConfig: ScaleConfig[SignalRef]
  ): Boolean | SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(scaleType.asInstanceOf[js.Any], sort.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], scaleConfig.asInstanceOf[js.Any])).asInstanceOf[Boolean | SignalRef]
  
  /* Inlined {[ k in keyof .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/scale.d.ts.Scale<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/expr.d.ts.ExprRef | vega.vega.SignalRef> ]:? (params : .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts.ScaleRuleParams): .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/scale.d.ts.Scale<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/expr.d.ts.ExprRef | vega.vega.SignalRef>[k]} */
  object scaleRules {
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.align")
    @js.native
    def align: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def align_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.base")
    @js.native
    def base: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def base_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("base")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.bins")
    @js.native
    def bins: js.UndefOr[js.Function1[/* params */ ScaleRuleParams, js.UndefOr[ScaleBins]]] = js.native
    inline def bins_=(x: js.UndefOr[js.Function1[/* params */ ScaleRuleParams, js.UndefOr[ScaleBins]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bins")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.clamp")
    @js.native
    def clamp: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    inline def clamp_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clamp")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.constant")
    @js.native
    def constant: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def constant_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("constant")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.domain")
    @js.native
    def domain: js.UndefOr[
        js.Function1[
          /* params */ ScaleRuleParams, 
          js.UndefOr[
            (js.Array[Null | String | Double | Boolean | DateTime | ExprRef | SignalRef]) | unaggregated | ParameterExtent | DomainUnionWith | ExprRef | SignalRef
          ]
        ]
      ] = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.domainMax")
    @js.native
    def domainMax: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
      ] = js.native
    inline def domainMax_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainMax")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.domainMid")
    @js.native
    def domainMid: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def domainMid_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainMid")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.domainMin")
    @js.native
    def domainMin: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
      ] = js.native
    inline def domainMin_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | DateTime | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domainMin")(x.asInstanceOf[js.Any])
    
    inline def domain_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[
              (js.Array[Null | String | Double | Boolean | DateTime | ExprRef | SignalRef]) | unaggregated | ParameterExtent | DomainUnionWith | ExprRef | SignalRef
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("domain")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.exponent")
    @js.native
    def exponent: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def exponent_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exponent")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.interpolate")
    @js.native
    def interpolate: js.UndefOr[
        js.Function1[
          /* params */ ScaleRuleParams, 
          js.UndefOr[ScaleInterpolateEnum | ExprRef | SignalRef | ScaleInterpolateParams]
        ]
      ] = js.native
    inline def interpolate_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[ScaleInterpolateEnum | ExprRef | SignalRef | ScaleInterpolateParams]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.nice")
    @js.native
    def nice: js.UndefOr[
        js.Function1[
          /* params */ ScaleRuleParams, 
          js.UndefOr[Boolean | Double | TimeInterval | TimeIntervalStep | ExprRef | SignalRef]
        ]
      ] = js.native
    inline def nice_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[Boolean | Double | TimeInterval | TimeIntervalStep | ExprRef | SignalRef]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nice")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.padding")
    @js.native
    def padding: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.paddingInner")
    @js.native
    def paddingInner: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def paddingInner_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingInner")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.paddingOuter")
    @js.native
    def paddingOuter: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
      ] = js.native
    inline def paddingOuter_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paddingOuter")(x.asInstanceOf[js.Any])
    
    inline def padding_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("padding")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.range")
    @js.native
    def range: js.UndefOr[
        js.Function1[
          /* params */ ScaleRuleParams, 
          js.UndefOr[
            RangeEnum | (js.Array[Double | String | js.Array[Double] | ExprRef | SignalRef]) | FieldRange
          ]
        ]
      ] = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.rangeMax")
    @js.native
    def rangeMax: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
      ] = js.native
    inline def rangeMax_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rangeMax")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.rangeMin")
    @js.native
    def rangeMin: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
      ] = js.native
    inline def rangeMin_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Double | String | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rangeMin")(x.asInstanceOf[js.Any])
    
    inline def range_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[
              RangeEnum | (js.Array[Double | String | js.Array[Double] | ExprRef | SignalRef]) | FieldRange
            ]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("range")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.reverse")
    @js.native
    def reverse: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    inline def reverse_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reverse")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.round")
    @js.native
    def round: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    inline def round_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("round")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.scheme")
    @js.native
    def scheme: js.UndefOr[
        js.Function1[
          /* params */ ScaleRuleParams, 
          js.UndefOr[String | SchemeParams | ExprRef | SignalRef]
        ]
      ] = js.native
    inline def scheme_=(
      x: js.UndefOr[
          js.Function1[
            /* params */ ScaleRuleParams, 
            js.UndefOr[String | SchemeParams | ExprRef | SignalRef]
          ]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("scheme")(x.asInstanceOf[js.Any])
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.type")
    @js.native
    val `type`: js.UndefOr[js.Function1[/* params */ ScaleRuleParams, js.UndefOr[ScaleType]]] = js.native
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/properties.d.ts", "scaleRules.zero")
    @js.native
    def zero: js.UndefOr[
        js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
      ] = js.native
    inline def zero_=(
      x: js.UndefOr[
          js.Function1[/* params */ ScaleRuleParams, js.UndefOr[Boolean | ExprRef | SignalRef]]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("zero")(x.asInstanceOf[js.Any])
  }
  
  inline def zero(
    channel: ScaleChannel,
    fieldDef: ScaleDatumDef[String],
    specifiedDomain: Domain,
    markDef: MarkDef[Mark, ExprRef | SignalRef],
    scaleType: ScaleType
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("zero")(channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def zero_binned(
    channel: ScaleChannel,
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    specifiedDomain: Domain,
    markDef: MarkDef[Mark, ExprRef | SignalRef],
    scaleType: ScaleType
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("zero")(channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], specifiedDomain.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait ScaleRuleParams extends StObject {
    
    var channel: ScaleChannel
    
    var config: Config[SignalRef]
    
    var domain: Domain
    
    var domainMax: js.UndefOr[Double | DateTime | ExprRef | SignalRef] = js.undefined
    
    var domainMin: js.UndefOr[Double | DateTime | ExprRef | SignalRef] = js.undefined
    
    var fieldOrDatumDef: (ScaleFieldDef[String, Type, Boolean | BinParams | Null]) | ScaleDatumDef[String]
    
    var hasNestedOffsetScale: Boolean
    
    var markDef: MarkDef[Mark, SignalRef]
    
    var model: Model
    
    var scalePadding: Double | SignalRef
    
    var scalePaddingInner: Double | SignalRef
    
    var scaleType: ScaleType
  }
  object ScaleRuleParams {
    
    inline def apply(
      channel: ScaleChannel,
      config: Config[SignalRef],
      domain: Domain,
      fieldOrDatumDef: (ScaleFieldDef[String, Type, Boolean | BinParams | Null]) | ScaleDatumDef[String],
      hasNestedOffsetScale: Boolean,
      markDef: MarkDef[Mark, SignalRef],
      model: Model,
      scalePadding: Double | SignalRef,
      scalePaddingInner: Double | SignalRef,
      scaleType: ScaleType
    ): ScaleRuleParams = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], fieldOrDatumDef = fieldOrDatumDef.asInstanceOf[js.Any], hasNestedOffsetScale = hasNestedOffsetScale.asInstanceOf[js.Any], markDef = markDef.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], scalePadding = scalePadding.asInstanceOf[js.Any], scalePaddingInner = scalePaddingInner.asInstanceOf[js.Any], scaleType = scaleType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScaleRuleParams]
    }
    
    extension [Self <: ScaleRuleParams](x: Self) {
      
      inline def setChannel(value: ScaleChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setConfig(value: Config[SignalRef]): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: Domain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainMax(value: Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "domainMax", value.asInstanceOf[js.Any])
      
      inline def setDomainMaxUndefined: Self = StObject.set(x, "domainMax", js.undefined)
      
      inline def setDomainMin(value: Double | DateTime | ExprRef | SignalRef): Self = StObject.set(x, "domainMin", value.asInstanceOf[js.Any])
      
      inline def setDomainMinUndefined: Self = StObject.set(x, "domainMin", js.undefined)
      
      inline def setDomainVarargs(value: (Null | String | Double | Boolean | DateTime | SignalRef)*): Self = StObject.set(x, "domain", js.Array(value*))
      
      inline def setFieldOrDatumDef(value: (ScaleFieldDef[String, Type, Boolean | BinParams | Null]) | ScaleDatumDef[String]): Self = StObject.set(x, "fieldOrDatumDef", value.asInstanceOf[js.Any])
      
      inline def setHasNestedOffsetScale(value: Boolean): Self = StObject.set(x, "hasNestedOffsetScale", value.asInstanceOf[js.Any])
      
      inline def setMarkDef(value: MarkDef[Mark, SignalRef]): Self = StObject.set(x, "markDef", value.asInstanceOf[js.Any])
      
      inline def setModel(value: Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setScalePadding(value: Double | SignalRef): Self = StObject.set(x, "scalePadding", value.asInstanceOf[js.Any])
      
      inline def setScalePaddingInner(value: Double | SignalRef): Self = StObject.set(x, "scalePaddingInner", value.asInstanceOf[js.Any])
      
      inline def setScaleType(value: ScaleType): Self = StObject.set(x, "scaleType", value.asInstanceOf[js.Any])
    }
  }
}
