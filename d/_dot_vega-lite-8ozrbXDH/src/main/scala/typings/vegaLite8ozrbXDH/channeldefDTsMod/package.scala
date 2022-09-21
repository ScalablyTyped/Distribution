package typings.vegaLite8ozrbXDH.channeldefDTsMod

import typings.std.Partial
import typings.vegaLite8ozrbXDH.anon.Aggregate
import typings.vegaLite8ozrbXDH.anon.AllowDisabling
import typings.vegaLite8ozrbXDH.anon.BandPosition
import typings.vegaLite8ozrbXDH.anon.Compatible
import typings.vegaLite8ozrbXDH.anon.CompositeMark
import typings.vegaLite8ozrbXDH.anon.Format
import typings.vegaLite8ozrbXDH.anon.Header
import typings.vegaLite8ozrbXDH.anon.Signal
import typings.vegaLite8ozrbXDH.anon.Test
import typings.vegaLite8ozrbXDH.anon.TimeUnit
import typings.vegaLite8ozrbXDH.binDTsMod.Bin
import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channelDTsMod.Channel
import typings.vegaLite8ozrbXDH.channelDTsMod.ExtendedChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.^
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.datetimeDTsMod.DateTime
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.guideDotDTsMod.Guide
import typings.vegaLite8ozrbXDH.guideDotDTsMod.GuideEncodingConditionalValueDef
import typings.vegaLite8ozrbXDH.indexDotdDottsMod.CompositeAggregate
import typings.vegaLite8ozrbXDH.markDotDTsMod.Mark
import typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef
import typings.vegaLite8ozrbXDH.markDotDTsMod.RelativeBandSize
import typings.vegaLite8ozrbXDH.predicateDotDTsMod.ParameterPredicate
import typings.vegaLite8ozrbXDH.transformDTsMod.AggregatedFieldDef
import typings.vegaLite8ozrbXDH.transformDTsMod.WindowFieldDef
import typings.vegaLite8ozrbXDH.typeDotDTsMod.StandardType
import typings.vegaLite8ozrbXDH.typeDotDTsMod.Type
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.binned
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.height
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.width
import typings.vegaTypings.encodeMod.Gradient
import typings.vegaTypings.encodeMod.Text
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def binRequiresRange(fieldDef: FieldDef[String, Any], channel: Channel): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("binRequiresRange")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def channelCompatibility_binned(fieldDef: TypedFieldDef[Field, Any, Boolean | BinParams | binned | Null], channel: ExtendedChannel): Compatible = (^.asInstanceOf[js.Dynamic].applyDynamic("channelCompatibility")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Compatible]

inline def channelDefType[F /* <: Field */](channelDef: ChannelDef[F]): js.UndefOr[Type] = ^.asInstanceOf[js.Dynamic].applyDynamic("channelDefType")(channelDef.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Type]]

inline def defaultTitle(fieldDef: FieldDefBase[String, Bin], config: Config[ExprRef | SignalRef]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTitle")(fieldDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]

inline def defaultTitleFormatter: FieldTitleFormatter = ^.asInstanceOf[js.Dynamic].selectDynamic("defaultTitleFormatter").asInstanceOf[FieldTitleFormatter]

inline def defaultType[T /* <: TypedFieldDef[Field, Any, Boolean | BinParams | binned | Null] */](fieldDef: T, channel: ExtendedChannel): Type = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultType")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Type]

inline def functionalTitleFormatter(fieldDef: FieldDefBase[String, Bin]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("functionalTitleFormatter")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[String]

inline def getBandPosition(hasFieldDefFieldDef2MarkConfig: typings.vegaLite8ozrbXDH.anon.Config): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getBandPosition")(hasFieldDefFieldDef2MarkConfig.asInstanceOf[js.Any]).asInstanceOf[Double]

inline def getBandSize(
  hasChannelFieldDefFieldDef2MarkConfigScaleTypeUseVlSizeChannel: typings.vegaLite8ozrbXDH.anon.Channel
): Double | RelativeBandSize | SignalRef = ^.asInstanceOf[js.Dynamic].applyDynamic("getBandSize")(hasChannelFieldDefFieldDef2MarkConfigScaleTypeUseVlSizeChannel.asInstanceOf[js.Any]).asInstanceOf[Double | RelativeBandSize | SignalRef]

inline def getFieldDef[F /* <: Field */](channelDef: ChannelDef[F]): FieldDef[F, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[FieldDef[F, Any]]

inline def getFieldOrDatumDef[F /* <: Field */, CD /* <: ChannelDef[F] */](channelDef: CD): (FieldDef[F, Any]) | (DatumDef[F, PrimitiveValue | DateTime | ExprRef | SignalRef]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[(FieldDef[F, Any]) | (DatumDef[F, PrimitiveValue | DateTime | ExprRef | SignalRef])]

inline def getFormatMixins(fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): Format = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatMixins")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Format]

inline def getFormatMixins_binned(fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]): Format = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormatMixins")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Format]

inline def getGuide(fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): Guide = ^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Guide]
inline def getGuide(fieldDef: SecondaryFieldDef[String]): Guide = ^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Guide]

inline def getGuide_binned(fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]): Guide = ^.asInstanceOf[js.Dynamic].applyDynamic("getGuide")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Guide]

