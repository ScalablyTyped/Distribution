package typings.vegaLite8ozrbXDH

import typings.std.Set
import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.modelDTsMod.ModelWithField
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaTypings.transformMod.TimeUnitTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeunitDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/timeunit.d.ts", "TimeUnitNode")
  @js.native
  open class TimeUnitNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, formula: Dict[TimeUnitComponent]) = this()
    
    def assemble(): js.Array[TimeUnitTransform] = js.native
    
    /* private */ var formula: Any = js.native
    
    /**
      * Merge together TimeUnitNodes assigning the children of `other` to `this`
      * and removing `other`.
      */
    def merge(other: TimeUnitNode): Unit = js.native
    
    /**
      * Remove time units coming from the other node.
      */
    def removeFormulas(fields: Set[String]): Unit = js.native
  }
  /* static members */
  object TimeUnitNode {
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/timeunit.d.ts", "TimeUnitNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromEncoding(parent: DataFlowNode, model: ModelWithField): TimeUnitNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromEncoding")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[TimeUnitNode]
    
    inline def makeFromTransform(parent: DataFlowNode, t: typings.vegaLite8ozrbXDH.transformDTsMod.TimeUnitTransform): TimeUnitNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromTransform")(parent.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[TimeUnitNode]
  }
  
  type TimeUnitComponent = typings.vegaLite8ozrbXDH.transformDTsMod.TimeUnitTransform
}
