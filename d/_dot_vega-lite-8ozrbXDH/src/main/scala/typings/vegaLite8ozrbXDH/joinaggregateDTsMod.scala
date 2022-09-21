package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.JoinAggregateTransform
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgJoinAggregateTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object joinaggregateDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/joinaggregate.d.ts", "JoinAggregateTransformNode")
  @js.native
  open class JoinAggregateTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: JoinAggregateTransform) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): VgJoinAggregateTransform = js.native
    
    /* private */ var getDefaultName: Any = js.native
    
    /* private */ val transform: Any = js.native
  }
}
