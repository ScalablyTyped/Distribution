package typings.babylonWalk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait coreVisitors[V] extends js.Object {
  var ArrayExpression: js.UndefOr[V] = js.native
  var AssignmentExpression: js.UndefOr[V] = js.native
  var BinaryExpression: js.UndefOr[V] = js.native
  var BlockStatement: js.UndefOr[V] = js.native
  var BooleanLiteral: js.UndefOr[V] = js.native
  var BreakStatement: js.UndefOr[V] = js.native
  var CallExpression: js.UndefOr[V] = js.native
  var CatchClause: js.UndefOr[V] = js.native
  var ConditionalExpression: js.UndefOr[V] = js.native
  var ContinueStatement: js.UndefOr[V] = js.native
  var DebuggerStatement: js.UndefOr[V] = js.native
  var Directive: js.UndefOr[V] = js.native
  var DirectiveLiteral: js.UndefOr[V] = js.native
  var DoWhileStatement: js.UndefOr[V] = js.native
  var EmptyStatement: js.UndefOr[V] = js.native
  var ExpressionStatement: js.UndefOr[V] = js.native
  var File: js.UndefOr[V] = js.native
  var ForInStatement: js.UndefOr[V] = js.native
  var ForStatement: js.UndefOr[V] = js.native
  var FunctionDeclaration: js.UndefOr[V] = js.native
  var FunctionExpression: js.UndefOr[V] = js.native
  var Identifier: js.UndefOr[V] = js.native
  var IfStatement: js.UndefOr[V] = js.native
  var LabeledStatement: js.UndefOr[V] = js.native
  var LogicalExpression: js.UndefOr[V] = js.native
  var MemberExpression: js.UndefOr[V] = js.native
  var NewExpression: js.UndefOr[V] = js.native
  var NullLiteral: js.UndefOr[V] = js.native
  var NumericLiteral: js.UndefOr[V] = js.native
  var ObjectExpression: js.UndefOr[V] = js.native
  var ObjectMethod: js.UndefOr[V] = js.native
  var ObjectProperty: js.UndefOr[V] = js.native
  var Program: js.UndefOr[V] = js.native
  var RegExpLiteral: js.UndefOr[V] = js.native
  var RestElement: js.UndefOr[V] = js.native
  var ReturnStatement: js.UndefOr[V] = js.native
  var SequenceExpression: js.UndefOr[V] = js.native
  var StringLiteral: js.UndefOr[V] = js.native
  var SwitchCase: js.UndefOr[V] = js.native
  var SwitchStatement: js.UndefOr[V] = js.native
  var ThisExpression: js.UndefOr[V] = js.native
  var ThrowStatement: js.UndefOr[V] = js.native
  var TryStatement: js.UndefOr[V] = js.native
  var UnaryExpression: js.UndefOr[V] = js.native
  var UpdateExpression: js.UndefOr[V] = js.native
  var VariableDeclaration: js.UndefOr[V] = js.native
  var VariableDeclarator: js.UndefOr[V] = js.native
  var WhileStatement: js.UndefOr[V] = js.native
  var WithStatement: js.UndefOr[V] = js.native
}

