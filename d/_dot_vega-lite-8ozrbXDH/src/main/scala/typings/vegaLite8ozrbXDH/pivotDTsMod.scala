package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.PivotTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pivotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/pivot.d.ts", "PivotTransformNode")
  @js.native
  open class PivotTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: PivotTransform) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): typings.vegaTypings.transformMod.PivotTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
