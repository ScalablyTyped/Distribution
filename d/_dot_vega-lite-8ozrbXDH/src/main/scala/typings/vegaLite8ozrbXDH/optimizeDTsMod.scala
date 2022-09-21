package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.indexDTsMod.DataComponent
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optimizeDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimize.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimize.d.ts", "FACET_SCALE_PREFIX")
  @js.native
  val FACET_SCALE_PREFIX: /* "scale_" */ String = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimize.d.ts", "MAX_OPTIMIZATION_RUNS")
  @js.native
  val MAX_OPTIMIZATION_RUNS: /* 5 */ Double = js.native
  
  inline def checkLinks(nodes: js.Array[DataFlowNode]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkLinks")(nodes.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def optimizeDataflow(data: DataComponent, model: Model): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("optimizeDataflow")(data.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
