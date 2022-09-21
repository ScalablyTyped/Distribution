package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.PartialRecordVgEncodeChan
import typings.vegaLite8ozrbXDH.channeldefDTsMod.StringFieldDef
import typings.vegaLite8ozrbXDH.channeldefDTsMod.StringFieldDefWithCondition
import typings.vegaLite8ozrbXDH.channeldefDTsMod.StringValueDefWithCondition
import typings.vegaLite8ozrbXDH.channeldefDTsMod.TextDef
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.typeDotDTsMod.StandardType
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.datum
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.datumDotdatum
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.description
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.href
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.url
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgValueRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/encode/text.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def text(model: UnitModel): PartialRecordVgEncodeChan = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan]
  inline def text(
    model: UnitModel,
    channel: typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.text | href | url | description
  ): PartialRecordVgEncodeChan = (^.asInstanceOf[js.Dynamic].applyDynamic("text")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan]
  
  inline def textRef(channelDef: js.Array[StringFieldDef[String]], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(
    channelDef: js.Array[StringFieldDef[String]],
    config: Config[ExprRef | SignalRef],
    expr: datum | datumDotdatum
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Null, config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Null, config: Config[ExprRef | SignalRef], expr: datum | datumDotdatum): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Unit, config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: Unit, config: Config[ExprRef | SignalRef], expr: datum | datumDotdatum): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: StringFieldDefWithCondition[String], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(
    channelDef: StringFieldDefWithCondition[String],
    config: Config[ExprRef | SignalRef],
    expr: datum | datumDotdatum
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: StringValueDefWithCondition[String, StandardType], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(
    channelDef: StringValueDefWithCondition[String, StandardType],
    config: Config[ExprRef | SignalRef],
    expr: datum | datumDotdatum
  ): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: TextDef[String], config: Config[ExprRef | SignalRef]): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
  inline def textRef(channelDef: TextDef[String], config: Config[ExprRef | SignalRef], expr: datum | datumDotdatum): VgValueRef = (^.asInstanceOf[js.Dynamic].applyDynamic("textRef")(channelDef.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expr.asInstanceOf[js.Any])).asInstanceOf[VgValueRef]
}