inline def hasBandEnd(
  fieldDef: FieldDef[String, Any],
  fieldDef2: SecondaryChannelDef[String],
  markDef: MarkDef[Mark, SignalRef],
  config: Config[SignalRef]
): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasBandEnd")(fieldDef.asInstanceOf[js.Any], fieldDef2.asInstanceOf[js.Any], markDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def hasConditionalFieldDef[F /* <: Field */](channelDef: Partial[ChannelDef[F]]): /* is .vega-lite-8ozrbXDH.anon.0<F> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH.anon.0<F> */ Boolean]

inline def hasConditionalFieldOrDatumDef[F /* <: Field */](channelDef: ChannelDef[F]): /* is .vega-lite-8ozrbXDH.anon.0<F> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH.anon.0<F> */ Boolean]

inline def hasConditionalValueDef[F /* <: Field */](channelDef: ChannelDef[F]): /* is .vega-lite-8ozrbXDH.anon.ValueDefanyconditionCondi */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasConditionalValueDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH.anon.ValueDefanyconditionCondi */ Boolean]

inline def initChannelDef(channelDef: ChannelDef[String], channel: ExtendedChannel, config: Config[ExprRef | SignalRef]): ChannelDef[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("initChannelDef")(channelDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ChannelDef[String]]
inline def initChannelDef(
  channelDef: ChannelDef[String],
  channel: ExtendedChannel,
  config: Config[ExprRef | SignalRef],
  opt: CompositeMark
): ChannelDef[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("initChannelDef")(channelDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[ChannelDef[String]]

inline def initFieldDef(fd: FieldDef[String, Any], channel: ExtendedChannel): Aggregate | BandPosition | typings.vegaLite8ozrbXDH.anon.Bin | typings.vegaLite8ozrbXDH.anon.Field | Header = (^.asInstanceOf[js.Dynamic].applyDynamic("initFieldDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Aggregate | BandPosition | typings.vegaLite8ozrbXDH.anon.Bin | typings.vegaLite8ozrbXDH.anon.Field | Header]
inline def initFieldDef(fd: FieldDef[String, Any], channel: ExtendedChannel, hasCompositeMark: CompositeMark): Aggregate | BandPosition | typings.vegaLite8ozrbXDH.anon.Bin | typings.vegaLite8ozrbXDH.anon.Field | Header = (^.asInstanceOf[js.Dynamic].applyDynamic("initFieldDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], hasCompositeMark.asInstanceOf[js.Any])).asInstanceOf[Aggregate | BandPosition | typings.vegaLite8ozrbXDH.anon.Bin | typings.vegaLite8ozrbXDH.anon.Field | Header]

inline def initFieldOrDatumDef(
  fd: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
  channel: ExtendedChannel,
  config: Config[ExprRef | SignalRef],
  opt: CompositeMark
): (FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) = (^.asInstanceOf[js.Dynamic].applyDynamic("initFieldOrDatumDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[(FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])]
inline def initFieldOrDatumDef(
  fd: FieldDef[String, Any],
  channel: ExtendedChannel,
  config: Config[ExprRef | SignalRef],
  opt: CompositeMark
): (FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) = (^.asInstanceOf[js.Dynamic].applyDynamic("initFieldOrDatumDef")(fd.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], config.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[(FieldDef[String, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef])]

inline def isConditionalDef(channelDef: ExprRef): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isConditionalDef(channelDef: GuideEncodingConditionalValueDef): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isConditionalDef(channelDef: SignalRef): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isConditionalDef[CD /* <: js.UndefOr[
PolarDef[Any] | ShapeDef[Any] | (FieldDefWithoutScale[Any, StandardType]) | OrderFieldDef[Any] | (js.Array[
  (FieldDefWithoutScale[Any, StandardType]) | OrderFieldDef[Any] | StringFieldDef[Any]
]) | OrderValueDef | ColorDef[Any] | (OffsetDef[Any, StandardType]) | StringFieldDefWithCondition[Any] | (StringValueDefWithCondition[Any, StandardType]) | TextDef[Any] | NumericArrayMarkPropDef[Any] | Position2Def[Any] | PositionDef[Any] | Null | LatLongDef[Any] | NumericMarkPropDef[Any]] */](channelDef: CD): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isConditionalParameter[T](c: Conditional[T]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.ConditionalParameter<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConditionalParameter")(c.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.ConditionalParameter<T> */ Boolean]

inline def isContinuousFieldOrDatumDef[F /* <: Field */](cd: ChannelDef[F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContinuousFieldOrDatumDef")(cd.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isCount(fieldDef: FieldDefBase[Field, Bin]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCount")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDatumDef[F /* <: Field */](channelDef: Partial[ChannelDef[F]]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.DatumDef<F, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.DatumDef<F, any> */ Boolean]
inline def isDatumDef[F /* <: Field */](channelDef: DatumDef[F, Any]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.DatumDef<F, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.DatumDef<F, any> */ Boolean]
inline def isDatumDef[F /* <: Field */](channelDef: FieldDefBase[F, Bin]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.DatumDef<F, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.DatumDef<F, any> */ Boolean]

inline def isDiscrete(`def`: DatumDef[Any, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDiscrete_binned(`def`: TypedFieldDef[Field, Any, Boolean | BinParams | binned | Null]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscrete")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDiscretizing(`def`: DatumDef[Any, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscretizing")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isDiscretizing_binned(`def`: TypedFieldDef[Field, Any, Boolean | BinParams | binned | Null]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDiscretizing")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isFieldDef[F /* <: Field */](channelDef: Partial[ChannelDef[F]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFieldDef[F /* <: Field */](channelDef: DatumDef[F, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFieldDef[F /* <: Field */](channelDef: FieldDefBase[F, Bin]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isFieldOrDatumDef[F /* <: Field */](channelDef: Partial[ChannelDef[F]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isFieldOrDatumDefForTimeFormat(fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDefForTimeFormat")(fieldOrDatumDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isFieldOrDatumDefForTimeFormat(fieldOrDatumDef: FieldDef[String, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFieldOrDatumDefForTimeFormat")(fieldOrDatumDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isMarkPropFieldOrDatumDef[F /* <: Field */](channelDef: ChannelDef[F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMarkPropFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isNumericDataDef[F /* <: Field */](cd: ChannelDef[F]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.DatumDef<F, number> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNumericDataDef")(cd.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.DatumDef<F, number> */ Boolean]

inline def isPositionFieldOrDatumDef[F /* <: Field */](channelDef: ChannelDef[F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPositionFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isQuantitativeFieldOrDatumDef[F /* <: Field */](cd: ChannelDef[F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isQuantitativeFieldOrDatumDef")(cd.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isRepeatRef(field: Any | Field): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.RepeatRef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRepeatRef")(field.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.RepeatRef */ Boolean]

inline def isScaleFieldDef[F /* <: Field */](channelDef: ChannelDef[F]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.ScaleFieldDef<F, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/type.d.ts.StandardType, boolean | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/bin.d.ts.BinParams | null> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isScaleFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.ScaleFieldDef<F, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/type.d.ts.StandardType, boolean | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/bin.d.ts.BinParams | null> */ Boolean]

inline def isSortableFieldDef[F /* <: Field */](fieldDef: FieldDef[F, Any]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.SortableFieldDef<F, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/type.d.ts.StandardType, boolean | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/bin.d.ts.BinParams | null> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSortableFieldDef")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.SortableFieldDef<F, .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/type.d.ts.StandardType, boolean | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/bin.d.ts.BinParams | null> */ Boolean]

inline def isStringFieldOrDatumDef[F /* <: Field */](channelDef: ChannelDef[F]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStringFieldOrDatumDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isTimeFieldDef(`def`: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeFieldDef")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
inline def isTimeFieldDef(`def`: FieldDef[Any, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTimeFieldDef")(`def`.asInstanceOf[js.Any]).asInstanceOf[Boolean]

inline def isTypedFieldDef[F /* <: Field */](channelDef: ChannelDef[F]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.TypedFieldDef<F, any, boolean | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/bin.d.ts.BinParams | 'binned' | null> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTypedFieldDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.TypedFieldDef<F, any, boolean | .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/bin.d.ts.BinParams | 'binned' | null> */ Boolean]

inline def isValueDef[F /* <: Field */](channelDef: Partial[ChannelDef[F]]): /* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.ValueDef<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValueDef")(channelDef.asInstanceOf[js.Any]).asInstanceOf[/* is .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/channeldef.d.ts.ValueDef<any> */ Boolean]

inline def normalizeBin(bin: Boolean): BinParams = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[BinParams]
inline def normalizeBin(bin: Boolean, channel: ExtendedChannel): BinParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[BinParams]
inline def normalizeBin(bin: BinParams): BinParams = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[BinParams]
inline def normalizeBin(bin: BinParams, channel: ExtendedChannel): BinParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[BinParams]

inline def normalizeBin_binned(bin: binned): BinParams = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any]).asInstanceOf[BinParams]
inline def normalizeBin_binned(bin: binned, channel: ExtendedChannel): BinParams = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeBin")(bin.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[BinParams]

inline def resetTitleFormatter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetTitleFormatter")().asInstanceOf[Unit]

inline def setTitleFormatter(formatter: FieldTitleFormatter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTitleFormatter")(formatter.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def title(
  fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
  config: Config[ExprRef | SignalRef],
  hasAllowDisablingIncludeDefault: AllowDisabling
): SignalRef | Text = (^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasAllowDisablingIncludeDefault.asInstanceOf[js.Any])).asInstanceOf[SignalRef | Text]
inline def title(
  fieldOrDatumDef: SecondaryFieldDef[String],
  config: Config[ExprRef | SignalRef],
  hasAllowDisablingIncludeDefault: AllowDisabling
): SignalRef | Text = (^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasAllowDisablingIncludeDefault.asInstanceOf[js.Any])).asInstanceOf[SignalRef | Text]

inline def title_binned(
  fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
  config: Config[ExprRef | SignalRef],
  hasAllowDisablingIncludeDefault: AllowDisabling
): SignalRef | Text = (^.asInstanceOf[js.Dynamic].applyDynamic("title")(fieldOrDatumDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasAllowDisablingIncludeDefault.asInstanceOf[js.Any])).asInstanceOf[SignalRef | Text]

inline def toFieldDefBase(fieldDef: FieldDef[String, Any]): FieldDefBase[String, Bin] = ^.asInstanceOf[js.Dynamic].applyDynamic("toFieldDefBase")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[FieldDefBase[String, Bin]]

inline def toStringFieldDef[F /* <: Field */](fieldDef: FieldDef[F, Any]): StringFieldDef[F] = ^.asInstanceOf[js.Dynamic].applyDynamic("toStringFieldDef")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[StringFieldDef[F]]

inline def valueArray(
  fieldOrDatumDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
  values: js.Array[Double | String | Boolean | DateTime]
): js.Array[String | Double | Boolean | DateTime | Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("valueArray")(fieldOrDatumDef.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double | Boolean | DateTime | Signal]]

inline def valueArray_binned(
  fieldOrDatumDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
  values: js.Array[Double | String | Boolean | DateTime]
): js.Array[String | Double | Boolean | DateTime | Signal] = (^.asInstanceOf[js.Dynamic].applyDynamic("valueArray")(fieldOrDatumDef.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double | Boolean | DateTime | Signal]]

inline def valueExpr(v: String, hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: js.Array[Double], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: Boolean, hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: Double, hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: DateTime, hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: ExprRef, hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[String]
inline def valueExpr(v: SignalRef, hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired: TimeUnit): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueExpr")(v.asInstanceOf[js.Any], hasTimeUnitTypeWrapTimeUndefinedIfExprNotRequired.asInstanceOf[js.Any])).asInstanceOf[String]

inline def verbalTitleFormatter(fieldDef: FieldDefBase[String, Bin], config: Config[ExprRef | SignalRef]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("verbalTitleFormatter")(fieldDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]

inline def vgField(fieldDef: FieldDefBase[String, Bin]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[String]
inline def vgField(fieldDef: FieldDefBase[String, Bin], opt: FieldRefOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
inline def vgField(fieldDef: AggregatedFieldDef): String = ^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[String]
inline def vgField(fieldDef: AggregatedFieldDef, opt: FieldRefOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
inline def vgField(fieldDef: WindowFieldDef): String = ^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any]).asInstanceOf[String]
inline def vgField(fieldDef: WindowFieldDef, opt: FieldRefOption): String = (^.asInstanceOf[js.Dynamic].applyDynamic("vgField")(fieldDef.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]

/* Rewritten from type alias, can be one of: 
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.NumericMarkPropDef[F]
  - scala.Unit
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.TextDef[F]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.PositionDef[F]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.OffsetDef[F, typings.vegaLite8ozrbXDH.typeDotDTsMod.StandardType]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDefWithoutScale[F, typings.vegaLite8ozrbXDH.typeDotDTsMod.StandardType]
  - js.Array[
(typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldDefWithoutScale[F, typings.vegaLite8ozrbXDH.typeDotDTsMod.StandardType]) | typings.vegaLite8ozrbXDH.channeldefDTsMod.OrderFieldDef[F] | typings.vegaLite8ozrbXDH.channeldefDTsMod.StringFieldDef[F]]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.OrderFieldDef[F]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.OrderValueDef
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.NumericArrayMarkPropDef[F]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.PolarDef[F]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.ColorDef[F]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.StringFieldDefWithCondition[F]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.StringValueDefWithCondition[F, typings.vegaLite8ozrbXDH.typeDotDTsMod.StandardType]
  - scala.Null
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.ShapeDef[F]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.LatLongDef[F]
  - typings.vegaLite8ozrbXDH.channeldefDTsMod.Position2Def[F]
*/
type ChannelDef[F /* <: Field */] = js.UndefOr[
_ChannelDef[F] | (OffsetDef[F, StandardType]) | (FieldDefWithoutScale[F, StandardType]) | (js.Array[(FieldDefWithoutScale[F, StandardType]) | OrderFieldDef[F] | StringFieldDef[F]]) | (StringValueDefWithCondition[F, StandardType]) | NumericMarkPropDef[F] | TextDef[F] | PositionDef[F] | NumericArrayMarkPropDef[F] | PolarDef[F] | ColorDef[F] | StringFieldDefWithCondition[F] | Null | ShapeDef[F] | LatLongDef[F] | Position2Def[F]]

type ColorDef[F /* <: Field */] = MarkPropDef[F, Gradient | String | Null, StandardType]

type Conditional[CD /* <: (FieldDef[Any, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) | ValueDef[Any] | ExprRef | SignalRef */] = ConditionalPredicate[CD] | ConditionalParameter[CD]

type ConditionalParameter[CD /* <: (FieldDef[Any, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) | ValueDef[Any] | ExprRef | SignalRef */] = ParameterPredicate & CD

type ConditionalPredicate[CD /* <: (FieldDef[Any, Any]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) | ValueDef[Any] | ExprRef | SignalRef */] = Test & CD

type Field = FieldName | RepeatRef

type FieldDef[F /* <: Field */, T /* <: Type */] = SecondaryFieldDef[F] | (TypedFieldDef[F, T, Boolean | BinParams | binned | Null])

type FieldDefWithoutScale[F /* <: Field */, T /* <: Type */] = TypedFieldDef[F, T, Boolean | BinParams | binned | Null]

type FieldName = String

type FieldOrDatumDefWithCondition[F /* <: (FieldDef[Any, Any]) | (DatumDef[Any, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */] = F & (ConditionValueDefMixins[V | ExprRef | SignalRef])

type FieldTitleFormatter = js.Function2[
/* fieldDef */ FieldDefBase[String, Bin], 
/* config */ Config[ExprRef | SignalRef], 
String]

type HiddenCompositeAggregate = CompositeAggregate

type LatLongDef[F /* <: Field */] = LatLongFieldDef[F] | (DatumDef[F, PrimitiveValue | DateTime | ExprRef | SignalRef])

type MarkPropDef[F /* <: Field */, V /* <: Value[ExprRef | SignalRef] */, T /* <: Type */] = (FieldOrDatumDefWithCondition[
(DatumDef[F, PrimitiveValue | DateTime | ExprRef | SignalRef]) | (MarkPropFieldDef[F, T]), 
V]) | (ValueDefWithCondition[MarkPropFieldOrDatumDef[F, T], V])

type MarkPropFieldDef[F /* <: Field */, T /* <: Type */] = (ScaleFieldDef[F, T, Boolean | BinParams | Null]) & LegendMixins

type MarkPropFieldOrDatumDef[F /* <: Field */, T /* <: Type */] = (MarkPropFieldDef[F, T]) | MarkPropDatumDef[F]

type NumericArrayMarkPropDef[F /* <: Field */] = MarkPropDef[F, js.Array[Double], StandardType]

type NumericMarkPropDef[F /* <: Field */] = MarkPropDef[F, Double, StandardType]

type NumericValueDef = ValueDef[Double | ExprRef | SignalRef]

type OffsetDef[F /* <: Field */, T /* <: Type */] = (ScaleFieldDef[F, T, Boolean | BinParams | Null]) | ScaleDatumDef[F] | ValueDef[Double]

type PolarDef[F /* <: Field */] = PositionFieldDefBase[F] | PositionDatumDefBase[F] | PositionValueDef

type Position2Def[F /* <: Field */] = SecondaryFieldDef[F] | (DatumDef[F, PrimitiveValue | DateTime | ExprRef | SignalRef]) | PositionValueDef

type PositionDef[F /* <: Field */] = PositionFieldDef[F] | PositionDatumDef[F] | PositionValueDef

type PositionFieldDef[F /* <: Field */] = PositionFieldDefBase[F] & PositionMixins

type PositionFieldDefBase[F /* <: Field */] = (ScaleFieldDef[F, StandardType, Boolean | BinParams | binned | Null]) & PositionBaseMixins

type PositionValueDef = ValueDef[Double | width | height | ExprRef | SignalRef]

type PrimitiveValue = Double | String | Boolean | Null

type SecondaryChannelDef[F /* <: Field */] = js.UndefOr[Position2Def[F]]

type ShapeDef[F /* <: Field */] = MarkPropDef[F, String | Null, TypeForShape]

type StringFieldDefWithCondition[F /* <: Field */] = FieldOrDatumDefWithCondition[StringFieldDef[F], String]

type TextDef[F /* <: Field */] = (FieldOrDatumDefWithCondition[StringDatumDef[F] | StringFieldDef[F], Text]) | (ValueDefWithCondition[StringFieldDef[F], Text])

type Value[ES /* <: ExprRef | SignalRef */] = PrimitiveValue | js.Array[Double] | Gradient | Text | ES
