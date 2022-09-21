package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataDTsMod.SequenceParams
import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaTypings.transformMod.SequenceTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sequenceDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/sequence.d.ts", "SequenceNode")
  @js.native
  open class SequenceNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, params: SequenceParams) = this()
    
    def assemble(): SequenceTransform = js.native
    
    /* private */ var params: Any = js.native
  }
}
