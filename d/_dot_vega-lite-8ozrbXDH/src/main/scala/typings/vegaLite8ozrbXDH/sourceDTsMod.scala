package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.anon.PartialVgData
import typings.vegaLite8ozrbXDH.dataDTsMod.Data
import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.vegaSchemaDTsMod.VgData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/source.d.ts", "SourceNode")
  @js.native
  open class SourceNode protected () extends DataFlowNode {
    def this(data: Data) = this()
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _generator: Any = js.native
    
    /* private */ var _name: Any = js.native
    
    def assemble(): VgData = js.native
    
    def data: PartialVgData = js.native
    
    def dataName: String = js.native
    def dataName_=(name: String): Unit = js.native
    
    def hasName(): Boolean = js.native
    
    def isGenerator: Boolean = js.native
  }
}
