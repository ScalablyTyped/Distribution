package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.ClipHeight
import typings.vegaLite8ozrbXDH.componentDotdDottsMod.LegendComponent
import typings.vegaLite8ozrbXDH.configDotDTsMod.Config
import typings.vegaLite8ozrbXDH.exprDTsMod.ExprRef
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaTypings.legendMod.Legend
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendAssembleDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/legend/assemble.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assembleLegend(legendCmpt: LegendComponent, config: Config[ExprRef | SignalRef]): ClipHeight = (^.asInstanceOf[js.Dynamic].applyDynamic("assembleLegend")(legendCmpt.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ClipHeight]
  
  inline def assembleLegends(model: Model): js.Array[Legend] = ^.asInstanceOf[js.Dynamic].applyDynamic("assembleLegends")(model.asInstanceOf[js.Any]).asInstanceOf[js.Array[Legend]]
}
