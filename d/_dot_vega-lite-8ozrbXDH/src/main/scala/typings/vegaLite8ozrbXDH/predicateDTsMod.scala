package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.logicalDTsMod.LogicalComposition
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.predicateDotDTsMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object predicateDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/predicate.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def expression(model: Model, filterOp: LogicalComposition[Predicate]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(model.asInstanceOf[js.Any], filterOp.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def expression(model: Model, filterOp: LogicalComposition[Predicate], node: DataFlowNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("expression")(model.asInstanceOf[js.Any], filterOp.asInstanceOf[js.Any], node.asInstanceOf[js.Any])).asInstanceOf[String]
}
