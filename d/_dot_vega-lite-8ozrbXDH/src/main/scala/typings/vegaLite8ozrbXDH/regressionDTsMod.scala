package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.RegressionTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object regressionDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/regression.d.ts", "RegressionTransformNode")
  @js.native
  open class RegressionTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: RegressionTransform) = this()
    
    def assemble(): typings.vegaTypings.transformMod.RegressionTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
