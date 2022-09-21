package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.DatumDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.PrimitiveValue
import typings.vegaLite8ozrbXDH.channeldefDTsMod.TypedFieldDef
import typings.vegaLite8ozrbXDH.datetimeDTsMod.DateTime
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.markDotDTsMod.Mark
import typings.vegaLite8ozrbXDH.markDotDTsMod.MarkDef
import typings.vegaLite8ozrbXDH.scaleDTsMod.Scale
import typings.vegaLite8ozrbXDH.scaleDTsMod.ScaleType
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.binned
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typeDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/type.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def scaleType(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: ScaleChannel,
    fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    mark: MarkDef[Mark, ExprRef | SignalRef]
  ): ScaleType = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleType")(specifiedScale.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[ScaleType]
  inline def scaleType(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: ScaleChannel,
    fieldDef: DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef],
    mark: MarkDef[Mark, ExprRef | SignalRef],
    hasNestedOffsetScale: Boolean
  ): ScaleType = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleType")(specifiedScale.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[ScaleType]
  
  inline def scaleType_binned(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: ScaleChannel,
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    mark: MarkDef[Mark, ExprRef | SignalRef]
  ): ScaleType = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleType")(specifiedScale.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], mark.asInstanceOf[js.Any])).asInstanceOf[ScaleType]
  inline def scaleType_binned(
    specifiedScale: Scale[ExprRef | SignalRef],
    channel: ScaleChannel,
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    mark: MarkDef[Mark, ExprRef | SignalRef],
    hasNestedOffsetScale: Boolean
  ): ScaleType = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleType")(specifiedScale.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], fieldDef.asInstanceOf[js.Any], mark.asInstanceOf[js.Any], hasNestedOffsetScale.asInstanceOf[js.Any])).asInstanceOf[ScaleType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.continuous
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.discrete
    - typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.flexible
    - scala.Unit
  */
  type RangeType = js.UndefOr[_RangeType]
  
  trait _RangeType extends StObject
}
