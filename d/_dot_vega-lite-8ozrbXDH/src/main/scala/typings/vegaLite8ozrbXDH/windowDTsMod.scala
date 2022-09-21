package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.WindowTransform
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgJoinAggregateTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object windowDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/window.d.ts", "WindowTransformNode")
  @js.native
  open class WindowTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: WindowTransform) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): typings.vegaTypings.transformMod.WindowTransform | VgJoinAggregateTransform = js.native
    
    /* private */ var getDefaultName: Any = js.native
    
    /* private */ val transform: Any = js.native
  }
}
