package typings.vegaLite8ozrbXDH

import typings.std.Set
import typings.vegaLite8ozrbXDH.anon.PartialRecordAggregateOpS
import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaTypings.transformMod.AggregateTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aggregateDotDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/aggregate.d.ts", "AggregateNode")
  @js.native
  open class AggregateNode protected () extends DataFlowNode {
    /**
      * @param dimensions string set for dimensions
      * @param measures dictionary mapping field name => dict of aggregation functions and names to use
      */
    def this(parent: DataFlowNode, dimensions: Set[String], measures: Measures) = this()
    
    def addDimensions(fields: js.Array[String]): Unit = js.native
    
    def assemble(): AggregateTransform = js.native
    
    /* private */ var dimensions: Any = js.native
    
    def groupBy: Set[String] = js.native
    
    /* private */ var measures: Any = js.native
    
    def merge(other: AggregateNode): Boolean = js.native
  }
  /* static members */
  object AggregateNode {
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/aggregate.d.ts", "AggregateNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def makeFromEncoding(parent: DataFlowNode, model: UnitModel): AggregateNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromEncoding")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[AggregateNode]
    
    inline def makeFromTransform(parent: DataFlowNode, t: typings.vegaLite8ozrbXDH.transformDTsMod.AggregateTransform): AggregateNode = (^.asInstanceOf[js.Dynamic].applyDynamic("makeFromTransform")(parent.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[AggregateNode]
  }
  
  type Measures = Dict[PartialRecordAggregateOpS]
}
