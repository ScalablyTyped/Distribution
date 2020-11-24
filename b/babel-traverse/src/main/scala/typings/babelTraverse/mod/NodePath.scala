package typings.babelTraverse.mod

import org.scalablytyped.runtime.Instantiable1
import typings.babelTraverse.anon.Confident
import typings.babelTypes.ts36Mod.FlowTypeAnnotation
import typings.babelTypes.ts36Mod.Function
import typings.babelTypes.ts36Mod.Statement
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babel-traverse", "NodePath")
@js.native
class NodePath[T] protected () extends js.Object {
  def this(hub: Hub, parent: Node) = this()
  
  def addComment(`type`: String, content: String): Unit = js.native
  def addComment(`type`: String, content: String, line: Boolean): Unit = js.native
  
  /** Give node `comments` of the specified `type`. */
  def addComments(`type`: String, comments: js.Array[_]): Unit = js.native
  
  def assertAnyTypeAnnotation(): Unit = js.native
  def assertAnyTypeAnnotation(opts: js.Object): Unit = js.native
  
  // ------------------------- assertXXX -------------------------
  def assertArrayExpression(): Unit = js.native
  def assertArrayExpression(opts: js.Object): Unit = js.native
  
  def assertArrayPattern(): Unit = js.native
  def assertArrayPattern(opts: js.Object): Unit = js.native
  
  def assertArrayTypeAnnotation(): Unit = js.native
  def assertArrayTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertArrowFunctionExpression(): Unit = js.native
  def assertArrowFunctionExpression(opts: js.Object): Unit = js.native
  
  def assertAssignmentExpression(): Unit = js.native
  def assertAssignmentExpression(opts: js.Object): Unit = js.native
  
  def assertAssignmentPattern(): Unit = js.native
  def assertAssignmentPattern(opts: js.Object): Unit = js.native
  
  def assertAwaitExpression(): Unit = js.native
  def assertAwaitExpression(opts: js.Object): Unit = js.native
  
  def assertBinary(): Unit = js.native
  def assertBinary(opts: js.Object): Unit = js.native
  
  def assertBinaryExpression(): Unit = js.native
  def assertBinaryExpression(opts: js.Object): Unit = js.native
  
  def assertBindExpression(): Unit = js.native
  def assertBindExpression(opts: js.Object): Unit = js.native
  
  def assertBlock(): Unit = js.native
  def assertBlock(opts: js.Object): Unit = js.native
  
  def assertBlockParent(): Unit = js.native
  def assertBlockParent(opts: js.Object): Unit = js.native
  
  def assertBlockStatement(): Unit = js.native
  def assertBlockStatement(opts: js.Object): Unit = js.native
  
  def assertBooleanLiteral(): Unit = js.native
  def assertBooleanLiteral(opts: js.Object): Unit = js.native
  
  def assertBooleanLiteralTypeAnnotation(): Unit = js.native
  def assertBooleanLiteralTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertBooleanTypeAnnotation(): Unit = js.native
  def assertBooleanTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertBreakStatement(): Unit = js.native
  def assertBreakStatement(opts: js.Object): Unit = js.native
  
  def assertCallExpression(): Unit = js.native
  def assertCallExpression(opts: js.Object): Unit = js.native
  
  def assertCatchClause(): Unit = js.native
  def assertCatchClause(opts: js.Object): Unit = js.native
  
  def assertClass(): Unit = js.native
  def assertClass(opts: js.Object): Unit = js.native
  
  def assertClassBody(): Unit = js.native
  def assertClassBody(opts: js.Object): Unit = js.native
  
  def assertClassDeclaration(): Unit = js.native
  def assertClassDeclaration(opts: js.Object): Unit = js.native
  
  def assertClassExpression(): Unit = js.native
  def assertClassExpression(opts: js.Object): Unit = js.native
  
  def assertClassImplements(): Unit = js.native
  def assertClassImplements(opts: js.Object): Unit = js.native
  
  def assertClassMethod(): Unit = js.native
  def assertClassMethod(opts: js.Object): Unit = js.native
  
  def assertClassProperty(): Unit = js.native
  def assertClassProperty(opts: js.Object): Unit = js.native
  
  def assertCompletionStatement(): Unit = js.native
  def assertCompletionStatement(opts: js.Object): Unit = js.native
  
  def assertConditional(): Unit = js.native
  def assertConditional(opts: js.Object): Unit = js.native
  
  def assertConditionalExpression(): Unit = js.native
  def assertConditionalExpression(opts: js.Object): Unit = js.native
  
  def assertContinueStatement(): Unit = js.native
  def assertContinueStatement(opts: js.Object): Unit = js.native
  
  def assertDebuggerStatement(): Unit = js.native
  def assertDebuggerStatement(opts: js.Object): Unit = js.native
  
  def assertDeclaration(): Unit = js.native
  def assertDeclaration(opts: js.Object): Unit = js.native
  
  def assertDeclareClass(): Unit = js.native
  def assertDeclareClass(opts: js.Object): Unit = js.native
  
  def assertDeclareFunction(): Unit = js.native
  def assertDeclareFunction(opts: js.Object): Unit = js.native
  
  def assertDeclareInterface(): Unit = js.native
  def assertDeclareInterface(opts: js.Object): Unit = js.native
  
  def assertDeclareModule(): Unit = js.native
  def assertDeclareModule(opts: js.Object): Unit = js.native
  
  def assertDeclareTypeAlias(): Unit = js.native
  def assertDeclareTypeAlias(opts: js.Object): Unit = js.native
  
  def assertDeclareVariable(): Unit = js.native
  def assertDeclareVariable(opts: js.Object): Unit = js.native
  
  def assertDecorator(): Unit = js.native
  def assertDecorator(opts: js.Object): Unit = js.native
  
  def assertDirective(): Unit = js.native
  def assertDirective(opts: js.Object): Unit = js.native
  
  def assertDirectiveLiteral(): Unit = js.native
  def assertDirectiveLiteral(opts: js.Object): Unit = js.native
  
  def assertDoExpression(): Unit = js.native
  def assertDoExpression(opts: js.Object): Unit = js.native
  
  def assertDoWhileStatement(): Unit = js.native
  def assertDoWhileStatement(opts: js.Object): Unit = js.native
  
  def assertEmptyStatement(): Unit = js.native
  def assertEmptyStatement(opts: js.Object): Unit = js.native
  
  def assertExistentialTypeParam(): Unit = js.native
  def assertExistentialTypeParam(opts: js.Object): Unit = js.native
  
  def assertExportAllDeclaration(): Unit = js.native
  def assertExportAllDeclaration(opts: js.Object): Unit = js.native
  
  def assertExportDeclaration(): Unit = js.native
  def assertExportDeclaration(opts: js.Object): Unit = js.native
  
  def assertExportDefaultDeclaration(): Unit = js.native
  def assertExportDefaultDeclaration(opts: js.Object): Unit = js.native
  
  def assertExportDefaultSpecifier(): Unit = js.native
  def assertExportDefaultSpecifier(opts: js.Object): Unit = js.native
  
  def assertExportNamedDeclaration(): Unit = js.native
  def assertExportNamedDeclaration(opts: js.Object): Unit = js.native
  
  def assertExportNamespaceSpecifier(): Unit = js.native
  def assertExportNamespaceSpecifier(opts: js.Object): Unit = js.native
  
  def assertExportSpecifier(): Unit = js.native
  def assertExportSpecifier(opts: js.Object): Unit = js.native
  
  def assertExpression(): Unit = js.native
  def assertExpression(opts: js.Object): Unit = js.native
  
