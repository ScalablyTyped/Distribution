package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.PartialRecordfillcolorfil
import typings.vegaLite8ozrbXDH.channelDTsMod.NonPositionScaleChannel
import typings.vegaLite8ozrbXDH.componentDotdDottsMod.LegendComponent
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendParseDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/parse.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mergeLegendComponent(mergedLegend: LegendComponent, childLegend: LegendComponent): LegendComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeLegendComponent")(mergedLegend.asInstanceOf[js.Any], childLegend.asInstanceOf[js.Any])).asInstanceOf[LegendComponent]
  
  inline def parseLegend(model: Model): PartialRecordfillcolorfil = ^.asInstanceOf[js.Dynamic].applyDynamic("parseLegend")(model.asInstanceOf[js.Any]).asInstanceOf[PartialRecordfillcolorfil]
  
  inline def parseLegendForChannel(model: UnitModel, channel: NonPositionScaleChannel): LegendComponent = (^.asInstanceOf[js.Dynamic].applyDynamic("parseLegendForChannel")(model.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[LegendComponent]
}
