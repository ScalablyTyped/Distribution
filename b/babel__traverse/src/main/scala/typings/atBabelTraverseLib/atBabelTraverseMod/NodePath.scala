package typings
package atBabelTraverseLib.atBabelTraverseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@babel/traverse", "NodePath")
@js.native
class NodePath[T] protected () extends js.Object {
  def this(hub: Hub, parent: Node) = this()
  var container: js.Object | js.Array[js.Object] = js.native
  var context: TraversalContext = js.native
  var contexts: js.Array[TraversalContext] = js.native
  var data: js.Object = js.native
  var hub: Hub = js.native
  var inList: scala.Boolean = js.native
  var key: java.lang.String | scala.Double = js.native
  var listKey: java.lang.String = js.native
  var node: T = js.native
  var opts: js.Object = js.native
  var parent: Node = js.native
  var parentKey: java.lang.String = js.native
  var parentPath: NodePath[Node] = js.native
  var removed: scala.Boolean = js.native
  var scope: Scope = js.native
  var shouldSkip: scala.Boolean = js.native
  var shouldStop: scala.Boolean = js.native
  var skipKeys: js.Object = js.native
  var state: js.Any = js.native
  var `type`: java.lang.String | scala.Null = js.native
  var typeAnnotation: js.Object = js.native
  def addComment(`type`: java.lang.String, content: java.lang.String): scala.Unit = js.native
  def addComment(`type`: java.lang.String, content: java.lang.String, line: scala.Boolean): scala.Unit = js.native
  /** Give node `comments` of the specified `type`. */
  def addComments(`type`: java.lang.String, comments: js.Array[_]): scala.Unit = js.native
  def assertAnyTypeAnnotation(): scala.Unit = js.native
  def assertAnyTypeAnnotation(opts: js.Object): scala.Unit = js.native
  // ------------------------- assertXXX -------------------------
  def assertArrayExpression(): scala.Unit = js.native
  def assertArrayExpression(opts: js.Object): scala.Unit = js.native
  def assertArrayPattern(): scala.Unit = js.native
  def assertArrayPattern(opts: js.Object): scala.Unit = js.native
  def assertArrayTypeAnnotation(): scala.Unit = js.native
  def assertArrayTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertArrowFunctionExpression(): scala.Unit = js.native
  def assertArrowFunctionExpression(opts: js.Object): scala.Unit = js.native
  def assertAssignmentExpression(): scala.Unit = js.native
  def assertAssignmentExpression(opts: js.Object): scala.Unit = js.native
  def assertAssignmentPattern(): scala.Unit = js.native
  def assertAssignmentPattern(opts: js.Object): scala.Unit = js.native
  def assertAwaitExpression(): scala.Unit = js.native
  def assertAwaitExpression(opts: js.Object): scala.Unit = js.native
  def assertBinary(): scala.Unit = js.native
  def assertBinary(opts: js.Object): scala.Unit = js.native
  def assertBinaryExpression(): scala.Unit = js.native
  def assertBinaryExpression(opts: js.Object): scala.Unit = js.native
  def assertBindExpression(): scala.Unit = js.native
  def assertBindExpression(opts: js.Object): scala.Unit = js.native
  def assertBlock(): scala.Unit = js.native
  def assertBlock(opts: js.Object): scala.Unit = js.native
  def assertBlockParent(): scala.Unit = js.native
  def assertBlockParent(opts: js.Object): scala.Unit = js.native
  def assertBlockStatement(): scala.Unit = js.native
  def assertBlockStatement(opts: js.Object): scala.Unit = js.native
  def assertBooleanLiteral(): scala.Unit = js.native
  def assertBooleanLiteral(opts: js.Object): scala.Unit = js.native
  def assertBooleanLiteralTypeAnnotation(): scala.Unit = js.native
  def assertBooleanLiteralTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertBooleanTypeAnnotation(): scala.Unit = js.native
  def assertBooleanTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertBreakStatement(): scala.Unit = js.native
  def assertBreakStatement(opts: js.Object): scala.Unit = js.native
  def assertCallExpression(): scala.Unit = js.native
  def assertCallExpression(opts: js.Object): scala.Unit = js.native
  def assertCatchClause(): scala.Unit = js.native
  def assertCatchClause(opts: js.Object): scala.Unit = js.native
  def assertClass(): scala.Unit = js.native
  def assertClass(opts: js.Object): scala.Unit = js.native
  def assertClassBody(): scala.Unit = js.native
  def assertClassBody(opts: js.Object): scala.Unit = js.native
  def assertClassDeclaration(): scala.Unit = js.native
  def assertClassDeclaration(opts: js.Object): scala.Unit = js.native
  def assertClassExpression(): scala.Unit = js.native
  def assertClassExpression(opts: js.Object): scala.Unit = js.native
  def assertClassImplements(): scala.Unit = js.native
  def assertClassImplements(opts: js.Object): scala.Unit = js.native
  def assertClassMethod(): scala.Unit = js.native
  def assertClassMethod(opts: js.Object): scala.Unit = js.native
  def assertClassProperty(): scala.Unit = js.native
  def assertClassProperty(opts: js.Object): scala.Unit = js.native
  def assertCompletionStatement(): scala.Unit = js.native
  def assertCompletionStatement(opts: js.Object): scala.Unit = js.native
  def assertConditional(): scala.Unit = js.native
  def assertConditional(opts: js.Object): scala.Unit = js.native
  def assertConditionalExpression(): scala.Unit = js.native
  def assertConditionalExpression(opts: js.Object): scala.Unit = js.native
  def assertContinueStatement(): scala.Unit = js.native
  def assertContinueStatement(opts: js.Object): scala.Unit = js.native
  def assertDebuggerStatement(): scala.Unit = js.native
  def assertDebuggerStatement(opts: js.Object): scala.Unit = js.native
  def assertDeclaration(): scala.Unit = js.native
  def assertDeclaration(opts: js.Object): scala.Unit = js.native
  def assertDeclareClass(): scala.Unit = js.native
  def assertDeclareClass(opts: js.Object): scala.Unit = js.native
  def assertDeclareFunction(): scala.Unit = js.native
  def assertDeclareFunction(opts: js.Object): scala.Unit = js.native
  def assertDeclareInterface(): scala.Unit = js.native
  def assertDeclareInterface(opts: js.Object): scala.Unit = js.native
  def assertDeclareModule(): scala.Unit = js.native
  def assertDeclareModule(opts: js.Object): scala.Unit = js.native
  def assertDeclareTypeAlias(): scala.Unit = js.native
  def assertDeclareTypeAlias(opts: js.Object): scala.Unit = js.native
  def assertDeclareVariable(): scala.Unit = js.native
  def assertDeclareVariable(opts: js.Object): scala.Unit = js.native
  def assertDecorator(): scala.Unit = js.native
  def assertDecorator(opts: js.Object): scala.Unit = js.native
  def assertDirective(): scala.Unit = js.native
  def assertDirective(opts: js.Object): scala.Unit = js.native
  def assertDirectiveLiteral(): scala.Unit = js.native
  def assertDirectiveLiteral(opts: js.Object): scala.Unit = js.native
  def assertDoExpression(): scala.Unit = js.native
  def assertDoExpression(opts: js.Object): scala.Unit = js.native
  def assertDoWhileStatement(): scala.Unit = js.native
  def assertDoWhileStatement(opts: js.Object): scala.Unit = js.native
  def assertEmptyStatement(): scala.Unit = js.native
  def assertEmptyStatement(opts: js.Object): scala.Unit = js.native
  def assertExistentialTypeParam(): scala.Unit = js.native
  def assertExistentialTypeParam(opts: js.Object): scala.Unit = js.native
  def assertExportAllDeclaration(): scala.Unit = js.native
  def assertExportAllDeclaration(opts: js.Object): scala.Unit = js.native
  def assertExportDeclaration(): scala.Unit = js.native
  def assertExportDeclaration(opts: js.Object): scala.Unit = js.native
  def assertExportDefaultDeclaration(): scala.Unit = js.native
  def assertExportDefaultDeclaration(opts: js.Object): scala.Unit = js.native
  def assertExportDefaultSpecifier(): scala.Unit = js.native
  def assertExportDefaultSpecifier(opts: js.Object): scala.Unit = js.native
  def assertExportNamedDeclaration(): scala.Unit = js.native
  def assertExportNamedDeclaration(opts: js.Object): scala.Unit = js.native
  def assertExportNamespaceSpecifier(): scala.Unit = js.native
  def assertExportNamespaceSpecifier(opts: js.Object): scala.Unit = js.native
  def assertExportSpecifier(): scala.Unit = js.native
  def assertExportSpecifier(opts: js.Object): scala.Unit = js.native
  def assertExpression(): scala.Unit = js.native
  def assertExpression(opts: js.Object): scala.Unit = js.native
  def assertExpressionStatement(): scala.Unit = js.native
  def assertExpressionStatement(opts: js.Object): scala.Unit = js.native
  def assertExpressionWrapper(): scala.Unit = js.native
  def assertExpressionWrapper(opts: js.Object): scala.Unit = js.native
  def assertFile(): scala.Unit = js.native
  def assertFile(opts: js.Object): scala.Unit = js.native
  def assertFlow(): scala.Unit = js.native
  def assertFlow(opts: js.Object): scala.Unit = js.native
  def assertFlowBaseAnnotation(): scala.Unit = js.native
  def assertFlowBaseAnnotation(opts: js.Object): scala.Unit = js.native
  def assertFlowDeclaration(): scala.Unit = js.native
  def assertFlowDeclaration(opts: js.Object): scala.Unit = js.native
  def assertFor(): scala.Unit = js.native
  def assertFor(opts: js.Object): scala.Unit = js.native
  def assertForInStatement(): scala.Unit = js.native
  def assertForInStatement(opts: js.Object): scala.Unit = js.native
  def assertForOfStatement(): scala.Unit = js.native
  def assertForOfStatement(opts: js.Object): scala.Unit = js.native
  def assertForStatement(): scala.Unit = js.native
  def assertForStatement(opts: js.Object): scala.Unit = js.native
  def assertForXStatement(): scala.Unit = js.native
  def assertForXStatement(opts: js.Object): scala.Unit = js.native
  def assertFunction(): scala.Unit = js.native
  def assertFunction(opts: js.Object): scala.Unit = js.native
  def assertFunctionDeclaration(): scala.Unit = js.native
  def assertFunctionDeclaration(opts: js.Object): scala.Unit = js.native
  def assertFunctionExpression(): scala.Unit = js.native
  def assertFunctionExpression(opts: js.Object): scala.Unit = js.native
  def assertFunctionParent(): scala.Unit = js.native
  def assertFunctionParent(opts: js.Object): scala.Unit = js.native
  def assertFunctionTypeAnnotation(): scala.Unit = js.native
  def assertFunctionTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertFunctionTypeParam(): scala.Unit = js.native
  def assertFunctionTypeParam(opts: js.Object): scala.Unit = js.native
  def assertGenericTypeAnnotation(): scala.Unit = js.native
  def assertGenericTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertIdentifier(): scala.Unit = js.native
  def assertIdentifier(opts: js.Object): scala.Unit = js.native
  def assertIfStatement(): scala.Unit = js.native
  def assertIfStatement(opts: js.Object): scala.Unit = js.native
  def assertImmutable(): scala.Unit = js.native
  def assertImmutable(opts: js.Object): scala.Unit = js.native
  def assertImportDeclaration(): scala.Unit = js.native
  def assertImportDeclaration(opts: js.Object): scala.Unit = js.native
  def assertImportDefaultSpecifier(): scala.Unit = js.native
  def assertImportDefaultSpecifier(opts: js.Object): scala.Unit = js.native
  def assertImportNamespaceSpecifier(): scala.Unit = js.native
  def assertImportNamespaceSpecifier(opts: js.Object): scala.Unit = js.native
  def assertImportSpecifier(): scala.Unit = js.native
  def assertImportSpecifier(opts: js.Object): scala.Unit = js.native
  def assertInterfaceDeclaration(): scala.Unit = js.native
  def assertInterfaceDeclaration(opts: js.Object): scala.Unit = js.native
  def assertInterfaceExtends(): scala.Unit = js.native
  def assertInterfaceExtends(opts: js.Object): scala.Unit = js.native
  def assertIntersectionTypeAnnotation(): scala.Unit = js.native
  def assertIntersectionTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertJSX(): scala.Unit = js.native
  def assertJSX(opts: js.Object): scala.Unit = js.native
  def assertJSXAttribute(): scala.Unit = js.native
  def assertJSXAttribute(opts: js.Object): scala.Unit = js.native
  def assertJSXClosingElement(): scala.Unit = js.native
  def assertJSXClosingElement(opts: js.Object): scala.Unit = js.native
  def assertJSXElement(): scala.Unit = js.native
  def assertJSXElement(opts: js.Object): scala.Unit = js.native
  def assertJSXEmptyExpression(): scala.Unit = js.native
  def assertJSXEmptyExpression(opts: js.Object): scala.Unit = js.native
  def assertJSXExpressionContainer(): scala.Unit = js.native
  def assertJSXExpressionContainer(opts: js.Object): scala.Unit = js.native
  def assertJSXIdentifier(): scala.Unit = js.native
  def assertJSXIdentifier(opts: js.Object): scala.Unit = js.native
  def assertJSXMemberExpression(): scala.Unit = js.native
  def assertJSXMemberExpression(opts: js.Object): scala.Unit = js.native
  def assertJSXNamespacedName(): scala.Unit = js.native
  def assertJSXNamespacedName(opts: js.Object): scala.Unit = js.native
  def assertJSXOpeningElement(): scala.Unit = js.native
  def assertJSXOpeningElement(opts: js.Object): scala.Unit = js.native
  def assertJSXSpreadAttribute(): scala.Unit = js.native
  def assertJSXSpreadAttribute(opts: js.Object): scala.Unit = js.native
  def assertJSXText(): scala.Unit = js.native
  def assertJSXText(opts: js.Object): scala.Unit = js.native
  def assertLVal(): scala.Unit = js.native
  def assertLVal(opts: js.Object): scala.Unit = js.native
  def assertLabeledStatement(): scala.Unit = js.native
  def assertLabeledStatement(opts: js.Object): scala.Unit = js.native
  def assertLiteral(): scala.Unit = js.native
  def assertLiteral(opts: js.Object): scala.Unit = js.native
  def assertLogicalExpression(): scala.Unit = js.native
  def assertLogicalExpression(opts: js.Object): scala.Unit = js.native
  def assertLoop(): scala.Unit = js.native
  def assertLoop(opts: js.Object): scala.Unit = js.native
  def assertMemberExpression(): scala.Unit = js.native
  def assertMemberExpression(opts: js.Object): scala.Unit = js.native
  def assertMetaProperty(): scala.Unit = js.native
  def assertMetaProperty(opts: js.Object): scala.Unit = js.native
  def assertMethod(): scala.Unit = js.native
  def assertMethod(opts: js.Object): scala.Unit = js.native
  def assertMixedTypeAnnotation(): scala.Unit = js.native
  def assertMixedTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertModuleDeclaration(): scala.Unit = js.native
  def assertModuleDeclaration(opts: js.Object): scala.Unit = js.native
  def assertModuleSpecifier(): scala.Unit = js.native
  def assertModuleSpecifier(opts: js.Object): scala.Unit = js.native
  def assertNewExpression(): scala.Unit = js.native
  def assertNewExpression(opts: js.Object): scala.Unit = js.native
  def assertNoop(): scala.Unit = js.native
  def assertNoop(opts: js.Object): scala.Unit = js.native
  def assertNullLiteral(): scala.Unit = js.native
  def assertNullLiteral(opts: js.Object): scala.Unit = js.native
  def assertNullLiteralTypeAnnotation(): scala.Unit = js.native
  def assertNullLiteralTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertNullableTypeAnnotation(): scala.Unit = js.native
  def assertNullableTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertNumberLiteral(): scala.Unit = js.native
  def assertNumberLiteral(opts: js.Object): scala.Unit = js.native
  def assertNumberTypeAnnotation(): scala.Unit = js.native
  def assertNumberTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertNumericLiteral(): scala.Unit = js.native
  def assertNumericLiteral(opts: js.Object): scala.Unit = js.native
  def assertNumericLiteralTypeAnnotation(): scala.Unit = js.native
  def assertNumericLiteralTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertObjectExpression(): scala.Unit = js.native
  def assertObjectExpression(opts: js.Object): scala.Unit = js.native
  def assertObjectMember(): scala.Unit = js.native
  def assertObjectMember(opts: js.Object): scala.Unit = js.native
  def assertObjectMethod(): scala.Unit = js.native
  def assertObjectMethod(opts: js.Object): scala.Unit = js.native
  def assertObjectPattern(): scala.Unit = js.native
  def assertObjectPattern(opts: js.Object): scala.Unit = js.native
  def assertObjectProperty(): scala.Unit = js.native
  def assertObjectProperty(opts: js.Object): scala.Unit = js.native
  def assertObjectTypeAnnotation(): scala.Unit = js.native
  def assertObjectTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertObjectTypeCallProperty(): scala.Unit = js.native
  def assertObjectTypeCallProperty(opts: js.Object): scala.Unit = js.native
  def assertObjectTypeIndexer(): scala.Unit = js.native
  def assertObjectTypeIndexer(opts: js.Object): scala.Unit = js.native
  def assertObjectTypeProperty(): scala.Unit = js.native
  def assertObjectTypeProperty(opts: js.Object): scala.Unit = js.native
  def assertParenthesizedExpression(): scala.Unit = js.native
  def assertParenthesizedExpression(opts: js.Object): scala.Unit = js.native
  def assertPattern(): scala.Unit = js.native
  def assertPattern(opts: js.Object): scala.Unit = js.native
  def assertProgram(): scala.Unit = js.native
  def assertProgram(opts: js.Object): scala.Unit = js.native
  def assertProperty(): scala.Unit = js.native
  def assertProperty(opts: js.Object): scala.Unit = js.native
  def assertPureish(): scala.Unit = js.native
  def assertPureish(opts: js.Object): scala.Unit = js.native
  def assertQualifiedTypeIdentifier(): scala.Unit = js.native
  def assertQualifiedTypeIdentifier(opts: js.Object): scala.Unit = js.native
  def assertRegExpLiteral(): scala.Unit = js.native
  def assertRegExpLiteral(opts: js.Object): scala.Unit = js.native
  def assertRegexLiteral(): scala.Unit = js.native
  def assertRegexLiteral(opts: js.Object): scala.Unit = js.native
  def assertRestElement(): scala.Unit = js.native
  def assertRestElement(opts: js.Object): scala.Unit = js.native
  def assertRestProperty(): scala.Unit = js.native
  def assertRestProperty(opts: js.Object): scala.Unit = js.native
  def assertReturnStatement(): scala.Unit = js.native
  def assertReturnStatement(opts: js.Object): scala.Unit = js.native
  def assertScopable(): scala.Unit = js.native
  def assertScopable(opts: js.Object): scala.Unit = js.native
  def assertSequenceExpression(): scala.Unit = js.native
  def assertSequenceExpression(opts: js.Object): scala.Unit = js.native
  def assertSpreadElement(): scala.Unit = js.native
  def assertSpreadElement(opts: js.Object): scala.Unit = js.native
  def assertSpreadProperty(): scala.Unit = js.native
  def assertSpreadProperty(opts: js.Object): scala.Unit = js.native
  def assertStatement(): scala.Unit = js.native
  def assertStatement(opts: js.Object): scala.Unit = js.native
  def assertStringLiteral(): scala.Unit = js.native
  def assertStringLiteral(opts: js.Object): scala.Unit = js.native
  def assertStringLiteralTypeAnnotation(): scala.Unit = js.native
  def assertStringLiteralTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertStringTypeAnnotation(): scala.Unit = js.native
  def assertStringTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertSuper(): scala.Unit = js.native
  def assertSuper(opts: js.Object): scala.Unit = js.native
  def assertSwitchCase(): scala.Unit = js.native
  def assertSwitchCase(opts: js.Object): scala.Unit = js.native
  def assertSwitchStatement(): scala.Unit = js.native
  def assertSwitchStatement(opts: js.Object): scala.Unit = js.native
  def assertTaggedTemplateExpression(): scala.Unit = js.native
  def assertTaggedTemplateExpression(opts: js.Object): scala.Unit = js.native
  def assertTemplateElement(): scala.Unit = js.native
  def assertTemplateElement(opts: js.Object): scala.Unit = js.native
  def assertTemplateLiteral(): scala.Unit = js.native
  def assertTemplateLiteral(opts: js.Object): scala.Unit = js.native
  def assertTerminatorless(): scala.Unit = js.native
  def assertTerminatorless(opts: js.Object): scala.Unit = js.native
  def assertThisExpression(): scala.Unit = js.native
  def assertThisExpression(opts: js.Object): scala.Unit = js.native
  def assertThisTypeAnnotation(): scala.Unit = js.native
  def assertThisTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertThrowStatement(): scala.Unit = js.native
  def assertThrowStatement(opts: js.Object): scala.Unit = js.native
  def assertTryStatement(): scala.Unit = js.native
  def assertTryStatement(opts: js.Object): scala.Unit = js.native
  def assertTupleTypeAnnotation(): scala.Unit = js.native
  def assertTupleTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertTypeAlias(): scala.Unit = js.native
  def assertTypeAlias(opts: js.Object): scala.Unit = js.native
  def assertTypeAnnotation(): scala.Unit = js.native
  def assertTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertTypeCastExpression(): scala.Unit = js.native
  def assertTypeCastExpression(opts: js.Object): scala.Unit = js.native
  def assertTypeParameterDeclaration(): scala.Unit = js.native
  def assertTypeParameterDeclaration(opts: js.Object): scala.Unit = js.native
  def assertTypeParameterInstantiation(): scala.Unit = js.native
  def assertTypeParameterInstantiation(opts: js.Object): scala.Unit = js.native
  def assertTypeofTypeAnnotation(): scala.Unit = js.native
  def assertTypeofTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertUnaryExpression(): scala.Unit = js.native
  def assertUnaryExpression(opts: js.Object): scala.Unit = js.native
  def assertUnaryLike(): scala.Unit = js.native
  def assertUnaryLike(opts: js.Object): scala.Unit = js.native
  def assertUnionTypeAnnotation(): scala.Unit = js.native
  def assertUnionTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertUpdateExpression(): scala.Unit = js.native
  def assertUpdateExpression(opts: js.Object): scala.Unit = js.native
  def assertUserWhitespacable(): scala.Unit = js.native
  def assertUserWhitespacable(opts: js.Object): scala.Unit = js.native
  def assertVariableDeclaration(): scala.Unit = js.native
  def assertVariableDeclaration(opts: js.Object): scala.Unit = js.native
  def assertVariableDeclarator(): scala.Unit = js.native
  def assertVariableDeclarator(opts: js.Object): scala.Unit = js.native
  def assertVoidTypeAnnotation(): scala.Unit = js.native
  def assertVoidTypeAnnotation(opts: js.Object): scala.Unit = js.native
  def assertWhile(): scala.Unit = js.native
  def assertWhile(opts: js.Object): scala.Unit = js.native
  def assertWhileStatement(): scala.Unit = js.native
  def assertWhileStatement(opts: js.Object): scala.Unit = js.native
  def assertWithStatement(): scala.Unit = js.native
  def assertWithStatement(opts: js.Object): scala.Unit = js.native
  def assertYieldExpression(): scala.Unit = js.native
  def assertYieldExpression(opts: js.Object): scala.Unit = js.native
  def baseTypeStrictlyMatches(right: NodePath[Node]): scala.Boolean = js.native
  def buildCodeFrameError[TError /* <: stdLib.Error */](msg: java.lang.String): TError = js.native
  def buildCodeFrameError[TError /* <: stdLib.Error */](
    msg: java.lang.String,
    Error: org.scalablytyped.runtime.Instantiable1[/* msg */ java.lang.String, TError]
  ): TError = js.native
  // ------------------------- context -------------------------
  def call(key: java.lang.String): scala.Boolean = js.native
  /**
    * This checks whether or not we're in one of the following positions:
    *
    *   for (KEY in right);
    *   for (KEY;;);
    *
    * This is because these spots allow VariableDeclarations AND normal expressions so we need
    * to tell the path replacement that it's ok to replace this with an expression.
    */
  def canHaveVariableDeclarationOrExpression(): scala.Boolean = js.native
  /**
    * This checks whether we are swapping an arrow function's body between an
    * expression and a block statement (or vice versa).
    *
    * This is because arrow functions may implicitly return an expression, which
    * is the same as containing a block statement.
    */
  def canSwapBetweenExpressionAndStatement(replacement: Node): scala.Boolean = js.native
  def couldBeBaseType(name: java.lang.String): scala.Boolean = js.native
  // Example: https://github.com/babel/babel/blob/63204ae51e020d84a5b246312f5eeb4d981ab952/packages/babel-traverse/src/path/modification.js#L83
  def debug(buildMessage: js.Function0[java.lang.String]): scala.Unit = js.native
  /** Check whether the path node `key` strict equals `value`. */
  def equals(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  /**
    * Walk the input `node` and statically evaluate it.
    *
    * Returns an object in the form `{ confident, value }`. `confident` indicates
    * whether or not we had to drop out of evaluating the expression because of
    * hitting an unknown node that we couldn't confidently find the value of.
    *
    * Example:
    *
    *   t.evaluate(parse("5 + 5")) // { confident: true, value: 10 }
    *   t.evaluate(parse("!true")) // { confident: true, value: false }
    *   t.evaluate(parse("foo + foo")) // { confident: false, value: undefined }
    */
  def evaluate(): atBabelTraverseLib.Anon_Confident = js.native
  // ------------------------- evaluation -------------------------
  /**
    * Walk the input `node` and statically evaluate if it's truthy.
    *
    * Returning `true` when we're sure that the expression will evaluate to a
    * truthy value, `false` if we're sure that it will evaluate to a falsy
    * value and `undefined` if we aren't sure. Because of this please do not
    * rely on coercion when using this method and check with === if it's false.
    */
  def evaluateTruthy(): scala.Boolean = js.native
  def find(callback: js.Function1[/* path */ this.type, scala.Boolean]): NodePath[Node] = js.native
  // ------------------------- ancestry -------------------------
  /**
    * Call the provided `callback` with the `NodePath`s of all the parents.
    * When the `callback` returns a truthy value, we return that node path.
    */
  def findParent(callback: js.Function1[/* path */ this.type, scala.Boolean]): NodePath[Node] = js.native
  def get(key: java.lang.String): NodePath[Node] | js.Array[NodePath[Node]] = js.native
  def get(key: java.lang.String, context: TraversalContext): NodePath[Node] | js.Array[NodePath[Node]] = js.native
  def get(key: java.lang.String, context: scala.Boolean): NodePath[Node] | js.Array[NodePath[Node]] = js.native
  def get[K /* <: java.lang.String */](key: K): (NodePath[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]) | (js.Array[
    NodePath[
      /* import warning: ImportType.apply Failed type conversion: T[K][number] */ js.Any
    ]
  ]) = js.native
  def get[K /* <: java.lang.String */](key: K, context: TraversalContext): (NodePath[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]) | (js.Array[
    NodePath[
      /* import warning: ImportType.apply Failed type conversion: T[K][number] */ js.Any
    ]
  ]) = js.native
  def get[K /* <: java.lang.String */](key: K, context: scala.Boolean): (NodePath[/* import warning: ImportType.apply Failed type conversion: T[K] */ js.Any]) | (js.Array[
    NodePath[
      /* import warning: ImportType.apply Failed type conversion: T[K][number] */ js.Any
    ]
  ]) = js.native
  def getAllNextSiblings(): js.Array[NodePath[Node]] = js.native
  def getAllPrevSiblings(): js.Array[NodePath[Node]] = js.native
  /**
    * Build an array of node paths containing the entire ancestry of the current node path.
    *
    * NOTE: The current node path is included in this.
    */
  def getAncestry(): js.Array[NodePath[Node]] = js.native
  def getBindingIdentifiers(): js.Array[Node] = js.native
  def getBindingIdentifiers(duplicates: scala.Boolean): js.Array[Node] = js.native
  def getCompletionRecords(): js.Array[NodePath[Node]] = js.native
  def getData(key: java.lang.String): js.Any = js.native
  def getData(key: java.lang.String, `def`: js.Any): js.Any = js.native
  /** Get the earliest path in the tree where the provided `paths` intersect. */
  def getDeepestCommonAncestorFrom(paths: js.Array[NodePath[Node]]): NodePath[Node] = js.native
  def getDeepestCommonAncestorFrom(
    paths: js.Array[NodePath[Node]],
    filter: js.Function3[
      /* deepest */ Node, 
      /* i */ scala.Double, 
      /* ancestries */ js.Array[this.type], 
      this.type
    ]
  ): NodePath[Node] = js.native
  /**
    * Get the deepest common ancestor and then from it, get the earliest relationship path
    * to that ancestor.
    *
    * Earliest is defined as being "before" all the other nodes in terms of list container
    * position and visiting key.
    */
  def getEarliestCommonAncestorFrom(paths: js.Array[NodePath[Node]]): js.Array[NodePath[Node]] = js.native
  /** Get the parent function of the current path. */
  def getFunctionParent(): NodePath[atBabelTypesLib.atBabelTypesMod.Function] = js.native
  // ------------------------- family -------------------------
  def getOpposite(): NodePath[Node] = js.native
  def getOuterBindingIdentifiers(): js.Array[Node] = js.native
  def getOuterBindingIdentifiers(duplicates: scala.Boolean): js.Array[Node] = js.native
  def getPathLocation(): java.lang.String = js.native
  def getScope(scope: Scope): Scope = js.native
  def getSibling(key: java.lang.String): NodePath[Node] = js.native
  def getSibling(key: scala.Double): NodePath[Node] = js.native
  /** Get the source code associated with this node. */
  def getSource(): java.lang.String = js.native
  /** Walk up the tree until we hit a parent node path in a list. */
  def getStatementParent(): NodePath[atBabelTypesLib.atBabelTypesMod.Statement] = js.native
  // ------------------------- inference -------------------------
  /** Infer the type of the current `NodePath`. */
  def getTypeAnnotation(): atBabelTypesLib.atBabelTypesMod.FlowType = js.native
  /**
    * Check whether we have the input `key`. If the `key` references an array then we check
    * if the array has any items, otherwise we just check if it's falsy.
    */
  def has(key: java.lang.String): scala.Boolean = js.native
  /** Hoist the current node to the highest scope possible and return a UID referencing it. */
  def hoist(scope: Scope): scala.Unit = js.native
  def inType(candidateTypes: java.lang.String*): scala.Boolean = js.native
  /**
    * Insert the provided nodes after the current one. When inserting nodes after an
    * expression, ensure that the completion record is correct by pushing the current node.
    */
  def insertAfter(nodes: Node): js.Any = js.native
  def insertAfter(nodes: js.Array[Node]): js.Any = js.native
  // ------------------------- modification -------------------------
  /** Insert the provided nodes before the current one. */
  def insertBefore(nodes: Node): js.Any = js.native
  def insertBefore(nodes: js.Array[Node]): js.Any = js.native
  /** Alias of `has`. */
  def is(key: java.lang.String): scala.Boolean = js.native
  def isAnyTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AnyTypeAnnotation> */ scala.Boolean = js.native
  def isAnyTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AnyTypeAnnotation> */ scala.Boolean = js.native
  // ------------------------- isXXX -------------------------
  def isArrayExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayExpression> */ scala.Boolean = js.native
  def isArrayExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayExpression> */ scala.Boolean = js.native
  def isArrayPattern(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayPattern> */ scala.Boolean = js.native
  def isArrayPattern(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayPattern> */ scala.Boolean = js.native
  def isArrayTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayTypeAnnotation> */ scala.Boolean = js.native
  def isArrayTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrayTypeAnnotation> */ scala.Boolean = js.native
  def isArrowFunctionExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrowFunctionExpression> */ scala.Boolean = js.native
  def isArrowFunctionExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ArrowFunctionExpression> */ scala.Boolean = js.native
  def isAssignmentExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AssignmentExpression> */ scala.Boolean = js.native
  def isAssignmentExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AssignmentExpression> */ scala.Boolean = js.native
  def isAssignmentPattern(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AssignmentPattern> */ scala.Boolean = js.native
  def isAssignmentPattern(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AssignmentPattern> */ scala.Boolean = js.native
  def isAwaitExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AwaitExpression> */ scala.Boolean = js.native
  def isAwaitExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.AwaitExpression> */ scala.Boolean = js.native
  def isBaseType(baseName: java.lang.String): scala.Boolean = js.native
  def isBaseType(baseName: java.lang.String, soft: scala.Boolean): scala.Boolean = js.native
  def isBinary(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Binary> */ scala.Boolean = js.native
  def isBinary(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Binary> */ scala.Boolean = js.native
  def isBinaryExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BinaryExpression> */ scala.Boolean = js.native
  def isBinaryExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BinaryExpression> */ scala.Boolean = js.native
  def isBindExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BindExpression> */ scala.Boolean = js.native
  def isBindExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BindExpression> */ scala.Boolean = js.native
  def isBindingIdentifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier> */ scala.Boolean = js.native
  def isBindingIdentifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier> */ scala.Boolean = js.native
  def isBlacklisted(): scala.Boolean = js.native
  def isBlock(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Block> */ scala.Boolean = js.native
  def isBlock(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Block> */ scala.Boolean = js.native
  def isBlockParent(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BlockParent> */ scala.Boolean = js.native
  def isBlockParent(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BlockParent> */ scala.Boolean = js.native
  def isBlockScoped(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionDeclaration | @babel/types.@babel/types.ClassDeclaration | @babel/types.@babel/types.VariableDeclaration> */ scala.Boolean = js.native
  def isBlockScoped(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionDeclaration | @babel/types.@babel/types.ClassDeclaration | @babel/types.@babel/types.VariableDeclaration> */ scala.Boolean = js.native
  def isBlockStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BlockStatement> */ scala.Boolean = js.native
  def isBlockStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BlockStatement> */ scala.Boolean = js.native
  def isBooleanLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanLiteral> */ scala.Boolean = js.native
  def isBooleanLiteral(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanLiteral> */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanLiteralTypeAnnotation> */ scala.Boolean = js.native
  def isBooleanLiteralTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanLiteralTypeAnnotation> */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanTypeAnnotation> */ scala.Boolean = js.native
  def isBooleanTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BooleanTypeAnnotation> */ scala.Boolean = js.native
  def isBreakStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BreakStatement> */ scala.Boolean = js.native
  def isBreakStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.BreakStatement> */ scala.Boolean = js.native
  def isCallExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CallExpression> */ scala.Boolean = js.native
  def isCallExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CallExpression> */ scala.Boolean = js.native
  def isCatchClause(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CatchClause> */ scala.Boolean = js.native
  def isCatchClause(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CatchClause> */ scala.Boolean = js.native
  def isClass(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Class> */ scala.Boolean = js.native
  def isClass(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Class> */ scala.Boolean = js.native
  def isClassBody(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassBody> */ scala.Boolean = js.native
  def isClassBody(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassBody> */ scala.Boolean = js.native
  def isClassDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassDeclaration> */ scala.Boolean = js.native
  def isClassDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassDeclaration> */ scala.Boolean = js.native
  def isClassExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassExpression> */ scala.Boolean = js.native
  def isClassExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassExpression> */ scala.Boolean = js.native
  def isClassImplements(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassImplements> */ scala.Boolean = js.native
  def isClassImplements(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassImplements> */ scala.Boolean = js.native
  def isClassMethod(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassMethod> */ scala.Boolean = js.native
  def isClassMethod(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassMethod> */ scala.Boolean = js.native
  def isClassProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassProperty> */ scala.Boolean = js.native
  def isClassProperty(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ClassProperty> */ scala.Boolean = js.native
  /** Check whether the current path references a completion record */
  def isCompletionRecord(): scala.Boolean = js.native
  def isCompletionRecord(allowInsideFunction: scala.Boolean): scala.Boolean = js.native
  def isCompletionStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CompletionStatement> */ scala.Boolean = js.native
  def isCompletionStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.CompletionStatement> */ scala.Boolean = js.native
  def isConditional(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Conditional> */ scala.Boolean = js.native
  def isConditional(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Conditional> */ scala.Boolean = js.native
  def isConditionalExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ConditionalExpression> */ scala.Boolean = js.native
  def isConditionalExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ConditionalExpression> */ scala.Boolean = js.native
  def isContinueStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ContinueStatement> */ scala.Boolean = js.native
  def isContinueStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ContinueStatement> */ scala.Boolean = js.native
  def isDebuggerStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DebuggerStatement> */ scala.Boolean = js.native
  def isDebuggerStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DebuggerStatement> */ scala.Boolean = js.native
  def isDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Declaration> */ scala.Boolean = js.native
  def isDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Declaration> */ scala.Boolean = js.native
  def isDeclareClass(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareClass> */ scala.Boolean = js.native
  def isDeclareClass(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareClass> */ scala.Boolean = js.native
  def isDeclareFunction(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareFunction> */ scala.Boolean = js.native
  def isDeclareFunction(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareFunction> */ scala.Boolean = js.native
  def isDeclareInterface(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareInterface> */ scala.Boolean = js.native
  def isDeclareInterface(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareInterface> */ scala.Boolean = js.native
  def isDeclareModule(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareModule> */ scala.Boolean = js.native
  def isDeclareModule(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareModule> */ scala.Boolean = js.native
  def isDeclareTypeAlias(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareTypeAlias> */ scala.Boolean = js.native
  def isDeclareTypeAlias(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareTypeAlias> */ scala.Boolean = js.native
  def isDeclareVariable(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareVariable> */ scala.Boolean = js.native
  def isDeclareVariable(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DeclareVariable> */ scala.Boolean = js.native
  def isDecorator(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Decorator> */ scala.Boolean = js.native
  def isDecorator(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Decorator> */ scala.Boolean = js.native
  def isDirective(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Directive> */ scala.Boolean = js.native
  def isDirective(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Directive> */ scala.Boolean = js.native
  def isDirectiveLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DirectiveLiteral> */ scala.Boolean = js.native
  def isDirectiveLiteral(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DirectiveLiteral> */ scala.Boolean = js.native
  def isDoExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DoExpression> */ scala.Boolean = js.native
  def isDoExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DoExpression> */ scala.Boolean = js.native
  def isDoWhileStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DoWhileStatement> */ scala.Boolean = js.native
  def isDoWhileStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.DoWhileStatement> */ scala.Boolean = js.native
  def isEmptyStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.EmptyStatement> */ scala.Boolean = js.native
  def isEmptyStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.EmptyStatement> */ scala.Boolean = js.native
  def isExportAllDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportAllDeclaration> */ scala.Boolean = js.native
  def isExportAllDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportAllDeclaration> */ scala.Boolean = js.native
  def isExportDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDeclaration> */ scala.Boolean = js.native
  def isExportDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDeclaration> */ scala.Boolean = js.native
  def isExportDefaultDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDefaultDeclaration> */ scala.Boolean = js.native
  def isExportDefaultDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDefaultDeclaration> */ scala.Boolean = js.native
  def isExportDefaultSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDefaultSpecifier> */ scala.Boolean = js.native
  def isExportDefaultSpecifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportDefaultSpecifier> */ scala.Boolean = js.native
  def isExportNamedDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportNamedDeclaration> */ scala.Boolean = js.native
  def isExportNamedDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportNamedDeclaration> */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportNamespaceSpecifier> */ scala.Boolean = js.native
  def isExportNamespaceSpecifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportNamespaceSpecifier> */ scala.Boolean = js.native
  def isExportSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportSpecifier> */ scala.Boolean = js.native
  def isExportSpecifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExportSpecifier> */ scala.Boolean = js.native
  def isExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Expression> */ scala.Boolean = js.native
  def isExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Expression> */ scala.Boolean = js.native
  def isExpressionStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExpressionStatement> */ scala.Boolean = js.native
  def isExpressionStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExpressionStatement> */ scala.Boolean = js.native
  def isExpressionWrapper(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExpressionWrapper> */ scala.Boolean = js.native
  def isExpressionWrapper(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ExpressionWrapper> */ scala.Boolean = js.native
  def isFile(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.File> */ scala.Boolean = js.native
  def isFile(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.File> */ scala.Boolean = js.native
  def isFlow(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Flow> */ scala.Boolean = js.native
  def isFlow(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Flow> */ scala.Boolean = js.native
  def isFlowBaseAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowBaseAnnotation> */ scala.Boolean = js.native
  def isFlowBaseAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowBaseAnnotation> */ scala.Boolean = js.native
  def isFlowDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowDeclaration> */ scala.Boolean = js.native
  def isFlowDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FlowDeclaration> */ scala.Boolean = js.native
  def isFor(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.For> */ scala.Boolean = js.native
  def isFor(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.For> */ scala.Boolean = js.native
  def isForInStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForInStatement> */ scala.Boolean = js.native
  def isForInStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForInStatement> */ scala.Boolean = js.native
  def isForOfStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForOfStatement> */ scala.Boolean = js.native
  def isForOfStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForOfStatement> */ scala.Boolean = js.native
  def isForStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForStatement> */ scala.Boolean = js.native
  def isForStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForStatement> */ scala.Boolean = js.native
  def isForXStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForXStatement> */ scala.Boolean = js.native
  def isForXStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ForXStatement> */ scala.Boolean = js.native
  def isFunction(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Function> */ scala.Boolean = js.native
  def isFunction(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Function> */ scala.Boolean = js.native
  def isFunctionDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionDeclaration> */ scala.Boolean = js.native
  def isFunctionDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionDeclaration> */ scala.Boolean = js.native
  def isFunctionExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionExpression> */ scala.Boolean = js.native
  def isFunctionExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionExpression> */ scala.Boolean = js.native
  def isFunctionParent(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionParent> */ scala.Boolean = js.native
  def isFunctionParent(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionParent> */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionTypeAnnotation> */ scala.Boolean = js.native
  def isFunctionTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionTypeAnnotation> */ scala.Boolean = js.native
  def isFunctionTypeParam(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionTypeParam> */ scala.Boolean = js.native
  def isFunctionTypeParam(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.FunctionTypeParam> */ scala.Boolean = js.native
  def isGenerated(): scala.Boolean = js.native
  def isGenerated(opts: js.Object): scala.Boolean = js.native
  def isGenericType(genericName: java.lang.String): scala.Boolean = js.native
  def isGenericTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.GenericTypeAnnotation> */ scala.Boolean = js.native
  def isGenericTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.GenericTypeAnnotation> */ scala.Boolean = js.native
  def isIdentifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier> */ scala.Boolean = js.native
  def isIdentifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier> */ scala.Boolean = js.native
  def isIfStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.IfStatement> */ scala.Boolean = js.native
  def isIfStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.IfStatement> */ scala.Boolean = js.native
  def isImmutable(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Immutable> */ scala.Boolean = js.native
  def isImmutable(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Immutable> */ scala.Boolean = js.native
  def isImportDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportDeclaration> */ scala.Boolean = js.native
  def isImportDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportDeclaration> */ scala.Boolean = js.native
  def isImportDefaultSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportDefaultSpecifier> */ scala.Boolean = js.native
  def isImportDefaultSpecifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportDefaultSpecifier> */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportNamespaceSpecifier> */ scala.Boolean = js.native
  def isImportNamespaceSpecifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportNamespaceSpecifier> */ scala.Boolean = js.native
  def isImportSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportSpecifier> */ scala.Boolean = js.native
  def isImportSpecifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ImportSpecifier> */ scala.Boolean = js.native
  def isInterfaceDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterfaceDeclaration> */ scala.Boolean = js.native
  def isInterfaceDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterfaceDeclaration> */ scala.Boolean = js.native
  def isInterfaceExtends(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterfaceExtends> */ scala.Boolean = js.native
  def isInterfaceExtends(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.InterfaceExtends> */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.IntersectionTypeAnnotation> */ scala.Boolean = js.native
  def isIntersectionTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.IntersectionTypeAnnotation> */ scala.Boolean = js.native
  def isJSX(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSX> */ scala.Boolean = js.native
  def isJSX(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSX> */ scala.Boolean = js.native
  def isJSXAttribute(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXAttribute> */ scala.Boolean = js.native
  def isJSXAttribute(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXAttribute> */ scala.Boolean = js.native
  def isJSXClosingElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXClosingElement> */ scala.Boolean = js.native
  def isJSXClosingElement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXClosingElement> */ scala.Boolean = js.native
  def isJSXElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXElement> */ scala.Boolean = js.native
  def isJSXElement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXElement> */ scala.Boolean = js.native
  def isJSXEmptyExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXEmptyExpression> */ scala.Boolean = js.native
  def isJSXEmptyExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXEmptyExpression> */ scala.Boolean = js.native
  def isJSXExpressionContainer(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXExpressionContainer> */ scala.Boolean = js.native
  def isJSXExpressionContainer(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXExpressionContainer> */ scala.Boolean = js.native
  def isJSXIdentifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXIdentifier> */ scala.Boolean = js.native
  def isJSXIdentifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXIdentifier> */ scala.Boolean = js.native
  def isJSXMemberExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXMemberExpression> */ scala.Boolean = js.native
  def isJSXMemberExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXMemberExpression> */ scala.Boolean = js.native
  def isJSXNamespacedName(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXNamespacedName> */ scala.Boolean = js.native
  def isJSXNamespacedName(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXNamespacedName> */ scala.Boolean = js.native
  def isJSXOpeningElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXOpeningElement> */ scala.Boolean = js.native
  def isJSXOpeningElement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXOpeningElement> */ scala.Boolean = js.native
  def isJSXSpreadAttribute(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXSpreadAttribute> */ scala.Boolean = js.native
  def isJSXSpreadAttribute(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXSpreadAttribute> */ scala.Boolean = js.native
  def isJSXText(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXText> */ scala.Boolean = js.native
  def isJSXText(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.JSXText> */ scala.Boolean = js.native
  def isLVal(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LVal> */ scala.Boolean = js.native
  def isLVal(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LVal> */ scala.Boolean = js.native
  def isLabeledStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LabeledStatement> */ scala.Boolean = js.native
  def isLabeledStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LabeledStatement> */ scala.Boolean = js.native
  def isLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Literal> */ scala.Boolean = js.native
  def isLiteral(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Literal> */ scala.Boolean = js.native
  def isLogicalExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LogicalExpression> */ scala.Boolean = js.native
  def isLogicalExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.LogicalExpression> */ scala.Boolean = js.native
  def isLoop(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Loop> */ scala.Boolean = js.native
  def isLoop(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Loop> */ scala.Boolean = js.native
  def isMemberExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MemberExpression> */ scala.Boolean = js.native
  def isMemberExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MemberExpression> */ scala.Boolean = js.native
  def isMetaProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MetaProperty> */ scala.Boolean = js.native
  def isMetaProperty(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MetaProperty> */ scala.Boolean = js.native
  def isMethod(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Method> */ scala.Boolean = js.native
  def isMethod(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Method> */ scala.Boolean = js.native
  def isMixedTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MixedTypeAnnotation> */ scala.Boolean = js.native
  def isMixedTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MixedTypeAnnotation> */ scala.Boolean = js.native
  def isModuleDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ModuleDeclaration> */ scala.Boolean = js.native
  def isModuleDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ModuleDeclaration> */ scala.Boolean = js.native
  def isModuleSpecifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ModuleSpecifier> */ scala.Boolean = js.native
  def isModuleSpecifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ModuleSpecifier> */ scala.Boolean = js.native
  def isNewExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NewExpression> */ scala.Boolean = js.native
  def isNewExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NewExpression> */ scala.Boolean = js.native
  /**
    * Check the type against our stored internal type of the node. This is handy when a node has
    * been removed yet we still internally know the type and need it to calculate node replacement.
    */
  def isNodeType(`type`: java.lang.String): scala.Boolean = js.native
  def isNoop(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Noop> */ scala.Boolean = js.native
  def isNoop(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Noop> */ scala.Boolean = js.native
  def isNullLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullLiteral> */ scala.Boolean = js.native
  def isNullLiteral(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullLiteral> */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullLiteralTypeAnnotation> */ scala.Boolean = js.native
  def isNullLiteralTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullLiteralTypeAnnotation> */ scala.Boolean = js.native
  def isNullableTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullableTypeAnnotation> */ scala.Boolean = js.native
  def isNullableTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NullableTypeAnnotation> */ scala.Boolean = js.native
  def isNumberLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumericLiteral> */ scala.Boolean = js.native
  def isNumberLiteral(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumericLiteral> */ scala.Boolean = js.native
  def isNumberTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumberTypeAnnotation> */ scala.Boolean = js.native
  def isNumberTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumberTypeAnnotation> */ scala.Boolean = js.native
  def isNumericLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumericLiteral> */ scala.Boolean = js.native
  def isNumericLiteral(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.NumericLiteral> */ scala.Boolean = js.native
  def isObjectExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectExpression> */ scala.Boolean = js.native
  def isObjectExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectExpression> */ scala.Boolean = js.native
  def isObjectMember(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectMember> */ scala.Boolean = js.native
  def isObjectMember(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectMember> */ scala.Boolean = js.native
  def isObjectMethod(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectMethod> */ scala.Boolean = js.native
  def isObjectMethod(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectMethod> */ scala.Boolean = js.native
  def isObjectPattern(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectPattern> */ scala.Boolean = js.native
  def isObjectPattern(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectPattern> */ scala.Boolean = js.native
  def isObjectProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectProperty> */ scala.Boolean = js.native
  def isObjectProperty(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectProperty> */ scala.Boolean = js.native
  def isObjectTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeAnnotation> */ scala.Boolean = js.native
  def isObjectTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeAnnotation> */ scala.Boolean = js.native
  def isObjectTypeCallProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeCallProperty> */ scala.Boolean = js.native
  def isObjectTypeCallProperty(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeCallProperty> */ scala.Boolean = js.native
  def isObjectTypeIndexer(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeIndexer> */ scala.Boolean = js.native
  def isObjectTypeIndexer(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeIndexer> */ scala.Boolean = js.native
  def isObjectTypeProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeProperty> */ scala.Boolean = js.native
  def isObjectTypeProperty(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ObjectTypeProperty> */ scala.Boolean = js.native
  def isParenthesizedExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ParenthesizedExpression> */ scala.Boolean = js.native
  def isParenthesizedExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ParenthesizedExpression> */ scala.Boolean = js.native
  def isPattern(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Pattern> */ scala.Boolean = js.native
  def isPattern(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Pattern> */ scala.Boolean = js.native
  def isProgram(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Program> */ scala.Boolean = js.native
  def isProgram(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Program> */ scala.Boolean = js.native
  def isProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Property> */ scala.Boolean = js.native
  def isProperty(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Property> */ scala.Boolean = js.native
  def isPure(): scala.Boolean = js.native
  def isPure(opts: js.Object): scala.Boolean = js.native
  def isPureish(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Pureish> */ scala.Boolean = js.native
  def isPureish(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Pureish> */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.QualifiedTypeIdentifier> */ scala.Boolean = js.native
  def isQualifiedTypeIdentifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.QualifiedTypeIdentifier> */ scala.Boolean = js.native
  def isReferenced(): scala.Boolean = js.native
  def isReferenced(opts: js.Object): scala.Boolean = js.native
  def isReferencedIdentifier(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier | @babel/types.@babel/types.JSXIdentifier> */ scala.Boolean = js.native
  def isReferencedIdentifier(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Identifier | @babel/types.@babel/types.JSXIdentifier> */ scala.Boolean = js.native
  def isReferencedMemberExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MemberExpression> */ scala.Boolean = js.native
  def isReferencedMemberExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.MemberExpression> */ scala.Boolean = js.native
  def isRegExpLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RegExpLiteral> */ scala.Boolean = js.native
  def isRegExpLiteral(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RegExpLiteral> */ scala.Boolean = js.native
  def isRegexLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RegExpLiteral> */ scala.Boolean = js.native
  def isRegexLiteral(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RegExpLiteral> */ scala.Boolean = js.native
  def isRestElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RestElement> */ scala.Boolean = js.native
  def isRestElement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RestElement> */ scala.Boolean = js.native
  def isRestProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RestProperty> */ scala.Boolean = js.native
  def isRestProperty(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.RestProperty> */ scala.Boolean = js.native
  def isReturnStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ReturnStatement> */ scala.Boolean = js.native
  def isReturnStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ReturnStatement> */ scala.Boolean = js.native
  def isScopable(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Scopable> */ scala.Boolean = js.native
  def isScopable(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Scopable> */ scala.Boolean = js.native
  def isScope(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Scopable> */ scala.Boolean = js.native
  def isScope(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Scopable> */ scala.Boolean = js.native
  def isSequenceExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SequenceExpression> */ scala.Boolean = js.native
  def isSequenceExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SequenceExpression> */ scala.Boolean = js.native
  def isSpreadElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SpreadElement> */ scala.Boolean = js.native
  def isSpreadElement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SpreadElement> */ scala.Boolean = js.native
  def isSpreadProperty(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SpreadProperty> */ scala.Boolean = js.native
  def isSpreadProperty(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SpreadProperty> */ scala.Boolean = js.native
  def isStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Statement> */ scala.Boolean = js.native
  def isStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Statement> */ scala.Boolean = js.native
  /**
    * Check whether or not the current `key` allows either a single statement or block statement
    * so we can explode it if necessary.
    */
  def isStatementOrBlock(): scala.Boolean = js.native
  def isStatic(): scala.Boolean = js.native
  def isStringLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringLiteral> */ scala.Boolean = js.native
  def isStringLiteral(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringLiteral> */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringLiteralTypeAnnotation> */ scala.Boolean = js.native
  def isStringLiteralTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringLiteralTypeAnnotation> */ scala.Boolean = js.native
  def isStringTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringTypeAnnotation> */ scala.Boolean = js.native
  def isStringTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.StringTypeAnnotation> */ scala.Boolean = js.native
  def isSuper(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Super> */ scala.Boolean = js.native
  def isSuper(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Super> */ scala.Boolean = js.native
  def isSwitchCase(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SwitchCase> */ scala.Boolean = js.native
  def isSwitchCase(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SwitchCase> */ scala.Boolean = js.native
  def isSwitchStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SwitchStatement> */ scala.Boolean = js.native
  def isSwitchStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.SwitchStatement> */ scala.Boolean = js.native
  def isTaggedTemplateExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TaggedTemplateExpression> */ scala.Boolean = js.native
  def isTaggedTemplateExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TaggedTemplateExpression> */ scala.Boolean = js.native
  def isTemplateElement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TemplateElement> */ scala.Boolean = js.native
  def isTemplateElement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TemplateElement> */ scala.Boolean = js.native
  def isTemplateLiteral(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TemplateLiteral> */ scala.Boolean = js.native
  def isTemplateLiteral(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TemplateLiteral> */ scala.Boolean = js.native
  def isTerminatorless(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Terminatorless> */ scala.Boolean = js.native
  def isTerminatorless(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.Terminatorless> */ scala.Boolean = js.native
  def isThisExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThisExpression> */ scala.Boolean = js.native
  def isThisExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThisExpression> */ scala.Boolean = js.native
  def isThisTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThisTypeAnnotation> */ scala.Boolean = js.native
  def isThisTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThisTypeAnnotation> */ scala.Boolean = js.native
  def isThrowStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThrowStatement> */ scala.Boolean = js.native
  def isThrowStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.ThrowStatement> */ scala.Boolean = js.native
  def isTryStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TryStatement> */ scala.Boolean = js.native
  def isTryStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TryStatement> */ scala.Boolean = js.native
  def isTupleTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TupleTypeAnnotation> */ scala.Boolean = js.native
  def isTupleTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TupleTypeAnnotation> */ scala.Boolean = js.native
  def isTypeAlias(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeAlias> */ scala.Boolean = js.native
  def isTypeAlias(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeAlias> */ scala.Boolean = js.native
  def isTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeAnnotation> */ scala.Boolean = js.native
  def isTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeAnnotation> */ scala.Boolean = js.native
  def isTypeCastExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeCastExpression> */ scala.Boolean = js.native
  def isTypeCastExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeCastExpression> */ scala.Boolean = js.native
  def isTypeParameterDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeParameterDeclaration> */ scala.Boolean = js.native
  def isTypeParameterDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeParameterDeclaration> */ scala.Boolean = js.native
  def isTypeParameterInstantiation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeParameterInstantiation> */ scala.Boolean = js.native
  def isTypeParameterInstantiation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeParameterInstantiation> */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeofTypeAnnotation> */ scala.Boolean = js.native
  def isTypeofTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.TypeofTypeAnnotation> */ scala.Boolean = js.native
  def isUnaryExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnaryExpression> */ scala.Boolean = js.native
  def isUnaryExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnaryExpression> */ scala.Boolean = js.native
  def isUnaryLike(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnaryLike> */ scala.Boolean = js.native
  def isUnaryLike(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnaryLike> */ scala.Boolean = js.native
  def isUnionTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnionTypeAnnotation> */ scala.Boolean = js.native
  def isUnionTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UnionTypeAnnotation> */ scala.Boolean = js.native
  def isUpdateExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UpdateExpression> */ scala.Boolean = js.native
  def isUpdateExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UpdateExpression> */ scala.Boolean = js.native
  def isUser(): scala.Boolean = js.native
  def isUser(opts: js.Object): scala.Boolean = js.native
  def isUserWhitespacable(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UserWhitespacable> */ scala.Boolean = js.native
  def isUserWhitespacable(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.UserWhitespacable> */ scala.Boolean = js.native
  def isVar(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclaration> */ scala.Boolean = js.native
  def isVar(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclaration> */ scala.Boolean = js.native
  def isVariableDeclaration(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclaration> */ scala.Boolean = js.native
  def isVariableDeclaration(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclaration> */ scala.Boolean = js.native
  def isVariableDeclarator(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclarator> */ scala.Boolean = js.native
  def isVariableDeclarator(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VariableDeclarator> */ scala.Boolean = js.native
  def isVoidTypeAnnotation(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VoidTypeAnnotation> */ scala.Boolean = js.native
  def isVoidTypeAnnotation(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.VoidTypeAnnotation> */ scala.Boolean = js.native
  def isWhile(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.While> */ scala.Boolean = js.native
  def isWhile(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.While> */ scala.Boolean = js.native
  def isWhileStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.WhileStatement> */ scala.Boolean = js.native
  def isWhileStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.WhileStatement> */ scala.Boolean = js.native
  def isWithStatement(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.WithStatement> */ scala.Boolean = js.native
  def isWithStatement(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.WithStatement> */ scala.Boolean = js.native
  def isYieldExpression(): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.YieldExpression> */ scala.Boolean = js.native
  def isYieldExpression(opts: js.Object): /* is @babel/traverse.@babel/traverse.NodePath<@babel/types.@babel/types.YieldExpression> */ scala.Boolean = js.native
  /** Opposite of `has`. */
  def isnt(key: java.lang.String): scala.Boolean = js.native
  // ------------------------- introspection -------------------------
  /**
    * Match the current node if it matches the provided `pattern`.
    *
    * For example, given the match `React.createClass` it would match the
    * parsed nodes of `React.createClass` and `React["createClass"]`.
    */
  def matchesPattern(pattern: java.lang.String): scala.Boolean = js.native
  def matchesPattern(pattern: java.lang.String, allowPartial: scala.Boolean): scala.Boolean = js.native
  def popContext(): scala.Unit = js.native
  def pushContext(context: TraversalContext): scala.Unit = js.native
  /** Check if the currently assigned path references the `importName` of `moduleSource`. */
  def referencesImport(moduleSource: java.lang.String, importName: java.lang.String): scala.Boolean = js.native
  // ------------------------- removal -------------------------
  def remove(): scala.Unit = js.native
  /**
    * This method takes an array of statements nodes and then explodes it
    * into expressions. This method retains completion records which is
    * extremely important to retain original semantics.
    */
  def replaceExpressionWithStatements(nodes: js.Array[Node]): Node = js.native
  def replaceInline(nodes: Node): scala.Unit = js.native
  def replaceInline(nodes: js.Array[Node]): scala.Unit = js.native
  /** Replace the current node with another. */
  def replaceWith(replacement: Node): scala.Unit = js.native
  def replaceWith(replacement: NodePath[Node]): scala.Unit = js.native
  // ------------------------- replacement -------------------------
  /**
    * Replace a node with an array of multiple. This method performs the following steps:
    *
    *  - Inherit the comments of first provided node with that of the current node.
    *  - Insert the provided nodes after the current node.
    *  - Remove the current node.
    */
  def replaceWithMultiple(nodes: js.Array[Node]): scala.Unit = js.native
  /**
    * Parse a string as an expression and replace the current node with the result.
    *
    * NOTE: This is typically not a good idea to use. Building source strings when
    * transforming ASTs is an antipattern and SHOULD NOT be encouraged. Even if it's
    * easier to use, your transforms will be extremely brittle.
    */
  def replaceWithSourceString(replacement: js.Any): scala.Unit = js.native
  def set(key: java.lang.String, node: Node): scala.Unit = js.native
  def setContext(context: TraversalContext): NodePath[T] = js.native
  def setData(key: java.lang.String, `val`: js.Any): js.Any = js.native
  def setScope(): scala.Unit = js.native
  // ------------------------- comments -------------------------
  /** Share comments amongst siblings. */
  def shareCommentsWithSiblings(): scala.Unit = js.native
  def skip(): scala.Unit = js.native
  def skipKey(key: java.lang.String): scala.Unit = js.native
  def stop(): scala.Unit = js.native
  def traverse(visitor: Visitor[js.Object]): scala.Unit = js.native
  def traverse[T](visitor: Visitor[T], state: T): scala.Unit = js.native
  /** Update all sibling node paths after `fromIndex` by `incrementBy`. */
  def updateSiblingKeys(fromIndex: scala.Double, incrementBy: scala.Double): scala.Unit = js.native
  def visit(): scala.Boolean = js.native
  /** Check if the current path will maybe execute before another path */
  def willIMaybeExecuteBefore(path: NodePath[Node]): scala.Boolean = js.native
}

