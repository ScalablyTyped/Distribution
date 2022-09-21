package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.binDTsMod.BinParams
import typings.vegaLite8ozrbXDH.channelDTsMod.SingleDefChannel
import typings.vegaLite8ozrbXDH.channeldefDTsMod.FieldRefOption
import typings.vegaLite8ozrbXDH.channeldefDTsMod.TypedFieldDef
import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.modelDTsMod.ModelWithField
import typings.vegaLite8ozrbXDH.transformDTsMod.CalculateTransform
import typings.vegaLite8ozrbXDH.vegaLite8ozrbXDHStrings.binned
import typings.vegaTypings.transformMod.FormulaTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object calculateDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/calculate.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/calculate.d.ts", "CalculateNode")
  @js.native
  open class CalculateNode protected () extends DataFlowNode {
    def this(parent: DataFlowNode, transform: CalculateTransform) = this()
    
    /* private */ var _dependentFields: Any = js.native
    
    def assemble(): FormulaTransform = js.native
    
    /* private */ val transform: Any = js.native
  }
  /* static members */
  object CalculateNode {
    
    @JSImport(".vega-lite-8ozrbXDH/build/src/compile/data/calculate.d.ts", "CalculateNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parseAllForSortIndex(parent: DataFlowNode, model: ModelWithField): DataFlowNode = (^.asInstanceOf[js.Dynamic].applyDynamic("parseAllForSortIndex")(parent.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[DataFlowNode]
  }
  
  inline def sortArrayIndexField_binned(
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    channel: SingleDefChannel
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sortArrayIndexField")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def sortArrayIndexField_binned(
    fieldDef: TypedFieldDef[String, Any, Boolean | BinParams | binned | Null],
    channel: SingleDefChannel,
    opt: FieldRefOption
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sortArrayIndexField")(fieldDef.asInstanceOf[js.Any], channel.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
}
