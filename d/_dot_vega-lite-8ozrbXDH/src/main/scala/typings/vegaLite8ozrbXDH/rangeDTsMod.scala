package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channelDTsMod.ScaleChannel
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.scaleDTsMod.Domain
import typings.vegaLite8ozrbXDH.splitDTsMod.Explicit
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.`type`
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.align
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.base
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.bins
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.clamp
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.constant
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.domain
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.domainMax
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.domainMid
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.domainMin
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.exponent
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.interpolate
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.nice
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.padding
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.paddingInner
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.paddingOuter
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.quantile
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.quantize
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.range
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rangeMax
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.rangeMin
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.reverse
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.round
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.scheme
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.threshold
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.zero
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgRange
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/range.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/range.d.ts", "MAX_SIZE_RANGE_STEP_RATIO")
  @js.native
  val MAX_SIZE_RANGE_STEP_RATIO: /* 0.95 */ Double = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/scale/range.d.ts", "RANGE_PROPERTIES")
  @js.native
  val RANGE_PROPERTIES: js.Array[
    /* keyof .vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/scale.d.ts.Scale<.vega-lite-8ozrbXDH..vega-lite-8ozrbXDH/build/src/expr.d.ts.ExprRef | vega-typings.vega-typings/types/spec/signal.SignalRef> */ `type` | domain | domainMid | domainMax | domainMin | reverse | range | rangeMax | rangeMin | scheme | align | bins | round | padding | paddingInner | paddingOuter | clamp | nice | base | exponent | constant | zero | interpolate
  ] = js.native
  
  inline def defaultContinuousToDiscreteCount(
    scaleType: quantile | quantize | threshold,
    config: Config[ExprRef | SignalRef],
    domain: Domain,
    channel: ScaleChannel
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultContinuousToDiscreteCount")(scaleType.asInstanceOf[js.Any], config.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def interpolateRange(rangeMin: Double, rangeMax: Double, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  inline def interpolateRange(rangeMin: Double, rangeMax: SignalRef, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  inline def interpolateRange(rangeMin: SignalRef, rangeMax: Double, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  inline def interpolateRange(rangeMin: SignalRef, rangeMax: SignalRef, cardinality: Double): SignalRef = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateRange")(rangeMin.asInstanceOf[js.Any], rangeMax.asInstanceOf[js.Any], cardinality.asInstanceOf[js.Any])).asInstanceOf[SignalRef]
  
  inline def parseRangeForChannel(channel: ScaleChannel, model: UnitModel): Explicit[VgRange] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRangeForChannel")(channel.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Explicit[VgRange]]
  
  inline def parseUnitScaleRange(model: UnitModel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("parseUnitScaleRange")(model.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
