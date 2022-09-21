package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.QuantileTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quantileDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/quantile.d.ts", "QuantileTransformNode")
  @js.native
  open class QuantileTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: QuantileTransform) = this()
    
    def assemble(): typings.vegaTypings.transformMod.QuantileTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
