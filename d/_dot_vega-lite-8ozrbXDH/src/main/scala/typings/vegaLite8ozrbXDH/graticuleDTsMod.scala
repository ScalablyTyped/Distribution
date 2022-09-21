package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataDTsMod.GraticuleParams
import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHBooleans.`true`
import typings.vegaTypings.transformMod.GraticuleTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object graticuleDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/graticule.d.ts", "GraticuleNode")
  @js.native
  open class GraticuleNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, params: GraticuleParams) = this()
    def this(parent: DataFlowNode, params: `true`) = this()
    
    def assemble(): GraticuleTransform = js.native
    
    /* private */ var params: Any = js.native
  }
}
