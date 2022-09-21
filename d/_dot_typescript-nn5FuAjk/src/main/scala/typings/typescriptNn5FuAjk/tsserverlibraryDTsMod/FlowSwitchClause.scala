package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowSwitchClause
  extends StObject
     with FlowNodeBase
     with FlowNode {
  
  var antecedent: FlowNode
  
  var clauseEnd: Double
  
  var clauseStart: Double
  
  var switchStatement: SwitchStatement
}
object FlowSwitchClause {
  
  inline def apply(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement
  ): FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowSwitchClause]
  }
  
  extension [Self <: FlowSwitchClause](x: Self) {
    
    inline def setAntecedent(value: FlowNode): Self = StObject.set(x, "antecedent", value.asInstanceOf[js.Any])
    
    inline def setClauseEnd(value: Double): Self = StObject.set(x, "clauseEnd", value.asInstanceOf[js.Any])
    
    inline def setClauseStart(value: Double): Self = StObject.set(x, "clauseStart", value.asInstanceOf[js.Any])
    
    inline def setSwitchStatement(value: SwitchStatement): Self = StObject.set(x, "switchStatement", value.asInstanceOf[js.Any])
  }
}