  def assertExpressionStatement(): Unit = js.native
  def assertExpressionStatement(opts: js.Object): Unit = js.native
  
  def assertExpressionWrapper(): Unit = js.native
  def assertExpressionWrapper(opts: js.Object): Unit = js.native
  
  def assertFile(): Unit = js.native
  def assertFile(opts: js.Object): Unit = js.native
  
  def assertFlow(): Unit = js.native
  def assertFlow(opts: js.Object): Unit = js.native
  
  def assertFlowBaseAnnotation(): Unit = js.native
  def assertFlowBaseAnnotation(opts: js.Object): Unit = js.native
  
  def assertFlowDeclaration(): Unit = js.native
  def assertFlowDeclaration(opts: js.Object): Unit = js.native
  
  def assertFor(): Unit = js.native
  def assertFor(opts: js.Object): Unit = js.native
  
  def assertForInStatement(): Unit = js.native
  def assertForInStatement(opts: js.Object): Unit = js.native
  
  def assertForOfStatement(): Unit = js.native
  def assertForOfStatement(opts: js.Object): Unit = js.native
  
  def assertForStatement(): Unit = js.native
  def assertForStatement(opts: js.Object): Unit = js.native
  
  def assertForXStatement(): Unit = js.native
  def assertForXStatement(opts: js.Object): Unit = js.native
  
  def assertFunction(): Unit = js.native
  def assertFunction(opts: js.Object): Unit = js.native
  
  def assertFunctionDeclaration(): Unit = js.native
  def assertFunctionDeclaration(opts: js.Object): Unit = js.native
  
  def assertFunctionExpression(): Unit = js.native
  def assertFunctionExpression(opts: js.Object): Unit = js.native
  
  def assertFunctionParent(): Unit = js.native
  def assertFunctionParent(opts: js.Object): Unit = js.native
  
  def assertFunctionTypeAnnotation(): Unit = js.native
  def assertFunctionTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertFunctionTypeParam(): Unit = js.native
  def assertFunctionTypeParam(opts: js.Object): Unit = js.native
  
  def assertGenericTypeAnnotation(): Unit = js.native
  def assertGenericTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertIdentifier(): Unit = js.native
  def assertIdentifier(opts: js.Object): Unit = js.native
  
  def assertIfStatement(): Unit = js.native
  def assertIfStatement(opts: js.Object): Unit = js.native
  
  def assertImmutable(): Unit = js.native
  def assertImmutable(opts: js.Object): Unit = js.native
  
  def assertImportDeclaration(): Unit = js.native
  def assertImportDeclaration(opts: js.Object): Unit = js.native
  
  def assertImportDefaultSpecifier(): Unit = js.native
  def assertImportDefaultSpecifier(opts: js.Object): Unit = js.native
  
  def assertImportNamespaceSpecifier(): Unit = js.native
  def assertImportNamespaceSpecifier(opts: js.Object): Unit = js.native
  
  def assertImportSpecifier(): Unit = js.native
  def assertImportSpecifier(opts: js.Object): Unit = js.native
  
  def assertInterfaceDeclaration(): Unit = js.native
  def assertInterfaceDeclaration(opts: js.Object): Unit = js.native
  
  def assertInterfaceExtends(): Unit = js.native
  def assertInterfaceExtends(opts: js.Object): Unit = js.native
  
  def assertIntersectionTypeAnnotation(): Unit = js.native
  def assertIntersectionTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertJSX(): Unit = js.native
  def assertJSX(opts: js.Object): Unit = js.native
  
  def assertJSXAttribute(): Unit = js.native
  def assertJSXAttribute(opts: js.Object): Unit = js.native
  
  def assertJSXClosingElement(): Unit = js.native
  def assertJSXClosingElement(opts: js.Object): Unit = js.native
  
  def assertJSXElement(): Unit = js.native
  def assertJSXElement(opts: js.Object): Unit = js.native
  
  def assertJSXEmptyExpression(): Unit = js.native
  def assertJSXEmptyExpression(opts: js.Object): Unit = js.native
  
  def assertJSXExpressionContainer(): Unit = js.native
  def assertJSXExpressionContainer(opts: js.Object): Unit = js.native
  
  def assertJSXIdentifier(): Unit = js.native
  def assertJSXIdentifier(opts: js.Object): Unit = js.native
  
  def assertJSXMemberExpression(): Unit = js.native
  def assertJSXMemberExpression(opts: js.Object): Unit = js.native
  
  def assertJSXNamespacedName(): Unit = js.native
  def assertJSXNamespacedName(opts: js.Object): Unit = js.native
  
  def assertJSXOpeningElement(): Unit = js.native
  def assertJSXOpeningElement(opts: js.Object): Unit = js.native
  
  def assertJSXSpreadAttribute(): Unit = js.native
  def assertJSXSpreadAttribute(opts: js.Object): Unit = js.native
  
  def assertJSXText(): Unit = js.native
  def assertJSXText(opts: js.Object): Unit = js.native
  
  def assertLVal(): Unit = js.native
  def assertLVal(opts: js.Object): Unit = js.native
  
  def assertLabeledStatement(): Unit = js.native
  def assertLabeledStatement(opts: js.Object): Unit = js.native
  
  def assertLiteral(): Unit = js.native
  def assertLiteral(opts: js.Object): Unit = js.native
  
  def assertLogicalExpression(): Unit = js.native
  def assertLogicalExpression(opts: js.Object): Unit = js.native
  
  def assertLoop(): Unit = js.native
  def assertLoop(opts: js.Object): Unit = js.native
  
  def assertMemberExpression(): Unit = js.native
  def assertMemberExpression(opts: js.Object): Unit = js.native
  
  def assertMetaProperty(): Unit = js.native
  def assertMetaProperty(opts: js.Object): Unit = js.native
  
  def assertMethod(): Unit = js.native
  def assertMethod(opts: js.Object): Unit = js.native
  
  def assertMixedTypeAnnotation(): Unit = js.native
  def assertMixedTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertModuleDeclaration(): Unit = js.native
  def assertModuleDeclaration(opts: js.Object): Unit = js.native
  
  def assertModuleSpecifier(): Unit = js.native
  def assertModuleSpecifier(opts: js.Object): Unit = js.native
  
  def assertNewExpression(): Unit = js.native
  def assertNewExpression(opts: js.Object): Unit = js.native
  
  def assertNoop(): Unit = js.native
  def assertNoop(opts: js.Object): Unit = js.native
  
  def assertNullLiteral(): Unit = js.native
  def assertNullLiteral(opts: js.Object): Unit = js.native
  
  def assertNullLiteralTypeAnnotation(): Unit = js.native
  def assertNullLiteralTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertNullableTypeAnnotation(): Unit = js.native
  def assertNullableTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertNumberLiteral(): Unit = js.native
  def assertNumberLiteral(opts: js.Object): Unit = js.native
  
  def assertNumberTypeAnnotation(): Unit = js.native
  def assertNumberTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertNumericLiteral(): Unit = js.native
  def assertNumericLiteral(opts: js.Object): Unit = js.native
  
  def assertNumericLiteralTypeAnnotation(): Unit = js.native
  def assertNumericLiteralTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertObjectExpression(): Unit = js.native
  def assertObjectExpression(opts: js.Object): Unit = js.native
  
  def assertObjectMember(): Unit = js.native
  def assertObjectMember(opts: js.Object): Unit = js.native
  
  def assertObjectMethod(): Unit = js.native
  def assertObjectMethod(opts: js.Object): Unit = js.native
  
