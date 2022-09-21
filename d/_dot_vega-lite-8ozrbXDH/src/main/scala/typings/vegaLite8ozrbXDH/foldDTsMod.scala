package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.FoldTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object foldDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/fold.d.ts", "FoldTransformNode")
  @js.native
  open class FoldTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: FoldTransform) = this()
    
    def assemble(): typings.vegaTypings.transformMod.FoldTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
