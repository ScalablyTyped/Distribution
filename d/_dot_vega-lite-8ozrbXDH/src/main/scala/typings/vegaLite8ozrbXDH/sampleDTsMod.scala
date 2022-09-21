package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.SampleTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sampleDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/sample.d.ts", "SampleTransformNode")
  @js.native
  open class SampleTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: SampleTransform) = this()
    
    def assemble(): typings.vegaTypings.transformMod.SampleTransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
