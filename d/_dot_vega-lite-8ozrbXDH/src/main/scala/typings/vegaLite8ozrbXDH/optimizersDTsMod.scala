package typings.vegaLite8ozrbXDH

import typings.std.Set
import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.optimizerDTsMod.BottomUpOptimizer
import typings.vegaLite8ozrbXDH.optimizerDTsMod.Optimizer
import typings.vegaLite8ozrbXDH.optimizerDTsMod.TopDownOptimizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optimizersDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "MergeAggregates")
  @js.native
  open class MergeAggregates () extends BottomUpOptimizer
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "MergeBins")
  @js.native
  open class MergeBins protected () extends BottomUpOptimizer {
    def this(model: Model) = this()
    
    /* private */ var model: Any = js.native
  }
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "MergeIdenticalNodes")
  @js.native
  open class MergeIdenticalNodes () extends TopDownOptimizer {
    
    def mergeNodes(parent: DataFlowNode, nodes: js.Array[DataFlowNode]): Unit = js.native
  }
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "MergeOutputs")
  @js.native
  open class MergeOutputs () extends BottomUpOptimizer
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "MergeParse")
  @js.native
  open class MergeParse () extends BottomUpOptimizer
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "MergeTimeUnits")
  @js.native
  open class MergeTimeUnits () extends BottomUpOptimizer
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "MoveParseUp")
  @js.native
  open class MoveParseUp () extends BottomUpOptimizer
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "RemoveDuplicateTimeUnits")
  @js.native
  open class RemoveDuplicateTimeUnits () extends Optimizer {
    
    def run(node: DataFlowNode, timeUnitFields: Set[String]): Unit = js.native
  }
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "RemoveUnnecessaryIdentifierNodes")
  @js.native
  open class RemoveUnnecessaryIdentifierNodes protected () extends TopDownOptimizer {
    def this(model: Model) = this()
    
    /* private */ var requiresSelectionId: Any = js.native
  }
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "RemoveUnnecessaryOutputNodes")
  @js.native
  open class RemoveUnnecessaryOutputNodes () extends TopDownOptimizer
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/optimizers.d.ts", "RemoveUnusedSubtrees")
  @js.native
  open class RemoveUnusedSubtrees () extends BottomUpOptimizer
}