  def assertObjectPattern(): Unit = js.native
  def assertObjectPattern(opts: js.Object): Unit = js.native
  
  def assertObjectProperty(): Unit = js.native
  def assertObjectProperty(opts: js.Object): Unit = js.native
  
  def assertObjectTypeAnnotation(): Unit = js.native
  def assertObjectTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertObjectTypeCallProperty(): Unit = js.native
  def assertObjectTypeCallProperty(opts: js.Object): Unit = js.native
  
  def assertObjectTypeIndexer(): Unit = js.native
  def assertObjectTypeIndexer(opts: js.Object): Unit = js.native
  
  def assertObjectTypeProperty(): Unit = js.native
  def assertObjectTypeProperty(opts: js.Object): Unit = js.native
  
  def assertParenthesizedExpression(): Unit = js.native
  def assertParenthesizedExpression(opts: js.Object): Unit = js.native
  
  def assertPattern(): Unit = js.native
  def assertPattern(opts: js.Object): Unit = js.native
  
  def assertProgram(): Unit = js.native
  def assertProgram(opts: js.Object): Unit = js.native
  
  def assertProperty(): Unit = js.native
  def assertProperty(opts: js.Object): Unit = js.native
  
  def assertPureish(): Unit = js.native
  def assertPureish(opts: js.Object): Unit = js.native
  
  def assertQualifiedTypeIdentifier(): Unit = js.native
  def assertQualifiedTypeIdentifier(opts: js.Object): Unit = js.native
  
  def assertRegExpLiteral(): Unit = js.native
  def assertRegExpLiteral(opts: js.Object): Unit = js.native
  
  def assertRegexLiteral(): Unit = js.native
  def assertRegexLiteral(opts: js.Object): Unit = js.native
  
  def assertRestElement(): Unit = js.native
  def assertRestElement(opts: js.Object): Unit = js.native
  
  def assertRestProperty(): Unit = js.native
  def assertRestProperty(opts: js.Object): Unit = js.native
  
  def assertReturnStatement(): Unit = js.native
  def assertReturnStatement(opts: js.Object): Unit = js.native
  
  def assertScopable(): Unit = js.native
  def assertScopable(opts: js.Object): Unit = js.native
  
  def assertSequenceExpression(): Unit = js.native
  def assertSequenceExpression(opts: js.Object): Unit = js.native
  
  def assertSpreadElement(): Unit = js.native
  def assertSpreadElement(opts: js.Object): Unit = js.native
  
  def assertSpreadProperty(): Unit = js.native
  def assertSpreadProperty(opts: js.Object): Unit = js.native
  
  def assertStatement(): Unit = js.native
  def assertStatement(opts: js.Object): Unit = js.native
  
  def assertStringLiteral(): Unit = js.native
  def assertStringLiteral(opts: js.Object): Unit = js.native
  
  def assertStringLiteralTypeAnnotation(): Unit = js.native
  def assertStringLiteralTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertStringTypeAnnotation(): Unit = js.native
  def assertStringTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertSuper(): Unit = js.native
  def assertSuper(opts: js.Object): Unit = js.native
  
  def assertSwitchCase(): Unit = js.native
  def assertSwitchCase(opts: js.Object): Unit = js.native
  
  def assertSwitchStatement(): Unit = js.native
  def assertSwitchStatement(opts: js.Object): Unit = js.native
  
  def assertTaggedTemplateExpression(): Unit = js.native
  def assertTaggedTemplateExpression(opts: js.Object): Unit = js.native
  
  def assertTemplateElement(): Unit = js.native
  def assertTemplateElement(opts: js.Object): Unit = js.native
  
  def assertTemplateLiteral(): Unit = js.native
  def assertTemplateLiteral(opts: js.Object): Unit = js.native
  
  def assertTerminatorless(): Unit = js.native
  def assertTerminatorless(opts: js.Object): Unit = js.native
  
  def assertThisExpression(): Unit = js.native
  def assertThisExpression(opts: js.Object): Unit = js.native
  
  def assertThisTypeAnnotation(): Unit = js.native
  def assertThisTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertThrowStatement(): Unit = js.native
  def assertThrowStatement(opts: js.Object): Unit = js.native
  
  def assertTryStatement(): Unit = js.native
  def assertTryStatement(opts: js.Object): Unit = js.native
  
  def assertTupleTypeAnnotation(): Unit = js.native
  def assertTupleTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertTypeAlias(): Unit = js.native
  def assertTypeAlias(opts: js.Object): Unit = js.native
  
  def assertTypeAnnotation(): Unit = js.native
  def assertTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertTypeCastExpression(): Unit = js.native
  def assertTypeCastExpression(opts: js.Object): Unit = js.native
  
  def assertTypeParameterDeclaration(): Unit = js.native
  def assertTypeParameterDeclaration(opts: js.Object): Unit = js.native
  
  def assertTypeParameterInstantiation(): Unit = js.native
  def assertTypeParameterInstantiation(opts: js.Object): Unit = js.native
  
  def assertTypeofTypeAnnotation(): Unit = js.native
  def assertTypeofTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertUnaryExpression(): Unit = js.native
  def assertUnaryExpression(opts: js.Object): Unit = js.native
  
  def assertUnaryLike(): Unit = js.native
  def assertUnaryLike(opts: js.Object): Unit = js.native
  
  def assertUnionTypeAnnotation(): Unit = js.native
  def assertUnionTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertUpdateExpression(): Unit = js.native
  def assertUpdateExpression(opts: js.Object): Unit = js.native
  
  def assertUserWhitespacable(): Unit = js.native
  def assertUserWhitespacable(opts: js.Object): Unit = js.native
  
  def assertVariableDeclaration(): Unit = js.native
  def assertVariableDeclaration(opts: js.Object): Unit = js.native
  
  def assertVariableDeclarator(): Unit = js.native
  def assertVariableDeclarator(opts: js.Object): Unit = js.native
  
  def assertVoidTypeAnnotation(): Unit = js.native
  def assertVoidTypeAnnotation(opts: js.Object): Unit = js.native
  
  def assertWhile(): Unit = js.native
  def assertWhile(opts: js.Object): Unit = js.native
  
  def assertWhileStatement(): Unit = js.native
  def assertWhileStatement(opts: js.Object): Unit = js.native
  
  def assertWithStatement(): Unit = js.native
  def assertWithStatement(opts: js.Object): Unit = js.native
  
  def assertYieldExpression(): Unit = js.native
  def assertYieldExpression(opts: js.Object): Unit = js.native
  
  def baseTypeStrictlyMatches(right: NodePath[Node]): Boolean = js.native
  
  def buildCodeFrameError[TError /* <: Error */](msg: String): TError = js.native
  def buildCodeFrameError[TError /* <: Error */](msg: String, Error: Instantiable1[/* msg */ String, TError]): TError = js.native
  
  // ------------------------- context -------------------------
  def call(key: String): Boolean = js.native
  
  /**
    * This checks whether or not we're in one of the following positions:
    *
    *   for (KEY in right);
    *   for (KEY;;);
    *
    * This is because these spots allow VariableDeclarations AND normal expressions so we need
    * to tell the path replacement that it's ok to replace this with an expression.
    */
  def canHaveVariableDeclarationOrExpression(): Boolean = js.native
  
  /**
    * This checks whether we are swapping an arrow function's body between an
    * expression and a block statement (or vice versa).
    *
    * This is because arrow functions may implicitly return an expression, which
    * is the same as containing a block statement.
    */
  def canSwapBetweenExpressionAndStatement(replacement: Node): Boolean = js.native
  
