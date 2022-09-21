package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.FlattenTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flattenDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/flatten.d.ts", "FlattenTransformNode")
  @js.native
  open class FlattenTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: FlattenTransform) = this()
    
    def assemble(): typings.vegaTypings.transformMod.FlattenTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
