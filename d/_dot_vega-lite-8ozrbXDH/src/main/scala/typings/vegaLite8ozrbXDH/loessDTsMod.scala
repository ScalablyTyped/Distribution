package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.LoessTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loessDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/loess.d.ts", "LoessTransformNode")
  @js.native
  open class LoessTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: LoessTransform) = this()
    
    def assemble(): typings.vegaTypings.transformMod.LoessTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
