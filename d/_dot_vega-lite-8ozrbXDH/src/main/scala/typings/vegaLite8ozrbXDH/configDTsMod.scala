package typings.vegaLite8ozrbXDH

import typings.std.Partial
import typings.std.ReturnType
import typings.vegaLite8ozrbXDH.anon.AxisConfigStyle
import typings.vegaLite8ozrbXDH.anon.ConfigFrom
import typings.vegaLite8ozrbXDH.channelDTsMod.PositionScaleChannel
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.configDotDTsMod.StyleConfigIndex
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaTypings.scaleMod.ScaleType
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/axis/config.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAxisConfig(
    property: /* keyof .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/axis.d.ts.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: String
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  inline def getAxisConfig(
    property: /* keyof .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/axis.d.ts.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: String,
    axisConfigs: Partial[AxisConfigs]
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any], axisConfigs.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  inline def getAxisConfig(
    property: /* keyof .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/axis.d.ts.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: js.Array[String]
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  inline def getAxisConfig(
    property: /* keyof .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/axis.d.ts.AxisConfig<vega-typings.vega-typings/types/spec/signal.SignalRef> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 79 */ Any,
    styleConfigIndex: StyleConfigIndex[SignalRef],
    style: js.Array[String],
    axisConfigs: Partial[AxisConfigs]
  ): ConfigFrom = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfig")(property.asInstanceOf[js.Any], styleConfigIndex.asInstanceOf[js.Any], style.asInstanceOf[js.Any], axisConfigs.asInstanceOf[js.Any])).asInstanceOf[ConfigFrom]
  
  inline def getAxisConfigStyle(axisConfigTypes: js.Array[String], config: Config[ExprRef | SignalRef]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfigStyle")(axisConfigTypes.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getAxisConfigs(
    channel: PositionScaleChannel,
    scaleType: ScaleType,
    orient: String,
    config: Config[ExprRef | SignalRef]
  ): AxisConfigStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfigs")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], orient.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AxisConfigStyle]
  inline def getAxisConfigs(
    channel: PositionScaleChannel,
    scaleType: ScaleType,
    orient: SignalRef,
    config: Config[ExprRef | SignalRef]
  ): AxisConfigStyle = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisConfigs")(channel.asInstanceOf[js.Any], scaleType.asInstanceOf[js.Any], orient.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[AxisConfigStyle]
  
  type AxisConfigs = ReturnType[
    js.Function4[
      /* channel */ PositionScaleChannel, 
      /* scaleType */ ScaleType, 
      /* orient */ String | SignalRef, 
      /* config */ Config[ExprRef | SignalRef], 
      AxisConfigStyle
    ]
  ]
}
