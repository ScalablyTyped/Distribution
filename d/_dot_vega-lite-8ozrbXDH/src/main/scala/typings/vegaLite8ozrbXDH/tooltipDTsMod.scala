package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.PartialRecordVgEncodeChan
import typings.vegaLite8ozrbXDH.anon.ReactiveGeom
import typings.vegaLite8ozrbXDH.anon.Signal
import typings.vegaLite8ozrbXDH.anon.Tooltip
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.encodingDTsMod.Encoding
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.stackDotDTsMod.StackProperties
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/mark/encode/tooltip.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tooltip(model: UnitModel): PartialRecordVgEncodeChan | Tooltip = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordVgEncodeChan | Tooltip]
  inline def tooltip(model: UnitModel, opt: ReactiveGeom): PartialRecordVgEncodeChan | Tooltip = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltip")(model.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[PartialRecordVgEncodeChan | Tooltip]
  
  inline def tooltipData(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipData")(encoding.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def tooltipData(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipData")(encoding.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasReactiveGeom.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def tooltipRefForEncoding(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipRefForEncoding")(encoding.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Signal]
  inline def tooltipRefForEncoding(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): Signal = (^.asInstanceOf[js.Dynamic].applyDynamic("tooltipRefForEncoding")(encoding.asInstanceOf[js.Any], stack.asInstanceOf[js.Any], config.asInstanceOf[js.Any], hasReactiveGeom.asInstanceOf[js.Any])).asInstanceOf[Signal]
}
