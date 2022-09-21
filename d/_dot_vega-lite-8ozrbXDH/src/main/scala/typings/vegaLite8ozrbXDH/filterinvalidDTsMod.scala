package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channeldefDTsMod.TypedFieldDef
import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.binned
import typings.vegaTypings.transformMod.FilterTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterinvalidDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/filterinvalid.d.ts", "FilterInvalidNode")
  @js.native
  open class FilterInvalidNode protected () extends DataFlowNode {
    def this(
      parent: DataFlowNode,
      filter: Dict[TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]]
    ) = this()
    
    /**
      * Create the VgTransforms for each of the filtered fields.
      */
    def assemble(): FilterTransform = js.native
    
    val filter: Dict[TypedFieldDef[String, Any, Boolean | BinParams | binned | Null]] = js.native
  }
  /* static members */
  object FilterInvalidNode {
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/filterinvalid.d.ts", "FilterInvalidNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def make(parent: DataFlowNode, model: UnitModel): FilterInvalidNode = (^.asInstanceOf[js.Dynamic].applyDynamic("make")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[FilterInvalidNode]
  }
}