  var container: js.Object | js.Array[js.Object] = js.native
  
  var context: TraversalContext = js.native
  
  var contexts: js.Array[TraversalContext] = js.native
  
  def couldBeBaseType(name: String): Boolean = js.native
  
  var data: js.Object = js.native
  
  // Example: https://github.com/babel/babel/blob/63204ae51e020d84a5b246312f5eeb4d981ab952/packages/babel-traverse/src/path/modification.js#L83
  def debug(buildMessage: js.Function0[String]): Unit = js.native
  
  /** Check whether the path node `key` strict equals `value`. */
  def equals(key: String, value: js.Any): Boolean = js.native
  
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
  def evaluate(): Confident = js.native
  
  // ------------------------- evaluation -------------------------
  /**
    * Walk the input `node` and statically evaluate if it's truthy.
    *
    * Returning `true` when we're sure that the expression will evaluate to a
    * truthy value, `false` if we're sure that it will evaluate to a falsy
    * value and `undefined` if we aren't sure. Because of this please do not
    * rely on coercion when using this method and check with === if it's false.
    */
  def evaluateTruthy(): Boolean = js.native
  
  def find(callback: js.Function1[/* path */ NodePath[Node], Boolean]): NodePath[Node] = js.native
  
  // ------------------------- ancestry -------------------------
  /**
    * Call the provided `callback` with the `NodePath`s of all the parents.
    * When the `callback` returns a truthy value, we return that node path.
    */
  def findParent(callback: js.Function1[/* path */ NodePath[Node], Boolean]): NodePath[Node] = js.native
  
