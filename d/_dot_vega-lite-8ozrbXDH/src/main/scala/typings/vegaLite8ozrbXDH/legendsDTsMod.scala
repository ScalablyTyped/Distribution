package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.channelDTsMod.NonPositionScaleChannel
import typings.vegaLite8ozrbXDH.componentDotdDottsMod.LegendComponent
import typings.vegaLite8ozrbXDH.indexDDotTsMod.SelectionCompiler
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendsDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/legends.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/legends.d.ts", JSImport.Default)
  @js.native
  val default: SelectionCompiler[point] = js.native
  
  inline def parseInteractiveLegend(model: UnitModel, channel: NonPositionScaleChannel, legendCmpt: LegendComponent): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseInteractiveLegend")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], legendCmpt.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