object coreVisitors {
  @scala.inline
  def apply[V](): coreVisitors[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[coreVisitors[V]]
  }
  @scala.inline
  implicit class coreVisitorsOps[Self <: coreVisitors[_], V] (val x: Self with coreVisitors[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArrayExpression(value: V): Self = this.set("ArrayExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArrayExpression: Self = this.set("ArrayExpression", js.undefined)
    @scala.inline
    def setAssignmentExpression(value: V): Self = this.set("AssignmentExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentExpression: Self = this.set("AssignmentExpression", js.undefined)
    @scala.inline
    def setBinaryExpression(value: V): Self = this.set("BinaryExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryExpression: Self = this.set("BinaryExpression", js.undefined)
    @scala.inline
    def setBlockStatement(value: V): Self = this.set("BlockStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlockStatement: Self = this.set("BlockStatement", js.undefined)
    @scala.inline
    def setBooleanLiteral(value: V): Self = this.set("BooleanLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBooleanLiteral: Self = this.set("BooleanLiteral", js.undefined)
    @scala.inline
    def setBreakStatement(value: V): Self = this.set("BreakStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBreakStatement: Self = this.set("BreakStatement", js.undefined)
    @scala.inline
    def setCallExpression(value: V): Self = this.set("CallExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallExpression: Self = this.set("CallExpression", js.undefined)
    @scala.inline
    def setCatchClause(value: V): Self = this.set("CatchClause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatchClause: Self = this.set("CatchClause", js.undefined)
    @scala.inline
    def setConditionalExpression(value: V): Self = this.set("ConditionalExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConditionalExpression: Self = this.set("ConditionalExpression", js.undefined)
    @scala.inline
    def setContinueStatement(value: V): Self = this.set("ContinueStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinueStatement: Self = this.set("ContinueStatement", js.undefined)
    @scala.inline
    def setDebuggerStatement(value: V): Self = this.set("DebuggerStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebuggerStatement: Self = this.set("DebuggerStatement", js.undefined)
    @scala.inline
    def setDirective(value: V): Self = this.set("Directive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirective: Self = this.set("Directive", js.undefined)
    @scala.inline
    def setDirectiveLiteral(value: V): Self = this.set("DirectiveLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectiveLiteral: Self = this.set("DirectiveLiteral", js.undefined)
    @scala.inline
    def setDoWhileStatement(value: V): Self = this.set("DoWhileStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoWhileStatement: Self = this.set("DoWhileStatement", js.undefined)
    @scala.inline
    def setEmptyStatement(value: V): Self = this.set("EmptyStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyStatement: Self = this.set("EmptyStatement", js.undefined)
    @scala.inline
    def setExpressionStatement(value: V): Self = this.set("ExpressionStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressionStatement: Self = this.set("ExpressionStatement", js.undefined)
    @scala.inline
    def setFile(value: V): Self = this.set("File", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("File", js.undefined)
    @scala.inline
    def setForInStatement(value: V): Self = this.set("ForInStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForInStatement: Self = this.set("ForInStatement", js.undefined)
    @scala.inline
    def setForStatement(value: V): Self = this.set("ForStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForStatement: Self = this.set("ForStatement", js.undefined)
    @scala.inline
    def setFunctionDeclaration(value: V): Self = this.set("FunctionDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionDeclaration: Self = this.set("FunctionDeclaration", js.undefined)
    @scala.inline
    def setFunctionExpression(value: V): Self = this.set("FunctionExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionExpression: Self = this.set("FunctionExpression", js.undefined)
    @scala.inline
    def setIdentifier(value: V): Self = this.set("Identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("Identifier", js.undefined)
    @scala.inline
    def setIfStatement(value: V): Self = this.set("IfStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIfStatement: Self = this.set("IfStatement", js.undefined)
    @scala.inline
    def setLabeledStatement(value: V): Self = this.set("LabeledStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabeledStatement: Self = this.set("LabeledStatement", js.undefined)
    @scala.inline
    def setLogicalExpression(value: V): Self = this.set("LogicalExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogicalExpression: Self = this.set("LogicalExpression", js.undefined)
    @scala.inline
    def setMemberExpression(value: V): Self = this.set("MemberExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberExpression: Self = this.set("MemberExpression", js.undefined)
    @scala.inline
    def setNewExpression(value: V): Self = this.set("NewExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewExpression: Self = this.set("NewExpression", js.undefined)
    @scala.inline
    def setNullLiteral(value: V): Self = this.set("NullLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullLiteral: Self = this.set("NullLiteral", js.undefined)
    @scala.inline
    def setNumericLiteral(value: V): Self = this.set("NumericLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumericLiteral: Self = this.set("NumericLiteral", js.undefined)
    @scala.inline
    def setObjectExpression(value: V): Self = this.set("ObjectExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectExpression: Self = this.set("ObjectExpression", js.undefined)
    @scala.inline
    def setObjectMethod(value: V): Self = this.set("ObjectMethod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectMethod: Self = this.set("ObjectMethod", js.undefined)
    @scala.inline
    def setObjectProperty(value: V): Self = this.set("ObjectProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectProperty: Self = this.set("ObjectProperty", js.undefined)
    @scala.inline
    def setProgram(value: V): Self = this.set("Program", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProgram: Self = this.set("Program", js.undefined)
    @scala.inline
    def setRegExpLiteral(value: V): Self = this.set("RegExpLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegExpLiteral: Self = this.set("RegExpLiteral", js.undefined)
    @scala.inline
    def setRestElement(value: V): Self = this.set("RestElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestElement: Self = this.set("RestElement", js.undefined)
    @scala.inline
    def setReturnStatement(value: V): Self = this.set("ReturnStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturnStatement: Self = this.set("ReturnStatement", js.undefined)
    @scala.inline
    def setSequenceExpression(value: V): Self = this.set("SequenceExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSequenceExpression: Self = this.set("SequenceExpression", js.undefined)
    @scala.inline
    def setStringLiteral(value: V): Self = this.set("StringLiteral", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStringLiteral: Self = this.set("StringLiteral", js.undefined)
    @scala.inline
    def setSwitchCase(value: V): Self = this.set("SwitchCase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitchCase: Self = this.set("SwitchCase", js.undefined)
    @scala.inline
    def setSwitchStatement(value: V): Self = this.set("SwitchStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwitchStatement: Self = this.set("SwitchStatement", js.undefined)
    @scala.inline
    def setThisExpression(value: V): Self = this.set("ThisExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThisExpression: Self = this.set("ThisExpression", js.undefined)
    @scala.inline
    def setThrowStatement(value: V): Self = this.set("ThrowStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThrowStatement: Self = this.set("ThrowStatement", js.undefined)
    @scala.inline
    def setTryStatement(value: V): Self = this.set("TryStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTryStatement: Self = this.set("TryStatement", js.undefined)
    @scala.inline
    def setUnaryExpression(value: V): Self = this.set("UnaryExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnaryExpression: Self = this.set("UnaryExpression", js.undefined)
    @scala.inline
    def setUpdateExpression(value: V): Self = this.set("UpdateExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateExpression: Self = this.set("UpdateExpression", js.undefined)
    @scala.inline
    def setVariableDeclaration(value: V): Self = this.set("VariableDeclaration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableDeclaration: Self = this.set("VariableDeclaration", js.undefined)
    @scala.inline
    def setVariableDeclarator(value: V): Self = this.set("VariableDeclarator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariableDeclarator: Self = this.set("VariableDeclarator", js.undefined)
    @scala.inline
    def setWhileStatement(value: V): Self = this.set("WhileStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhileStatement: Self = this.set("WhileStatement", js.undefined)
    @scala.inline
    def setWithStatement(value: V): Self = this.set("WithStatement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithStatement: Self = this.set("WithStatement", js.undefined)
  }
  
}

