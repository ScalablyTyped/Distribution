package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.ts.FlowStart
  - typings.typescriptNn5FuAjk.ts.FlowLabel
  - typings.typescriptNn5FuAjk.ts.FlowAssignment
  - typings.typescriptNn5FuAjk.ts.FlowCondition
  - typings.typescriptNn5FuAjk.ts.FlowSwitchClause
  - typings.typescriptNn5FuAjk.ts.FlowArrayMutation
  - typings.typescriptNn5FuAjk.ts.FlowCall
  - typings.typescriptNn5FuAjk.ts.FlowReduceLabel
*/
trait FlowNode extends StObject
object FlowNode {
  
  inline def FlowArrayMutation(antecedent: FlowNode, flags: FlowFlags, node: CallExpression | BinaryExpression): typings.typescriptNn5FuAjk.ts.FlowArrayMutation = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.FlowArrayMutation]
  }
  
  inline def FlowAssignment(antecedent: FlowNode, flags: FlowFlags, node: Expression | VariableDeclaration | BindingElement): typings.typescriptNn5FuAjk.ts.FlowAssignment = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.FlowAssignment]
  }
  
  inline def FlowCall(antecedent: FlowNode, flags: FlowFlags, node: CallExpression): typings.typescriptNn5FuAjk.ts.FlowCall = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.FlowCall]
  }
  
  inline def FlowCondition(antecedent: FlowNode, flags: FlowFlags, node: Expression): typings.typescriptNn5FuAjk.ts.FlowCondition = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.FlowCondition]
  }
  
  inline def FlowLabel(flags: FlowFlags): typings.typescriptNn5FuAjk.ts.FlowLabel = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.FlowLabel]
  }
  
  inline def FlowReduceLabel(antecedent: FlowNode, antecedents: Array[FlowNode], flags: FlowFlags, target: FlowLabel): typings.typescriptNn5FuAjk.ts.FlowReduceLabel = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], antecedents = antecedents.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.FlowReduceLabel]
  }
  
  inline def FlowStart(flags: FlowFlags): typings.typescriptNn5FuAjk.ts.FlowStart = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.FlowStart]
  }
  
  inline def FlowSwitchClause(
    antecedent: FlowNode,
    clauseEnd: Double,
    clauseStart: Double,
    flags: FlowFlags,
    switchStatement: SwitchStatement
  ): typings.typescriptNn5FuAjk.ts.FlowSwitchClause = {
    val __obj = js.Dynamic.literal(antecedent = antecedent.asInstanceOf[js.Any], clauseEnd = clauseEnd.asInstanceOf[js.Any], clauseStart = clauseStart.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], switchStatement = switchStatement.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.typescriptNn5FuAjk.ts.FlowSwitchClause]
  }
}
