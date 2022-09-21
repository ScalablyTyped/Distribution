package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.logicalDTsMod.LogicalComposition
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.predicateDotDTsMod.Predicate
import typings.vegaTypings.transformMod.FilterTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/filter.d.ts", "FilterNode")
  @js.native
  open class FilterNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, model: Model, filter: LogicalComposition[Predicate]) = this()
    
    /* private */ var _dependentFields: Any = js.native
    
    def assemble(): FilterTransform = js.native
    
    /* private */ var expr: Any = js.native
    
    /* private */ val filter: Any = js.native
    
    /* private */ val model: Any = js.native
  }
}