  def get(key: String): NodePath[Node] | js.Array[NodePath[Node]] = js.native
  def get(key: String, context: Boolean): NodePath[Node] | js.Array[NodePath[Node]] = js.native
  def get(key: String, context: TraversalContext): NodePath[Node] | js.Array[NodePath[Node]] = js.native
  def get[K /* <: /* keyof T */ String */](key: K): (NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]) | (js.Array[
    NodePath[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K][number] */ js.Any
    ]
  ]) = js.native
  def get[K /* <: /* keyof T */ String */](key: K, context: Boolean): (NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]) | (js.Array[
    NodePath[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K][number] */ js.Any
    ]
  ]) = js.native
  def get[K /* <: /* keyof T */ String */](key: K, context: TraversalContext): (NodePath[
    /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
  ]) | (js.Array[
    NodePath[
      /* import warning: importer.ImportType#apply Failed type conversion: T[K][number] */ js.Any
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
  def getBindingIdentifiers(duplicates: Boolean): js.Array[Node] = js.native
  
  def getCompletionRecords(): js.Array[NodePath[Node]] = js.native
  
  def getData(key: String): js.Any = js.native
  def getData(key: String, `def`: js.Any): js.Any = js.native
  
  /** Get the earliest path in the tree where the provided `paths` intersect. */
  def getDeepestCommonAncestorFrom(paths: js.Array[NodePath[Node]]): NodePath[Node] = js.native
  def getDeepestCommonAncestorFrom(
    paths: js.Array[NodePath[Node]],
    filter: js.Function3[
      /* deepest */ Node, 
      /* i */ Double, 
      /* ancestries */ js.Array[NodePath[Node]], 
      NodePath[Node]
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
  def getFunctionParent(): NodePath[Function] = js.native
  
  // ------------------------- family -------------------------
  def getOpposite(): NodePath[Node] = js.native
  
  def getOuterBindingIdentifiers(): js.Array[Node] = js.native
  def getOuterBindingIdentifiers(duplicates: Boolean): js.Array[Node] = js.native
  
  def getPathLocation(): String = js.native
  
  def getScope(scope: Scope): Scope = js.native
  
  def getSibling(key: String): NodePath[Node] = js.native
  def getSibling(key: Double): NodePath[Node] = js.native
  
  /** Get the source code associated with this node. */
  def getSource(): String = js.native
  
  /** Walk up the tree until we hit a parent node path in a list. */
  def getStatementParent(): NodePath[Statement] = js.native
  
  // ------------------------- inference -------------------------
  /** Infer the type of the current `NodePath`. */
  def getTypeAnnotation(): FlowTypeAnnotation = js.native
  
  /**
    * Check whether we have the input `key`. If the `key` references an array then we check
    * if the array has any items, otherwise we just check if it's falsy.
    */
  def has(key: String): Boolean = js.native
  
  /** Hoist the current node to the highest scope possible and return a UID referencing it. */
  def hoist(scope: Scope): Unit = js.native
  
  var hub: Hub = js.native
  
  var inList: Boolean = js.native
  
  def inType(candidateTypes: String*): Boolean = js.native
  
  def insertAfter(nodes: js.Array[Node]): js.Any = js.native
  /**
    * Insert the provided nodes after the current one. When inserting nodes after an
    * expression, ensure that the completion record is correct by pushing the current node.
    */
  def insertAfter(nodes: Node): js.Any = js.native
  
  def insertBefore(nodes: js.Array[Node]): js.Any = js.native
  // ------------------------- modification -------------------------
  /** Insert the provided nodes before the current one. */
  def insertBefore(nodes: Node): js.Any = js.native
  
  /** Alias of `has`. */
  def is(key: String): Boolean = js.native
  
  def isAnyTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.AnyTypeAnnotation> */ Boolean = js.native
  def isAnyTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.AnyTypeAnnotation> */ Boolean = js.native
  
  // ------------------------- isXXX -------------------------
  def isArrayExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ArrayExpression> */ Boolean = js.native
  def isArrayExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ArrayExpression> */ Boolean = js.native
  
  def isArrayPattern(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ArrayPattern> */ Boolean = js.native
  def isArrayPattern(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ArrayPattern> */ Boolean = js.native
  
  def isArrayTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ArrayTypeAnnotation> */ Boolean = js.native
  def isArrayTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ArrayTypeAnnotation> */ Boolean = js.native
  
  def isArrowFunctionExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ArrowFunctionExpression> */ Boolean = js.native
  def isArrowFunctionExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ArrowFunctionExpression> */ Boolean = js.native
  
  def isAssignmentExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.AssignmentExpression> */ Boolean = js.native
  def isAssignmentExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.AssignmentExpression> */ Boolean = js.native
  
  def isAssignmentPattern(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.AssignmentPattern> */ Boolean = js.native
  def isAssignmentPattern(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.AssignmentPattern> */ Boolean = js.native
  
  def isAwaitExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.AwaitExpression> */ Boolean = js.native
  def isAwaitExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.AwaitExpression> */ Boolean = js.native
  
  def isBaseType(baseName: String): Boolean = js.native
  def isBaseType(baseName: String, soft: Boolean): Boolean = js.native
  
  def isBinary(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Binary> */ Boolean = js.native
  def isBinary(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Binary> */ Boolean = js.native
  
  def isBinaryExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BinaryExpression> */ Boolean = js.native
  def isBinaryExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BinaryExpression> */ Boolean = js.native
  
  def isBindExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BindExpression> */ Boolean = js.native
  def isBindExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BindExpression> */ Boolean = js.native
  
  def isBindingIdentifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Identifier> */ Boolean = js.native
  def isBindingIdentifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Identifier> */ Boolean = js.native
  
  def isBlacklisted(): Boolean = js.native
  
  def isBlock(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Block> */ Boolean = js.native
  def isBlock(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Block> */ Boolean = js.native
  
  def isBlockParent(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BlockParent> */ Boolean = js.native
  def isBlockParent(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BlockParent> */ Boolean = js.native
  
  def isBlockScoped(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionDeclaration | babel-types.babel-types/ts3.6.ClassDeclaration | babel-types.babel-types/ts3.6.VariableDeclaration> */ Boolean = js.native
  def isBlockScoped(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionDeclaration | babel-types.babel-types/ts3.6.ClassDeclaration | babel-types.babel-types/ts3.6.VariableDeclaration> */ Boolean = js.native
  
  def isBlockStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BlockStatement> */ Boolean = js.native
  def isBlockStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BlockStatement> */ Boolean = js.native
  
  def isBooleanLiteral(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BooleanLiteral> */ Boolean = js.native
  def isBooleanLiteral(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BooleanLiteral> */ Boolean = js.native
  
  def isBooleanLiteralTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BooleanLiteralTypeAnnotation> */ Boolean = js.native
  def isBooleanLiteralTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BooleanLiteralTypeAnnotation> */ Boolean = js.native
  
  def isBooleanTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BooleanTypeAnnotation> */ Boolean = js.native
  def isBooleanTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BooleanTypeAnnotation> */ Boolean = js.native
  
  def isBreakStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BreakStatement> */ Boolean = js.native
  def isBreakStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.BreakStatement> */ Boolean = js.native
  
  def isCallExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.CallExpression> */ Boolean = js.native
  def isCallExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.CallExpression> */ Boolean = js.native
  
  def isCatchClause(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.CatchClause> */ Boolean = js.native
  def isCatchClause(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.CatchClause> */ Boolean = js.native
  
  def isClass(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Class> */ Boolean = js.native
  def isClass(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Class> */ Boolean = js.native
  
  def isClassBody(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassBody> */ Boolean = js.native
  def isClassBody(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassBody> */ Boolean = js.native
  
  def isClassDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassDeclaration> */ Boolean = js.native
  def isClassDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassDeclaration> */ Boolean = js.native
  
  def isClassExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassExpression> */ Boolean = js.native
  def isClassExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassExpression> */ Boolean = js.native
  
  def isClassImplements(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassImplements> */ Boolean = js.native
  def isClassImplements(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassImplements> */ Boolean = js.native
  
  def isClassMethod(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassMethod> */ Boolean = js.native
  def isClassMethod(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassMethod> */ Boolean = js.native
  
  def isClassProperty(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassProperty> */ Boolean = js.native
  def isClassProperty(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ClassProperty> */ Boolean = js.native
  
  /** Check whether the current path references a completion record */
  def isCompletionRecord(): Boolean = js.native
  def isCompletionRecord(allowInsideFunction: Boolean): Boolean = js.native
  
  def isCompletionStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.CompletionStatement> */ Boolean = js.native
  def isCompletionStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.CompletionStatement> */ Boolean = js.native
  
  def isConditional(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Conditional> */ Boolean = js.native
  def isConditional(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Conditional> */ Boolean = js.native
  
  def isConditionalExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ConditionalExpression> */ Boolean = js.native
  def isConditionalExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ConditionalExpression> */ Boolean = js.native
  
  def isContinueStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ContinueStatement> */ Boolean = js.native
  def isContinueStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ContinueStatement> */ Boolean = js.native
  
  def isDebuggerStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DebuggerStatement> */ Boolean = js.native
  def isDebuggerStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DebuggerStatement> */ Boolean = js.native
  
  def isDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Declaration> */ Boolean = js.native
  def isDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Declaration> */ Boolean = js.native
  
  def isDeclareClass(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareClass> */ Boolean = js.native
  def isDeclareClass(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareClass> */ Boolean = js.native
  
  def isDeclareFunction(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareFunction> */ Boolean = js.native
  def isDeclareFunction(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareFunction> */ Boolean = js.native
  
  def isDeclareInterface(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareInterface> */ Boolean = js.native
  def isDeclareInterface(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareInterface> */ Boolean = js.native
  
  def isDeclareModule(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareModule> */ Boolean = js.native
  def isDeclareModule(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareModule> */ Boolean = js.native
  
  def isDeclareTypeAlias(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareTypeAlias> */ Boolean = js.native
  def isDeclareTypeAlias(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareTypeAlias> */ Boolean = js.native
  
  def isDeclareVariable(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareVariable> */ Boolean = js.native
  def isDeclareVariable(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DeclareVariable> */ Boolean = js.native
  
  def isDecorator(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Decorator> */ Boolean = js.native
  def isDecorator(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Decorator> */ Boolean = js.native
  
  def isDirective(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Directive> */ Boolean = js.native
  def isDirective(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Directive> */ Boolean = js.native
  
  def isDirectiveLiteral(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DirectiveLiteral> */ Boolean = js.native
  def isDirectiveLiteral(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DirectiveLiteral> */ Boolean = js.native
  
  def isDoExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DoExpression> */ Boolean = js.native
  def isDoExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DoExpression> */ Boolean = js.native
  
  def isDoWhileStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DoWhileStatement> */ Boolean = js.native
  def isDoWhileStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.DoWhileStatement> */ Boolean = js.native
  
  def isEmptyStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.EmptyStatement> */ Boolean = js.native
  def isEmptyStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.EmptyStatement> */ Boolean = js.native
  
  def isExistentialTypeParam(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExistentialTypeParam> */ Boolean = js.native
  def isExistentialTypeParam(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExistentialTypeParam> */ Boolean = js.native
  
  def isExportAllDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportAllDeclaration> */ Boolean = js.native
  def isExportAllDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportAllDeclaration> */ Boolean = js.native
  
  def isExportDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportDeclaration> */ Boolean = js.native
  def isExportDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportDeclaration> */ Boolean = js.native
  
  def isExportDefaultDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportDefaultDeclaration> */ Boolean = js.native
  def isExportDefaultDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportDefaultDeclaration> */ Boolean = js.native
  
  def isExportDefaultSpecifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportDefaultSpecifier> */ Boolean = js.native
  def isExportDefaultSpecifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportDefaultSpecifier> */ Boolean = js.native
  
  def isExportNamedDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportNamedDeclaration> */ Boolean = js.native
  def isExportNamedDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportNamedDeclaration> */ Boolean = js.native
  
  def isExportNamespaceSpecifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportNamespaceSpecifier> */ Boolean = js.native
  def isExportNamespaceSpecifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportNamespaceSpecifier> */ Boolean = js.native
  
  def isExportSpecifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportSpecifier> */ Boolean = js.native
  def isExportSpecifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExportSpecifier> */ Boolean = js.native
  
  def isExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Expression> */ Boolean = js.native
  def isExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Expression> */ Boolean = js.native
  
  def isExpressionStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExpressionStatement> */ Boolean = js.native
  def isExpressionStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExpressionStatement> */ Boolean = js.native
  
  def isExpressionWrapper(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExpressionWrapper> */ Boolean = js.native
  def isExpressionWrapper(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ExpressionWrapper> */ Boolean = js.native
  
  def isFile(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.File> */ Boolean = js.native
  def isFile(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.File> */ Boolean = js.native
  
  def isFlow(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Flow> */ Boolean = js.native
  def isFlow(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Flow> */ Boolean = js.native
  
  def isFlowBaseAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FlowBaseAnnotation> */ Boolean = js.native
  def isFlowBaseAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FlowBaseAnnotation> */ Boolean = js.native
  
  def isFlowDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FlowDeclaration> */ Boolean = js.native
  def isFlowDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FlowDeclaration> */ Boolean = js.native
  
  def isFor(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.For> */ Boolean = js.native
  def isFor(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.For> */ Boolean = js.native
  
  def isForInStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ForInStatement> */ Boolean = js.native
  def isForInStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ForInStatement> */ Boolean = js.native
  
  def isForOfStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ForOfStatement> */ Boolean = js.native
  def isForOfStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ForOfStatement> */ Boolean = js.native
  
  def isForStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ForStatement> */ Boolean = js.native
  def isForStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ForStatement> */ Boolean = js.native
  
  def isForXStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ForXStatement> */ Boolean = js.native
  def isForXStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ForXStatement> */ Boolean = js.native
  
  def isFunction(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Function> */ Boolean = js.native
  def isFunction(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Function> */ Boolean = js.native
  
  def isFunctionDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionDeclaration> */ Boolean = js.native
  def isFunctionDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionDeclaration> */ Boolean = js.native
  
  def isFunctionExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionExpression> */ Boolean = js.native
  def isFunctionExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionExpression> */ Boolean = js.native
  
  def isFunctionParent(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionParent> */ Boolean = js.native
  def isFunctionParent(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionParent> */ Boolean = js.native
  
  def isFunctionTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionTypeAnnotation> */ Boolean = js.native
  def isFunctionTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionTypeAnnotation> */ Boolean = js.native
  
  def isFunctionTypeParam(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionTypeParam> */ Boolean = js.native
  def isFunctionTypeParam(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.FunctionTypeParam> */ Boolean = js.native
  
  def isGenerated(): Boolean = js.native
  def isGenerated(opts: js.Object): Boolean = js.native
  
  def isGenericType(genericName: String): Boolean = js.native
  
  def isGenericTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.GenericTypeAnnotation> */ Boolean = js.native
  def isGenericTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.GenericTypeAnnotation> */ Boolean = js.native
  
  def isIdentifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Identifier> */ Boolean = js.native
  def isIdentifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Identifier> */ Boolean = js.native
  
  def isIfStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.IfStatement> */ Boolean = js.native
  def isIfStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.IfStatement> */ Boolean = js.native
  
  def isImmutable(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Immutable> */ Boolean = js.native
  def isImmutable(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Immutable> */ Boolean = js.native
  
  def isImportDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ImportDeclaration> */ Boolean = js.native
  def isImportDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ImportDeclaration> */ Boolean = js.native
  
  def isImportDefaultSpecifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ImportDefaultSpecifier> */ Boolean = js.native
  def isImportDefaultSpecifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ImportDefaultSpecifier> */ Boolean = js.native
  
  def isImportNamespaceSpecifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ImportNamespaceSpecifier> */ Boolean = js.native
  def isImportNamespaceSpecifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ImportNamespaceSpecifier> */ Boolean = js.native
  
  def isImportSpecifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ImportSpecifier> */ Boolean = js.native
  def isImportSpecifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ImportSpecifier> */ Boolean = js.native
  
  def isInterfaceDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.InterfaceDeclaration> */ Boolean = js.native
  def isInterfaceDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.InterfaceDeclaration> */ Boolean = js.native
  
  def isInterfaceExtends(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.InterfaceExtends> */ Boolean = js.native
  def isInterfaceExtends(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.InterfaceExtends> */ Boolean = js.native
  
  def isIntersectionTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.IntersectionTypeAnnotation> */ Boolean = js.native
  def isIntersectionTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.IntersectionTypeAnnotation> */ Boolean = js.native
  
  def isJSX(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSX> */ Boolean = js.native
  def isJSX(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSX> */ Boolean = js.native
  
  def isJSXAttribute(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXAttribute> */ Boolean = js.native
  def isJSXAttribute(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXAttribute> */ Boolean = js.native
  
  def isJSXClosingElement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXClosingElement> */ Boolean = js.native
  def isJSXClosingElement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXClosingElement> */ Boolean = js.native
  
  def isJSXElement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXElement> */ Boolean = js.native
  def isJSXElement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXElement> */ Boolean = js.native
  
  def isJSXEmptyExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXEmptyExpression> */ Boolean = js.native
  def isJSXEmptyExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXEmptyExpression> */ Boolean = js.native
  
  def isJSXExpressionContainer(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXExpressionContainer> */ Boolean = js.native
  def isJSXExpressionContainer(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXExpressionContainer> */ Boolean = js.native
  
  def isJSXIdentifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXIdentifier> */ Boolean = js.native
  def isJSXIdentifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXIdentifier> */ Boolean = js.native
  
  def isJSXMemberExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXMemberExpression> */ Boolean = js.native
  def isJSXMemberExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXMemberExpression> */ Boolean = js.native
  
  def isJSXNamespacedName(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXNamespacedName> */ Boolean = js.native
  def isJSXNamespacedName(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXNamespacedName> */ Boolean = js.native
  
  def isJSXOpeningElement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXOpeningElement> */ Boolean = js.native
  def isJSXOpeningElement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXOpeningElement> */ Boolean = js.native
  
  def isJSXSpreadAttribute(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXSpreadAttribute> */ Boolean = js.native
  def isJSXSpreadAttribute(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXSpreadAttribute> */ Boolean = js.native
  
  def isJSXText(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXText> */ Boolean = js.native
  def isJSXText(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.JSXText> */ Boolean = js.native
  
  def isLVal(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.LVal> */ Boolean = js.native
  def isLVal(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.LVal> */ Boolean = js.native
  
  def isLabeledStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.LabeledStatement> */ Boolean = js.native
  def isLabeledStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.LabeledStatement> */ Boolean = js.native
  
  def isLiteral(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Literal> */ Boolean = js.native
  def isLiteral(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Literal> */ Boolean = js.native
  
  def isLogicalExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.LogicalExpression> */ Boolean = js.native
  def isLogicalExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.LogicalExpression> */ Boolean = js.native
  
  def isLoop(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Loop> */ Boolean = js.native
  def isLoop(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Loop> */ Boolean = js.native
  
  def isMemberExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.MemberExpression> */ Boolean = js.native
  def isMemberExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.MemberExpression> */ Boolean = js.native
  
  def isMetaProperty(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.MetaProperty> */ Boolean = js.native
  def isMetaProperty(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.MetaProperty> */ Boolean = js.native
  
  def isMethod(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Method> */ Boolean = js.native
  def isMethod(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Method> */ Boolean = js.native
  
  def isMixedTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.MixedTypeAnnotation> */ Boolean = js.native
  def isMixedTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.MixedTypeAnnotation> */ Boolean = js.native
  
  def isModuleDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ModuleDeclaration> */ Boolean = js.native
  def isModuleDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ModuleDeclaration> */ Boolean = js.native
  
  def isModuleSpecifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ModuleSpecifier> */ Boolean = js.native
  def isModuleSpecifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ModuleSpecifier> */ Boolean = js.native
  
  def isNewExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NewExpression> */ Boolean = js.native
  def isNewExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NewExpression> */ Boolean = js.native
  
  /**
    * Check the type against our stored internal type of the node. This is handy when a node has
    * been removed yet we still internally know the type and need it to calculate node replacement.
    */
  def isNodeType(`type`: String): Boolean = js.native
  
  def isNoop(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Noop> */ Boolean = js.native
  def isNoop(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Noop> */ Boolean = js.native
  
  def isNullLiteral(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NullLiteral> */ Boolean = js.native
  def isNullLiteral(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NullLiteral> */ Boolean = js.native
  
  def isNullLiteralTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NullLiteralTypeAnnotation> */ Boolean = js.native
  def isNullLiteralTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NullLiteralTypeAnnotation> */ Boolean = js.native
  
  def isNullableTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NullableTypeAnnotation> */ Boolean = js.native
  def isNullableTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NullableTypeAnnotation> */ Boolean = js.native
  
  def isNumberLiteral(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NumericLiteral> */ Boolean = js.native
  def isNumberLiteral(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NumericLiteral> */ Boolean = js.native
  
  def isNumberTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NumberTypeAnnotation> */ Boolean = js.native
  def isNumberTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NumberTypeAnnotation> */ Boolean = js.native
  
  def isNumericLiteral(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NumericLiteral> */ Boolean = js.native
  def isNumericLiteral(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NumericLiteral> */ Boolean = js.native
  
  def isNumericLiteralTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NumericLiteralTypeAnnotation> */ Boolean = js.native
  def isNumericLiteralTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.NumericLiteralTypeAnnotation> */ Boolean = js.native
  
  def isObjectExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectExpression> */ Boolean = js.native
  def isObjectExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectExpression> */ Boolean = js.native
  
  def isObjectMember(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectMember> */ Boolean = js.native
  def isObjectMember(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectMember> */ Boolean = js.native
  
  def isObjectMethod(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectMethod> */ Boolean = js.native
  def isObjectMethod(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectMethod> */ Boolean = js.native
  
  def isObjectPattern(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectPattern> */ Boolean = js.native
  def isObjectPattern(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectPattern> */ Boolean = js.native
  
  def isObjectProperty(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectProperty> */ Boolean = js.native
  def isObjectProperty(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectProperty> */ Boolean = js.native
  
  def isObjectTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectTypeAnnotation> */ Boolean = js.native
  def isObjectTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectTypeAnnotation> */ Boolean = js.native
  
  def isObjectTypeCallProperty(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectTypeCallProperty> */ Boolean = js.native
  def isObjectTypeCallProperty(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectTypeCallProperty> */ Boolean = js.native
  
  def isObjectTypeIndexer(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectTypeIndexer> */ Boolean = js.native
  def isObjectTypeIndexer(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectTypeIndexer> */ Boolean = js.native
  
  def isObjectTypeProperty(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectTypeProperty> */ Boolean = js.native
  def isObjectTypeProperty(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ObjectTypeProperty> */ Boolean = js.native
  
  def isParenthesizedExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ParenthesizedExpression> */ Boolean = js.native
  def isParenthesizedExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ParenthesizedExpression> */ Boolean = js.native
  
  def isPattern(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Pattern> */ Boolean = js.native
  def isPattern(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Pattern> */ Boolean = js.native
  
  def isProgram(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Program> */ Boolean = js.native
  def isProgram(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Program> */ Boolean = js.native
  
  def isProperty(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Property> */ Boolean = js.native
  def isProperty(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Property> */ Boolean = js.native
  
  def isPure(): Boolean = js.native
  def isPure(opts: js.Object): Boolean = js.native
  
  def isPureish(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Pureish> */ Boolean = js.native
  def isPureish(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Pureish> */ Boolean = js.native
  
  def isQualifiedTypeIdentifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.QualifiedTypeIdentifier> */ Boolean = js.native
  def isQualifiedTypeIdentifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.QualifiedTypeIdentifier> */ Boolean = js.native
  
  def isReferenced(): Boolean = js.native
  def isReferenced(opts: js.Object): Boolean = js.native
  
  def isReferencedIdentifier(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Identifier | babel-types.babel-types/ts3.6.JSXIdentifier> */ Boolean = js.native
  def isReferencedIdentifier(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Identifier | babel-types.babel-types/ts3.6.JSXIdentifier> */ Boolean = js.native
  
  def isReferencedMemberExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.MemberExpression> */ Boolean = js.native
  def isReferencedMemberExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.MemberExpression> */ Boolean = js.native
  
  def isRegExpLiteral(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.RegExpLiteral> */ Boolean = js.native
  def isRegExpLiteral(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.RegExpLiteral> */ Boolean = js.native
  
  def isRegexLiteral(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.RegExpLiteral> */ Boolean = js.native
  def isRegexLiteral(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.RegExpLiteral> */ Boolean = js.native
  
  def isRestElement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.RestElement> */ Boolean = js.native
  def isRestElement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.RestElement> */ Boolean = js.native
  
  def isRestProperty(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.RestProperty> */ Boolean = js.native
  def isRestProperty(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.RestProperty> */ Boolean = js.native
  
  def isReturnStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ReturnStatement> */ Boolean = js.native
  def isReturnStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ReturnStatement> */ Boolean = js.native
  
  def isScopable(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Scopable> */ Boolean = js.native
  def isScopable(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Scopable> */ Boolean = js.native
  
  def isScope(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Scopable> */ Boolean = js.native
  def isScope(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Scopable> */ Boolean = js.native
  
  def isSequenceExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.SequenceExpression> */ Boolean = js.native
  def isSequenceExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.SequenceExpression> */ Boolean = js.native
  
  def isSpreadElement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.SpreadElement> */ Boolean = js.native
  def isSpreadElement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.SpreadElement> */ Boolean = js.native
  
  def isSpreadProperty(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.SpreadProperty> */ Boolean = js.native
  def isSpreadProperty(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.SpreadProperty> */ Boolean = js.native
  
  def isStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Statement> */ Boolean = js.native
  def isStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Statement> */ Boolean = js.native
  
  /**
    * Check whether or not the current `key` allows either a single statement or block statement
    * so we can explode it if necessary.
    */
  def isStatementOrBlock(): Boolean = js.native
  
  def isStatic(): Boolean = js.native
  
  def isStringLiteral(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.StringLiteral> */ Boolean = js.native
  def isStringLiteral(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.StringLiteral> */ Boolean = js.native
  
  def isStringLiteralTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.StringLiteralTypeAnnotation> */ Boolean = js.native
  def isStringLiteralTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.StringLiteralTypeAnnotation> */ Boolean = js.native
  
  def isStringTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.StringTypeAnnotation> */ Boolean = js.native
  def isStringTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.StringTypeAnnotation> */ Boolean = js.native
  
  def isSuper(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Super> */ Boolean = js.native
  def isSuper(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Super> */ Boolean = js.native
  
  def isSwitchCase(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.SwitchCase> */ Boolean = js.native
  def isSwitchCase(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.SwitchCase> */ Boolean = js.native
  
  def isSwitchStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.SwitchStatement> */ Boolean = js.native
  def isSwitchStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.SwitchStatement> */ Boolean = js.native
  
  def isTaggedTemplateExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TaggedTemplateExpression> */ Boolean = js.native
  def isTaggedTemplateExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TaggedTemplateExpression> */ Boolean = js.native
  
  def isTemplateElement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TemplateElement> */ Boolean = js.native
  def isTemplateElement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TemplateElement> */ Boolean = js.native
  
  def isTemplateLiteral(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TemplateLiteral> */ Boolean = js.native
  def isTemplateLiteral(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TemplateLiteral> */ Boolean = js.native
  
  def isTerminatorless(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Terminatorless> */ Boolean = js.native
  def isTerminatorless(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.Terminatorless> */ Boolean = js.native
  
  def isThisExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ThisExpression> */ Boolean = js.native
  def isThisExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ThisExpression> */ Boolean = js.native
  
  def isThisTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ThisTypeAnnotation> */ Boolean = js.native
  def isThisTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ThisTypeAnnotation> */ Boolean = js.native
  
  def isThrowStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ThrowStatement> */ Boolean = js.native
  def isThrowStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.ThrowStatement> */ Boolean = js.native
  
  def isTryStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TryStatement> */ Boolean = js.native
  def isTryStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TryStatement> */ Boolean = js.native
  
  def isTupleTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TupleTypeAnnotation> */ Boolean = js.native
  def isTupleTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TupleTypeAnnotation> */ Boolean = js.native
  
  def isTypeAlias(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeAlias> */ Boolean = js.native
  def isTypeAlias(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeAlias> */ Boolean = js.native
  
  def isTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeAnnotation> */ Boolean = js.native
  def isTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeAnnotation> */ Boolean = js.native
  
  def isTypeCastExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeCastExpression> */ Boolean = js.native
  def isTypeCastExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeCastExpression> */ Boolean = js.native
  
  def isTypeParameterDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeParameterDeclaration> */ Boolean = js.native
  def isTypeParameterDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeParameterDeclaration> */ Boolean = js.native
  
  def isTypeParameterInstantiation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeParameterInstantiation> */ Boolean = js.native
  def isTypeParameterInstantiation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeParameterInstantiation> */ Boolean = js.native
  
  def isTypeofTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeofTypeAnnotation> */ Boolean = js.native
  def isTypeofTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.TypeofTypeAnnotation> */ Boolean = js.native
  
  def isUnaryExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.UnaryExpression> */ Boolean = js.native
  def isUnaryExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.UnaryExpression> */ Boolean = js.native
  
  def isUnaryLike(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.UnaryLike> */ Boolean = js.native
  def isUnaryLike(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.UnaryLike> */ Boolean = js.native
  
  def isUnionTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.UnionTypeAnnotation> */ Boolean = js.native
  def isUnionTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.UnionTypeAnnotation> */ Boolean = js.native
  
  def isUpdateExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.UpdateExpression> */ Boolean = js.native
  def isUpdateExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.UpdateExpression> */ Boolean = js.native
  
  def isUser(): Boolean = js.native
  def isUser(opts: js.Object): Boolean = js.native
  
  def isUserWhitespacable(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.UserWhitespacable> */ Boolean = js.native
  def isUserWhitespacable(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.UserWhitespacable> */ Boolean = js.native
  
  def isVar(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.VariableDeclaration> */ Boolean = js.native
  def isVar(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.VariableDeclaration> */ Boolean = js.native
  
  def isVariableDeclaration(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.VariableDeclaration> */ Boolean = js.native
  def isVariableDeclaration(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.VariableDeclaration> */ Boolean = js.native
  
  def isVariableDeclarator(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.VariableDeclarator> */ Boolean = js.native
  def isVariableDeclarator(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.VariableDeclarator> */ Boolean = js.native
  
  def isVoidTypeAnnotation(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.VoidTypeAnnotation> */ Boolean = js.native
  def isVoidTypeAnnotation(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.VoidTypeAnnotation> */ Boolean = js.native
  
  def isWhile(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.While> */ Boolean = js.native
  def isWhile(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.While> */ Boolean = js.native
  
  def isWhileStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.WhileStatement> */ Boolean = js.native
  def isWhileStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.WhileStatement> */ Boolean = js.native
  
  def isWithStatement(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.WithStatement> */ Boolean = js.native
  def isWithStatement(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.WithStatement> */ Boolean = js.native
  
  def isYieldExpression(): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.YieldExpression> */ Boolean = js.native
  def isYieldExpression(opts: js.Object): /* is babel-traverse.babel-traverse.NodePath<babel-types.babel-types/ts3.6.YieldExpression> */ Boolean = js.native
  
  /** Opposite of `has`. */
  def isnt(key: String): Boolean = js.native
  
  var key: String | Double = js.native
  
  var listKey: String = js.native
  
  // ------------------------- introspection -------------------------
  /**
    * Match the current node if it matches the provided `pattern`.
    *
    * For example, given the match `React.createClass` it would match the
    * parsed nodes of `React.createClass` and `React["createClass"]`.
    */
  def matchesPattern(pattern: String): Boolean = js.native
  def matchesPattern(pattern: String, allowPartial: Boolean): Boolean = js.native
  
  var node: T = js.native
  
  var opts: js.Object = js.native
  
  var parent: Node = js.native
  
  var parentKey: String = js.native
  
  var parentPath: NodePath[Node] = js.native
  
  def popContext(): Unit = js.native
  
  def pushContext(context: TraversalContext): Unit = js.native
  
  /** Check if the currently assigned path references the `importName` of `moduleSource`. */
  def referencesImport(moduleSource: String, importName: String): Boolean = js.native
  
  // ------------------------- removal -------------------------
  def remove(): Unit = js.native
  
  var removed: Boolean = js.native
  
  /**
    * This method takes an array of statements nodes and then explodes it
    * into expressions. This method retains completion records which is
    * extremely important to retain original semantics.
    */
  def replaceExpressionWithStatements(nodes: js.Array[Node]): Node = js.native
  
  def replaceInline(nodes: js.Array[Node]): Unit = js.native
  def replaceInline(nodes: Node): Unit = js.native
  
  /** Replace the current node with another. */
  def replaceWith(replacement: Node): Unit = js.native
  def replaceWith(replacement: NodePath[Node]): Unit = js.native
  
  // ------------------------- replacement -------------------------
  /**
    * Replace a node with an array of multiple. This method performs the following steps:
    *
    *  - Inherit the comments of first provided node with that of the current node.
    *  - Insert the provided nodes after the current node.
    *  - Remove the current node.
    */
  def replaceWithMultiple(nodes: js.Array[Node]): Unit = js.native
  
  /**
    * Parse a string as an expression and replace the current node with the result.
    *
    * NOTE: This is typically not a good idea to use. Building source strings when
    * transforming ASTs is an antipattern and SHOULD NOT be encouraged. Even if it's
    * easier to use, your transforms will be extremely brittle.
    */
  def replaceWithSourceString(replacement: js.Any): Unit = js.native
  
  var scope: Scope = js.native
  
  def set(key: String, node: Node): Unit = js.native
  
  def setContext(context: TraversalContext): NodePath[T] = js.native
  
  def setData(key: String, `val`: js.Any): js.Any = js.native
  
  def setScope(): Unit = js.native
  
  // ------------------------- comments -------------------------
  /** Share comments amongst siblings. */
  def shareCommentsWithSiblings(): Unit = js.native
  
  var shouldSkip: Boolean = js.native
  
  var shouldStop: Boolean = js.native
  
  def skip(): Unit = js.native
  
  def skipKey(key: String): Unit = js.native
  
  var skipKeys: js.Object = js.native
  
  var state: js.Any = js.native
  
  def stop(): Unit = js.native
  
  def traverse(visitor: Visitor[Node]): Unit = js.native
  def traverse[T](visitor: Visitor[T], state: T): Unit = js.native
  
  var `type`: String | Null = js.native
  
  var typeAnnotation: js.Object = js.native
  
  /** Update all sibling node paths after `fromIndex` by `incrementBy`. */
  def updateSiblingKeys(fromIndex: Double, incrementBy: Double): Unit = js.native
  
  def visit(): Boolean = js.native
  
  /** Check if the current path will maybe execute before another path */
  def willIMaybeExecuteBefore(path: NodePath[Node]): Boolean = js.native
}
