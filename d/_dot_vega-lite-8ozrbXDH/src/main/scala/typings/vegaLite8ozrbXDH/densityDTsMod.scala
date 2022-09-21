package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.transformDTsMod.DensityTransform
import typings.vegaTypings.transformMod.KDETransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object densityDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/density.d.ts", "DensityTransformNode")
  @js.native
  open class DensityTransformNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: DensityTransform) = this()
    
    def assemble(): KDETransform = js.native
    
    /* private */ var transform: Any = js.native
  }
}
