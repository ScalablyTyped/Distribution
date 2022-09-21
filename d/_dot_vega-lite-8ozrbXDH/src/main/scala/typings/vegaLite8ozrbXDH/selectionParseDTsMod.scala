package typings.vegaLite8ozrbXDH

import typings.vegaLite8ozrbXDH.dataflowDTsMod.DataFlowNode
import typings.vegaLite8ozrbXDH.dataflowDTsMod.OutputNode
import typings.vegaLite8ozrbXDH.indexDDotTsMod.SelectionComponent
import typings.vegaLite8ozrbXDH.modelDTsMod.Model
import typings.vegaLite8ozrbXDH.predicateDotDTsMod.ParameterPredicate
import typings.vegaLite8ozrbXDH.selectionDTsMod.ParameterExtent
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionParameter
import typings.vegaLite8ozrbXDH.selectionDTsMod.SelectionType
import typings.vegaLite8ozrbXDH.unitDTsMod.UnitModel
import typings.vegaLite8ozrbXDH.utilDTsMod.Dict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectionParseDTsMod {
  
  @JSImport(".vega-lite-8ozrbXDH/build/src/compile/selection/parse.d.ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def materializeSelections(model: UnitModel, main: OutputNode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("materializeSelections")(model.asInstanceOf[js.Any], main.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseSelectionExtent(model: Model, name: String, extent: ParameterExtent): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionExtent")(model.asInstanceOf[js.Any], name.asInstanceOf[js.Any], extent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseSelectionPredicate(model: Model, pred: ParameterPredicate): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], pred.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseSelectionPredicate(model: Model, pred: ParameterPredicate, dfnode: Unit, datum: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], dfnode.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseSelectionPredicate(model: Model, pred: ParameterPredicate, dfnode: DataFlowNode): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], dfnode.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def parseSelectionPredicate(model: Model, pred: ParameterPredicate, dfnode: DataFlowNode, datum: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("parseSelectionPredicate")(model.asInstanceOf[js.Any], pred.asInstanceOf[js.Any], dfnode.asInstanceOf[js.Any], datum.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseUnitSelection(model: UnitModel, selDefs: js.Array[SelectionParameter[SelectionType]]): Dict[SelectionComponent[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseUnitSelection")(model.asInstanceOf[js.Any], selDefs.asInstanceOf[js.Any])).asInstanceOf[Dict[SelectionComponent[Any]]]
}
