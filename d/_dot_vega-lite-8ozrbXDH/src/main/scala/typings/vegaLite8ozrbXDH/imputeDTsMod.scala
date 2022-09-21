package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.ImputeTransform
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaTypings.transformMod.FormulaTransform
import typings.vegaTypings.transformMod.WindowTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imputeDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/impute.d.ts", "ImputeNode")
  @js.native
  open class ImputeNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: ImputeTransform) = this()
    
    def assemble(): js.Array[
        FormulaTransform | typings.vegaTypings.transformMod.ImputeTransform | WindowTransform
      ] = js.native
    
    /* private */ var processSequence: Any = js.native
    
    /* private */ val transform: Any = js.native
  }
  /* static members */
  object ImputeNode {
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/impute.d.ts", "ImputeNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromEncoding(parent: DataFlowNode, model: UnitModel): ImputeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromEncoding")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[ImputeNode]
    
    inline def makeFromTransform(parent: DataFlowNode, imputeTransform: ImputeTransform): ImputeNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromTransform")(parent.asInstanceOf[js.Any], imputeTransform.asInstanceOf[js.Any])).asInstanceOf[ImputeNode]
  }
}
